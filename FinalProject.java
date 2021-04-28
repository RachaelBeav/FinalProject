import java.util.Scanner; // import the Scanner class 
class FinalProject
{
  public static void main(String[] args) 
  {
    Scanner myObj = new Scanner(System.in);
    // prompt user
    System.out.println("Please choose a number between 1 and 25!");
    // Define counter
    int logi = 0;
//start main while
    while (logi < 1)
    {
      int num = myObj.nextInt();
    // make if for numbers 1 thru 25
      if (num >= 1 && num <= 25)
      {
        System.out.println(num);
        logi ++; //Increment counter
        // Do the maths here
        while (num != 1)
        {
          // for evens
          if (num % 2 == 1)
          {
             num /= 2;
          }
          // for odds
          else
          {
            num = num * 3 + 1;
          }
          System.out.println(num);
        }      
      }
      // ask to re-try prompt. While statement will bring this back to top due to counter not being incremented
      else 
      {
        System.out.println("Try again! Please choose a number between 1 and 25.");
      }
    } 
  }
}
