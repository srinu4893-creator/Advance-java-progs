interface Payable{double pay();}
interface Taxable{double tax();}
class Employee implements Payable, Taxable{
    double salary;
    Employee(double s){
        salary=s;
    }
    public double pay(){
        return salary;
    }
    public double tax(){
        return salary*0.1;
    }
}
public class payroll {
    public static void main(String[] args) {
        Employee e=new Employee(50000);
        System.out.println("Salary: " + e.pay());
        System.out.println("Tax: " + e.tax());
    }
}