public class Prism extends Square {
    private int height;

    public Prism()
    {
    }

    public Prism(int length, int height)
    {
        super.setLength(length);
        this.height = height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void setLength(int length) {
        super.setLength(length);
    }

    @Override
    public int getLength() {
        return super.getLength();
    }

    public int getHeight() {
        return height;
    }

    public int getV(){
        return super.getS() * this.height;
    }

    @Override
    public int getS() {
        return (super.getS() * 2) + this.height * this.getLength();
    }

    @Override
    public double getDiagonal() {
        return super.getDiagonal();
    }

    @Override
    public String toString(){
        return "Prism length = " + this.getLength()
                + ",  Prism height = " + this.getHeight()
                + ",  Prism S = " + this.getS()
                + ",  Prism V = " + this.getV();
    }



}
