package com.company;

/**
 * Created by Koljan on 2016.03.29..
 */
public class Sphere extends ThreeDimensionalShape {

    private String sphereText;

    public Sphere(){}

    public Sphere(String sphereText){
        this.sphereText = sphereText;
    }

    public Sphere(String threeDimensionalText, String shapeText, String sphereText){
        super(threeDimensionalText, shapeText);
        this.sphereText = sphereText;
    }

    public String getSphereText() {
        return sphereText;
    }

    public void setSphereText(String sphereText) {
        this.sphereText = sphereText;
    }
    @Override
    public String toString(){
        return super.toString() + "\n" + "Sphere " + this.sphereText + "\n";
    }
}
