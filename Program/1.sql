CREATE DATABASE school;

USE school;

CREATE TABLE student (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    city VARCHAR(50)
);

INSERT INTO student VALUES
(1, 'Anu', 'Bangalore'),
(2, 'Rahul', 'Mysore'),
(3, 'Priya', 'Kochi');

SELECT * FROM student;