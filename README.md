DeltaSpike Enabled Restlet Web Services Archetype
=================================================

Overview
--------

This archetype allows for creating a basic maven project which will integrate [DeltaSpike](http://deltaspike.apache.org/) 
with [Restlet Framework](http://restlet.com) to build CDI enabled microservices in a JavaSE runtime.

Prerequisites
-------------

* Java >=1.8
* Maven >=3.0

Using
-----

The archetype is available from Maven Central

```bash
$ mvn archetype:generate -DarchetypeGroupId=com.zanclus.codepalousa -DarchetypeArtifactId=deltaspike-restlet-archetype -DarchetypeVersion=2.3.0
```

Maven will interactively prompt you to build the template application. When you 
run the archetype application with the "exec:java" goal it will start up
listening on port 8080 and you can try out the example ReST endpoint
http://localhost:8080/rest/example

The example endpoint only returns the systemTimeInMillis value.
