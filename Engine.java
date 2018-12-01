public class Engine
{
    private String name;
    private double tpl; //turn per litre
    private double fuel;
    private Wheel wheel; 
    public Engine(String name,double tpl)
    {
        this.name=name;
        this.tpl=tpl;
        fuel=0;
    }
    public void add(Wheel wheel){
        this.wheel=wheel;
    }
    public double getTpl(){
        return tpl;
    }
    public void setFuel(double fuel){
        this.fuel=fuel;
    }
    public double getFuel(){
        return fuel;
    }
    public double getRadius(){
        return wheel.getRadius();
    }
    public double calcDistance(){
        return (fuel*tpl)*wheel.calcTurnDistance();
    }
}

