public class Main {

    static void a(double r){
        //S = π r² / C = 2πr
        System.out.println("Obsah kruhu s polomerem " + r + " se rovna " + (r * r * Math.PI));
        System.out.println("Obvod kruhu se rovná " + (2 * Math.PI * r));
    }
    static void a(double sirka, double vyska){
        //S = a * b / O = 2 * ( a + b )
        System.out.println("Obsah obdelniku s vyskou " + vyska + " a sirkou " + sirka + " se rovna " + (vyska * sirka));
        System.out.println("Obvod obdelniku s vyskou " + vyska + " a sirkou " + sirka + " se rovna " + (2 * (vyska + sirka)));
    }

    static long fibbo(int n, long f) {
        if (n == 0) {
            f = 0;
        } else if (n == 1) {
            f = 1;
        } else {
            f = fibbo(n - 1, f) + fibbo(n - 2, f);
        }
        return f;
    }

    public static void main (String[] args){
        a(5);
        a(20, 60);
        System.out.println("Fibbonacciho cislo pro " + 6 + " se rovna " + fibbo(6, 0));
    }



}

