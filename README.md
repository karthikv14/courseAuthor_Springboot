# courseAuthor_Springboot
This is the backend code for the courseAuthor_Angular

For Database stuff:



create database courseauthordb;


use courseauthordb;
 
insert into course values("TEC1236" , "Java Programming");

insert into author values("2" , "Alex");

select * from course;

select * from author;

drop database coursedb;

delete from course where id = '';

create database studentcoursedb;

use studentcoursedb;

show tables;

select * from student;

select * from course;

select * from student_course;

insert into course values("Java101", "Introduction to Java Programming");

insert into course values("DB205", "Database concepts");

insert into course values("WA329", "Web development and design foundation");

insert into course values("CA121", "capstone Project");

insert into course values("CA123", "capstone Project2");

insert into student values("1", "John", "Lewisville,Tx");

insert into student values("2", "Alexa", "FlowerMound,TX");

insert into student values("3", "Smith", "Stamford,CT");

insert into student values("4", "Jim", "New Have,CT");

insert into student values("5", "Kevin", "Parlin,NJ");

delete from student where studentId = "1";

delete from course where  courseId= "2";

drop table student_course;

drop table student;

drop table course;


drop database studentcoursedb;

