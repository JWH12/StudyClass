/*
CREATE TABLE student (
  stu_no char(9)PRIMARY KEY,
  stu_name varchar(12),
  stu_dept varchar(20),
  stu_grade NUMBER ,
  stu_class char(1) ,
  stu_gender char(1) ,
  stu_height NUMBER ,
  stu_weight NUMBER
 
);

CREATE TABLE subject (
  sub_no char(3) PRIMARY KEY,
  sub_name varchar(30) ,
  sub_prof varchar(12) ,
  sub_grade NUMBER ,
  sub_dept varchar(20) 
) ;

CREATE TABLE enrol (
  sub_no char(3) REFERENCES subject(sub_no),
  stu_no char(9) REFERENCES student(stu_no),
  enr_grade NUMBER 
);
INSERT INTO STUDENT VALUES(20153075,'���Ѻ�','���',1,'C','M',177,80);
INSERT INTO STUDENT VALUES(20153088,'���¿�','���',1,'C','F',162,50);
INSERT INTO STUDENT VALUES(20143054,'������','���',2,'C','F',154,47);
INSERT INTO STUDENT VALUES(20152088,'���ο�','��������',1,'C','M',188,90);
INSERT INTO STUDENT VALUES(20142021,'�ɼ���','��������',2,'A','F',168,45);
INSERT INTO STUDENT VALUES(20132003,'����ö','��������',3,'B','M',NULL,63);
INSERT INTO STUDENT VALUES(20151062,'������','��ǻ������',1,'B','M',166,67);
INSERT INTO STUDENT VALUES(20141007,'������','��ǻ������',2,'A','M',174,64);
INSERT INTO STUDENT VALUES(20131001,'������','��ǻ������',3,'C','M',NULL,72);
INSERT INTO STUDENT VALUES(20131025,'������','��ǻ������',3,'A','F',172,63);
INSERT INTO SUBJECT VALUES('111', '�����ͺ��̽�', '���翵',2,'��ǻ������');
INSERT INTO SUBJECT VALUES('110', '�ڵ�����','������',2,'��������');
INSERT INTO SUBJECT VALUES('109', '�ڵ�ȭ����','�ڹο�',3,'���');
INSERT INTO SUBJECT VALUES('101', '��ǻ�Ͱ���','������',3,'��ǻ������');
INSERT INTO SUBJECT VALUES('102', '�����۹�','���¿�',1,'���');
INSERT INTO SUBJECT VALUES('103', '�������ڽ���','������',1,'��������');
INSERT INTO SUBJECT VALUES('104', '�ý��ۺм�����','������',3,'��ǻ������');
INSERT INTO SUBJECT VALUES('105', '����Ҽ���','���',1,'���');
INSERT INTO SUBJECT VALUES('106', '����ȸ�ν���','�ֿ���',3,'��������');
INSERT INTO SUBJECT VALUES('107', 'CAD����ǽ�','������',2,'���');
INSERT INTO SUBJECT VALUES('108', '����Ʈ�������','�ǹμ�',1,'��ǻ������');
INSERT INTO ENROL VALUES('101', '20131001', 80);
INSERT INTO ENROL VALUES('104', '20131001', 56);
INSERT INTO ENROL VALUES('106', '20132003', 72);
INSERT INTO ENROL VALUES('103', '20152088', 45);
INSERT INTO ENROL VALUES('101', '20131025', 65);
INSERT INTO ENROL VALUES('104', '20131025', 65);
INSERT INTO ENROL VALUES('108', '20151062', 81);
INSERT INTO ENROL VALUES('107', '20143054', 41);
INSERT INTO ENROL VALUES('102', '20153075', 66);
INSERT INTO ENROL VALUES('105', '20153075', 56);
INSERT INTO ENROL VALUES('102', '20153088', 61);
INSERT INTO ENROL VALUES('105', '20153088', 78);  */

/*
SELECT * FROM STUDENT; -- �л� ����

SELECT * FROM ENROL;   -- �����ȣ �й� �� ����

SELECT * FROM Subject;  -- ����� �� ���� ����  */



