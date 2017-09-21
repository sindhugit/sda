
/**
 * Write a description of class Heater here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Heater
{
    // instance variables - replace the example below with your own
    private double temp;
    private double min;
    private double max;
    private double increment;

    /**
     * Constructor for objects of class Heater
     */
    public Heater(double mintemp,double maxtemp)
    {
        // initialise instance variables
        temp = 15.0;
        increment = 5.0;
        min = mintemp;
        max = maxtemp;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void warmer()
    {
        if ((temp + increment) > max)
        {
            System.out.println("This increment can produce more than maximum, so its cancelled");
        }
        else
        {
            temp = temp + increment;
        }
    }
    public void cooler()
    {
        if ((temp - increment) < min)
        {
            System.out.println("This decrement can cause cooler than minimum, so its cancelled");
        }
        else
        {
            temp = temp-increment;
        }
    }
    public void setIncrement(double value)
    {
        if(value > 0)
        {
        increment = value;
    }
    else
    System.out.println(" enter a positive value greater than zero");
    }
    public double knowTemp()
    {
        return temp;
    }
}
