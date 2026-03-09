public class Position {
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
    public String toString() {
        String s = "Position { x = " + this.x + ", y = " + this.y + " }";
        return s;
    }
}



