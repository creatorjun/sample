# Sample Spring Boot API

Spring Boot 3 + Springdoc OpenAPI(Swagger) 샘플 프로젝트입니다.

## 실행 방법

```bash
./gradlew bootRun
```

## Swagger UI

서버 기동 후 아래 URL에서 API 명세서를 확인하고 직접 호출해볼 수 있습니다.

```
http://localhost:8080/swagger-ui.html
```

## 엔드포인트 목록

| Method | URL | 설명 |
|--------|-----|------|
| POST | /api/v1/users | 유저 생성 |
| GET | /api/v1/users | 전체 유저 조회 |
| GET | /api/v1/users/{id} | 유저 단건 조회 |
| PATCH | /api/v1/users/{id} | 유저 이름 수정 |
| DELETE | /api/v1/users/{id} | 유저 삭제 |

## 기술 스택

- Java 17
- Spring Boot 3.2.5
- Springdoc OpenAPI 2.5.0 (Swagger UI)
- Lombok
- In-memory 저장소 (ConcurrentHashMap)
