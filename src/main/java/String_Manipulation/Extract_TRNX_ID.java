package String_Manipulation;

//1. Extract the transaction ID from the HTML body
//<html>
//<title>Test</title>
//<body>
//Your trnx is successful. Trnx Id is: TXN123456
//</body>
//</html>
//        Output: TXN123456

public class Extract_TRNX_ID {
    public static void main(String[] args) {
        String str = "Extract the transaction ID from the HTML body\n" +
                "<html>\n" +
                "<title>Test</title>\n" +
                "<body>\n" +
                "Your trnx is successful. Trnx Id is: TXN123456\n" +
                "</body>\n" +
                "</html>";
        String arr[]=str.split(" ");
        System.out.println("----------------------------");
        System.out.println(arr[14].split("\n")[0]);
    }
}
