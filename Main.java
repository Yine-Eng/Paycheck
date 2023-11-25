import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      String date;      // Check date
      String name;      // Pay to the order of
      double amount;    // Amount of check
      
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);

      // Get the date.
      System.out.print("Enter the check date: ");
      date = keyboard.nextLine();
      
      // Get the name of the payee.
      System.out.print("Enter the name of the payee: ");
      name = keyboard.nextLine();
      
      // Get the amount of the check.
      System.out.print("Enter the amount of the check: ");
      amount = keyboard.nextDouble();
      
      // Validate the amount of the check.
      while (amount < 0 || amount > 10000)
      {
         System.out.print("ERROR: Enter at least 1 and no more " +
                          "than 10000: ");
         amount = keyboard.nextDouble();
      }
      
      // Display the simulated check.
      System.out.println("\t\t\t\t\t\tDate: " + date);
      System.out.print("Pay to the order of: " + name);
      System.out.printf("\t\t$%,.2f\n", amount);
      System.out.println(wordNumber(amount));
   }
   
   /**
      The wordNumber method converts a number to an English
      word.
      @param num The number to convert.
      @return A string containing an English word version of num.
   */
   
   public static String wordNumber(double num)
   {
      String[] onesWords = { "", "One", "Two", "Three", "Four", 
                             "Five", "Six", "Seven", "Eight", "nine" };
      String[] teensWords = { "", "", "", "", "", "", "", "", "", "",
                              "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen",
                              "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };
      String[] tensWords = { "", "Ten", "twenty", "Thirty", "Forty", "Fifty", 
                             "Sixty", "Seventy", "Eighty", "Ninety" };
   
      int ks, huns, tens, teens, ones, cents;
      String fracString = "";
      String str = "";
      
//add code here
    
     
     ks = (int)(num / 1000);
     if (ks > 0)
     {
       str += onesWords[ks] + " thousand ";
     }
     huns = (int)(num / 100) % 10;
     
    if (huns > 0)
     
      str += onesWords[huns]+ " hundred ";

     
     tens = (int)(num / 10) % 10;
     
    if (tens > 1)
     
       str += tensWords[tens] + " ";

     
     ones = (int)(num % 10);
   
    if (ones > 0)
    {
       str += onesWords[ones] + " ";
    }
     
    else if (tens == 1)
    {
      teens = (int)num % 10;
      str += teensWords[teens] + " ";
    }
     else 
    {
      ones = (int)num % 10;
      if (ones > 0)
        str += onesWords[ones] + " ";
    }
     
     
     cents = (int)(num * 100) % 100;
     
     if (cents > 0)
       str += "and " + cents+ " cents" ;
     
     return str;
          
  
  
      
   }
}