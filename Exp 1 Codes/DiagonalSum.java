import java.util.Scanner; public class DiagonalSum {
public static void main(String[] args) { Scanner sc = new Scanner(System.in);
System.out.print("Enter the size of the matrix (n x n): "); int n = sc.nextInt();
int[][] arr = new int[n][n];

System.out.println("Enter the elements of the matrix:"); for (int i = 0; i < n; i++) {
for (int j = 0; j < n; j++) { arr[i][j] = sc.nextInt();
}
}
int d1 = 0; int d2 = 0;

for (int i = 0; i < n; i++) { for (int j = 0; j < n; j++) {
if (i == j) {
d1 = d1 + arr[i][j];
}
if (i+j == n - 1) {
d2 = d2 + arr[i][j];
 

}
}
}

int result = d1 - d2;
result = Math.abs(result);
System.out.print("DIAGONAL DIFFERENCE: "+result);

}
}
