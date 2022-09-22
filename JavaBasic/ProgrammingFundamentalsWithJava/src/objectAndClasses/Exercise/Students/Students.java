package objectAndClasses.Exercise.Students;

public class Students {
    //first name (string), last name (string), and grade (a floating-point number).
    private String name;
    private String lastName;
    private double grade;

    public Students(String name,String lastName,double grade){
        this.name=name;
        this.lastName=lastName;
        this.grade=grade;
    }
    public String getName() {
        return name;
    }
    public String getLastName() {
        return lastName;
    }
    public double getGrade() {
        return grade;
    }
    public String toString(){
        return String.format("%s %s: %.2f",getName(),getLastName(),getGrade());
    }

}