--1������ -------------------------------------------------------
SELECT COUNT(stu_height)FROM STUDENT 
WHERE stu_height >= 180;


--2������ -------------------------------------------------------
SELECT * FROM STUDENT 
WHERE stu_dept LIKE '��������' AND stu_weight >= 50;

--3������ X-------------------------------------------------------
UPDATE STUDENT
SET 
    STU_HEIGHT = STU_HEIGHT+1
WHERE STU_DEPT = '��ǻ������' AND STU_HEIGHT IS NOT NULL;

--4������ X-------------------------------------------------------
SELECT AVG(ENR_GRADE) AS ���, STU_NO 
FROM ENROL 
GROUP BY STU_NO 
ORDER BY ��� DESC;


--5������ X-------------------------------------------------------
SELECT MAX(ENR_GRADE) AS �ְ�����, SUB_NO
FROM ENROL 
GROUP BY SUB_NO
ORDER BY SUB_NO;


--6������ -------------------------------------------------------
SELECT * FROM Subject 
WHERE sub_NAME LIKE '%����%';


--7������ X-------------------------------------------------------
SELECT AVG(STU_HEIGHT), STU_GRADE, STU_GENDER FROM STUDENT 
WHERE STU_GRADE = 2 AND STU_GENDER ='M'
GROUP BY STU_GRADE, STU_GENDER;




--INNER JOIN�� ���Ͽ� 3���� ���̺��� �����ϴ� �ڵ� // �л����� ���� ���̺��� �ۼ� �� ��
SELECT E.*, S.STU_NAME, S2.SUB_NAME
FROM ENROL E
INNER JOIN STUDENT S ON S.stu_no = E.STU_NO 
INNER JOIN SUBJECT S2 ON S2.SUB_NO = E.SUB_NO;

--�л����� ���� ���̺��� �ۼ� �� �� => ��ǻ������ �а� �л��鸸 ���
SELECT E.*, S.STU_NAME, S.STU_DEPT, S2.SUB_NAME 
FROM ENROL E
INNER JOIN STUDENT S ON S.stu_no = E.STU_NO 
INNER JOIN SUBJECT S2 ON S2.SUB_NO = E.SUB_NO
WHERE S.STU_DEPT LIKE '��ǻ������';



-- ���� ���� : ���� �ȿ� �ٸ� ������ ���� ��
-- ������ ��ü ��պ��� ���� ������ ���� ����� ��� 
SELECT *
FROM STUDENT S
INNER JOIN ENROL E ON S.STU_NO = E.STU_NO
WHERE E.ENR_GRADE >(SELECT AVG(ENR_GRADE)FROM ENROL); -- ���������� �߰��ϴ� ���


SELECT AVG(ENR_GRADE)
FROM ENROL; 



-- ���� ���� ��� ���� �߰��� ����ϴ� ���
SELECT stu_NAME, ENR_GRADE, ROUND(AVG_ALL, 2)AS ���             -- ROUND (���̺� ,2) �Ҽ����� ���ϴ� �ڸ����� ����ϴ� ��� / ��Ī�� ������ ""�� ����Ͽ� ��� �� ��
FROM STUDENT S
INNER JOIN ENROL E ON S.STU_NO = E.STU_NO                       
INNER JOIN
 (SELECT AVG(ENR_GRADE)AVG_ALL FROM ENROL)                    --���� ������ �� ����� ���� ���� ���̺��̱� ������ INNER JOIN�� ��� �� �� �ִ�.
 A ON E.ENR_GRADE > A.AVG_ALL;                                 -- ���������� INNER JOIN���� ����� ���� ()�� ����ؾ� �Ѵ�.


--(��������) ��ü����� ���� ��
SELECT AVG(ENR_GRADE)
FROM ENROL; 




--�������� ����------------------------------------------------------------------

--1��--------------------------------
SELECT S.STU_NAME, S.STU_NO, S.STU_HEIGHT
FROM STUDENT S
INNER JOIN (SELECT AVG(STU_HEIGHT)AVG_ALL FROM STUDENT) A
ON S.STU_HEIGHT > A.AVG_ALL ;                                                  -- ���������� ���� ������ ���� ���� ���������� ���� ���� ������ ������ ����. 

