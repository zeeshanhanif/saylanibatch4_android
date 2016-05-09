package DemoArrays4;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a[][] = new int[2][];
        System.out.println(a[0]);
        System.out.println(a[1]);
        a[0] = new int [3];
        a[1] = new int [5];

        a[0][0] = 5;
        a[0][1] = 6;
        a[0][2] = 34;
        a[1][0] = 33;
        a[1][1] = 22;
        a[1][2] = 21;
        a[1][3] = 74;
        a[1][4] = 31;

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+ " ");
            }
            System.out.println("");
        }

/*

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

*/

    }
}
