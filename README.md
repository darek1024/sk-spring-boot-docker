# Spring Boot Application with Docker packaging

Build a docker image with:

```bash
./mvnw dockerfile:build
```

Run docker image:

```bash
docker run -p 8080:80 darek1024/dockerdemo:latest
```

Verify it works:

```shell
curl 'localhost:8080'
curl 'localhost:8080?name=Adam'
```


---

Wants more? Head to **Sztuka Kodu** - my polish 🇵🇱 blog on programming.

* https://sztukakodu.pl/kategoria/spring
