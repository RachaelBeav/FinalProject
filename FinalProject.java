import java.util.Scanner; // import the Scanner class 

class FinalProject {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    // prompt user
    System.out.println("Please enter a number between 1 and 25! ");
    // start main while
    int num = myObj.nextInt();
    //start while for math
    while(num < 1 || num > 25){
      System.out.println("Thats not a valid number. Please enter a number between 1 and 25: ");
      num = myObj.nextInt();
    }
    while(num != 1){
      //for evens
      if (num % 2 == 0) {
            num /= 2;
          }
          // for odds
          else {
            num = num * 3 + 1;
          }
          System.out.println(num);
        }
    }
  }
