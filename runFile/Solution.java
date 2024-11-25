package runFile;

import java.util.HashMap;

public class Solution {

    public static void main(String[] args) {

        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {
                {"may", "kein", "kain", "radi"},
                {"may", "kein", "brin", "deny"},
                {"kon", "kain", "may", "coni"}
        };

        int[] result = solution(name, yearning, photo);
        for (int score : result) {
            System.out.println(score);
        }

    }
    public static int[] solution(String[] name, int[] yearning, String[][] photo) {

        int[] answer = new int[photo.length];

        HashMap<String ,Integer> hm = new HashMap<>();

        for (int i = 0; i < name.length; i++){
            hm.put(name[i], yearning[i]);
        }

        for(int i = 0; i < photo.length; i++){
            for (int j = 0; j < photo[i].length; j++){
                if(hm.containsKey(photo[i][j])){
                    answer[i] += hm.get(photo[i][j]);
                }
            }
        }

        return answer;
    }
}
