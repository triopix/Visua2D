//package SwiftMath.assets.info;
//
//public class ex {
//
//    //Important constants for our calculator
//    public static final double PI = 3.14;
//    public static final double E = Math.E;
//    public final static String INVALID_VALUE_ENTERED = "Invalid Value(s) Entered";
//
//    public void calculatePi() {
//        System.out.println("Pi is = " + PI);
//    }
//    public void calculateE() {
//        System.out.println("Euler's number or e, is = " + E);
//    }
//    //Important Operators
//    public double add(double num1, double num2) {
//        double addedNums = num1 + num2;
//        System.out.println("The number " + num1 + " + " + " The number " + num2 + " is = " + addedNums);
//        return addedNums;
//    }
//
//    public double subtract(double num1, double num2) {
//        double subtract = num1 - num2;
//        System.out.println("The number " + num1 + " minus " + "The number " + num2 + " is = " + subtract);
//        return subtract;
//    }
//
//    public double multiply(double num1, double num2) {
//        double multiplyNums = num1 * num2;
//        System.out.println("The number " + num1 + " multiplied by " + " The number " + num2 + " is = " + multiplyNums);
//        return multiplyNums;
//    }
//
//    public double divide(double num1, double num2) {
//        double divideNums = num1 / num2;
//        System.out.println("The number " + num1 + " divided by " + " The number " + num2 + " is = " + divideNums);
//        return divideNums;
//    }
//        // Math basics^^^
//    //Exponents and Square Roots
//    public double exp(double number, double exponent) {
//        double totalValue = Math.pow(number, exponent);
//        System.out.println("The number " + number + " raised to the power "+ exponent + " is = " + totalValue);
//        return totalValue;
//    }
//
//    public double setSquareRoot(double number) {
//        System.out.println("The square root of the number " + number + " is = " + Math.sqrt(number));
//        return Math.sqrt(number);
//    }
//
//    public double setCubeRoot(double number) {
//        System.out.println("The cube root of the number " + number + " is = " + Math.cbrt(64));
//        return Math.cbrt(number);
//    }
//
//    public double squareNumber(double number) {
//        double result = number * number;
//        System.out.println("The number " + number + " squared is " + result);
//        return result;
//    }
//
//    public static double cubeNumber(double number) {
//        double result = number * number * number;
//        System.out.println("The number " + number + " cubed is " + result);
//        return result;
//    }
//
//
//    //The pythagorean Theorems
//    public void PythagoreanTheoremSolveForA(double theHeight, double c) {
//        if((theHeight < 1 || c < 1)) {
//            System.out.println(INVALID_VALUE_ENTERED);
//        }
//        double a = Math.sqrt((c*c) - (theHeight*theHeight));
//        System.out.println("Your value of a in the Pythagorean Theorem is = " + String.format("%.2f", a));
//    }
//
//    public void PythagoreanTheoremSolveForB(double a, double c) {
//        if((a < 1) || (c < 1)) {
//            System.out.println(INVALID_VALUE_ENTERED);
//        }
//        double theHeight = Math.sqrt(((c*c) - (a*a)));
//        System.out.println("Your value of theHeight in the Pythagorean Theorem is = " + String.format("%.2f", theHeight));
//    }
//
//    public void PythagoreanTheoremSolveForC(double a, double theHeight) {
//        if((a < 1) || (theHeight < 1)) {
//            System.out.println(INVALID_VALUE_ENTERED);
//        }
//        double cHyp = Math.sqrt(((a*a) + (theHeight*theHeight)));
//        System.out.println("Your value of c in the Pythagorean Theorem is = " + String.format("%.2f", cHyp));
//    }
//
//    //Triangles
//    public void typeOfTriangle(int sideOne, int sideTwo, int sideThree) {
//        if(sideOne < 1 || sideTwo < 1 || sideThree < 1) {
//            System.out.println(INVALID_VALUE_ENTERED);
//        }
//        if(sideOne == sideTwo && sideOne == sideThree) {
//            System.out.println("Your Triangle is an Equilateral Triangle");
//        } else if((sideOne == sideTwo) || (sideOne == sideThree) || (sideTwo == sideThree)) {
//            System.out.println("Your Triangle is an Isosceles Triangle");
//        } else {
//            System.out.println("Your triangle is a Scalene Triangle");
//        }
//    }
//
//    public double areaOfTriangle(double base, double height) {
//        if((base < 1) || (height < 1)) {
//            System.out.println(INVALID_VALUE_ENTERED);
//        }
//        double area = 0.5 * (base * height);
//        System.out.println("The area of the triangle is = " + area);
//        return area;
//    }
//
//    //Circles
//    public double areaOfCircle(double radius) {
//        if(radius < 1) {
//            System.out.println(INVALID_VALUE_ENTERED);
//        }
//        double areaOfCircle = PI*radius*radius;
//        System.out.println("The area of the circle is = " + areaOfCircle);
//        return areaOfCircle;
//    }
//
//    public double circumferenceOfCircle(double radius) {
//        if(radius < 1) {
//            System.out.println(INVALID_VALUE_ENTERED);
//        }
//        double circumference = 2*PI*radius;
//        System.out.println("The circumference of the circle is = " + circumference);
//        return circumference;
//    }
//
//    public double findRadiusFromArea(double area) {
//        if(area < 1) {
//            System.out.println(INVALID_VALUE_ENTERED);
//        }
//        double radius = Math.sqrt(area / PI);
//        System.out.println("The radius from the given area is = " + radius);
//        return radius;
//    }
//
//    public double findRadiusFromCircumference(double circumference) {
//        if(circumference < 1) {
//            System.out.println(INVALID_VALUE_ENTERED);
//        }
//        double radius = circumference / (PI * 2);
//        System.out.println("The radius from the given circumference is = " + radius);
//        return radius;
//    }
//
//    //General Polygons -> Angles -> Diagonals
//
//    //Rectangles -> Area
//    public double areaOfRectangle(double length, double width) {
//        if(length < 1 || width < 1) {
//            System.out.println(INVALID_VALUE_ENTERED);
//        }
//        double area = length * width;
//        System.out.println("The area of the rectangle with length " + length + " and width " + width + " has area of = " + area);
//        return area;
//    }
//
//    public  double perimeterOfRectangle(double length, double width) {
//        if(length < 1 || width < 1) {
//            System.out.println(INVALID_VALUE_ENTERED);
//        }
//        double perimeter = (2*length) + (2*width);
//        System.out.println("The perimeter of your rectangle with length " + length + " and width of " + width + " has perimeter of = " + perimeter);
//        return perimeter;
//    }
//
//    //Interior Angles with shape
//
//    //Strings for output of program
//    private static final String INVALID_VALUE = "Invalid Value";
//    private static final String FOR_ANY_TRIANGLE_REGARDLESS = "for any triangle regardless";
//    private static final String ONLY_FOR_EQUILATERAL_TRIANGLE = "Only for equilateral triangle";
//    private static final String SQUARE_OR_RECTANGLE_OR_ANY_OTHER_QUADRILATERAL = "Square or Rectangle or any other quadrilateral";
//    private static final String SQUARE_AND_RECTANGLE_ONLY = "Square and Rectangle Only";
//    private static final String PENTAGON_OR_ANY_OTHER_FIVE_SIDED_SHAPE = "Pentagon or any other 5 sided shape";
//    private static final String ONLY_EQUILATERAL_PENTAGON = "Only a Equilateral Pentagon";
//    private static final String HEXAGON_OR_ANY_OTHER_SIX_SIDED_SHAPE = "A Hexagon or any other 6 sided shape";
//    private static final String ONLY_EQUILATERAL_HEXAGON = "Only a Equilateral Hexagon";
//    private static final String HEPTAGON_OR_ANY_OTHER_SEVEN_SIDED_SHAPE = "A Heptagon or any other 7 sided shape";
//    private static final String ONLY_EQUILATERAL_HEPTAGON = "Only a Equilateral Heptagon";
//    private static final String OCTAGON_OR_ANY_OTHER_EIGHT_SIDED_SHAPE = "Octagon or any other 8 sided shape";
//    private static final String ONLY_EQUILATERAL_OCTAGON = "Only a equilateral Octagon";
//    private static final String NONAGON_OR_ANY_OTHER_NINE_SIDED_SHAPE = "Nonagon or any other 9 sided shape";
//    private static final String ONLY_EQUILATERAL_NONAGON = "Only a equilateral Nonagon";
//    private static final String DECAGON_OR_ANY_OTHER_TEN_SIDED_SHAPE = "Decagon or any other 10 sided shape";
//    private static final String ONLY_EQUILATERAL_DECAGON = "Only a equilateral Decagon";
//    private static final String HENDECAGON_OR_ANY_OTHER_11_SIDED_SHAPE = "Hendecagon or any other 11 sided shape";
//    private static final String ONLY_EQUILATERAL_HENDECAGON = "Only a equilateral Hendecagon";
//    private static final String DODECAGON_OR_ANY_OTHER_TWELVE_SIDED_SHAPE = "Dodecagon or any other 12 sided shape";
//    private static final String ONLY_EQUILATERAL_DODECAGON = "Only equilateral Dodecagon";
//
//    //don't print names greater than 12 sides
//    private static final String I_WILL_NOT_PRINT_NAMES_GREATER_THAN_12_SIDES = "I will not output the names of shapes greater than 12 sides.";
//
//
//    public void sumOfInteriorAnglesAndEachInteriorAngleValueWithShapeName(int numberOfSides) {
//        int sum = 180 * (numberOfSides - 2);
//        int eachInteriorAngle = sum / numberOfSides;
//        char degreeSymbol = '\u00B0';
//        if(numberOfSides < 3) {
//            System.out.println(INVALID_VALUE);
//        } else {
//            switch(numberOfSides) {
//                case 3:
//                    System.out.println("Sum of interior angles " + FOR_ANY_TRIANGLE_REGARDLESS + " is = " + sum + degreeSymbol);
//                    System.out.println("And each interior angle " + ONLY_FOR_EQUILATERAL_TRIANGLE  + " is = " + eachInteriorAngle + degreeSymbol);
//                    break;
//                case 4:
//                    System.out.println("Sum of interior angles in " + SQUARE_OR_RECTANGLE_OR_ANY_OTHER_QUADRILATERAL + " is = " + sum + degreeSymbol);
//                    System.out.println("And each interior angle in " + SQUARE_AND_RECTANGLE_ONLY  + " is = " + eachInteriorAngle + degreeSymbol);
//                    break;
//                case 5:
//                    System.out.println("Sum of interior angles in " + PENTAGON_OR_ANY_OTHER_FIVE_SIDED_SHAPE + " is = " + sum + degreeSymbol);
//                    System.out.println("And each interior angle in " + ONLY_EQUILATERAL_PENTAGON + " is = " + eachInteriorAngle + degreeSymbol);
//                    break;
//                case 6:
//                    System.out.println("Sum of interior angles in " + HEXAGON_OR_ANY_OTHER_SIX_SIDED_SHAPE + " is = " + sum + degreeSymbol);
//                    System.out.println("And each interior angle in " + ONLY_EQUILATERAL_HEXAGON + " is = " + eachInteriorAngle + degreeSymbol);
//                    break;
//                case 7:
//                    System.out.println("Sum of interior angles in " + HEPTAGON_OR_ANY_OTHER_SEVEN_SIDED_SHAPE + " is = " + sum + degreeSymbol);
//                    System.out.println("And each interior angle in " + ONLY_EQUILATERAL_HEPTAGON  + " is = " + eachInteriorAngle + degreeSymbol);
//                    break;
//                case 8:
//                    System.out.println("Sum of interior angles in " + OCTAGON_OR_ANY_OTHER_EIGHT_SIDED_SHAPE + " is = " + sum + degreeSymbol);
//                    System.out.println("And each interior angle in " + ONLY_EQUILATERAL_OCTAGON  + " is = " + eachInteriorAngle + degreeSymbol);
//                    break;
//                case 9:
//                    System.out.println("Sum of interior angles in " + NONAGON_OR_ANY_OTHER_NINE_SIDED_SHAPE + " is = " + sum + degreeSymbol);
//                    System.out.println("And each interior angle in " + ONLY_EQUILATERAL_NONAGON  + " is = " + eachInteriorAngle + degreeSymbol);
//                    break;
//                case 10:
//                    System.out.println("Sum of interior angles in " + DECAGON_OR_ANY_OTHER_TEN_SIDED_SHAPE + " is = " + sum + degreeSymbol);
//                    System.out.println("And each interior angle in " + ONLY_EQUILATERAL_DECAGON  + " is = " + eachInteriorAngle + degreeSymbol);
//                    break;
//                case 11:
//                    System.out.println("Sum of interior angles in " + HENDECAGON_OR_ANY_OTHER_11_SIDED_SHAPE + " is = " + sum + degreeSymbol);
//                    System.out.println("And each interior angle in " + ONLY_EQUILATERAL_HENDECAGON + " is = " + eachInteriorAngle + degreeSymbol);
//                    break;
//                case 12:
//                    System.out.println("Sum of interior angles in " + DODECAGON_OR_ANY_OTHER_TWELVE_SIDED_SHAPE + " is = " + sum + degreeSymbol);
//                    System.out.println("And each interior angle in " + ONLY_EQUILATERAL_DODECAGON  + " is = " + eachInteriorAngle + degreeSymbol);
//                    break;
//                default:
//                    System.out.println(I_WILL_NOT_PRINT_NAMES_GREATER_THAN_12_SIDES);
//                    System.out.println("\n");
//                    System.out.println("Sum of interior angles in " + numberOfSides + " number of sides is = " + sum + degreeSymbol);
//                    System.out.println("And each interior angle in " + numberOfSides  + " is  = " + eachInteriorAngle + degreeSymbol);
//            }
//        }
//    }
//
//    //Polygons Diagonals
//
//    //some strings for the names of polygons
//    private static final String SQUARE = "Square";
//    private static final String PENTAGON = "Pentagon";
//    private static final String HEXAGON = "Hexagon";
//    private static final String HEPTAGON = "Heptagon";
//    private static final String OCTAGON = "Octagon";
//    private static final String NONAGON = "Nonagon";
//    private static final String DECAGON = "Decagon";
//    private static final String HENDECAGON = "Hendecagon";
//    private static final String DODECAGON = "Dodecagon";
//
//    public void countNumberOfDiagonalsFromGivenNumberOfSides(int numberOfSides) {
//        int numberOfDiagonals = (numberOfSides * (numberOfSides - 3)) / 2;
//        if (numberOfSides < 4) {
//            System.out.println(INVALID_VALUE);
//        } else {
//            switch (numberOfSides) {
//                case 4:
//                    System.out.println("A " + SQUARE + " has " + numberOfDiagonals + " number of Diagonals");
//                    break;
//                case 5:
//                    System.out.println("A " + PENTAGON + " has " + numberOfDiagonals + " number of Diagonals");
//                    break;
//                case 6:
//                    System.out.println("A " + HEXAGON + " has " + numberOfDiagonals + " number of Diagonals");
//                    break;
//                case 7:
//                    System.out.println("A " + HEPTAGON + " has " + numberOfDiagonals + " number of Diagonals");
//                    break;
//                case 8:
//                    System.out.println("An " + OCTAGON + " has " + numberOfDiagonals + " number of Diagonals");
//                    break;
//                case 9:
//                    System.out.println("A " + NONAGON + " has " + numberOfDiagonals + " number of Diagonals");
//                    break;
//                case 10:
//                    System.out.println("A " + DECAGON + " has " + numberOfDiagonals + " number of Diagonals");
//                    break;
//                case 11:
//                    System.out.println("A " + HENDECAGON + " has " + numberOfDiagonals + " number of Diagonals");
//                    break;
//                case 12:
//                    System.out.println("A " + DODECAGON + " has " + numberOfDiagonals + " number of Diagonals");
//                    break;
//                default:
//                    System.out.println(I_WILL_NOT_PRINT_NAMES_GREATER_THAN_12_SIDES);
//                    System.out.println("\n");
//                    System.out.println("The number of diagonals for " + numberOfSides + " sided shape is = " + numberOfDiagonals);
//            }
//        }
//    }
//
//    public double cylinderVolume(double radius, double height, String roundingOptionEnterYorN) {
//        System.out.println("Warning: The cylinder volume if entered Y for option will print the number to the nearest hundredth, or else, it will print the normal volume");
//        System.out.println("\n");
//        double cylinderVolume = PI * (radius*radius) * height;
//        double newVol = Math.round(cylinderVolume * 100.0) / 100.0;
//        if(radius < 0.0 || height < 0.0) {
//            System.out.println(INVALID_VALUE_ENTERED);
//        } else if(roundingOptionEnterYorN == "Y") {
//            System.out.println("The rounded Cylinder volume is equal to = " + newVol);
//        } else if(roundingOptionEnterYorN == "N") {
//            System.out.println("The cylinder volume is equal to  = " + cylinderVolume);;
//        } else {
//            System.out.println(INVALID_VALUE + " entered for rounding option");
//        }
//        return 0.0;
//    }
//
//    public double cylinderSurfaceArea(double radius, double height, String roundingOptionEnterYorN) {
//        System.out.println("Warning: The cylinder surface area if entered Y for option will print the number to the nearest hundredth, or else, it will print the normal surface area");
//        System.out.println("\n");
//        double surfaceArea = (2*PI*radius*height) + (2*PI*(radius*radius));
//        double roundedSA = Math.round(surfaceArea * 100.0) / 100.0;
//        if(radius < 0.0 || height < 0.0) {
//            System.out.println(INVALID_VALUE_ENTERED);
//        } else if(roundingOptionEnterYorN == "Y") {
//            System.out.println("The rounded Cylinder surface area is equal to = " + roundedSA);
//        } else if(roundingOptionEnterYorN == "N") {
//            System.out.println("The cylinder surface area is equal to  = " + surfaceArea);;
//        } else {
//            System.out.println(INVALID_VALUE + " entered for rounding option");
//        }
//        return 0.0;
//
//    }
//
//    public double volumeOfCone(double radius, double height, String roundingOptionEnterYorN) {
//        double volume = 1/3d * PI * (radius * radius) * height;
//        double roundedVolume = Math.round(volume * 100.0d) / 100.0d;
//        if (radius < 0.0d || height < 0.0d) {
//            System.out.println(INVALID_VALUE_ENTERED);
//        } else if (roundingOptionEnterYorN.equals("Y")) {
//            System.out.println("The rounded cone volume is = " + roundedVolume);
//        } else if (roundingOptionEnterYorN.equals("N")) {
//            System.out.println("The cone volume is = " + volume);
//        } else {
//            System.out.println(INVALID_VALUE + " entered for rounding option");
//        }
//        return 0.0d;
//    }
//
//    public double volumeOfSphere(double radius, String roundingOptionEnterYorN) {
//        double volumeOfSphere = (4/3d) * PI * (radius*radius*radius);
//        double roundedVol = Math.round(volumeOfSphere * 100.0d) / 100.0d;
//        if (radius < 0.0d) {
//            System.out.println(INVALID_VALUE_ENTERED);
//        } else if (roundingOptionEnterYorN == "Y") {
//            System.out.println("The rounded volume of sphere is = " + roundedVol);
//        } else if (roundingOptionEnterYorN == "N") {
//            System.out.println("The sphere volume is = " + volumeOfSphere);
//        } else {
//            System.out.println(INVALID_VALUE + " entered for rounding option");
//        }
//        return 0.0d;
//    }
//}
