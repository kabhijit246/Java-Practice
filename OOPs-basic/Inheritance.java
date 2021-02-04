package com.jetbrains;

//Inheritance hierarchy example
public class Inheritance {

    public static void main(String[] args) {
        Trapezoid trapezoid = new Trapezoid(-6,0,6,0,2,2,-2,2);
        Parallelogram parallelogram = new Parallelogram(-9,-2,4,-2,6,5,-7,5);
        Rectangle rectangle = new Rectangle(3,2,8,2,8,6,3,6);
        Square square = new Square(4,5,9,5,9,10,4,10);

        System.out.println("Area of trapezoid is "+ trapezoid.area());
        System.out.println("Area of parallelogram is "+ parallelogram.area());
        System.out.println("Area of rectangle is "+ rectangle.area());
        System.out.println("Area of square is "+ square.area());
    }

}

class Point {
    private double x, y;
    
    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}

class Quadrilateral {
    private Point p1, p2, p3, p4;
    
    Quadrilateral(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        this.p1 = new Point(x1, y1);
        this.p2 = new Point(x2, y2);
        this.p3 = new Point(x3, y3);
        this.p4 = new Point(x4, y4);
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public Point getP3() {
        return p3;
    }

    public void setP3(Point p3) {
        this.p3 = p3;
    }

    public Point getP4() {
        return p4;
    }

    public void setP4(Point p4) {
        this.p4 = p4;
    }
}

class Rectangle extends Quadrilateral {
    private double width, length;

    Rectangle(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
        width = Math.sqrt(Math.pow((getP2().getX() - getP1().getX()), 2) + Math.pow((getP2().getY() - getP1().getY()), 2));
        length = Math.sqrt(Math.pow((getP4().getX() - getP1().getX()), 2) + Math.pow((getP4().getY() - getP1().getY()), 2));
    }

    public double area() {
        return length*width;
    }
}

class Square extends Quadrilateral {

    private double side;

    Square(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
        side = Math.sqrt(Math.pow((getP2().getX() - getP1().getX()), 2) + Math.pow((getP2().getY() - getP1().getY()), 2));
    }

    public double area() {
        return side*side;
    }
}

class Parallelogram extends Quadrilateral {
    private double areaT;
   
    Parallelogram(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
        areaT = Math.abs((getP1().getX()*(getP2().getY()-getP3().getY())) + (getP2().getX()*(getP3().getY()-getP1().getY())) + (getP3().getX()*(getP1().getY()-getP2().getY())))/2;
    }

    public double area() {
        return 2*areaT;
    }
}

class Trapezoid extends Quadrilateral {
    private double areaT1, areaT2;

    Trapezoid(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);

        areaT1 = Math.abs((getP1().getX()*(getP2().getY()-getP3().getY())) + (getP2().getX()*(getP3().getY()-getP1().getY())) + (getP3().getX()*(getP1().getY()-getP2().getY())))/2;
        areaT2 = Math.abs((getP1().getX()*(getP3().getY()-getP4().getY())) + (getP3().getX()*(getP4().getY()-getP1().getY())) + (getP4().getX()*(getP1().getY()-getP3().getY())))/2;  
    }

    public double area() {
        return (areaT1 + areaT2);
    }
}
