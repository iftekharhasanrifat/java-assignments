package Function_Array;

//4. Create your todays bazar list/pocket expenditure which includes the item name and price.
// Then create a function named searchItem(String item) which will be used to search any item from your HashMap and return the price.
// If found no item, then print message as "No item found" and another function named totalSum() which will return total price of items.


import java.util.HashMap;
import java.util.Scanner;

public class Hashmap_Bazar_List {

    public HashMap bazarList(){
        HashMap bazarList = new HashMap();
        bazarList.put("Honey",330);
        bazarList.put("Mustard Oil",115);
        bazarList.put("Ghee",534);
        bazarList.put("Orange",220);
        return bazarList;
    }
    public String searchItem(String item){
        HashMap bazarList = bazarList();

        if(bazarList.containsKey(item)){
            String price =bazarList.get(item).toString();
            return price;
        }
        else {
            return "No item found";
        }
    }


    public int totalSum(){

        HashMap bazarList = bazarList();

        int total = 0;
        Object[] priceArray = bazarList.values().toArray();

        for (int i = 0; i < priceArray.length; i++) {
            total+=Integer.parseInt(priceArray[i].toString());
        }
        return total;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hashmap_Bazar_List bazar_list = new Hashmap_Bazar_List();
        System.out.println("Please enter a item name to search");
        String item = scanner.next();
        String message = bazar_list.searchItem(item);
        int totalPrice = bazar_list.totalSum();
        if(message!="No item found"){
            System.out.println("The Price of "+item+" is "+message);
        }
        else {
            System.out.println(message);
        }

        System.out.println("Total Price "+totalPrice);
    }
}
