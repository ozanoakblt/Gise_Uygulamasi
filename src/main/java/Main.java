import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Gişe uygulaması yapalım tc si doğru ise numara versin yanlış girerse uyarsın.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Gişe Uygulamasına Hoş Geldiniz!");
        System.out.println("Lütfen TC Kimlik Numaranızı Giriniz : ");

        String tckn = scanner.nextLine();

        TCKN tcknNesne = new TCKN();
        tcknNesne.setTckn(tckn);



    }

}
