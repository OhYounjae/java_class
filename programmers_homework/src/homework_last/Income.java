package homework_last;

import java.util.Arrays;

class Solution {
  public int[][] solution(int[][] income) {
      int[][] answer = {};
      int total_len = income.length;
        answer = new int[total_len + 3][4];        
        
        for(int i = 0; i < total_len; i++) {
          Arrays.sort(income[i]);
        }
    //1�� �м�
        //1 ���� ���� ���ϱ�
        for(int i = 0; i < total_len; i++) {
          answer[i][0] = income[i].length;
        }
        
        //2 �ձ��ϱ�
        for(int i = 0; i < total_len; i++) {
          int sum = 0;
          for(int j = 0; j < income[i].length; j++) {
            sum += income[i][j];
          }
          answer[i][1] = sum;
        }
        
        //3 ��ձ��ϱ�
        for(int i = 0; i < total_len; i++) {
          answer[i][2] = answer[i][1] / answer[i][0];
        }
        
        //4 max�� ���ϱ�
        for(int i = 0; i < total_len; i++) {
          int max = 0;
          for(int j = 0; j < income[i].length; j++) {
            if(income[i][j] > max) {
              max = income[i][j];
            }
          }
          answer[i][3] = max;          
        }
        
        
   //2�� �м�
        //2-1 ��
        for(int i = 0; i < 4; i++){
            int sum = 0;
            for(int j = 0; j < total_len; j++){
                sum += answer[j][i];
            }
            answer[total_len][i] = sum;
        }
        
        //2-2 ���
        for(int i = 0; i < 4; i++){
            answer[total_len+1][i] = answer[total_len][i] / total_len;
        }      
        
        //2-3 max
        for(int i = 0; i < 4; i++){
            int max = 0;
            for(int j = 0; j < total_len; j++){
                if(answer[j][i] > max){
                    max = answer[j][i];
                }
                answer[total_len+2][i] = max;
            }
        }     
        
        return answer;
  }
}