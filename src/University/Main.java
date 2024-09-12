package University;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // перечень студентов (пусть их будет 5)
        Student student1 = new Student("Виталий",101,3,Grades.A, Grades.B, Grades.D3, Grades.F);
        Student student2 = new Student ("Сергей", 201, 1,Grades.D4, Grades.D3, Grades.F, Grades.F);
        Student student3 = new Student ("Ксения", 201, 1,Grades.C, Grades.B, Grades.B, Grades.D4);
        Student student4 = new Student ("Петр", 103, 5,Grades.E, Grades.A, Grades.D3, Grades.F);
        Student student5 = new Student ("Максим", 603, 2,Grades.D4, Grades.A, Grades.B, Grades.E);

        // коллекция, содержащая объекты класса Student
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        printStudents(students,1);
        System.out.println(students);// вывод перечня перед удалением

        studentRemover(students);
        System.out.println(students); //вывод перечня после удаления

        }
       public static void studentRemover(List<Student> students){ // удаляет студентов со средним баллом <3, переводит на след курс(>=3, <=6)
        Iterator<Student> iterator = students.iterator();
        Student student;
       while(iterator.hasNext()){
          student =iterator.next();
            if ((student.avgGrade()<3)||student.getCourse()>=6) iterator.remove();// удаление если средний балл ниже 3(отчисление), удаление если последний курс(выпуск)
            else if(student.getCourse()<6) student.setCourse(student.getCourse()+1); // повышение курса(если не последний)
        }
        }
        //ЗДЕСЬ УСЛОВИЕ ВЫПУСКА ИЗЛИШНЕ ПО ЗАДАНИЮ, ТАК ЧТО ВТОРОЕ УСЛОВИЕ МОЖНО УБРАТЬ
        public static void printStudents(List<Student> students, int course){ // Вывод всех студентов данного курса
            System.out.println("Студенты на "+course+" курсе:");
        for(Student student:students){
            if(student.getCourse()==course)
            System.out.println(student);
        }
            System.out.println("\n");
    }
}