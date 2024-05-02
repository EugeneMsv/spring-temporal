# spring-temporal

Spring-boot app build with Gradle and using Temporal.io workflow engine

## Project structure

- [buildSrc](buildSrc) is used to share common logic across all modules more
  details [here](https://docs.gradle.org/current/userguide/sharing_build_logic_between_subprojects.html#sec:using_buildsrc)
  and [here](https://docs.gradle.org/current/userguide/custom_plugins.html#sec:precompile_script_plugin)
- [domain](domain) is for storing model classes
- [service](domain) is for application entry point

## Running locally

- execute `./gradlew :service:assemble`
- execute `java -jar service/build/libs/service-1.0-SNAPSHOT.jar` 
