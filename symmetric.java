import java.util.Scanner;
public class symmetric {
        public static void main (String[] args){
                Scanner sc= new Scanner(System.in);
                int row,col;
                System.out.println("Enter the size of row:");
                row = sc.nextInt();
                System.out.println("Enter the size of columns:");
                col = sc.nextInt();

                if(row != col){
                        System.out.println("Matrix is not symmetric (not square matrix).");
                        return;
                }

                int a[][] = new int [row][col];
                System.out.println("Enter the matrix element:");
                for(int i=0;i<row;i++){
                        for(int j=0;j<col;j++){
                                a[i][j]=sc.nextInt();
                        }
                }
                boolean isSymmetric=true;

                for(int i=0;i<row;i++){
                        for(int j=i+1;j<col;j++){
                                if(a[i][j] !=a[j][i]){
                                        isSymmetric=false;
                                        break;
                                }
                        }
                }
                if(isSymmetric){
                        System.out.println("Matrix is Symmetric");
                }else{
                        System.out.println("Matrix is not Symmetric");
                }
        }
}


