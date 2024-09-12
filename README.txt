This basic applicataion include next classes :

* Student 

a) This class contains general information about person (name, groupNumber, course, 4 kind of grades) all this 
variables have getters/setters methods ;

b) Additional methods avgGrade(calculates and returns average score of student), overrided method toString(returns only name of student)

Class Main contains collection (List/ArrayList) of students that were preset in program.

There are 2 static methods in Main.java:

printStudents(List<Student>, int) - prints the list of student in chosen course

studentRemover(List<Student>) - removes students with average score less than 3 and increases the course of other students


*** THIS PROGRAM DOES NOT CONTAINS TOOLS OF INTERECTION BETWEEN USER AND SERVER, DOES NOT CONNECT WITH ANY SQL TABLE, DOES NOT IMPLEMENTS DAO SAMPLE

I used here : types primitive and references, basis of OOP, Generics,Java Collections Framework(List<>, ArrayList<>).