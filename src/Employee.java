public class  Employee{


/*    Задача №1
    Необходимо создать класс Employee со следующими методами:
            ●	getBaseSalary - получить базовую ставку
●	setBaseSalary
●	getName - получить имя
●	setName
●	getSalary - получить зарплату (должен быть абстрактный)*/

        int salary;
        int name;
        int baseSalary;

public void setSalary(int salary){
        this.salary=salary;
        }

public void setName(int name){
        this.name=name;
        }

public abstract int getSalary(){
        return salary;
        }

public int getName(){
        return name;
        }
        }
        }