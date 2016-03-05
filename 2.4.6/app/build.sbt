name := "app"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  evolutions,
  jdbc,
  javaCore,
  javaJdbc,
  javaJpa,
  filters,
  cache,
  json,
  ws,
  javaWs
)

lazy val root = (project in file(".")).enablePlugins(PlayScala)
