import java.util.*;


/**
 * Code for P7.12
 * @Victor
 */
public class Store
{
   public String nameOfBestCustomer(ArrayList<Double> sales,
         ArrayList<String> customers)
   {
      String top = " ";
	  
	  int customerIndex = 0;
	  for (int i=1; i<sales.size();i++)
		  if((Double)sales.get(customerIndex)< (Double)sales.get(i))
			  customerIndex=i;
	  top=(String)customers.get(customerIndex);  
	  
      return top;
   }

   public static void main(String[] args)
   {
      ArrayList<Double> price = new ArrayList<Double>();
      ArrayList<String> names = new ArrayList<String>();

      Scanner in = new Scanner(System.in);
	  
	  while (true) 
	  {
		  System.out.println ("Please enter price or $0 to quit: ");
		  double cusPrice = Double.parseDouble(in.nextLine());
		  if (cusPrice==0)
		  break;
		  System.out.println("Please enter name: ");
		  String cusName = in.nextLine();
		  price.add(cusPrice);
		  names.add(cusName);
	  }
	  
      	  if (names.size()==0)
      	  {
      		  System.out.println("Terminating Program");
      		  System.exit(0);
      	  }
		  
		  

      Store top = new Store();
      System.out.println("Best customer's name "
            + top.nameOfBestCustomer(price, names));
   }
}

