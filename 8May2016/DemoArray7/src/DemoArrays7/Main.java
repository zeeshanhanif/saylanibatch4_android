package DemoArrays7;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int abc[] = {5,4,7,9,21,13};


        //int max = 1000;

        //int b [] = new int[9];


        int a = 22;
        boolean isPrime = true;
        for(int i=2;i<a;i++){
            if(a%i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println("Number is Prime");
        }
        else {
            System.out.println("Number is Not Prime");
        }




    }
}
