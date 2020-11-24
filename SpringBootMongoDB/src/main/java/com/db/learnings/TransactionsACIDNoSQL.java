package com.db.learnings;

/**
 * Transactions, ACID, and NoSQL:-
 * 
 * A crucial question to consider when planning your application is whether or
 * not you need the ACID set of properties originally associated with a
 * relational database. ACID stands for Atomicity, Consistency, Integrity, and
 * Durability.
 * 
 * This set of properties is required for high-integrity and high-durability
 * transaction processing, such as those associated with banking transactions.
 * While frequently associated with relational databases accessed via SQL, ACID
 * properties are also available with NoSQL databases, including MongoDB (the
 * most popular document database), Redis (a key-value store) and Neo4j (a graph
 * database).
 * 
 * NoSQL databases broke new ground by enabling aspects of the database such as
 * consistency to be controlled by the users. It was possible to make
 * scalability easier by permitting inconsistent results temporarily. Eventual
 * consistency was one idea that was not part of SQL databases.
 * 
 * NoSQL databases, like early versions of open-source SQL databases such as
 * MySQL, became popular without fully supporting transactions.
 * 
 * But now transactions are partially or fully supported in most NoSQL
 * databases.
 * 
 * MongoDB has devoted a lot of resources to supporting multi-document
 * transactions that enable a collection of changes to multiple documents to be
 * applied or rolled back as a group. MongoDB also supports serializable, the
 * highest level of transaction isolation.
 * 
 * So, when choosing a NoSQL database, it’s important to know how important
 * transactions will be. For certain types of use cases, like consolidating data
 * from many sources to create a single view, transactions may not be that
 * important. For financial applications like banking or cryptocurrency
 * exchanges, full transactional support is vital.
 * 
 */
public class TransactionsACIDNoSQL {

}
