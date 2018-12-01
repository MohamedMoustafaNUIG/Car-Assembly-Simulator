import java.text.DecimalFormat;
public class Car
{
    DecimalFormat df = new DecimalFormat("0.0000");
    private String name;
    private double distance;
    private double travelled;
    private Engine engine;
    private Door door;

    public Car(String name)
    {
        this.name=name;
        distance=0;
        travelled=0;
    }
    
    public void add(Engine engine){
        this.engine=engine;
    }
    
    public void add(Wheel wheel){
        engine.add(wheel);
    }
    
    public void add(Door door){
        this.door=door;
    }
    
    public void setFuel(double fuel)
    {
        engine.setFuel(fuel);
    }
    
    public void drive()
    {
        distance=engine.calcDistance();
        travelled=travelled+distance;
        System.out.println("Car with given configurations (Engine Rate:"+engine.getTpl()+" trun/litre | Wheel Radius:"+engine.getRadius()+"in.) can travel "
                +df.format(distance/100000)+" Km if provided "+engine.getFuel()+" litres of fuel");
    }
    
    public void getDistance()
    {
        System.out.println("Total distance travelled "+df.format(travelled/100000)+" Km");
    }
}
