# elk-example


### 스프링부트 실행
```
cd ./demo
./gradlew bootRun
```

### ELK 실행
```
docker-compose up setup
docker-compose up -d
```

### 키바나 접속

> http://localhost:5601

1. Home > Management > Dev Tools 클릭
2. GET /_cat/indices?v 실행
3. hsrm_log 라는 인덱스가 검색되는지 확인
4. GET /hsrm_log/_search 실행
5. 내용이 나오는지 확인


### Dashboard

인덱스 추가 후 대쉬보드 시각화 구성

