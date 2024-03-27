
///Ciobanu Matei

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        String[] languages = { "C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java" };

        int n = (int) (Math.random() * 1_000_000);
        System.out.println(n);
        n *= 3;
        n += Integer.parseInt("10101", 2);
        n += Integer.parseInt("FF", 16);
        n *= 6;

        int cifraControl;
        if (n == 0)
            cifraControl = 0;
        else if (n % 9 == 0)
            cifraControl = 9;
        else
            cifraControl = n % 9;

        System.out.println("Willy-nilly, this semester I will learn " + languages[cifraControl]);

    }
}