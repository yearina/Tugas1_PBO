import java.util.Scanner;
class Matriks{
    // tipe data, variabel, array dua dimensi
    int a[][] = new int [10][10];
    int b[][] = new int [10][10];
    int c[][] = new int [10][10];
    int i, j, n, m;
    public void input(){
        // input, for, comment
        Scanner in = new Scanner(System.in);
        System.out.println("\t PROGRAM PENJUMLAHAN DUA BUAH MATRIKS UKURAN 2X2");
        System.out.println("\t=================================================");
        System.out.print("Masukkan banyak baris: ");
        n = in.nextInt();
        System.out.print("Masukkan banyak kolom: ");
        m = in.nextInt();

        System.out.println("Masukkan isi matriks A: ");
        for(i=1; i<=n; i++){
            for (j = 1; j <= m; j++) {
                System.out.print("["+i+"]"+"["+j+"]: ");
                a[i][j] = in.nextInt();
            }
        }

        System.out.println("Masukkan isi matriks B: ");
        for(i=1; i<=n; i++){
            for (j = 1; j <= m; j++) {
                System.out.print("["+i+"]"+"["+j+"]: ");
                b[i][j] = in.nextInt();
            }
        }

        penjumlahan();
        output();
    }

    public void penjumlahan(){
        for(i=1; i<=n; i++){
            for (j = 1; j <= m; j++) {
                c[i][j] = a[i][j]+b[i][j];
            }
        }
    }

    // output
    public void output(){
        System.out.println("Matriks A: ");
        for(i=1; i<=n; i++){
            for (j = 1; j <= m; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Matriks B: ");
        for(i=1; i<=n; i++){
            for (j = 1; j <= m; j++) {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Hasil penjumlahan matriks A + matriks B = ");
        for(i=1; i<=n; i++){
            for (j = 1; j <= m; j++) {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}

// main program
public class Main {
    public static void main(String[] args) {
        // tipe data, variabel, array satu dimensi
        double d[] = new double[5];
        char pilih;
        String akhir;
        int i, j;
        Matriks m = new Matriks();
        m.input();

        System.out.println("---------------------------------");
        // array satu dimensi
        System.out.println();
        d[1]=10.25; d[2]=20.75; d[3]=30.67;
        for(i=1; i<=3; i++){
            System.out.print(d[i]+" ");
        }

        // while
        System.out.println();
        i = 1;
        while (i<=10){
            System.out.print(i+" ");
            i++;
        }

        // do while
        System.out.println();
        j= 10;
        do {
            System.out.print(j+" ");
            j--;
        }while (j>=1);

        // if
        System.out.println("\n");
        System.out.print("Akhiri program (Y/N): ");
        Scanner in = new Scanner(System.in);
        pilih = in.next().charAt(0);
        if(pilih=='Y'||pilih=='y'){
            akhir = "\nProgram telah berakhir";
            System.out.println(akhir);
        }

        else if(pilih=='N'||pilih=='n'){
            System.out.println("Program Berulang");
        }

    }
}