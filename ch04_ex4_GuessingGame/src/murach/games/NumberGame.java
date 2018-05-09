package murach.games;

import java.util.Random;

public class NumberGame {
  
  //field ���� private�� �սô�
  private int upperLimit; 
  //�����ؼ� ������ ��
  private int number;
  //Ƚ��
  private int guessCounter;
  
  
  //field �� �ʱ�ȭ�� constructor���� �ϴ� �� ��õ
  public NumberGame(int upperLimit) {
    this.upperLimit = upperLimit;
    Random random = new Random();
    this.number = random.nextInt(upperLimit - 1) + 1;
    this.guessCounter = 1;    
  }
  
  
  
  //CorrectGuess method
  public int isCorrectGuess(int guess) {
    if(guess < this.number) {
      return -1;
    }else if(guess > this.number) {
      return 1;
    }else {
      return 0;
    }
  }
    
  
  //get method  
  //������������� ���������� �������� �����̴�.
  //get set method ������ ���սô� + �����մϴ�
  public int getUpperLimit() {
    return this.upperLimit;
  }

  public int getNumber() {
    return this.number;
  }

  public int getGuessCounter() {
    return this.guessCounter;
  }

  public void incrementGuessCounter() {
    this.guessCounter += 1;
  }
  
 
  
  
}

