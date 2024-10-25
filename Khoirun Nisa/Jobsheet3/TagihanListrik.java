// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

public class TagihanListrik {
   public TagihanListrik() {
   }

   public static void main(String[] var0) {
      double var1 = 1500.0;
      Scanner var5 = new Scanner(System.in);
      System.out.println("masukkan total penggunaan");
      double var3 = var5.nextDouble();
      double var6 = var1 * var3;
      System.out.println("total penggunaan lebih dari 500 kwh?" + (var3 > 500.0));
      System.out.println("tarif bulanan anda sebesar" + var6);
   }
}