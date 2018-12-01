public class TestClass
{
    public static void main(String[] args)
    {
        TestClass tc = new TestClass();
        tc.test1();
    }

    public void test1()
    {
        Car car = new Car("Mark7");
        Engine engine = new Engine("PL9", 9);
        car.add(engine);
        Door door = new Door ("UP2", 2);
        car.add(door);
        Wheel wheel = new Wheel ("Wichelin8", 8);
        car.add(wheel);
        car.setFuel(100);
        car.drive();
        car.getDistance();
        car.drive();
        car.getDistance();
    }
}
