public class Wheel
{
    private String name;
    private double radius;
    public Wheel(String name,double radius)
    {
        this.name=name;
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
    public double calcTurnDistance(){ 
        return 2*Math.PI*(radius*2.54);
    }
}
