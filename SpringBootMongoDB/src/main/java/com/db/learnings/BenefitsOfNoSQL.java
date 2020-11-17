package com.db.learnings;

/**
 * Benefits of NoSQL Databases:-
 * 
 * NoSQL databases offer many benefits over relational databases. NoSQL
 * databases have flexible data models, scale horizontally, have incredibly fast
 * queries, and are easy for developers to work with.
 * 
 * Flexible data models: NoSQL databases typically have very flexible schemas. A
 * flexible schema allows you to easily make changes to your database as
 * requirements change. You can iterate quickly and continuously integrate new
 * application features to provide value to your users faster.
 * 
 * Horizontal scaling: Most SQL databases require you to scale-up vertically
 * (migrate to a larger, more expensive server) when you exceed the capacity
 * requirements of your current server. Conversely, most NoSQL databases allow
 * you to scale-out horizontally, meaning you can add cheaper, commodity servers
 * whenever you need to.
 * 
 * Fast queries: Queries in NoSQL databases can be faster than SQL databases.
 * Why? Data in SQL databases is typically normalized, so queries for a single
 * object or entity require you to join data from multiple tables. As your
 * tables grow in size, the joins can become expensive. However, data in NoSQL
 * databases is typically stored in a way that is optimized for queries. The
 * rule of thumb when you use MongoDB is Data is that is accessed together
 * should be stored together. Queries typically do not require joins, so the
 * queries are very fast.
 * 
 * Easy for developers: Some NoSQL databases like MongoDB map their data
 * structures to those of popular programming languages. This mapping allows
 * developers to store their data in the same way that they use it in their
 * application code. While it may seem like a trivial advantage, this mapping
 * can allow developers to write less code, leading to faster development time
 * and fewer bugs.
 */
public class BenefitsOfNoSQL {

}
