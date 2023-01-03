public class Main {
    public static void main(String[] args) {
        int i = 1;
        //sira
        for (; i <= 5; i++) {
            System.out.println(i + ") @ ");
        }
        System.out.println(".");

        //  sira setr
        for (int a = 0; a <= 3; a++) {  //sira
            for (int c = 0; c <= 6; c++) {  //nece salam
                System.out.print("#");
            }
            System.out.println(".");
        }
        //artan siralama
        for (int b = 1; b < 6; b++) {
            for (int d = 0; d < b; d++) { // b her defe artir d ye gelib 6a qeder isleyir
                System.out.print("*");
            }
            System.out.println(".");

        }
        //1 4noqte 1*
        // 2 3noqte 2*
        // 3 2noqte 3*
        // 4 1noqte 4*
        // 5 0noqte 5*
        for (int e = 1; e < 6; e++) {
            for (int r = 0; r < 5 - e; r++) {
                System.out.print(" ");
            }
            for (int r = 0; r < e; r++) {
                System.out.print("*");
            }
            System.out.println(".");
        }
        //ortada bosluq olan setr
        for (int m = 0; m < 4; m++) { //= =
            for (int n = 0; n < 6; n++) {
                System.out.print("=");
                if (n != 2) {
                    System.out.print("");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
        int z = 0;
        while (z < 10) { // serti odedikse iceri giririk
            System.out.println("z=" + (z++)); //deyerini gotur artiracam
            //  System.out.println("z="+ (++z));//artiracam deyerini gotur
        }
        System.out.println("finish");

        int x = 0;
        do { //do -et
            x++;
            if (x == 4) {
                break;
            }
            System.out.println("x=" + x);
        } while (x<10); //yoxla
        System.out.println("finished");

    }
}