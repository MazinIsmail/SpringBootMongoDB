package com.db.learnings;

/**
 * Data Model
 * 
 * NoSQL databases all have a different approach to modeling data than SQL.
 * 
 * If your application needs to grab one chunk of data over and over again at
 * high speeds, the key-value stores do this really well.
 * 
 * If you have extremely large data sets that are tabular and you are querying
 * by column to support analytics, wide-column databases do a great job because
 * of the way they compress the data in each column.
 * 
 * If your data can be modeled by a set of interrelated objects, document
 * databases can model each document in a separate collection and relate
 * individual documents to one another. Documents also can contain nested
 * structures such as arrays and sub-documents, which can capture complex data.
 * 
 * If the connections between data elements are numerous and contain as much
 * information as the nodes themselves, a graph database can be a good choice.
 * 
 * MongoDB has extended JSON into BSON, Binary JSON, which stores a variety of
 * data types, natively increasing efficiency. MongoDB has support for geocoding
 * data and time series as well. In addition, MongoDB enables large collections
 * of data to be stored in object storage, supporting data lake style
 * deployments.
 */
public class DataModelNoSQL {

}
