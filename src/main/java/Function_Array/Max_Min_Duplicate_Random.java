package Function_Array;

//7. Generate 20 random numbers from 0 to 100 and print the max, min and duplicate random numbers (if any)


public class Max_Min_Duplicate_Random {
    public int findMax(int[] num){
        int max = num[0];
        for (int i = 0; i <num.length ; i++) {
            if(num[i]>=max){
                max = num[i];
            }
        }
        return max;
    }
    public int findMin(int[] num){
        int min = num[0];
        for (int i = 0; i <num.length ; i++) {
            if(num[i]<=min){
                min = num[i];
            }
        }
        return min;
    }

    public void findDuplicate(int[] num){
        for (int i = 0; i <num.length ; i++) {
            for (int j = i+1; j <num.length ; j++) {
                if (num[i]==num[j]){
                    System.out.println("Found Duplicate for "+num[i]);
                }
            }
        }
    }

    public int[] generateRandomNumber(){
        int max = 100,min=0;
        double rand;
        int arr[] = new int[20];
        for (int i = 0; i < arr.length; i++) {
            rand = Math.round(Math.random()*(max-min)+min);
            arr[i] =(int) rand;
        }
        return arr;
    }

    public static void main(String[] args) {

        Max_Min_Duplicate_Random maxMinDuplicateRandom = new Max_Min_Duplicate_Random();
        int arr[]=maxMinDuplicateRandom.generateRandomNumber();
        int maxNumber = maxMinDuplicateRandom.findMax(arr);
        int minNumber = maxMinDuplicateRandom.findMin(arr);
        System.out.println("----------------------------");
        System.out.println("Max number "+maxNumber);
        System.out.println("Min number "+minNumber);
        maxMinDuplicateRandom.findDuplicate(arr);
    }
}
