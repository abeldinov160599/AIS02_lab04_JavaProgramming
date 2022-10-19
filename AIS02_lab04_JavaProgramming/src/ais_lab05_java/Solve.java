package ais_lab05_java;

import java.io.Serializable;
import static java.lang.Math.pow;

// Класс "Персона" с сериализацией для поддержки RMI
public class Solve implements Serializable {

    private static final long serialVersionUID = 1L;

    private double x;
    private double a;
    private double b;
    private double y;

    public Solve(double a, double b, double x) {
        this.a = a;
        this.b = b;
        this.x = x;
        this.y = y;
        if (x < 7) {
            y = (pow(x, 2) + pow(a, 2) + pow(b, 2)) / (pow(x, 3) * pow(a + b, 2));
        } else {
            y = pow(x, 3) * pow(a + b, 3);
        }
        
    }

    public double getX() {
        return x;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        if (!Double.isNaN(y) && !Double.isInfinite(y)) {
           return String.format("Ответ = " + y); 
        } else {
            return String.format("Деление на ноль запрещено!");
        }
    }

}
