package DemoArrays5;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a[] = {5,5,7,7,8,9};
        int b[][] = {{3,5,6},{1,4,6,4},{1,2}};

        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[i].length;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }

        int c [][][] = new int [2][3][4];

    }
}
