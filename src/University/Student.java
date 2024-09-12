package University;

public class Student {
    private String name; // имя студента
    private int groupNumber; //номер группы
    private int course; // номер курса
    private Grades mathGrade; // оценка по математике
    private Grades physicsGrade; // оценка по физике

    private Grades economicGrade;// оценка по экономике
    private Grades cadSystemsGrade;// оценка по инженерной графике

    public Student(String name, int groupNumber, int course, Grades mathGrade, Grades physicsGrade, Grades economicGrade, Grades cadSystemsGrade) {
        this.name = name;
        this.groupNumber = groupNumber;
        this.course = course;
        this.mathGrade = mathGrade;
        this.physicsGrade = physicsGrade;
        this.economicGrade = economicGrade;
        this.cadSystemsGrade = cadSystemsGrade;
    }

    public String getName() {
        return name;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Grades getMathGrade() {
        return mathGrade;
    }

    public Grades getPhysicsGrade() {
        return physicsGrade;
    }

    public Grades getEconomicGrade() {
        return economicGrade;
    }

    public Grades getCadSystemsGrade() {
        return cadSystemsGrade;
    }
    public double avgGrade(){ // метод поиска среднего балла
        return (double)(mathGrade.getValue()+physicsGrade.getValue()+economicGrade.getValue()+cadSystemsGrade.getValue())/4;
    }
    @Override
    public String toString() {
        return  name ;

    }
}
