public class  Manager extends Worker{
        /*Необходимо создать класс Manager в который нужно добавить следующие методы:
        ●	getNumberOfSubordinates - получить количество подчиненных
        ●	setNumberOfSubordinates
        в классе, метод getSalary будет возвращать значение по формуле - <базовая ставка> * (<количество подчиненных>
         / 100 * 3). Если количество подчиненных 0, то результат как у обычного рабочего.*/
       int  numberOfSubordinates;
      public void getNumberOfSubordinates(){
          return this.numberOfSubordinates;
        }
        public void setNumberOfSubordinates(){
        this.numberOfSubordinates=numberOfSubordinates;
        }
        if (setNumberOfSubordinates == 0){

    }
     public  getSalary(baseSalary,NumberOfSubordinates){
        ((this.baseSalary * this.setNumberOfSubordinates)/ 100 * 3));
        }
}
