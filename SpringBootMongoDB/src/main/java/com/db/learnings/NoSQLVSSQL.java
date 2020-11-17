package com.db.learnings;

/**
 * NoSQL (“non SQL” or “not only SQL”) databases were developed in the late
 * 2000s with a focus on scaling, fast queries, allowing for frequent
 * application changes, and making programming simpler for developers.
 * Relational databases accessed with SQL (Structured Query Language) were
 * developed in the 1970s with a focus on reducing data duplication as storage
 * was much more costly than developer time. SQL databases tend to have rigid,
 * complex, tabular schemas and typically require expensive vertical scaling.
 * 
 * 
 * SQL Databases:-
 * 
 * 1. Tables with fixed rows and columns
 * 
 * 2. Developed in the 1970s with a focus on reducing data duplication
 * 
 * 3. Example: Oracle, MySQL, Microsoft SQL Server, and PostgreSQL
 * 
 * 4. Primary Purpose: General purpose
 * 
 * 5. Schemas: Rigid
 * 
 * 6. Scaling: Vertical (scale-up with a larger server)
 * 
 * 7. Multi-Record ACID Transactions Supported
 * 
 * 8. Joins: Typically required
 * 
 * 9. Data to Object Mapping: Requires ORM (object-relational mapping)
 * 
 * NoSQL Databases:-
 * 
 * 1. Document: JSON documents, Key-value: key-value pairs, Wide-column: tables
 * with rows and dynamic columns, Graph: nodes and edges
 * 
 * 2. Developed in the late 2000s with a focus on scaling and allowing for rapid
 * application change driven by agile and DevOps practices.
 * 
 * 3. Example:- Document: MongoDB and CouchDB, Key-value: Redis and DynamoDB,
 * Wide-column: Cassandra and HBase, Graph: Neo4j and Amazon Neptune
 * 
 * 4. Primary Purpose: Document: general purpose, Key-value: large amounts of
 * data with simple lookup queries, Wide-column: large amounts of data with
 * predictable query patterns, Graph: analyzing and traversing relationships
 * between connected data
 * 
 * 5. Schemas: Flexible
 * 
 * 6. Scaling: Horizontal (scale-out across commodity servers)
 * 
 * 7. Multi-Record ACID Transactions: Most do not support multi-record ACID
 * transactions. However, some—like MongoDB—do.
 * 
 * 8. Joins: Typically not required
 * 
 * 9. Data to Object Mapping: Many do not require ORMs. MongoDB documents map
 * directly to data structures in most popular programming languages.
 */
public class NoSQLVSSQL {

}
