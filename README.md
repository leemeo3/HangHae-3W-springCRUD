# Spring - CRUD
#### Springboot를 사용해 최소한의 백엔드의 CRUD만을 구현한 프로젝트
## 1. 요구 사항
#### 1. 전체 게시글 목록 조회 API
* 제목, 작성자명, 작성 내용, 작성 날짜를 조회하기
* 작성 날짜 기준 내림차순으로 정렬하기
### 2. 게시글 작성 API
* 제목, 작성자명, 비밀번호, 작성 내용을 저장하고
* 저장된 게시글을 Client 로 반환하기
### 3. 선택한 게시글 조회 API
* 선택한 게시글의 제목, 작성자명, 작성 날짜, 작성 내용을 조회하기 
* (간단한 게시글 조회만 구현)
### 4. 선택한 게시글 수정 API
* 수정을 요청할 때 수정할 데이터와 비밀번호를 같이 보내서 서버에서 비밀번호 일치 여부를 확인 한 후
* 제목, 작성자명, 작성 내용을 수정하고 수정된 게시글을 Client 로 반환하기
### 5. 선택한 게시글 삭제 API
* 삭제를 요청할 때 비밀번호를 같이 보내서 서버에서 비밀번호 일치 여부를 확인 한 후
* 선택한 게시글을 삭제하고 Client 로 성공했다는 표시 반환하기
## 2. API 설계도
![스크린샷 2022-12-01 오후 11 18 52](https://user-images.githubusercontent.com/117142323/205076242-9b06cf26-d8d5-43fc-86b1-7f672e8be321.png)
## 3. 기능 구성도 
![스크린샷 2022-12-01 오후 11 16 57](https://user-images.githubusercontent.com/117142323/205075830-3bae6045-7b9c-4585-88cf-21dc741ca8e8.png)
## 4. 사용한 기술 및 툴
* Java
* SpringBoot
* JPA
* H2-database
* Postman
