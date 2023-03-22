/*
SELECT * FROM BOOK;                                                     -- UPDATE �� ���� PK���� �༭ �ߺ����� �����ϸ� ������ �ɾ �ٲ� �����͸� ����Ѵ�. 

UPDATE BOOK                                                             -- ���� ���� ������ ���� ,�� ��� �ٲ� �����͸� �߰��Ѵ�. 
SET
   BOOKNAME = '�౸�� ����'
   , PRICE = 7000
WHERE 
  BOOKID = 1 ;        */
  
  
  
SELECT * FROM STUDENT; -- �л� ����

SELECT * FROM ENROL;   -- �����ȣ �й� �� ����

SELECT * FROM Subject;  -- ����� �� ���� ����

  
  
  
  
--1�� 20153075 �й� �л��� ���� B�� ����---------------------------------------------------
SELECT *
FROM STUDENT;

UPDATE STUDENT 
    SET STU_CLASS = 'B'
    
WHERE STU_NO = '20153075'
;



  
  
--2�� ��ü ��պ��� ���� Ű�� ���� �л��� Ű 1 ����--------------------------------------------------
SELECT *
FROM STUDENT;

UPDATE STUDENT
    SET STU_HEIGHT = STU_HEIGHT +1

 WHERE STU_HEIGHT < (
            SELECT AVG(STU_HEIGHT)
            FROM STUDENT ) ;



--��������
SELECT AVG(STU_HEIGHT) 
FROM STUDENT ;




 
--3�� ��������� 65�� ������ �л����� ������ 1����----------------------------------------
SELECT *
FROM STUDENT;

UPDATE STUDENT
    SET STU_WEIGHT = STU_WEIGHT +1
    WHERE STU_NO IN (
                SELECT STU_NO
                FROM (
                    SELECT AVG(ENR_GRADE) AS STU_AVG, E.STU_NO
                    FROM ENROL E
                    INNER JOIN STUDENT S ON S.STU_NO = E.STU_NO
                    GROUP BY E.STU_NO
                )
                WHERE STU_AVG <= 65
            )
;
            
--�������� -- �������
SELECT AVG(ENR_GRADE) AS STU_AVG, E.STU_NO
FROM ENROL E
INNER JOIN STUDENT S ON S.STU_NO = E.STU_NO
GROUP BY E.STU_NO  ;
  
  
  
  
--4�� ��ǻ�Ͱ��� ������ ��� �л����� Ű�� �����Ը� 1�� ����-------------------------------------------------------
SELECT *
FROM STUDENT;

UPDATE STUDENT 
SET
    STU_HEIGHT = STU_HEIGHT - 1
    , STU_WEIGHT = STU_WEIGHT - 1
WHERE STU_NO IN(
    SELECT S.STU_NO
    FROM STUDENT S
    INNER JOIN ENROL E ON S.STU_NO = E.STU_NO
    INNER JOIN SUBJECT S2 ON S2.SUB_NO = E.SUB_NO
    WHERE S2.SUB_NAME = '��ǻ�Ͱ���'
)
;
  
--��������
SELECT S.STU_NO 
FROM STUDENT S
INNER JOIN ENROL E ON S.STU_NO = E.STU_NO
INNER JOIN SUBJECT S2 ON S2.SUB_NO = E.SUB_NO
WHERE S2.SUB_NAME = '��ǻ�Ͱ���';
  
  
  
  
  
  
--5�� å �� ���� ����� ���� ���� ����� �̸�, �ּ�, �� ���ž� ���------------------------------------------------------- 
  
SELECT NAME, ADDRESS, P_SUM
FROM ORDERS O
INNER JOIN CUSTOMER C ON O.CUSTID = C.CUSTID
INNER JOIN (
    SELECT P_SUM, CUSTID
    FROM (
        SELECT SUM(SALEPRICE) AS P_SUM, CUSTID
        FROM ORDERS
        GROUP BY CUSTID
        ORDER BY P_SUM DESC                                                        -- DESC �������� ARC ��������
    )
    WHERE ROWNUM = 1                                                                -- �� �� �ֻ�� �ϳ��� ���� ����Ѵ�.
) A ON O.CUSTID = A.CUSTID
GROUP BY NAME, ADDRESS, P_SUM                                                      --GROUP BY�� ���� ���� ���� ��� ���� ���� ��� ������ ���� ������ �Ѵ�.
;-- DISTINCT�� ����ϸ� GROUP BY �� �������� ������� �ʾƵ� �ȴ�.



--��������
SELECT SUM(SALEPRICE) AS P_SUM, CUSTID
FROM ORDERS
GROUP BY CUSTID
ORDER BY P_SUM DESC;


--6�� å �� ���� ����� ���� ���� ����� ���� ���� ����� ���� ���ϱ�-------------------------------------------------------
SELECT MAX(P_SUM) - MIN(P_SUM)                                                      -- MAX ������ MIN ���� ����.
FROM (
  
        SELECT SUM(SALEPRICE) AS P_SUM, CUSTID
        FROM ORDERS
        GROUP BY CUSTID
        ORDER BY P_SUM DESC
    );


--��������
SELECT SUM(SALEPRICE) AS P_SUM, CUSTID
FROM ORDERS
GROUP BY CUSTID
ORDER BY P_SUM DESC;


--7�� 3���� å�� ������ ����� �̸�, �ּ�, å ���� ���� ���-------------------------------------------------------

SELECT NAME, ADDRESS, CNT
FROM ORDERS O
INNER JOIN CUSTOMER C ON C.CUSTID = O.CUSTID
INNER JOIN (
    SELECT CUSTID, CNT
    FROM (
        SELECT COUNT(*) AS CNT, CUSTID
        FROM ORDERS
        GROUP BY CUSTID
    ) WHERE CNT = 3
) A ON O.CUSTID = A.CUSTID
GROUP BY NAME, ADDRESS, CNT
;


--�������� 
SELECT COUNT(*) AS CNT, CUSTID
FROM ORDERS
GROUP BY CUSTID;




--8�� å �� ���� �ݾ��� 32000�� ������ ����� �ڵ��� ��ȣ�� 1234�� ����-------------------------------------------------------

UPDATE CUSTOMER
SET
    PHONE = '1234'
WHERE 
    CUSTID IN (
        SELECT CUSTID
        FROM (
            SELECT SUM(SALEPRICE) AS P_SUM, CUSTID
            FROM ORDERS
            GROUP BY CUSTID
            ORDER BY P_SUM DESC
        )
        WHERE P_SUM <= 32000
    );
    
   









SELECT * FROM book ;
SELECT * FROM customer ;
SELECT * FROM ORDERS ;










  
  
  
  
  
  
  
  