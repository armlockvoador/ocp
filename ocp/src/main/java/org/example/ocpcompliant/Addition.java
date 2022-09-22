package org.example.ocpcompliant;

public class Addition implements CalculatorOperation {
    private double left;
    private double right;
    private double result;

    @Override
    public void perform() {
        result = left + right;
    }

    public Addition() {
    }

    public double getLeft() {
        return left;
    }

    public void setLeft(double left) {
        this.left = left;
    }

    public double getRight() {
        return right;
    }

    public void setRight(double right) {
        this.right = right;
    }

    public double getResult() {
        return result;
    }

}
