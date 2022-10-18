package String_Manipulation;

//6. Replace "R" from Rahim with "F" from the given String:
//        Input: Ratul and Rahim lives in Rangpur
//        Output: Ratul and Fahim lives in Rangpur

public class ReplaceCharacter {
    public static void main(String[] args) {
        String str = "Ratul and Rahim lives in Rangpur";
        String word[] = str.split(" ");
        String newWord = str.split(" ")[2].replace('R','F');
        String newString = str.replace("Rahim",newWord);
        System.out.println(newString);
    }
}
