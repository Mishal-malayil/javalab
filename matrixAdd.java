import java.util.Scanner;
public class matrixAdd{
        public static void main (String[] args){
                Scanner sc = new Scanner(System.in);
                int row,col;
                System.out.println("Enter the size of row:");
                row = sc.nextInt();
                System.out.println("Enter the size of column:");
                col = sc.nextInt();


                int a[][] = new int [row][col];
                int b[][] = new int [row][col];
                int sum[][] = new int [row][col];


                System.out.println("Enter elements of first matrix:");
                for(int i=0;i<row;i++){
                        for(int j=0;j<col;j++){
                                a[i][j]=sc.nextInt();
                        }
                }
                System.out.println("Enter elements of Second matrix:");
                for(int i=0;i<row;i++){
                        for(int j=0;j<col;j++){
                                b[i][j]=sc.nextInt();
                        }
                }
                for(int i=0;i<row;i++){
                        for(int j=0;j<col;j++){
                                sum[i][j]=a[i][j]+b[i][j];
                        }
                }

                System.out.println("Sum of the matrices:");
                for(int i=0;i<row;i++){
                        for(int j=0;j<col;j++){
                                System.out.print(sum[i][j]+" ");
                        }
                System.out.println();
                }
        }
}


