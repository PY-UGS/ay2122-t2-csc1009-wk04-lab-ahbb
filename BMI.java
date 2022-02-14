public class BMI 
{
    private double weight;
    private double height;

    //to convert into kilograms and meters in calcBMI method
    private static final double kiloConversion = 0.45359237;
    private static final double meterConversion = 0.0254;

    public BMI()
    {
    }

    public double calcBMI(double weight, double height)
    {
        //applying BMI formula
        double bmi = (kiloConversion*weight)/Math.pow(meterConversion*height,2);
        return bmi;
    }

    public String getStatus(double bmi)
    {
        String status="";

        if (bmi<18.5)
        {
            status = "Underweight";
        }
        else if (bmi>=18.5 && bmi<25.0)
        {
            status = "Normal";
        }
        else if (bmi>=25.0 && bmi<30.0)
        {
            status = "Overweight";
        }
        else if (bmi>=30.0)
        {
            status = "Obese";
        }

        return status;
    }

    public double getWeight() 
    {
        return this.weight;
    }

    public void setWeight(double weight) 
    {
        this.weight = weight;
    }

    public double getHeight() 
    {
        return this.height;
    }

    public void setHeight(double height) 
    {
        this.height = height;
    }
}
