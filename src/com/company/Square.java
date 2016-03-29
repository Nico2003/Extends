package com.company;

/**
 * Created by Koljan on 2016.03.29..
 */
public class Square extends TwoDimensonalShape{

    private String squareText;

    public Square(){}

    public Square(String squareText){
        this.squareText = squareText;
    }

    public Square(String squareText, String twoDimensionalText, String shapeText){
        super(twoDimensionalText, shapeText);
        this.squareText = squareText;
    }

    public String getSquareText() {
        return squareText;
    }

    public void setSquareText(String squareText) {
        this.squareText = squareText;
    }
    @Override
    public String toString(){
        return super.toString() + "\n" + "Square " + this.squareText + "\n";
    }
}

