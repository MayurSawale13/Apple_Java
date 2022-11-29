package Inheritance;

public class Student {
float per;
char grade;
Student(float per,char grade)
{
	this.per=per;
	this.grade=grade;
	}
public void result()
{
	if(per>=75 && per<=100)
		grade='A';
	else if(per>=65 && per<75)
		grade='B';
	else if(per>=35 && per<65)
		grade='C';
	else
		grade='F';
}
}
