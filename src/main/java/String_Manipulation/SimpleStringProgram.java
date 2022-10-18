package String_Manipulation;

//4. Writea program that will give following output:
//        Input: chattogram
//        Output: C8M

public class SimpleStringProgram {
    public static void main(String[] args) {
        String str = "chattogram";
        String s1 = String.valueOf(str.charAt(0)).toUpperCase();
        String lastLetter = String.valueOf(str.charAt(str.length()-1)).toUpperCase();
        int length = str.length()-2;

        System.out.println(s1+length+lastLetter);
    }
}
