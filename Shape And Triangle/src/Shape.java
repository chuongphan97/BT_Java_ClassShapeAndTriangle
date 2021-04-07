public class Shape {
    private String color;
    private boolean isFilled;

    public Shape() {
    }

    public Shape(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }
    public String toString(){
        return "A Shape have color " + this.getColor() + " and " + (isFilled()?"filled":"not filled");
    }
}
