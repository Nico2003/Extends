package com.company;

/**
 * Created by Koljan on 2016.03.29..
 */
public class TwoDimensonalShape extends Shape{

    private String twodimensionalText;

    public TwoDimensonalShape(){
    }

    public TwoDimensonalShape(String twodimensionalText){
        this.twodimensionalText = twodimensionalText;
    }

    public TwoDimensonalShape(String twodimensionalText, String shapeText){
        super(shapeText);
        this.twodimensionalText = twodimensionalText;
    }

    public String getTwodimensionalText() {
        return twodimensionalText;
    }

    public void setTwodimensionalText(String twodimensionalText) {
        this.twodimensionalText = twodimensionalText;
    }
    @Override
    public String toString(){
        return super.toString() + "'\n" + "TwoDimensionalShape " +  this.twodimensionalText + "\n";

    }
}
