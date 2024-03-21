package pl_java.abstract_class.exercise_3.shapes;

public class Triangle extends Shape{
    private  double height;
    private  double base;


    public void setHeight(double height){
        this.height = height;
    }
    public void setBase(double base){
        this.base = base;
    }
    public double getHeight(){
        return height;
    }
    public double getBase(){
        return base;
    }

    public double calculateArea(){
        return (height * base)/2;
    }
    public double calculateCircumference(){
        return base + height + Math.sqrt((base*base) + (height*height));
    }

    
}
