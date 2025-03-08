import java.util.Random;

public class RandomCode {
  public static void main(String[] args) {
    Random rand = new Random();
    int randomNum = rand.nextInt(100); // generate a random number between 0 and 99
    System.out.println("The random number is: " + randomNum);
  }
}