package Visua2D.assets.util.resources.UI.assets.Math;

public class Math {

    public static double squareOrRectangleArea(double length, double width) {
        return length * width;
    }

    public static double constPI = 3.141592653589793238462643;

    //double result = squareOrRectangleArea(lengthNum, widthNum);

    public static double squareRectanglePerimeter(double length, double width) {
        return (2 * length) + (2 * width);
    }

    public static double TriangleArea(double base, double height) {
        return (base*0.5) * height;
    }

    public static double perimeterOfTriangle(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }


    public static double areaOfCircle(double dia) {
        double radius = dia/2;
        double result = constPI * radius * radius;
        return StrictMath.round(result * 1000.0) / 1000.0;
    }

    //todo
    public static double circumferenceOfCircle(double radius) {
        double result = 2 * constPI * radius;
        return StrictMath.round(result * 1000.0) / 1000.0;
    }

     public static String QuadType(double SideOne, double SideTwo, double SideThree, double SideFour){
         if((SideOne == SideTwo) && (SideTwo == SideThree) && (SideThree == SideFour)){
             return "This is a Square";
         }else if((SideOne == SideThree) && (SideTwo == SideFour) && (SideThree !=  SideTwo)){
             return "This is a Rectangle";
         }else if((SideOne == SideTwo) && (SideThree == SideFour) && (SideFour !=  SideTwo)){
             return "This is a Rectangle";
         }else if((SideOne == SideFour) && (SideTwo == SideThree) && (SideFour !=  SideTwo)){
             return "This is a Rectangle";
         }else{
             return "This is a general quadrilateral";
         }
     }

    public static String TriangleType(double SideOne, double SideTwo, double SideThree) {
        if(SideOne == SideTwo && SideOne == SideThree) {
            return"Your Triangle is an Equilateral Triangle";
        } else if((SideOne == SideTwo) || (SideOne == SideThree) || (SideTwo == SideThree)) {
            return"Your Triangle is an Isosceles Triangle";
        } else {
            return"Your triangle is a Scalene Triangle";
        }
    }


    //ellipse area
    public static double ellipseArea(double width, double height) {
        double result =  constPI * (width*0.5) * (height*0.5);
        return StrictMath.round(result * 1000.0) / 1000.0;
    }

    public static double ellipsePerimeter(double width, double height) {
        double a = width / 2;
        double b = height / 2;
        double part = (3*a + b) * (a + 3*b);
        double result = constPI * ((3*(a + b)) - (StrictMath.sqrt(part)));
        return StrictMath.round(result * 1000.0) / 1000.0;
    }

    public static String ellipseOrCircle(double a, double b) {
        return (a==b) ? "This is a Circle" : "This is an ellipse";
    }
}

