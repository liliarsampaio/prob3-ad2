name := "testPA"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaJpa,
  "org.apache.directory.api" % "api-all" % "1.0.0-M14",
  "postgresql" % "postgresql" % "9.1-901-1.jdbc4",
  "org.hibernate" % "hibernate-core" % "4.2.3.Final",
  "org.hibernate" % "hibernate-entitymanager" % "4.2.3.Final",
  "org.xerial" % "sqlite-jdbc" % "3.8.7",
  "org.json" % "org.json" % "chargebee-1.0"
)     

play.Project.playJavaSettings