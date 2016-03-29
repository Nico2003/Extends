package com.company;

/**
 * Created by Koljan on 2016.03.29..
 */
public class Cube  extends ThreeDimensionalShape{

    private String cubeText;

    public Cube(){}

    public Cube(String cubeText){
        this.cubeText = cubeText;
    }

    public Cube(String cubeText, String shapeText, String threeDimensionalText){
        super(shapeText,threeDimensionalText);
        this.cubeText = cubeText;
    }

    public String getCubeText() {
        return cubeText;
    }

    public void setCubeText(String cubeText) {
        this.cubeText = cubeText;
    }
    @Override
    public String toString(){
        return super.toString() + "\n" + "Cube " + this.cubeText + "\n";
    }
}
