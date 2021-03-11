package Task1;

public class Main
{

    public static void main(String[] args)
    {
        // write your code here
        Driver driver = new Driver("Christian Sørensen", 35);
        Car myCar1 = new Car("Ford", "Fiesta", 2015, "Hatchback");
        Car myCar2 = new Car("Shelby Mustang", "GT500", 1967, "Fastback");

        myCar1.setDriver(driver);
        myCar2.setDriver(driver);

        System.out.println(myCar1.toString() + driver.toString());
        System.out.println(myCar2.toString() + driver.toString());
    }
}
