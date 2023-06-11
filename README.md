**Exhibition Service - Product API Server**

---

- 개발 인원: 4명
- 개발기간: 2023.05.01 ~ 2023.00.00
- 담당역할: 작성예정
- This app is for study Spring Boot and MSA.
- This app is Product/Comment API Server.
- Visit (링크예정)

**Development environment**

---

- 개발언어: Java(JDK 11), JavaScript
- 프레임워크: Spring Boot 2.4.2, Spring Cloud 2020.0.0
- IDE: Eclipse 2022.12 (4.26.0) , Visual Studio Code(1.79.0)
- 버전 관리 시스템: Git (GitHub)
- Service Discovery : Eureka 1.10.10
- Web Application Server: Tomcat 9.0.41
- 빌드 자동화 도구: Maven 3.1.0
- 데이터베이스 : h2-console
- 운영체제: Windows 10

**Using this app**

---

- Use Products / Comments APIs
- 주요기능(회원관리, 상품관리, 댓글관리, 주문관리)
- API List
| Endpoint | Description | Secured | Roles |
| --- | --- | --- | --- |
| Member | POST | Member-service/members | 회원 등록 |
|  | PUT | Member-service/update | 회원 정보 수정 |
|  | PUT | Member-service/update | 회원 정보(비밀번호) 수정 |
|  | DELETE | Member-service/delete | 회원 삭제(탈퇴) |
|  | GET | Member-service/name/{username} | 회원 정보 자세히보기 |
|  | GET | Member-service/all | 회원 목록 |
|  | POST | Member-service/login | 회원 로그인 |
|  | - | Member-service/logout | 회원 로그아웃 |
| Item | POST | Item-service/create | 상품등록 |
|  | GET | Item-service/read | 상품보기 |
|  | GET | Item-service/list | 상품목록 |
|  | PUT | Item-service/update | 상품수정 |
|  | DELETE | Item-service/delete | 상품삭제 |
| Order | GET | Orderservice/orders/detail/{username} | 주문 확인 |
|  | POST | Order-service/orders | 주문 생성 |
|  | PUT | Order-service/orders/edit | 주문 수정 |
|  | DELETE | orders/delete/{id} | 주문 삭제 |
| Reply | GET | reply-service/replys/{id} | 댓글 자세히보기 |
|  | GET | reply-service/bid | 댓글목록 |
|  | PUT | reply-service/replys/{id} | 댓글수정 |
|  | POST | reply-service/replys | 댓글작성 |
|  | DELETE | reply-service/replys/{id} | 댓글삭제 |

**Contacts**

---

- 조장 :김우진(깃주소)
- 조원 :김도희(깃주소)
       :김연준(깃주소)
       :최수진(깃주소)
