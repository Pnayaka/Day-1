package org.nayaka;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        calculator cal = new calculator();
        cal.add(10, 20);
        cal.sub(30, 10);
    }
}
