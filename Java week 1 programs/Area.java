abstract class Shape{
    abstract double area();
    void describe(){
        System.out.println("Area=" + area());
    }
}
class Circle extends Shape{
    double r;
    Circle(double r){
        this.r=r;
    }
    double area(){
        return Math.PI*r*r;
    }
}
public class Area {
    public static void main(String[] args) {
        Circle c=new Circle(2);
        c.describe();
    }
}