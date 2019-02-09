import java.util.Scanner;

public class UcanOtomobilTest
{

   public static void main( String[] args )
   { 
        UcanOtomobil KaraSimsekKit= new UcanOtomobil();
        	KaraSimsekKit.setTasitTuru("UcanOto");
        	KaraSimsekKit.setMaximumHiz("250");
        	KaraSimsekKit.setModel("Mazda-RX7");
        	KaraSimsekKit.setYil("1990");
        	System.out.printf("Ozelliklerim : %s\t%s\t yil=%s hiz=%s\n",KaraSimsekKit.getTasitTuru(),
        	                  KaraSimsekKit.getModel(),KaraSimsekKit.getYil(),
        	                  KaraSimsekKit.getMaximumHiz());
        	KaraSimsekKit.ucusaBasla("Ankara");
        	KaraSimsekKit.ucusuBitir("Istanbul");
        	
   }
}