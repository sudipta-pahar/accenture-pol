import java.util.*;
class CelsiusConversion{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int cel = sc.nextInt();
        double fah = (1.8*cel)+32;
        System.out.println(fah);
    }
}