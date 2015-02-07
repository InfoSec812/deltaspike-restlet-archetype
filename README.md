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

    git clone https://github.com/InfoSec812/deltaspike-restlet-archetype.git
    cd deltaspike-restlet-archetype
    mvn clean install
    mvn archetype:generate -DarchetypeCatalog=local -DarchetypeGroupId=com.zanclus -DarchetypeArtifactId=deltaspike-restlet-archetype

Maven will interactively prompt you to build the template application.