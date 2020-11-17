package com.db.learnings;

/**
 * NoSQL was Born from Frustration with SQL There is always a large amount of
 * innovation in database technology from both academia and industry. NoSQL came
 * out of industry, driven by the needs of the successful pioneers of both
 * web-scale applications and infrastructure for search and advertising. The
 * demands of these applications could not be served by SQL technology and each
 * of the early companies developed new databases to meet their needs. Most of
 * these were developed in-house and were later published as open source. Some
 * stayed proprietary.
 * 
 * The founders of MongoDB experienced frustration with SQL technology while
 * building out DoubleClick, an early Internet advertising firm that is now part
 * of Google. After leaving DoubleClick, Dwight Merriman, Eliot Horowtiz, and
 * Kevin Ryan founded MongoDB in 2007 to create the NoSQL database they always
 * wanted.
 * 
 * Also, at the same time, NoSQL databases started appearing, the public cloud
 * was invented and has become an important way that database technology is
 * delivered.
 * 
 * What has happened in a broad sense is that the frustrations that led the
 * early Internet companies to create NoSQL databases are now shared by almost
 * every organization.
 * 
 * Digital transformation is the name for the trend toward serving customers
 * using scalable, customizable, Internet and mobile applications. These
 * applications are often hard to build and evolve rapidly using SQL technology.
 * For this reason, from the mid-2000s to 2020 we have seen a steady rise in the
 * adoption of NoSQL database technology.
 * 
 * The rise of NoSQL is an important event in computer science and in
 * application development because SQL has been so dominant for so long. Many
 * other forms of database technology have come and gone, but few have had the
 * wide adoption of NoSQL.
 * 
 * When Would You Want to Use NoSQL over SQL?
 * 
 * The pace of development with NoSQL databases can be much faster than with a
 * SQL database: Because NoSQL databases often allow developers to be in control
 * of the structure of the data, they are a good fit with modern Agile
 * development practices based on sprints, quick iterations, and frequent code
 * pushes. When a developer must ask a SQL database administrator to change the
 * structure of a database and then unload and reload the data, it can slow
 * development down.
 * 
 * The structure of many different forms of data is more easily handled and
 * evolved with a NoSQL database: NoSQL databases are often better suited to
 * storing and modeling structured, semi-structured, and unstructured data in
 * one database. NoSQL databases often store data in a form that is similar to
 * the objects used in applications, reducing the need for translation from the
 * form the data is stored into the form the data takes in the code.
 * 
 * The amount of data in many applications cannot be served affordably by a SQL
 * database: NoSQL databases were created to handle big data as part of their
 * fundamental architecture. Additional engineering is not required as it is
 * when SQL databases are used to handle web-scale applications. The path to
 * data scalability is straightforward and well understood. NoSQL databases are
 * often based on a scale-out strategy, which makes scaling to large data
 * volumes much cheaper than when using the scale-up approach the SQL databases
 * take.
 * 
 * The scale of traffic and need for zero downtime cannot be handled by SQL. The
 * scale-out strategy used by most NoSQL databases provides a clear path to
 * scaling the amount of traffic a database can handle. Scale-out architectures
 * also provide benefits such as being able to upgrade a database or change its
 * structure with zero downtime. The scale-out architecture is one of the most
 * affordable ways to handle large volumes of traffic.
 * 
 * New application paradigms can be more easily supported: The scalability of
 * NoSQL databases allows one database to serve both transactional and
 * analytical workloads from the same database. In SQL databases, usually, a
 * separate data warehouse is used to support analytics. NoSQL databases were
 * created during the cloud era and have adapted quickly to the automation that
 * is part of the cloud. Deploying databases at scale in a way that supports
 * microservices is often easier with NoSQL databases. NoSQL databases often
 * have superior integration with real-time streaming technologies. NoSQL
 * databases support polyglot persistence, the practice of mixing various types
 * of NoSQL databases depending on the needs of particular segments of an
 * application. For example, some applications storing most of their data in a
 * document database like MongoDB, but supplement that with a graph database to
 * capture inherent connections between people or products.
 */
public class WhenToUseNoSQL {

}
