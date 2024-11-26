package runFile;
public class Solution {

    public static void main(String[] args) {

       // System.out.println(solution(3, 20, 4));
    }
    public static long solution(int price, int money, int count) {
        long answer = -1;
        long sum = 0;

        for(int i = 1; i <= count; i++){
            sum += price * i;
        }

        if(sum >= money){
            answer = sum - money;
        }else{
            answer = 0;
        }

        return answer;
    }
}
