import java.util.Scanner;

public class Position implements Scanable{
    private int x;
    private int y;

    public Position(Position position){
        this.setX(position.x);
        this.setY(position.y);
    }
    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }
    public Position(){
        this(1,1);
    }
    public int getX(){
        return this.x;
    }
    public void setX(int x){
        this.x = x;
    }
    public int getY(){
        return this.y;
    }
    public void setY(int y){
        this.y = y;
    }
    public int getQuadrant(){
        if (this.x > 0 && this.y > 0) return 1;
        else if (this.x < 0 && this.y > 0) return 2;
        else if (this.x < 0 && this.y < 0) return 3;
        else if (this.x > 0 && this.y < 0) return 4;
        else return 0;
    }

    public void scan(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Position");
        System.out.println("x: ");
        //this.x = sc.nextInt();
        setX(sc.nextInt());
        System.out.println("y: ");
        //this.y = sc.nextInt();
        setY(sc.nextInt());
    }
    public String toString() {
        String s = "Position { x = " + this.x + ", y = " + this.y +
                ", Quadrant: " + this.getQuadrant() + " }";
        return s;
    }
}