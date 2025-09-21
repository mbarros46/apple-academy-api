# Deploy – API (Spring Boot 3 + Java 21)

## Requisitos
- Docker e Docker Compose instalados
- Porta 8083 livre

## Perfis
- `dev` (padrão): H2 em memória, Flyway desligado, porta 8080
- `prod`: Postgres, Flyway ligado, porta 8083

## Subir local com Docker (prod)
```bash
docker compose up -d --build
```

Aguarde o db ficar saudável. O app sobe em:

**API**: http://localhost:8083

**Health**: http://localhost:8083/actuator/health

## Variáveis (prod)

- `APPLE_API_DB_URL` (ex.: jdbc:postgresql://db:5432/apple_api)
- `APPLE_API_DB_USERNAME` (ex.: apple)
- `APPLE_API_DB_PASSWORD` (ex.: applepwd)
- `APPLE_API_JWT_SECRET` (ex.: troque em produção)
- `APPLE_API_PROFILE=prod`

## Rodar em dev (sem Docker)
```bash
./mvnw spring-boot:run
# ou
mvn spring-boot:run
```

**API**: http://localhost:8080

## Build da imagem para usar em provedor
```bash
docker build -t minha-org/minha-api:latest .
```

## Dicas de Deploy em nuvem

**Render/Railway/Fly.io**: crie serviço de Postgres + serviço Web para o app.

- Configure as variáveis `APPLE_API_*` no painel do provedor.
- Exponha a porta 8083 no container (ou ajuste conforme o provedor).
- Garanta que `/actuator/health` responda 200 para healthcheck.

---

# Passo a passo objetivo (o que você faz agora)

1. **Atualize o `pom.xml`** (Java 21, Boot 3.4.x, deps listadas).
2. **Crie/ajuste** os arquivos de **properties** exatamente como acima.
3. **Garanta migrações Flyway** em `src/main/resources/db/migration`.
4. **Implemente/ajuste Security + JWT** (use o `SecurityConfig` acima e, se faltar, me peça os arquivos de JWT que eu te mando completos).
5. **Cole o `Dockerfile` e o `docker-compose.yml`** na raiz.
6. Rode:
   ```bash
   docker compose up -d --build
   ```