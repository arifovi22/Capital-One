package allTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOn {
@Test
public void test1() {
	Assert.assertTrue(true);
}
@Test(dependsOnMethods = {"test1"})
public void test2() {
	System.out.println("test pass");
}
@Test(dependsOnMethods = {"test1", "test2"})
public void test3() {
	System.out.println("test pass");
}


}
