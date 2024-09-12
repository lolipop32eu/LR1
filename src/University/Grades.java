package University;

public enum Grades { // перечень оценок ECTS и соответвующие им обычные оценки
    F(2), E(3), D3(3),D4(4), C(4), B(4), A(5);
    private int value;

    Grades(int value) {
        this.value = value;
    }
    //public void setValue(int value){
    //  this.value = value;
   // } // очень не желательно в ENUM!!!!!!
    public int getValue(){
        return value;
    }
}
