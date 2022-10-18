package String_Manipulation;

//2. Price of a formal shirt is 1200 tk and Sharee is 3500 tk.
// If you buy 2 shirt and 1 sharee, then 400 tk will be discounted.
// After your purchase what will be your total cost?

public class ShareeShirtPrice {
    public static void main(String[] args) {
        String str = "Price of a formal shirt is 1200 tk and Sharee is 3500 tk. If you buy 2 shirt and 1 sharee, then 400 tk will be discounted. After your purchase what will be your total cost?";
        str = str.replaceAll("[^\\d]", " ");
        str = str.trim();
        str = str.replaceAll(" +", " ");
        int shirtPrice = Integer.parseInt(str.split(" ")[0]);
        int shareePrice = Integer.parseInt(str.split(" ")[1]);
        int shirtAmount = Integer.parseInt(str.split(" ")[2]);
        int shareeAmount = Integer.parseInt(str.split(" ")[3]);
        int discountPrice = Integer.parseInt(str.split(" ")[4]);

        int totalCost = (shirtPrice*shirtAmount)+(shareePrice*shareeAmount)-discountPrice;
        System.out.println("-----------------------------");
        System.out.println("Total Cost will be : "+totalCost+" tk");

    }
}
