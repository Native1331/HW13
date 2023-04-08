public class final Director extends Manager {
   /* Необходимо создать класс Director с теми же методами, что и Manager, но метод getSalary должен возвращать
   результат по формуле - <базовая ставка> * (<количество подчиненных> / 100 * 9). Если количество подчиненных 0,
   то результат как у обычного рабочего.
    Коэффициенты для расчета ЗП у Manager и Director должны быть константами (коэффициенты из формулы расчета ЗП)
    Классы Manager и Director должны быть финальными*/

public void getSalary(baseSalary,numberOfSubordinates){
        ((baseSalary * (setNumberOfSubordinates)/ 100 * 9);
        }

