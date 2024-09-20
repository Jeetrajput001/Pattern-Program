
import java.util.*;
public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no");
        int n = sc.nextInt();

//         halfPyramid(n);
//        halfNumPyramid(n);
        //floydTriangle(n);
//        zeroOneTriangle(n);
        // numTriangle(n);
//        halNumPyramid2(n);
//         palindromeTriangle(n);
//        halfRevPyramid(n);
       // RevHalfDiamond(n);
       //  HalfDiamond(n);
       // Diamond(n);
        //damru(n);
       // butterfly(n);
        //Butterfly11(n);
        //Hardpattern(n);
       // NumberFloyd(n);
}

public static void NumberFloyd(int n){
        int count =1; int mid=n/2+1;
        int star =1; int space=n/2;
    for (int i = 1; i <=n ; i++) {
        for (int j = 1; j <=space ; j++) {
            System.out.print("   ");
        }
        for (int j = 1; j <=star ; j++) {
            System.out.printf("%3d",count);
            count++;
        }
        if (i <mid) {
            star=star+2; space--;
        }
        else {
            star=star-2;space++;
        }
        System.out.println();

    }
}
public static void Hardpattern(int n ){
        int star=5*n/2+1;
        int space =n/2; int est=2*n-1;
        int mid =n/2+1 ; int sst=n+2;
        for(int i =1;i<=n;i++){
            //part1
            for (int j =1; j <=mid ; j++) {
                if(j<=space)
                   System.out.print("  ");
                else
                    System.out.print("* ");
            }
           //part2
            for (int j = mid+1; j <= n+1; j++) {
                if(i==1||j==n+1&&i<=mid){
                    System.out.print("@ ");
                }
                else{
                    System.out.print("  ");
                }
            }
            //part3
            for (int j = n+2; j <=2*n-1 ; j++) {
                if(i<=mid||j<sst||j>est){
                    System.out.print("  ");
                }
                else {
                    System.out.print("* ");
                }
            }
            //part4
            for (int j = 2*n; j <=5*n/2 ; j++) {
                if(i==1||j==2*n&&i<=mid){
                    System.out.print("@ ");
                }
                else {
                    System.out.print("  ");
                }
            }
            //part5
            for (int j =5*n/2+1; j <=star ; j++) {
                System.out.print("* ");
            }

            if(i<mid) {
                space--; star++;
            }
               else {
                space++; star--;
            }
             if(i>mid){
                   est--;sst++;
               }
            System.out.println();
        }
}
public static void butterfly(int n){
        int star =1; int space =n-2; int mid = n/2+1;
    for (int i =1; i <=n ; i++) {
        for (int j =1; j <=star ; j++) {
            System.out.print("*");
        }
        for (int j =1; j <=space ; j++) {
            System.out.print(" ");
        }
        for (int j =1; j <=star ; j++) {

            System.out.print("*");
        }
        if (i < mid) {
            star++;space-=2;
        }

        else {
            star--; space+=2;
        }
        System.out.println();

    }
}
public static void damru(int n){
        int star =n; int space =0;
        int mid = n/2+1;
    for (int i = 1; i <=n ; i++) {
        for (int j = 1; j <=space; j++) {
            System.out.print("  ");
        }
        for (int j = 1; j <=star ; j++) {
            System.out.print("* ");

        }
        if(i<mid) {
            star = star - 2;
            space++;
        }
        else {
            star = star + 2;
            space--;
        }
        System.out.println();
    }
}


    public static void halNumPyramid2(int n) {
        int star = 1;
        int space = n - 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <= star; j++) {
                System.out.print(j + " ");

            }
            star++;
            space--;
            System.out.println();
        }
    }

    public static void numTriangle(int n) {
        int star = 1;
        int space = n - 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <= star; j++) {
                System.out.print(i + " ");

            }
            star++;
            space--;
            System.out.println();

        }
    }

    public static void halfPyramid(int n) {
        int star = 1;
        int space = n - 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= star; j++) {
                System.out.print("* ");

            }
            star++;
            space--;
            System.out.println();
        }

    }

    public static void halfNumPyramid(int n) {
        int num = n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print(j + " ");

            }
            num--;
            System.out.println();

        }


    }

    public static void floydTriangle(int n) {
        int count = 1;
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print(count + " ");
                count++;

            }
            num++;
            System.out.println();

        }

    }

    public static void zeroOneTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");

            }
            System.out.println();

        }
    }

    public static void palindromeTriangle(int n) {
        int star = 1;
        int space = n - 1;
        for (int i = 1; i <= n; i++) {
            //print space
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            //print 1st star
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");

            }
            //2nd star
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");

            }
            System.out.println();
        }
    }

    public static void halfRevPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            //print space
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            //print 1st star
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");

            }
            System.out.println();
        }

    }
    public static void RevHalfDiamond(int n){
        int star =2*n-1; int space =0;
        for (int i = 1; i <=n ; i++) {

            for (int j = 1; j <=space ; j++) {
                System.out.print("  ");

            }
            for (int j = 1; j <=star ; j++) {
                System.out.print("* ");

            }
            star=star-2; space++;
            System.out.println();

        }

    }
    public static void HalfDiamond(int n){
        int star =1; int space =n-1;
        for (int i = 1; i <=n ; i++) {

            for (int j = 1; j <=space ; j++) {
                System.out.print("  ");

            }
            for (int j = 1; j <=star ; j++) {
                System.out.print("*   ");

            }
            star++; space--;
            System.out.println();

        }

    }
    public static void Diamond(int n){
        int star =n; int space =0;
        for (int i = 1; i <=n ; i++) {

            for (int j = 1; j <=space ; j++) {
                System.out.print("  ");

            }
            for (int j = 1; j <=star ; j++) {
                System.out.print("*   ");

            }
            star--; space++;
            System.out.println();

        }

    }

    public static void Butterfly11(int n ){
        int sst=1; int est=n; int mid =n/2+1;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if (j <= sst || j >= est) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

                if (i < mid) {

                    sst++;est--;
                }
                else {
                    sst--;est++;
                }


            System.out.println();
        }
    }
}
