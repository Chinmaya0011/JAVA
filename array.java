import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
   //      Scanner input=new Scanner(System.in);

   //      int[] arr=new int[3];
   //      // arr[0]=1;
   //      // arr[1]=2;
   //      // arr[2]=3;
   //      // System.out.println(Arrays.toString(arr));
   //   for(int i=0;i<arr.length;i++){
   //      arr[i]=input.nextInt();
   //   }
     
   //   for(int i=0;i<arr.length;i++){
   //      System.out.println(arr[i]);
   //   }

   //  }
Scanner input=new Scanner(System.in);
int[][] arr=new int[3][3];

for(int row=0;row<arr.length;row++){
   for(int col=0;col<arr[row].length;col++){
      arr[row][col]=input.nextInt();
   }
}
System.out.println(Arrays.deepToString(arr));

    }

}