--��������
SELECT AVG(STU_HEIGHT)
FROM STUDENT;




--2��----------------------------

SELECT S.STU_NAME, S.STU_DEPT, SUB.SUB_NAME, E.ENR_GRADE
FROM STUDENT S
INNER JOIN ENROL E ON S.STU_NO = E.STU_NO
INNER JOIN SUBJECT SUB ON E.SUB_NO = SUB.SUB_NO
INNER JOIN (SELECT AVG(ENR_GRADE)AVG_ALL FROM ENROL) A
ON E.ENR_GRADE > A.AVG_ALL

WHERE STU_DEPT LIKE '��ǻ������' ;

--��������
SELECT AVG(ENR_GRADE)
FROM ENROL;




--3��------------------------------- 

SELECT S.STU_NAME, S.STU_DEPT, S.STU_HEIGHT, ROUND(AVG_DEPT, 2) AS �а����
FROM STUDENT S
INNER JOIN (
    SELECT AVG(STU_HEIGHT) AS AVG_DEPT, STU_DEPT
    FROM STUDENT
    GROUP BY STU_DEPT
) A ON S.STU_DEPT = A.STU_DEPT
WHERE S.STU_HEIGHT > A.AVG_DEPT;


--��������
SELECT AVG(STU_HEIGHT)
FROM STUDENT
GROUP BY STU_EDPT;





--DB2 ����======================================================================================================================================================================

--1�� �л���ȣ, �̸�, �����, ���� ���--------------------------------

SELECT S.STU_NO, S.STU_NAME, SUB_NAME, ENR_GRADE
FROM STUDENT S
INNER JOIN ENROL E ON E.STU_NO = S.STU_NO  
INNER JOIN SUBJECT SUB ON SUB.SUB_NO = E.SUB_NO  
;




--2�� ������ 70�� �̻��� �л����� �̸� ���---------------------------------

SELECT S.STU_NAME, E.ENR_GRADE
FROM STUDENT S
INNER JOIN ENROL E ON E.STU_NO = S.STU_NO
INNER JOIN (SELECT AVG(ENR_GRADE)AVG_ALL FROM enrol )A
ON  E.ENR_GRADE > A.AVG_ALL
WHERE ENR_GRADE >= 70
;


--��������
SELECT AVG(ENR_GRADE)
FROM enrol;





--3�� ������ �л��� �����ϴ� ����� �ش� ���� ���--------------------------------------------------

SELECT S.STU_NAME, SUB.SUB_NAME, SUB.SUB_PROF
FROM STUDENT S
INNER JOIN ENROL E ON E.STU_NO = S.STU_NO
INNER JOIN SUBJECT SUB ON SUB.SUB_NO = E.SUB_NO
WHERE S.STU_NAME LIKE '������'
;






--4�� ��ǻ�Ͱ��� ������ ��� �л��� �й�,  �̸� ���-----------------------------------------------

SELECT S.STU_NAME, S.STU_NO, SUB.SUB_NAME
FROM STUDENT S
INNER JOIN ENROL E ON E.STU_NO = S.STU_NO
INNER JOIN SUBJECT SUB ON SUB.SUB_NO = E.SUB_NO
WHERE SUB.SUB_NAME LIKE '��ǻ�Ͱ���'
;






--5�� �����۹�, �������ڽ��� ������ ��� �л��� �й�, �̸�, ����� ���----------------------------------------------

SELECT S.STU_NAME, S.STU_NO, SUB.SUB_NAME
FROM STUDENT S
INNER JOIN ENROL E ON E.STU_NO = S.STU_NO
INNER JOIN SUBJECT SUB ON SUB.SUB_NO = E.SUB_NO
WHERE SUB.SUB_NAME LIKE '�����۹�' OR SUB.SUB_NAME LIKE '�������ڽ���'
--WHERE SUB.SUB_NAME IN ('�����۹�', '�������ڽ���') -- IN�� ����Ͽ� ����� �� ���� ����Ѵ�  // NOT IN ()�� ��ȣ�ȿ� ���Ե��� ���� ���� ����Ѵ�
;






