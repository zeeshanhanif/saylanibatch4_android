package DemoArrays3;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a[][] = new int[2][3];
        a[0][0] = 5;
        a[0][1] = 6;
        a[0][2] = 34;
        a[1][0] = 33;
        a[1][1] = 22;
        a[1][2] = 21;


        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+ " ");
            }
            System.out.println("");
        }






    }
}
