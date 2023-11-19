-- ******************** PERSON ********************
--테이블 삭제 (PERSON)
DROP TABLE PERSON;

--테이블 생성 (PERSON)
CREATE TABLE PERSON(
	seq NUMBER(8),      -- 번호
    name VARCHAR(50),   -- 이름
    age NUMBER(8),    	-- 나이
    
    --기본키 지정
    CONSTRAINT person_pk PRIMARY KEY (seq)
);

--시퀀스 생성
CREATE SEQUENCE SEQ_PERSON
START WITH 1
INCREMENT BY 1;