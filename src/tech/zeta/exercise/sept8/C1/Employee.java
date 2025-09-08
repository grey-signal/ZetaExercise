package tech.zeta.exercise.sept8.C1;

public class Employee{

    private String name;
    private double salary;

    public Employee(String name, double salary){
        setName(name);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return name + " ($" + salary + ")";
    }


    //    @Override
//    public int compareTo(Object o) {
//        return this.salary.compareTo
//    }
}
