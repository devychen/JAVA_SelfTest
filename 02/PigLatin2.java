import java.util.Scanner;

public class PigLatin2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the original lines: ");
        String originalLine = keyboard.nextLine();
        String lowerLine = originalLine.toLowerCase(); // all lowercase
        // no punctuation
        String result = removePunctuation(input);
        System.out.println("Result after removing punctuation: " + result);
    }

    private static String removePunctuation(String input) {
        // 使用正则表达式移除所有标点符号，并替换为空格
        return input.replaceAll("[\\p{Punct}&&[^\\s]]", " ");

        

    
        keyboard.close();
        
    }
}
