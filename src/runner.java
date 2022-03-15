import java.util.Arrays;
import java.util.List;

public class runner {

    public static int[] ascending(int[] nums){
        Arrays.sort(nums);
        return nums;
    }

    public static int countWords(String str){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != ' '){
                count++;
                while(str.charAt(i) != ' ' && i < str.length()-1){
                    i++;
                }
            }
        }
        return count;
    }

    public static double Calculator(double num, double num2, char op){
        if(op == '+'){
           return num + num2;
        }else if(op == '-'){
            return num - num2;
        }else if(op == '*'){
            return num * num2;
        }else if(op == '/'){
            return num / num2;
        }else{
            return 0;
        }
    }

    public static String cardHidden(String cardNum){
        String hiddenCard = "";
        for(int i =0; i < cardNum.length(); i++){
            if(i >= 4){
                hiddenCard += '*';
            }
        }
        hiddenCard += cardNum.substring(cardNum.length() -4);
        return hiddenCard;
    }


    public static String reverseOdd(String str){
        String[] words = str.split("");
        String result = "";
        for(int i = 0; i < str.length(); i++){
            if(words[i].length() % 2 == 0){
                result += words[i] + " ";
            }else{
                result += new StringBuilder(words[i]).reverse() + " ";
            }
        }
        return result.trim();
    }
}
