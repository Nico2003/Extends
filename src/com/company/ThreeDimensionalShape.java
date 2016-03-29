package com.company;

/**
 * Created by Koljan on 2016.03.29..
 */
public class ThreeDimensionalShape extends Shape {

    private String threeDimensionalText;

    public ThreeDimensionalShape(){}

    public ThreeDimensionalShape(String threeDimensionalText){
        this.threeDimensionalText = threeDimensionalText;
    }

    public ThreeDimensionalShape(String threeDimensionalText, String shapeText){
        super(shapeText);
        this.threeDimensionalText = threeDimensionalText;
    }

    public String getThreeDimensionalText() {
        return threeDimensionalText;
    }

    public void setThreeDimensionalText(String threeDimensionalText) {
        this.threeDimensionalText = threeDimensionalText;
    }
    @Override
    public String toString(){
        return super.toString() + "\n" + "ThreeDimensional " + this.threeDimensionalText + "\n";
    }
}
