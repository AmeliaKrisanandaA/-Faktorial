import java.util.Scanner;

public class TugasFaktorial {
    public static void main(String[] args) {
       
        int xx;
        boolean y = true;

        while (y){
        Scanner an = new Scanner(System.in);
        System.out.print("Masukan Angka (0 untuk berhenti ):");
        xx = an.nextInt();
        if (xx == 0){
        y = false;
        System.out.println("trimakasi telah menggunakan progam ini.");
    }
   int iy = xx;
   System.out.print(xx + "! = ");

   for(int i=xx; i>0;i--){
    System.out.print(i);
        if (i>1){
        System.out.print(" x ");
    }
    if(xx !=i){

    iy *=i;
    }
    iy *=i;
   }
   System.out.println("");
   System.out.println("=" +iy);
       }
    }
}