--6�� �����̸鼭 ������ ������ ������ ��� �л� ���------------------------------------------------
SELECT S.STU_NAME, SUB.SUB_PROF, SUB.SUB_NAME
FROM STUDENT S
INNER JOIN ENROL E ON E.STU_NO = S.STU_NO
INNER JOIN SUBJECT SUB ON SUB.SUB_NO = E.SUB_NO
WHERE S.STU_GENDER = 'F' AND sub.sub_prof = '������'
;






--7�� �������� ���� ��� �������� ���� �л����� �̸�, ���� ���, �� ������ ���� �������. ------------------------------------------------

SELECT S.STU_NAME, E.ENR_GRADE
FROM STUDENT S
INNER JOIN ENROL E ON E.STU_NO = S.STU_NO
INNER JOIN SUBJECT SUB ON SUB.SUB_NO = E.SUB_NO
INNER JOIN (SELECT AVG(ENR_GRADE)AVG_KIM
            FROM ENROL E
            INNER JOIN STUDENT S ON S.STU_NO = E.STU_NO
            WHERE STU_NAME LIKE '������')A
            ON E.ENR_GRADE < A.AVG_KIM

ORDER BY E.ENR_GRADE DESC
;

--��������---
SELECT AVG(ENR_GRADE)
FROM ENROL E
INNER JOIN STUDENT S ON S.STU_NO = E.STU_NO
WHERE STU_NAME LIKE '������' 
;

  
  
  
  
--8�� �� ���� �̻��� ������ �л�(enrol�� 2���̻� ������ �ִ�)���� �й�, �̸�, �����, ���� ��� -----------------------------------------------  
  
SELECT S.STU_NO, STU_NAME, STU_DEPT, ENR_GRADE
FROM STUDENT S 
INNER JOIN ENROL E ON S.STU_NO = E.STU_NO
INNER JOIN SUBJECT SUB ON SUB.SUB_NO = E.SUB_NO
WHERE S.STU_NO IN (                                                            -- in()�� ����ϸ� Ư�������� �����Ͽ� Ȯ���� �����ϴ�.                                         
    SELECT STU_NO
    FROM (                                                                     --���������� ���̺��̱� ������ FROM�� �ڿ� �� �� �ִ�. �̷��� �Ǹ� CNT�� �÷��� �Ǿ� ������ ���� �� �� �ְ� �ȴ�.
        SELECT COUNT(*) AS CNT, STU_NO 
        FROM ENROL  
        GROUP BY STU_NO
    ) T
    WHERE T.CNT > 1
)
ORDER BY STU_NAME;



--��������
SELECT COUNT(*) AS CNT, STU_NO 
FROM ENROL  
GROUP BY STU_NO
;




-- 9. �� �а��� ������� �� ���� ���� �������� ���� ������ ���� �л��� ���� ��� ---------------------------------------------

SELECT * 
FROM STUDENT S
INNER JOIN ENROL E ON S.STU_NO = E.STU_NO
INNER JOIN (SELECT MAX(AVG_DEPT) AS AVG_MAX
            FROM ( 
                SELECT AVG(ENR_GRADE) AS AVG_DEPT
                FROM STUDENT S
                INNER JOIN ENROL E ON S.STU_NO = E.STU_NO
                GROUP BY STU_DEPT)
            ) A ON E.ENR_GRADE > A.AVG_MAX;


--9. ALL ��� ��
SELECT * 
FROM STUDENT S
INNER JOIN ENROL E ON S.STU_NO = E.STU_NO
WHERE E.ENR_GRADE > ALL(            --ALL�� ����ϸ� ��ȣ�ȿ� �ִ� ���������� ���Ͽ� WHERE E.ENR_GRADE > ���ǿ� �´� ���� ����Ѵ�.
    SELECT AVG(ENR_GRADE)
    FROM STUDENT S
    INNER JOIN ENROL E ON S.STU_NO = E.STU_NO
    GROUP BY STU_DEPT



























