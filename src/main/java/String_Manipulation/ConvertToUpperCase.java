package String_Manipulation;

//8. Write a program to convert each 1st char to uppercase from a string

public class ConvertToUpperCase {
    public static void main(String[] args) {
        String str = "rahim lives in sylhet";
        String word[] = str.split(" ");
        String firstLetter = "";
        String restLetters="";
        for (int i = 0; i < word.length; i++) {
            firstLetter=String.valueOf(word[i].charAt(0));
            restLetters = word[i].substring(1);
            System.out.print(firstLetter.toUpperCase()+restLetters+" ");
        }
        System.out.println(" ");
    }
}
