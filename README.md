# Squiggly Filter Jackson Spring Boot POC application

To run the example, cd to the examples/spring-boot directory on the command line type the following:

```bash
mvn spring-boot:run
```

In another terminal, you can request the issue json by doing the following:

1) To print the raw json
```bash
curl -s -g 'http://localhost:8080/issues'
```
or
```bash
curl -s -g 'http://localhost:8080/issues/ISSUE-1'
```
