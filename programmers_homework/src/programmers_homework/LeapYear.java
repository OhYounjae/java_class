package programmers_homework;

//���ⱸ�ϱ�
public class LeapYear {
  class Solution {
  public boolean solution(int year) {
    boolean answer = false;
    if(year % 4 == 0 && (year % 100 != 0) || (year % 400 == 0)){
        answer = true;
    }
    return answer;
}
}

}
