import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     
         // DEGISKENLERI OLUSTURDUM.

      double mat, fizik, kimya, turkce, tarih , muzik;

        // SCANNER SINIFINI BELIRLEDIM
        Scanner input = new Scanner(System.in);


        //KULLANICIDAN DEGERLERI ALDIM.
        System.out.print("matematik puani:  ");
        mat = input.nextDouble();
        System.out.println(mat);

        System.out.print("fizik  puani:  ");
        fizik = input.nextDouble();
        System.out.println(fizik);

        System.out.print("kimya puani:  ");
        kimya = input.nextDouble();
        System.out.println(kimya);

        System.out.print("turkce puani:  ");
        turkce = input.nextDouble();
        System.out.println(turkce);

        System.out.print("tarih  puani:  ");
        tarih = input.nextDouble();
        System.out.println(tarih);

        System.out.print("muzik  puani:  ");
        muzik = input.nextDouble();
        System.out.println(muzik);

        double total =mat+fizik+kimya+turkce+tarih+muzik;
        double ortalama = total/6;

        System.out.println("not ortalamasi= "+ ortalama );
        boolean gectiMi= ortalama>=60;
        String str= gectiMi ? "sinifi  gecti":"sinifta  kaldi";
        System.out.println(str);
        
        
      

    }
}
    }
}
