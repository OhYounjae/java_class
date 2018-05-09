public class Homework {
    private int balance;   //������ �ܾ�
    private int accountID; //������ȣ
    private static final int MAX_WITHDRAW = 100000; //�ִ� ����ݾ�
    
    public Homework(int accountID){
        this(accountID, 0);
    }
    
    public Homework(int accountID, int balance){
        this.accountID = accountID;
        this.balance = balance;
    }
    
    //get method
    public int getBalance(){
        return this.balance;
    }
    public int getAccountID(){
        return this.accountID;
    }
    
    //withdraw method (1)
    public boolean withdraw(int amount){
        if(amount > this.balance) {return false;}
        if(amount > this.MAX_WITHDRAW) {return false;}
        if(0 >= amount) {return false;}
        this.balance -= amount;
        return true;
    }
    
    //withdraw method(2)
    public boolean withdraw(){
        return withdraw(10000);
    }  
    
    //desposit function
    public boolean deposit(int amount){
        if(amount <= 0) { return false; }
        this.balance += amount;
        return true;            
    }
    
}

// ���� ����!!!!! �Ʒ� �ڵ�� �������� ������. �������� �ȵ˴ϴ�.
class Solution {
  public int solution(int ignore) {
      int answer = 0;
      return answer;
  }
}