# spring-data-example

### building
```bash
./gradlew clean build
or
gradlew.bat clean build

docker build -t kevin:latest .
```

### running
```bash
docker-compose up
```

### injecting data

```bash
curl -X POST \
  http://localhost:8080/majors \
  -d '{
	"name" : "Computer Science"
}'
```

### REST API
available at: http://localhost:8080/majors/

### HTML UI

available at: http://localhost:8080/