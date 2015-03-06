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

We are working on getting this archetype into the Maven Central Repository,
but until that time you will have to check out the project and install it locally.

```bash
$ git clone https://github.com/InfoSec812/deltaspike-restlet-archetype.git
$ cd deltaspike-restlet-archetype
$ mvn clean install
$ mkdir /path/to/new/project
$ cd /path/to/new/project
$ mvn archetype:generate -DarchetypeCatalog=local -DarchetypeGroupId=com.zanclus -DarchetypeArtifactId=deltaspike-restlet-archetype
$ cd new-project-dir-created-by-maven
$ mvn clean test exec:java
```

Maven will interactively prompt you to build the template application. When you 
run the archetype application with the "exec:java" goal it will start up
listening on port 8080 and you can try out the example ReST endpoint
http://localhost:8080/rest/example

The example endpoint only returns the systemTimeInMillis value.
