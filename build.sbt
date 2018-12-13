name := "EmergingTopicDetector"
version := "1.0"

scalaVersion := "2.10.5"
libraryDependencies += "org.apache.spark" %% "spark-core" % "1.6.0"
libraryDependencies += "org.apache.spark" %% "spark-streaming" % "1.6.0"
libraryDependencies += "org.apache.spark" %% "spark-streaming-twitter" % "1.6.0"
libraryDependencies += "edu.stanford.nlp" % "stanford-corenlp" % "3.4.1"
libraryDependencies += "edu.stanford.nlp" % "stanford-corenlp" % "3.4.1" classifier "models"
libraryDependencies += "com.cybozu.labs" % "langdetect" % "1.1-20120112"