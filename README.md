# How to share Gradle version catalogs between separate projects

Store in one place all common lib's versions. The Example project [spring-data](spring-data) shows two type of in common place defined lib's version usage in totally isolated/separate projects. 

Test locally:
1. [version-catalog-bom-kit](version-catalog-bom-kit) > Task :publishToMavenLocal. Creating lib which Version Catalog and Maven BOM settings. 
2. Declare deps in [settings.gradle](spring-data%2Fsettings.gradle)




https://docs.gradle.org/current/userguide/platforms.html
https://docs.gradle.org/current/userguide/cross_project_publications.html
https://docs.gradle.org/current/userguide/plugins.html