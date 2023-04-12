public abstract class Worker extends Employee {
    // Необходимо создать класс Worker где метод getSalary будет возвращать базовую ставку и должен быть финальным.

    public Worker(String name, int baseSalary) {
        super(name, baseSalary);
            }

    public final int getSalary() {

        return getBaseSalary();
    }
}