package com.company;

/**
 * Created by Koljan on 2016.03.29..
 */
public class Circle extends  TwoDimensonalShape{

    private String circleText;

    public Circle(){}

    public Circle(String circleText){
        this.circleText = circleText;
    }

    public Circle(String circleText, String twoDimensionalText, String shapeText){
        super(twoDimensionalText, shapeText);
        this.circleText = circleText;
    }

    public String getCircleText() {
        return circleText;
    }

    public void setCircleText(String circleText) {
        this.circleText = circleText;
    }
    @Override
    public String toString(){
        return super.toString() + "\n" + "Circle " + this.circleText + "\n";
    }
}
