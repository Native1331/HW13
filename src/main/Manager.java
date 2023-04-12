package HW13.main;

public final class Manager extends BaseManager {

    public  static final int SALARY_COEFFICIENT = 3;

    public Manager(String name, int baseSalary, int numberOfSubordinates) {
        super(name, baseSalary, numberOfSubordinates);
    }
@Override
    public int getSalaryCoefficient() {
    return  SALARY_COEFFICIENT;
    }
}