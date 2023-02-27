package superandthiskeyword;

public class Employee extends Person {
    String name;
    @Override
    public void info() {
//        this.name = "Employee";
//        System.out.println("name of employee is:" + this.name);
        super.info();
    }
}
