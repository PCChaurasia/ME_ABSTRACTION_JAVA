package pl_java.abstract_class.exercise_3.shapes;

public class Rectangle extends Shape {
    private  double height;
    private double width;

    public void setHeight(double height){
        this.height = height;

    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getHeight(){
        return height;
    }
    public double getWidth(){
        return width;
    }

    public double calculateArea(){
        return height * width;
    }

    public double calculateCircumference(){
        return 2 * (height + width);
    }
    
}
