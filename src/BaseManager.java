package HW13;


public abstract class BaseManager extends HW13.Employee {

    /*Необходимо создать класс Manager в который нужно добавить следующие методы:
            ●	getNumberOfSubordinates - получить количество подчиненных
            ●	setNumberOfSubordinates
            в классе, метод getSalary будет возвращать значение по формуле - <базовая ставка> * (<количество подчиненных>
             / 100 * 3). Если количество подчиненных 0, то результат как у обычного рабочего.*/
    private int numberOfSubordinates;
    public BaseManager(String name. int baseSalary, int numberOfSubordinates){
        super(name, baseSalary);
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getSalaryCoefficient() {
        return 0;
    };

    public int getSalary() {
        if(getNumberOfSubordinates() == 0){
            return 0;
        }
        return getBaseSalary()*getSalaryCoefficient() * getNumberOfSubordinates()/100;
    }
  }