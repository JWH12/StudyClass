
SELECT * FROM book ;
SELECT * FROM customer ;
SELECT * FROM ORDERS ;

-- 1. å ��� ���� �ݾ��� 10000 ������ ����� �ڵ��� ��ȣ�� 1�� ����

UPDATE CUSTOMER
    SET PHONE = 1
    
    WHERE CUSTID IN(
            SELECT CUSTID 
            FROM(SELECT ROUND (AVG(SALEPRICE), 2) AS TOTAL ,C.CUSTID
                 FROM ORDERS O
                 INNER JOIN CUSTOMER C ON O.CUSTID = C.CUSTID
                 GROUP BY C.CUSTID
             )T WHERE T.TOTAL < 10000
    
                ) ;
SELECT * FROM CUSTOMER ;

--��������
SELECT ROUND (AVG(SALEPRICE), 2),C.CUSTID
FROM ORDERS O
INNER JOIN CUSTOMER C ON O.CUSTID = C.CUSTID
GROUP BY C.CUSTID
;



-- 2. å ��� ���� �ݾ��� ���� ���� ����� �ڵ��� ��ȣ�� 2�� ����

UPDATE CUSTOMER
    SET PHONE = 2
    WHERE CUSTID IN (
            SELECT MIN(T.TOTAL)
            FROM(SELECT AVG(SALEPRICE) AS TOTAL, C.CUSTID
                 FROM ORDERS O
                 INNER JOIN CUSTOMER C ON O.CUSTID = C.CUSTID
                 GROUP BY C.CUSTID
             )T 
                    )
;    
SELECT * FROM CUSTOMER;

--��������
SELECT ROUND (AVG(SALEPRICE), 2),C.CUSTID
FROM ORDERS O
INNER JOIN CUSTOMER C ON O.CUSTID = C.CUSTID
GROUP BY C.CUSTID
;





-- 3. �л����� ��� ������ ���� ���� �л��� ���� ���� �л��� ���� ���ϱ�

SELECT MAX(ENR_GRADE) - MIN(ENR_GRADE) AS TOTAL
FROM enrol E
INNER JOIN STUDENT S ON E.STU_NO = S.STU_NO
;






-- 4. 2���� ������ ���� �л����� ��������� 1���� ������ ���� �л����� ��������� ���� ���ϱ�



    SELECT AVG(ENR_GRADE)
    FROM STUDENT S 
    INNER JOIN ENROL E ON S.STU_NO = E.STU_NO
    INNER JOIN SUBJECT SUB ON SUB.SUB_NO = E.SUB_NO
    WHERE S.STU_NO IN (                                                                                                 
        SELECT STU_NO
        FROM (                                                                 
            SELECT COUNT(*) AS CNT, STU_NO 
            FROM ENROL  
            GROUP BY STU_NO
        ) T
        WHERE T.CNT >= 2
    )
;





SELECT * FROM ENROL;
SELECT * FROM SUBJECT;
SELECT * FROM STUDENT;


-- 5. ��ǻ�� �а����� ����� ���� �а��� ���� ���

SELECT STU_DEPT, ENR_GRADE
FROM ENROL E
INNER JOIN STUDENT S ON S.STU_NO = E.STU_NO
WHERE ENR_GRADE < (
        SELECT AVG(ENR_GRADE) CAVG
        FROM ENROL E
        INNER JOIN STUDENT S ON S.STU_NO = E.STU_NO
        WHERE STU_DEPT = '��ǻ������' 
      ) 
;


--��������
SELECT AVG(ENR_GRADE)
FROM ENROL E
INNER JOIN STUDENT S ON S.STU_NO = E.STU_NO
WHERE STU_DEPT = '��ǻ������'

;



-- 6. ��ǻ�� ���� ������ ��� �л����� ��� �������� ���� ������ ������ �ִ� ��ǻ�������� �л� ���








