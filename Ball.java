public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    public Ball(float x, float y, int radius, float xDelta, float yDelta){
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = xDelta;
        this.yDelta = yDelta;
    }

    public void setX(float x){
        this.x = x;
    }

    public void setY(float y){
        this.y = y;
    }

    public void setRadius(int radius){
        this.radius = radius;
    }

    public void setXDelta(float xDelta){
        this.xDelta = xDelta;
    }

    public void setYDelta(float yDelta){
        this.yDelta = yDelta;
    }

    public float getX(){
        return x;
    }

    public float getY(){
        return y;
    }

    public int getRadius(){
        return radius;
    }

    public float getXDelta(){
        return xDelta;
    }

    public float getYDelta(){
        return yDelta;
    }

    public void move(){
        this.x += xDelta;
        this.y += yDelta;
    }

    public void reflectHorizontal(){
        this.xDelta = (-1) * xDelta;
    }


    public void reflectVertical(){
        this.yDelta = (-1) * yDelta;
    }

    public String toString(){
        return "Ball[(" + x + "," + y + "),speed=(" + xDelta + "," + yDelta + ")]";
    }
}

