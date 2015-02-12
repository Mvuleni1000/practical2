package za.ac.cput.pra2;

/**
 * Created by student on 2015/02/12.
 */
public class Mni {
    String name;
    int num1 = 100;
    int num2 = 25;

    public Mni()
    {

    }

    public Mni(String n )
    {

    }


    public void returnInteger(int n , int m)
    {
        num1 = n;
        num2 = m;
    }

    public void setName(String n)
    {
        name = n;
    }

    public String returnName()
    {
        return name;
    }

    public int getAnswers()
    {
        return 12;
    }

    public float retrunfloat()
    {
        return 1000;
    }


}
