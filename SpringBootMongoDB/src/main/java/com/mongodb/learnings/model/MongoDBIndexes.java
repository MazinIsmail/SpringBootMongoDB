package com.mongodb.learnings.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.GeoSpatialIndexed;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Indexes support the efficient execution of queries in MongoDB. Without
 * indexes, MongoDB must perform a collection scan, i.e. scan every document in
 * a collection, to select those documents that match the query statement.
 * 
 * The index stores the value of a specific field or set of fields, ordered by
 * the value of the field. The ordering of the index entries supports efficient
 * equality matches and range-based query operations. In addition, MongoDB can
 * return sorted results by using the ordering in the index.
 * 
 * The default name for an index is the concatenation of the indexed keys and
 * each key’s direction in the index ( i.e. 1 or -1) using underscores as a
 * separator. For example, an index created on { item : 1, quantity: -1 } has
 * the name item_1_quantity_-1. You can create indexes with a custom name.
 * 
 * Index Types:-
 * 
 * Single Field:
 * 
 * In addition to the MongoDB-defined _id index, MongoDB supports the creation
 * of user-defined ascending/descending indexes on a single field of a document.
 * For a single-field index and sort operations, the sort order (i.e. ascending
 * or descending) of the index key does not matter because MongoDB can traverse
 * the index in either direction.
 * 
 * Compound Index:
 * 
 * The order of fields listed in a compound index has significance. For
 * instance, if a compound index consists of { userid: 1, score: -1 }, the index
 * sorts first by userid and then, within each userid value, sorts by score.
 * 
 * For compound indexes and sort operations, the sort order (i.e. ascending or
 * descending) of the index keys can determine whether the index can support a
 * sort operation.
 * 
 * Multikey Index:
 * 
 * MongoDB uses multikey indexes to index the content stored in arrays. If you
 * index a field that holds an array value, MongoDB creates separate index
 * entries for every element of the array. These multikey indexes allow queries
 * to select documents that contain arrays by matching on element or elements of
 * the arrays. MongoDB automatically determines whether to create a multikey
 * index if the indexed field contains an array value; you do not need to
 * explicitly specify the multikey type.
 * 
 * Geospatial Index:
 * 
 * To support efficient queries of geospatial coordinate data, MongoDB provides
 * two special indexes: 2d indexes that uses planar geometry when returning
 * results and 2dsphere indexes that use spherical geometry to return results.
 * 
 * Text Indexes:
 * 
 * MongoDB provides a text index type that supports searching for string content
 * in a collection. These text indexes do not store language-specific stop words
 * (e.g. “the”, “a”, “or”) and stem the words in a collection to only store root
 * words.
 * 
 * Hashed Indexes:
 * 
 * MongoDB provides a hashed index type, which indexes the hash of the value of
 * a field. These indexes have a more random distribution of values along their
 * range, but only support equality matches and cannot support range-based
 * queries.
 */

@Document(collection = "mongoDBIndexes")
public class MongoDBIndexes {

	/**
	 * MongoDB creates a unique index on the _id field during the creation of a
	 * collection. The _id index prevents clients from inserting two documents with
	 * the same value for the _id field. You cannot drop this index on the _id
	 * field.
	 */
	@Id
	private String id;

	/**
	 * TextIndexed marks a field to be part of the text index. As there can be only
	 * one text index per collectionall fields marked with TextIndexed are combined
	 * into one single index.
	 */
	@TextIndexed
	private String textIndexed;

	/**
	 * Mark a field to be indexed using MongoDB's geospatial indexing feature.
	 */
	@GeoSpatialIndexed
	private String geoSpatialIndexed;

	/**
	 * Mark a field to be indexed using MongoDB's indexing feature.
	 */
	@Indexed
	private String indexed;

}
