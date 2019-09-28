import java.util.Scanner;
public class DiscountPrice {

	public static void main(String[] args)
	{
	
	Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter cost of groceries: ");
		double cost = in.nextDouble();
		double couponRate;
		String percent;
	
		if (cost < 10 ) 
		{
			couponRate=(0);
			percent=(" (No Coupon) ");
		}		
		else if (cost >= 10 && cost <= 60)
		{
			couponRate= (cost*0.08);
			percent=(" (8% of your purchase) ");
		}
		else if (cost >= 60 && cost <= 150)
		{
			couponRate= (cost*0.10);
			percent=(" (10% of your purchase) ");
		}
		else if (cost > 150 && cost <= 210)
		{
			couponRate= (cost*0.12);
			percent=(" (12% of your purchase) ");
		}
		else
		{
			couponRate = (cost*0.14);
			percent=(" (14% of your purchase) ");
		} 
		System.out.print ("You win a discount coupon of $ " );
		System.out.print(couponRate);
		System.out.print(percent);
			
			}
		
		

	}


