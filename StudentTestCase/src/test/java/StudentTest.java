import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentTest {
   Student student=new Student("Nandhini",2500,new int[]{75,80,90});

   @Test
    public void testgetAnnualFee() {
        double annualFee=student.getAnnualFee();
       Assertions.assertEquals(annualFee,2500.00);
   }
   @Test
    public void testgetTotalMarks() {
       double totalMarks=student.getTotalMarks();
       Assertions.assertEquals(totalMarks,245);
   }
   @Test
   public void testgetAverage() {
       double average=student.getAverageMarks();
       Assertions.assertEquals(81.67,Math.round(average*100.0)/100.0);
   }
   @Test
   public void testgetResultPass() {
       String result=student.getResults();
       Assertions.assertEquals(result,"Pass");
   }
    @Test
    public void testgetResultFail() {
        Student student=new Student("Nandhini",2500,new int[]{50,55,60});
        String result=student.getResults();
        Assertions.assertEquals(result,"Fail");
    }
}
