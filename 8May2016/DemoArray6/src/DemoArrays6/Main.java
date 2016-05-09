package DemoArrays6;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a[] = new int [4];
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println("for each");
        for(int b : a){
            System.out.println(b);
        }


        int c [][] = new int[2][3];
        for (int []j : c){
            for(int k : j){
                System.out.println(k);
            }
        }






    }
}
