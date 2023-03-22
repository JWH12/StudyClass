/*
 
INNER JOIN�� ���ʿ� �����Ͱ� ���� �� ��µ����� 
LEFT JOIN�� �ְ� �Ǵ�(FROM) ���̺� �����Ͱ� �ִٸ� ������ ���̺� �����Ͱ� ��� NULL������ ����� ���ش�.


INSERT INTO ���̺�� 
VALUSE() = �����ϰ� �ִ� �÷��� �������� ���� �ִ´�.

*/

--LEFT JOIN ����
SELECT *
FROM SUBJECT S  --�ְ� �Ǵ� ������
LEFT JOIN ENROL E ON E.SUB_NO = S.SUB_NO; --���갡 �Ǵ� ������


SELECT * FROM SUBJECT;
SELECT * FROM ENROL WHERE SUB_NP =111;


--INSERT INTO ����
INSERT INTO BOOK                                   -- ��� �÷��� ���� ���� ��
VALUES(12, '����������', '�Ѽ����м���', 90000);

INSERT INTO BOOK (BOOKID, BOOKNAME, PUBLISHER)      -- VALUES ���� ���ϴ� �÷� ����ŭ�� �����͸� ���� ��
VALUES(12, '����������', '�Ѽ����м���');


INSERT INTO BOOK (BOOKID, BOOKNAME, PUBLISHER)
VALUES(13, '������123', '�Ѽ�');

SELECT * FROM BOOK;



DELETE FROM BOOK WHERE PRICE IS NULL;  --PRICE �÷��� NULL �����͸� ���� ���� ������Ų��.

INSERT INTO BOOK (BOOKID, BOOKNAME, PRICE, PUBLISHER)  -- INSERT INTO�� �÷������� �ٲٸ� VALUES ������ �Ȱ��� �ٲ�� �Ѵ�.
VALUES(13, '������123', 90000 ,'�Ѽ�');



--
SELECT * FROM Imported_Book;




INSERT INTO BOOK (BOOKID, BOOKNAME, PUBLISHER, PRICE)
SELECT BOOKID, BOOKNAME, PUBLISHER, PRICE
FROM Imported_Book;


SELECT * FROM Book;

--DUAL�� �̿��ϸ� �ӽ÷� ���̺��� ���� �� �ִ�. �� �ӽ÷� �����͸� ����Ͽ� ����� Ȯ�� �� �� �ִ�.
SELECT ABS(-78), ABS(78), ROUND(4.852, 2)
FROM DUAL;


-- Ư�� ������ �˻� �� �� ����� --------------------------
SELECT SUBSTR(NAME, 1, 1) "��", COUNT(*) "�ο�"            
FROM CUSTOMER
GROUP BY SUBSTR(NAME, 1, 1);






--���� ��¥�� �������� �ڵ�
SELECT SYSDATE
FROM DUAL;





















