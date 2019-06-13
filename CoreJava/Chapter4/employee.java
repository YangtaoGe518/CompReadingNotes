import java.time.*;

public class employee{
    //instance fields
    private String name;
    private double salary;
    private LocalDate hireDay;

    //constructor
    public employee(String name, double salary, LocalDate hirDate){
        this.name = name;
        this.salary = salary;
        this.hireDay = hireDay;
    }

    //methods
    public String getName(){
        return name;
    }
    public void raiseSalary(double byPercent){
        double raise= salary * byPercent / 100;
        salary += raise;
    }
}