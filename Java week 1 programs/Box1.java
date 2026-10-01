class Box{
    int w,h;
    Box(){
        w=1;
        h=1;
    }
    Box(int w, int h){
        this.w=w;
        this.h=h;
    }
    Box(Box b){
        this.w=b.w;
        this.h=b.h;
    }
    int area(){
        return w*h;
    }
}
public class Box1 {
    public static void main(String[] args) {
        Box a=new Box(4,3);
        Box b=new Box(a);
        Box c=new Box();
        System.out.println("Area of box1: " + a.area());
        System.out.println("Area of box2: " + b.area());
        System.out.println("Area of box3: " + c.area());
    }
}