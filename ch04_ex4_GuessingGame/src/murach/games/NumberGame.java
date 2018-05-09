package murach.games;

import java.util.Random;

public class NumberGame {
  
  //field ���� private�� �սô�
  private int upperLimit;
  private int number;
  private int guessCounter;
  
  
  //field �� �ʱ�ȭ�� constructor���� �ϴ� �� ��õ
  public NumberGame(int upperLimit) {
    this.upperLimit = upperLimit;
    Random random = new Random();
    this.number = random.nextInt(upperLimit - 1) + 1;
    this.guessCounter = 1;
  }
  
  public void guessValue(int guess) {
    System.out.print("Enter your guess: ");
    while(guess != number) {
      if (guess < number) {
        System.out.println("Your guess is too low.\n");
       }
      else if (guess > number) {
        System.out.println("Your guess is too high.\n");
       }
      
     guessCounter = guessCounter + 1;
     System.out.print("Enter your guess: ");
    }
    
  }
  
  
}
