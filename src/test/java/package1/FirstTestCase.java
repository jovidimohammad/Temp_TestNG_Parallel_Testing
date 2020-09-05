package package1;

import org.testng.annotations.Test;

public class FirstTestCase {

    @Test(priority = 1)
    public void test1(){
        System.out.println("Test one is running");
    }
    @Test(priority = 2)
    public void test2() {
        System.out.println("Test two is running");
    }
    @Test(priority = 3)
    public void test3() {
        System.out.println("Test two is running");
    }
}
