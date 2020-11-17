package com.db.learnings;

/**
 * Drawbacks of NoSQL Databases:-
 * 
 * One of the most frequently cited drawbacks of NoSQL databases is that they
 * don’t support ACID (atomicity, consistency, isolation, durability)
 * transactions across multiple documents. With appropriate schema design,
 * single record atomicity is acceptable for lots of applications. However,
 * there are still many applications that require ACID across multiple records.
 * To address these use cases MongoDB added support for multi-document ACID
 * transactions in the 4.0 release, and extended them in 4.2 to span sharded
 * clusters.
 * 
 * Since data models in NoSQL databases are typically optimized for queries and
 * not for reducing data duplication, NoSQL databases can be larger than SQL
 * databases. Storage is currently so cheap that most consider this a minor
 * drawback, and some NoSQL databases also support compression to reduce the
 * storage footprint.
 * 
 * Depending on the NoSQL database type you select, you may not be able to
 * achieve all of your use cases in a single database. For example, graph
 * databases are excellent for analyzing relationships in your data but may not
 * provide what you need for everyday retrieval of the data such as range
 * queries. When selecting a NoSQL database, consider what your use cases will
 * be and if a general purpose database like MongoDB would be a better option.
 */
public class DrawbacksOfNoSQL {

}
