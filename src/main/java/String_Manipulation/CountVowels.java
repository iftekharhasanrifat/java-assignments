package String_Manipulation;

//5. Write a program that will count how many vowels in the given string:
//        "roadtosdet"
//        Output: 4

public class CountVowels {
    public static void main(String[] args) {
        String str = "roadtosdet";
        int count =0;
        char ch[] = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'){
                count++;
            }
        }
        System.out.println("There are "+count+" vowels in \"roadtosdet\"");
    }
}
