# 트리플 클럽 마일리지 적립

# 기술 스택
- 운영체제: MAC, 윈도우
- IDE: 인텔리제이(IntelliJ)
- JDK 버전: 11
- 스프링부트 버전: 2.7.0
- 데이터베이스: Mysql (8.0.26)
- 빌드 툴: Maven
- 모델링 : https://dbdiagram.io/d 


1. 프로젝트 설정 

2.도메인
  * User
    * id
    
  * Place
    * id
    
  * review
    * id 
    * user_id
    * place_id
    * createDt
    * updateDt

  * mileage_active : 마일리지 활성화 테이블 - 목적 : insert  
