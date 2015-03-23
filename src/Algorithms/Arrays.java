package Algorithms;

/**
 * Created by Jeff Schulthies
 * .
 */
public class Arrays {
    private int[] iArray;
    private double[] dArray;

    public Arrays(int[] iArray) {
        this.iArray = iArray;
    }

    public Arrays(int[] iArray, double[] dArray) {
        this.iArray = iArray;
        this.dArray = dArray;
    }

    public int[] getiArray() {
        return iArray;
    }

    public void setiArray(int[] iArray) {
        this.iArray = iArray;
    }

    public double[] getdArray() {
        return dArray;
    }

    public void setdArray(double[] dArray) {
        this.dArray = dArray;
    }

}
