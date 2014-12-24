import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstTask {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int pairs = 1;
        boolean flag = true;

        while (flag) {
            System.out.println("Enter a number of bracket pairs");
            try {
                pairs = Integer.parseInt(reader.readLine());
            } catch (IOException e) {
                System.out.println("Enter a number");
            }
            if(pairs >= 1) {
                flag = false;
            }
        }

        int n = new FirstTask().amountOfBrackets(pairs);
        System.out.println(n);
    }

    //I found out that the amount of balanced brackets is the same task as getting Catalan number
    //so i recursively counted amount of brackets for number N using simple formula
    public int amountOfBrackets(int numberOfPairs) {
        if (numberOfPairs == 1) {
            return 1;
        } else {
            return 2 * (2 * numberOfPairs - 1) * amountOfBrackets(numberOfPairs - 1) / (numberOfPairs+1);
        }
    }
}
