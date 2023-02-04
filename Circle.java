public class Circle {
    private double radius = 1.0;

    public Circle(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
    public double getCircumference(){
        return 2 * radius * Math.PI;
    }
    @Override
    public String toString(){
        return "Circle[radius=" + radius + "]";
    }
}

class Test{
    public static void main(String[] args) {
        Circle c = new Circle(3.0);
        System.out.println(c.toString() + " " + "\n" + "Area:" + c.getArea() + "\n" + "Circumference:" + c.getCircumference());
    }
}
