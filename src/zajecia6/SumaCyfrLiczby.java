package zajecia6;

public class SumaCyfrLiczby {
    public static void main(String[] args) {
        String mojeLiczby = "52";

        int suma = 0;

        for (int i = 0; i < mojeLiczby.length(); i++) {
            char c = mojeLiczby.charAt(i);
            String wartosc = String.valueOf(c);
            suma = suma + Integer.valueOf(wartosc);

        }
        System.out.println(suma);
    }


}
