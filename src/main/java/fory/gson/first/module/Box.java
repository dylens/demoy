package fory.gson.first.module;

import com.google.gson.annotations.SerializedName;

public class Box {

    @SerializedName("w")
    private int width;

    @SerializedName("h")
    private int height;

    @SerializedName("d")
    private int depth;

    @Override
    public String toString() {
        return width + "," + height + "," + depth;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }
}
