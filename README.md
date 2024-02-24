## Spring Boot Base Library
Common spring-boot-components on your other projects.

### Deploy
```
mvn clean deploy -Drevision='1.0.0' -f pom.xml --settings settings.xml
```

Note: `${revision}` placeholder doesn't work so update versions one by one.

### Import it from your project
```
<repositories>
    <repository>
        <id>sha-center</id>
        <name>Sha release</name>
        <url>http://localhost:8081/repository/maven-releases</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>com.sha.demomaven</groupId>
        <artifactId>infra</artifactId>
        <version>0.0.1</version>
    </dependency>
    <dependency>
        <groupId>com.sha.demomaven</groupId>
        <artifactId>domain</artifactId>
        <version>0.0.1</version>
    </dependency>    
</dependencies>
```