import java.util.Scanner;
public class Main {



    public static Square maxS(Square[] s){
        int index = 0;
        int sq = 0;
        for(int i = 0;i<s.length;++i){
            if(sq<s[i].getS()){
                sq = s[i].getS();
                index = i;
            }
        }
        return s[index];
    }

    public static Prism getMaxDiag(Prism [] t){
        double diag = 0;
        int index = 0;
        for(int i = 0;i<t.length;++i){
            if(diag<t[i].getDiagonal()){
                diag = t[i].getDiagonal();
                index = i;
            }
        }
        return t[index];
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input n(amount of squares");
        int n = s.nextInt();
        System.out.println("Input m (amount of prisms");
        int m = s.nextInt();
        Square [] sq = new Square[n];
        Prism [] pr = new Prism[m];


        int len,hei;
        for(int i = 0;i<n;++i){
            System.out.print("Input length :");
            len = s.nextInt();
            sq[i] = new Square(len);
        }

        System.out.println("prism:");
        for(int i = 0;i<m;++i){
            System.out.print("Input length :");
            len = s.nextInt();
            System.out.print("Input height :");
            hei = s.nextInt();
            pr[i] = new Prism(len,hei);
        }

        for(int i = 0;i<n;++i){
            System.out.println(sq[i]);
        }
        System.out.println("/n/n");

        for(int i = 0;i<m;++i){
            System.out.println(pr[i]);
        }

        System.out.println("Max diag in prism = " + getMaxDiag(pr));
        System.out.println("Max S in square = " + maxS(sq));
    }
}
