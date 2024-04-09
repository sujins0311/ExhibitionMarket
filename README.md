# 🎯 [Exhibition Service - Product API Serve]
<!-- (http://MyBoard.site/) --> 
This app is for studying Spring Boot and MSA, and it serves as a Product/Comment API Server.<br>
<br>
<br>


### 🌈 개요 및 목적

우리 프로젝트는 "그림 전시 판매 도네이션 플랫폼"으로써, 예술과 문화를 소통하고 공유하는 공간을 만들어 나갑니다. <br>
이 프로젝트의 핵심은 예술 작품을 통해 사람들의 삶과 이야기를 표현하고 공유하는 것에 있습니다.<br>
<br>
회원 및 상품과 댓글에 대한 API서버입니다. 회원 정보 수정, 탈퇴 등과 같은 기능을 제공하고, 추후 주문 및 결제 기능을 업데이트 할 예정입니다. <br>
MSA아키텍처를 적용하여 각 기능을 독립적인 서비스로 구현하고, 필요에 따라 확장이 용이한 구조를 가지고 있습니다.<br>

---

- 개발 인원: 3명
- 개발기간: 2023.06.01 ~ 2023.08.30
- 담당역할:<br>
김우진: 댓글관리 및 상품관리(백엔드, 프론트엔드)<br>
최수진: 회원관리(백엔드, 프론트엔드)<br>
김도희: 상품관리 및 디자인(백엔드, 프론트엔드)<br>

<br>

---

### 🚀 개발환경

- IDE : Eclipse, Visual Studio Code
- 버전 관리 시스템 : Git (GitHub)
- 운영체제 : Windows 10
- 빌드 자동화 도구 : Apache Maven
- WAS : Apache Tomcat 9
- Containerization : Docker, Docker compose

데이터베이스
- H2, MySQL 8.0

사용언어
- Java(JDK 11)
- JavaScript(ES6)
- HTML5
- CSS3

프레임워크/ 라이브러리
- ReactJS
- Spring Boot 2.4.2
- Spring Cloud
- Spring Security
- Spring JPA
- Jackson JSON
- Lombok

<br>

---

### 📚 Using this app

- Use Products / Comments APIs
- 주요기능(회원관리, 상품관리, 댓글관리, 주문관리)
- API List

| Endpoint |   |   | Description | Secured | Roles |
| --- | --- | --- | --- | --- | --- |
| Member | POST | Member-service/members | 회원 등록 | NO | ALL |
|  | PUT | Member-service/update | 회원 정보 수정 | YES | USER |
|  | PUT | Member-service/update | 회원 정보(비밀번호) 수정 | YES | USER |
|  | DELETE | Member-service/delete | 회원 삭제(탈퇴) | YES | USER |
|  | GET | Member-service/name/{username} | 회원 정보 자세히보기 | YES | USER,ADMIN |
|  | GET | Member-service/all | 회원 목록 | YES | USER,ADMIN |
|  | POST | Member-service/login | 회원 로그인 | NO | ALL |
|  | - | Member-service/logout | 회원 로그아웃 | YES | USER,ADMIN |
| Item | POST | Item-service/create | 상품등록 | YES | ADMIN |
|  | GET | Item-service/read | 상품보기 | NO | ALL |
|  | GET | Item-service/list | 상품목록 | NO | ALL |
|  | PUT | Item-service/update | 상품수정 | YES | ADMIN |
|  | DELETE | Item-service/delete | 상품삭제 | YES | ADMIN |
| Reply | GET | reply-service/replys/{id} | 댓글 자세히보기 | NO | ALL |
|  | GET | reply-service/bid | 댓글목록 | NO | ALL |
|  | PUT | reply-service/replys/{id} | 댓글수정 | YES | USER,ADMIN |
|  | POST | reply-service/replys | 댓글작성 | YES | USER,ADMIN |
|  | DELETE | reply-service/replys/{id} | 댓글삭제 | YES | USER,ADMIN |

<br>

---

### 🫥 Members

| 개발자    | GitHub                                      |
|----------|---------------------------------------------|
| 조장/ 김우진 | [🐈‍⬛ gitHub](https://github.com/woojin598) | 
| 조원/ 김도희 | [🐈‍⬛ gitHub](https://github.com/DahnaKim) | 
|  조원/ 최수진 | [🐈‍⬛ gitHub](https://github.com/sujins0311) | 



