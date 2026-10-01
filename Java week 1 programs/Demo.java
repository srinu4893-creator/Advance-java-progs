class Student{
    int rollno;
    String name;
    Student(int r, String n){
        this.rollno=r;
        this.name=n;
    }
    void Display(){
        System.out.println(rollno + "-" + name);
    }
}
public class Demo {
    public static void main(String[] a) {
        Student s1=new Student(101,"Asha");
        s1.Display();
    }
}