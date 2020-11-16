import java.lang.Math;

public class Square
{
    private int length;

    public Square(){

    }

    public Square(int length)
    {
        this.length = length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public double getDiagonal(){
        return this.length * Math.sqrt(2);
    }

    public int getPerim(){
        return this.length * 4;
    }

    public int getS(){
        return this.length * this.length;
    }

    public String toString(){
        return "Square length = " + this.length
                + ",  Square diagonal = " + this.getDiagonal()
                + ",  Square Perim = " + this.getPerim()
                + ",  Square S = " + this.getS();
    }


}
