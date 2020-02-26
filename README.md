# e2e testing of complex microservices system with selenide + testcontainers [![CI](https://github.com/daggerok/integration-e2e-testing-with-selenide-and-testcontainers/workflows/CI/badge.svg)](https://github.com/daggerok/integration-e2e-testing-with-selenide-and-testcontainers/actions)

Status: IN PROGRESS

## start

```bash
./mvnw
./mvnw -f ui docker:build docker:start
./mvnw -f ui docker:stop docker:remove
```

## cleanup

```bash
docker rm -f -v `docker ps -aq`
docker rmi -f daggerok/ui daggerok/greetings daggerok/names
```

<!--
topics: jib + war
-->
