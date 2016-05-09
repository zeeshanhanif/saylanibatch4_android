package DemoArrays2;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //int b[] = new int[8];
        int a[] = {4,5,6,5};
        int b[] = new int []{4,5,6,8,9,12,3};

        //a[2] = 5;



        int max = 0;
        int min = Integer.MAX_VALUE;

        //max = min= b[0];


        for(int i=0;i<b.length;i++){
            if(b[i]> max){
                max = b[i];
            }

            if(b[i]<min){
                min = b[i];
            }
        }
        System.out.println("INT MaX = "+Integer.MAX_VALUE);
        System.out.println("Max = "+max);
        System.out.println("Min = "+min);



    }
}
