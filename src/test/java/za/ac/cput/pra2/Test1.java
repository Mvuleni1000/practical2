package za.ac.cput.pra2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert;

/**
 * Created by student on 2015/02/12.
 */
public class Test1 {

    Mni obj = new Mni();

    Mni object1 = new Mni("Mnisi");
    Mni object2 =  new Mni("Mnisi");

    //execute before class
    @BeforeClass
    public static void beforeClass()
    {
        System.out.println("In before class");
    }

    @Test
    public void Testinteger()
    {
        Assert.assertTrue(obj.getAnswers() == 12);
    }

    @Test
    public void Testfloat()
    {

        Assert.assertTrue(obj.retrunfloat() == 1000);
    }

    @Test
    public void Testname()
    {
        String name = "Sbu";
        Assert.assertNotNull(name);
    }

    public void  Testequality()
    {
        Assert.assertEquals(object1, object2);
    }



    //execute after class
    @AfterClass
    public static void afterClass()
    {
        System.out.println("In after class");
    }


}
