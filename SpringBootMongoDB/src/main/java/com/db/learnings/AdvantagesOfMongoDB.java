package com.db.learnings;

/**
 * At a high level, MongoDB enables developers that use data (which is most of
 * us) to build easily, adapt quickly, and scale reliably. Let’s break that
 * down:
 * 
 * Flexible document schemas:
 * 
 * MongoDB’s document model allows virtually any kind of data structure to be
 * modeled and manipulated easily. MongoDB’s BSON data format, inspired by JSON,
 * allows you to have objects in one collection have different sets of fields
 * (say, a middle name on a user only when applicable, or region-specific
 * information that only applies to some records).
 * 
 * MongoDB supports creating explicit schemas and validating data so it doesn’t
 * get out of control, but this flexibility is an incredible asset when handling
 * real-world data, and handling changes in requirements or environment.
 * 
 * Code-native data access:
 * 
 * Most databases force you to use heavy wrappers, like ORMs (Object Relational
 * Mappers), to get data into Object form for use in programs. MongoDB’s
 * decision to store and represent data in a document format means that you can
 * access it from any language, in data structures that are native to that
 * language (e.g. dictionaries in Python, associative arrays in JavaScript, Maps
 * in Java, etc.).
 * 
 * Change-friendly design:
 * 
 * If you’re used to having to bring down your site or application in order to
 * change the structure of your data, you’re in luck: MongoDB is designed for
 * change.
 * 
 * We spend a lot of time and effort designing efficient processes, and learning
 * from our mistakes, but typically the database is slowing the whole thing
 * down. There’s no downtime required to change schemas, and you can start
 * writing new data to MongoDB at any time, without disrupting its operations.
 * 
 * Powerful querying and analytics:
 * 
 * What good is a database if you can’t find things inside it? MongoDB is
 * designed to make data easy to access, and rarely to require joins or
 * transactions, but when you need to do complex querying, it’s more than up to
 * the task.
 * 
 * The MongoDB Query Language (MQL) is a full-featured, powerful language that
 * allows you to query deep into documents, and even perform complex analytics
 * pipelines with just a few lines of JSON-like MQL.
 * 
 * Easy horizontal scale-out:
 * 
 * MongoDB is designed from the ground up to be a distributed database. Create
 * clusters with real-time replication, and shard large or high-throughput
 * collections across multiple clusters to sustain performance and scaler
 * horizontally.
 */
public class AdvantagesOfMongoDB {

}
