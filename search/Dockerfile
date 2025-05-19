# ──────────────── [ Stage 1: Build with Gradle ] ────────────────
FROM gradle:8.3-jdk17 AS builder

WORKDIR /search
COPY . .

# 빌드 실행 (bootJar는 Spring Boot, Kotlin 모두 지원)
RUN ./gradlew bootJar

# ──────────────── [ Stage 2: Runtime Image ] ────────────────
FROM eclipse-temurin:17-jdk

WORKDIR /search

# 빌드 결과만 복사
COPY --from=builder /search/build/libs/*.jar search.jar

ENTRYPOINT ["java", "-jar", "search.jar"]
