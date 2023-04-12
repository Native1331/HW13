package HW13.main;

public  class  Director extends BaseManager {
    /* Необходимо создать класс Director с теми же методами, что и Manager, но метод getSalary должен возвращать
    результат по формуле - <базовая ставка> * (<количество подчиненных> / 100 * 9). Если количество подчиненных 0,
    то результат как у обычного рабочего.
     Коэффициенты для расчета ЗП у Manager и Director должны быть константами (коэффициенты из формулы расчета ЗП)
     Классы Manager и Director должны быть финальными*/
    public static final int SALARY_COEFFICIENT = 9;

    public Director(String name,int baseSalary, int numberOfSubordinates) {
        super(name, baseSalary, numberOfSubordinates);
    }

    public int getSalaryCoefficient() {
        return SALARY_COEFFICIENT;
    }

}


