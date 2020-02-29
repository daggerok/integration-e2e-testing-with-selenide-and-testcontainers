# e2e testing of complex microservices system with selenide + testcontainers [![CI](https://github.com/daggerok/integration-e2e-testing-with-selenide-and-testcontainers/workflows/CI/badge.svg)](https://github.com/daggerok/integration-e2e-testing-with-selenide-and-testcontainers/actions)

Status: Please, check [this](https://github.com/daggerok/testcontainers-examples) repo instead...

## start

```bash
./mvnw
./mvnw -f ui docker:build docker:start
#./mvnw -f ui docker:stop docker:remove
```

## test

```bash
http :8080/ui/
http :8080/ui/v1/api/names
http :8080/ui/v1/api/greetings
```

## cleanup

```bash
docker rm -f -v `docker ps -aq`
docker rmi -f daggerok/ui daggerok/greetings daggerok/names
```

<!--
topics: jib + war
-->

## resources

* https://github.com/daggerok/testcontainers-examples
