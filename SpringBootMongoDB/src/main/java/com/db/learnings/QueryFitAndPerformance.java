package com.db.learnings;

/**
 * Query Fit and Performance
 * 
 * NoSQL databases all have a sweet spot for the type of queries they can
 * perform.
 * 
 * Key-value stores are all about instantaneous retrieval of a chunk of data.
 * The queries aren’t complex, but they happen fast.
 * 
 * Wide-column databases are incredible when aggregating values on particular
 * columns. The compression and in-memory nature of these databases enable such
 * queries to happen extremely fast.
 * 
 * Document databases enable fast retrieval of individual documents like
 * key-value stores. MongoDB is the only document database that supports
 * aggregation pipelines that enable a number of documents to be retrieved and
 * then delivered in just the right form needed.
 * 
 * Graph databases can sift through massive layers of connected data and answer
 * a wide variety of questions about connections between data incredibly fast
 * with relatively simple queries. Graph algorithms can profile data and
 * determine clusters of related objects.
 * 
 * MongoDB’s aggregation pipelines can now integrate queries that span multiple
 * collections through the Union function. MongoDB has advanced capabilities for
 * analyzing the performance of a database cluster that will recommend when
 * indexes are needed.
 */
public class QueryFitAndPerformance {

}
