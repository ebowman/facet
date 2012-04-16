name := "simple"

organization := "simple"

version := "1.0.0-SNAPSHOT"

libraryDependencies ++= 
    "org.apache.lucene" % "lucene-core" % "3.6.0" ::
    "org.apache.lucene" % "lucene-facet" % "3.6.0" ::
    Nil