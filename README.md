## 실시간 선착순 이벤트 기본 모듈
### 혁신적인 쿠폰 관리, 이제 모든 프로젝트에서 쉽게 이용하세요!
우리는 다양한 애플리케이션과 서비스에서 필수적인 요소인 '쿠폰 발급 및 관리'를 위한 실시간 쿠폰 발급 시스템을 개발하고 있습니다.  
이 시스템은 모듈화된 구조로 설계되어 있어, 어떤 프로젝트에도 쉽게 통합하고 사용할 수 있습니다.
<br>
<br>

## 멀티 모듈 프로젝트 구성
##### real-time-event-basic : 실시간 쿠폰 발급 시스템
##### real-time-event-security : 로그인 및 보안
##### real-time-event-common : 공통 및 유저 관리
<br>

## Setting
- JAVA 17
- Spring Boot 3.2.0
- MySQL 8.0.27
- Redis 7.2.5
- Kafka
<br>
<br>

## Guide
#### docker 설치
```
brew install docker
brew link docker

docker version
```
#### docker mysql 실행 명령어
```
docker pull mysql
docker run -d -p 3306:3306 -e MYSQL_ROOT_PASSWORD=1234 --name mysql mysql
docker ps
docker exec -it mysql bash
```
#### mysql 명령어
```
mysql -u root -p
create database coupon_example;
use coupon_example;
```
#### redis 설치
```
docker pull redis

docker run --name myredis -d -p 6379:6379 redis
```
#### redis 실행
```
docker exec -it <도커 Redis 컨테이너 아이디> redis-cli
```
#### redis 초기화
```
flushall
```
#### kafka 실행
```
docker-compose up -d
```
#### kafka 종료
```
docker-compose down
```
#### kafka topic 생성
```
docker exec -it kafka kafka-topics.sh --bootstrap-server localhost:9092 --create --topic coupon_create
```
#### kafka Consumer 실행
```
docker exec -it kafka kafka-console-consumer.sh --topic coupon_create --bootstrap-server localhost:9092 --key-deserializer "org.apache.kafka.common.serialization.StringDeserializer" --value-deserializer "org.apache.kafka.common.serialization.LongDeserializer"
```
<br>
<br>

## Entity Relationship Diagram
![image](https://github.com/SeoYounSeok/real-time-event-basic/assets/43161245/76f56e86-5668-4770-80a0-0cff4e87e3ec)
<br>
<br>

## Structure
![image](https://github.com/SeoYounSeok/real-time-event-basic/assets/43161245/901005e1-0ef3-48dc-a112-07c40e102aeb)
<br>