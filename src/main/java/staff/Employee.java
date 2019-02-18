package staff;

public abstract class Employee {

    private String name;
    private int niNumber;
    private double salary;



    public Employee(String name, int niNumber, double salary){
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public int getNiNumber() {
        return this.niNumber;
    }

    public double getSalary() {
        return this.salary;
    }

    public void raiseSalary(double increase){
        if (increase < 0 ){
            return;
        }
        this.salary += increase;
    }

    public double bonus(){
        double bonus=  this.salary * 0.01;
        return bonus;
    }

    public String changeName(String newName) {
        if (newName == null) {
            return this.name;
        } else {
            this.name = newName;
            return this.name;

        }
    }



}
