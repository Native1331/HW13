package HW13.test;
import HW13.main.Director;
import HW13.main.Manager;
import HW13.main.Worker;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DirectorTest {

   @Test
    public void testGetSalaryCoefficient() {
        Worker worker = new Worker("John Worker",30000);
       Manager manager = new Manager("Jane Manager",10000,0);
       Manager manager1 = new Manager("Jack Manager",10000,20);
       Director director = new Director("Ivan Director",10000,0);
       Director director1 = new Director("Jack Director",10000,200);

        Assert.assertEquals(worker.getSalary(), worker.getBaseSalary());

       Assert.assertEquals(manager.getSalary(),0);
       Assert.assertEquals(manager1.getSalary(), 6000);

       Assert.assertEquals(director.getSalary(),0);
       Assert.assertEquals(director1.getSalary(),18000);


    }
}