package main.java.CuttingObjects;

import java.util.HashMap;

/**
 * Created by alexa on 24-Mar-16.
 */
public class WoodPiece {

    protected HashMap<String, Integer> dimensions = new HashMap<>();

    public WoodPiece(int length, int width)
    {
        this.dimensions.put("length", length);
        this.dimensions.put("width", width);

        this.resetDimensionsOrder();
    }

    public HashMap<String, Integer> getDimensions() {
        return dimensions;
    }

    public int getLength()
    {
        return this.dimensions.get("length");
    }

    public int getWidth()
    {
        return this.dimensions.get("width");
    }

    private void resetDimensionsOrder()
    {
        if (this.dimensions.get("length") < this.dimensions.get("width")) {
            this.swapDimensions();
        }
    }

    private void swapDimensions()
    {
        this.dimensions.put("length", this.dimensions.get("length") + this.dimensions.get("width"));
        this.dimensions.put("width", this.dimensions.get("length") - this.dimensions.get("width"));
        this.dimensions.put("length", this.dimensions.get("length") - this.dimensions.get("width"));
    }
}
