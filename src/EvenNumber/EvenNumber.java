package EvenNumber;

public class EvenNumber {
    public static void main(String[]args){
        int[]numbers={6,7,8,2,9,13};
        int even=0;
        System.out.println("Even numbers in the array:");
        for(int number:numbers){
            if(number%2==0){
                System.out.println(number);
                even++;
            }
        }

        System.out.println(("The number of even number in the array is:"+even));
    }
}
