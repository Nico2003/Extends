package com.company;

/**
 * Created by Koljan on 2016.03.29..
 */
public class Shape {

    private String shapeText;

    public Shape(){}

    public Shape(String shapeText){
        this.shapeText = shapeText;
    }

    public String getShapetext() {
        return shapeText;
    }

    public void setShapetext(String shapeText) {
        this.shapeText = shapeText;
    }
    @Override
    public String toString(){
        return "Shape " + this.shapeText + "\n";
    }
}
