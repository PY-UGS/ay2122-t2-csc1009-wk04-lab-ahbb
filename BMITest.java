import java.util.Scanner;

public class BMITest 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        BMI bmiObj = new BMI();

        System.out.println("Enter weight in pounds: ");
        bmiObj.setWeight(input.nextDouble());

        System.out.println("Enter height in inches: ");
        bmiObj.setHeight(input.nextDouble());

        input.close();

        double bmi = bmiObj.calcBMI(bmiObj.getWeight(),bmiObj.getHeight());

        String status = bmiObj.getStatus(bmi);

        System.out.println("BMI is "+bmi);
        System.out.println(status);
    }
}
