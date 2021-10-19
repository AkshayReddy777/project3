package com.company;


public class BMIValues {
    static String bmiCalculator(double weight, String x, double height , String y ) {
//        Scanner scanUserInput = new Scanner(System.in);
//
//        System.out.println("Enter 1 if weight is in kgs || Enter 2 if weight is in pounds");
//        int x = scanUserInput.nextInt();
//
//        System.out.println("Enter the weight");
//        double weight = scanUserInput.nextDouble();
//
//        System.out.println("Enter 1 if height is in meters || Enter 2 if height is in inches");
//        int y = scanUserInput.nextInt();
//
//        System.out.println("Enter the height");
//        double height = scanUserInput.nextDouble();

        if (x == "pounds") {
            weight = (weight * 0.453592);
        } else if ( x == "kilos") {
          weight = weight;
        }
        if (y == "inches") {
            height = height * 0.0254;
        } else if ( y == "meters"){
            height = height;
        }
        double BMI = weight / Math.pow(height, 2);
        BMI = Math.round(BMI);
        System.out.println(BMI);
        if (BMI < 18.5) {
           return "Underweight";
        } else if (18.5 <= BMI && BMI <= 24.9) {
            return "Normal Weight";
        } else if (25 <= BMI && BMI <= 29.9) {
            return "Overweight";
        } else if (BMI >= 30) {
            return "obese";
        }
        return " ";
    }
    public static void main(String[] srgs ) {
        System.out.println(bmiCalculator(205 , "pounds" , 73 , "inches"));
    }
}
