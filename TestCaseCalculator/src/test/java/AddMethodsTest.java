import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddMethodsTest {
    private Add add=new Add();

    @Test
    void testAddIntInt() {
        int result=add.addof(10,20);
        Assertions.assertEquals(30,result);
    }
    @Test
    void testAddIntIntInt() {
        int result=add.addof(10,20,30);
        Assertions.assertEquals(60,result);
    }
    @Test
    void testAddDoubleDouble() {
        double result=add.addof(10.5,20.1);
        Assertions.assertEquals(30.6,result);
    }
    @Test
    void testAdd() {
        String result=add.addof("Hello",20);
        Assertions.assertEquals("Hello 20",result);
    }
}
