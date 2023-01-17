class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        
        int[] answer = new int[2];
    
       
        int n = denom1 * denom2;   // 분수의 합
        int de = denom2 * numer1 + denom1 * numer2;  //분모의 최대 공약수
        int max = 1;    //기약분수
        
        for (int i =1; i <= n && i <= de; i++){
            if(n%i==0 && de%i == 0){
                max = i;
            }
        }
         // 분모와 분자를 최대 공약수로 나눠주면 리턴값
        
        answer[0] = de / max;
        answer[1] = n / max;
         
        return answer;
    }
}