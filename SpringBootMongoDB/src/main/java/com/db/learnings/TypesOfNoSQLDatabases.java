package com.db.learnings;

/**
 * Types of NoSQL Databases:-
 * 
 * Over time, four major types of NoSQL databases emerged: document databases,
 * key-value databases, wide-column stores, and graph databases.
 * 
 * Document databases store data in documents similar to JSON (JavaScript Object
 * Notation) objects. Each document contains pairs of fields and values. The
 * values can typically be a variety of types including things like strings,
 * numbers, booleans, arrays, or objects, and their structures typically align
 * with objects developers are working with in code. Because of their variety of
 * field value types and powerful query languages, document databases are great
 * for a wide variety of use cases and can be used as a general purpose
 * database. They can horizontally scale-out to accomodate large data volumes.
 * MongoDB is consistently ranked as the world’s most popular NoSQL database
 * according to DB-engines and is an example of a document database.
 * 
 * Key-value databases are a simpler type of database where each item contains
 * keys and values. A value can typically only be retrieved by referencing its
 * key, so learning how to query for a specific key-value pair is typically
 * simple. Key-value databases are great for use cases where you need to store
 * large amounts of data but you don’t need to perform complex queries to
 * retrieve it. Common use cases include storing user preferences or caching.
 * Redis and DynanoDB are popular key-value databases.
 * 
 * Wide-column stores store data in tables, rows, and dynamic columns.
 * Wide-column stores provide a lot of flexibility over relational databases
 * because each row is not required to have the same columns. Many consider
 * wide-column stores to be two-dimensional key-value databases. Wide-column
 * stores are great for when you need to store large amounts of data and you can
 * predict what your query patterns will be. Wide-column stores are commonly
 * used for storing Internet of Things data and user profile data. Cassandra and
 * HBase are two of the most popular wide-column stores.
 * 
 * Graph databases store data in nodes and edges. Nodes typically store
 * information about people, places, and things while edges store information
 * about the relationships between the nodes. Graph databases excel in use cases
 * where you need to traverse relationships to look for patterns such as social
 * networks, fraud detection, and recommendation engines. Neo4j and JanusGraph
 * are examples of graph databases.
 */
public class TypesOfNoSQLDatabases {

}
