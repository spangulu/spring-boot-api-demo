# Spring Boot API Demo

Minimal Java REST API demo by **Sarath Panguluri**, Test Automation Engineer.

Includes:
- `GET /api/health` returning `{"status":"ok"}`
- `GET /api/greet?name=Sarath` returning a greeting
- An illustrative MockMvc test

## Requirements

Java 17+ and Maven.

```bash
mvn spring-boot:run
# then open http://localhost:8080/api/health
```

Optional: `mvn test`.

**Demo code only.** No tests or builds were run during publication.
