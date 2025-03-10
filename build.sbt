lazy val root = (project in file(".")).
  settings(
    organization := "com.github.freeclimbapi",
    name := "freeclimb-java-client",
    version := "6.1.2",
    scalaVersion := "2.11.4",
    scalacOptions ++= Seq("-feature"),
    javacOptions in compile ++= Seq("-Xlint:deprecation"),
    publishArtifact in (Compile, packageDoc) := false,
    resolvers += Resolver.mavenLocal,
    libraryDependencies ++= Seq(
      "io.swagger" % "swagger-annotations" % "1.6.3",
      "com.squareup.okhttp3" % "okhttp" % "4.9.3",
      "com.squareup.okhttp3" % "logging-interceptor" % "4.9.3",
      "com.google.code.gson" % "gson" % "2.8.9",
      "org.apache.commons" % "commons-lang3" % "3.12.0",
      "org.openapitools" % "jackson-databind-nullable" % "0.2.2",
      "org.threeten" % "threetenbp" % "1.6.0" % "compile",
      "io.gsonfire" % "gson-fire" % "1.8.5" % "compile",
      "jakarta.annotation" % "jakarta.annotation-api" % "1.3.5" % "compile",
      "com.google.code.findbugs" % "jsr305" % "3.0.2" % "compile",
      "jakarta.annotation" % "jakarta.annotation-api" % "1.3.5" % "compile",
      "junit" % "junit" % "4.13.2" % "test",
      "com.novocode" % "junit-interface" % "0.10" % "test"
    )
  )
