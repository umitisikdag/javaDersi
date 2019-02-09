import java.util.Scanner;

public class OtomobilUcakTrenTest
{

   public static void main( String[] args )
   { 
        Otomobil Sahin=new Otomobil();
        Sahin.setTasitTuru("BinekAraci"); //miras aldigi oznitelik
        Sahin.setMaximumHiz("170");       //miras aldigi oznitelik
        Sahin.setRenk("Beyaz");           //kendi ozniteligi
        System.out.printf("Tasit turumuz %s , rengi %s dir\n",Sahin.getTasitTuru(),Sahin.getRenk());
        System.out.printf("Otomobil maksimum hizi %s dir\n",Sahin.getMaximumHiz());
        
        //Ucak islemleri 
        Ucak THY77= new Ucak();
        THY77.setTasitTuru("Ucak");   //miras aldigi oznitelik
        THY77.setMaximumHiz("1100");  //miras aldigi oznitelik
        THY77.setUcakHavayoluIsmi("Turk Hava Yollari"); //kendi oznitelgi
        System.out.printf("Ucak Havayolu ismi %s dir\n",THY77.getUcakHavayoluIsmi());
        System.out.printf("Ucak maksimum hiz %s dir\n",THY77.getMaximumHiz());
       
        //Tren islemleri
        Tren KaraTren= new Tren();
        Tren TCDDHizli=new Tren();
        TCDDHizli.setTasitTuru("Tren");//miras aldigi oznitelik
        TCDDHizli.setMaximumHiz("250");//miras aldigi oznitelik
                                      //TCDDHizli.SetVagonSayisi islemi yapmiyorum, constructor a dikkat !
        KaraTren.setTasitTuru("Tren");//miras aldigi oznitelik
        KaraTren.setMaximumHiz("60");//miras aldigi oznitelik
        KaraTren.setVagonSayisi(30); //kendi oznitelgi
        System.out.printf("KaraTren maksimum hizi %s dir\n",KaraTren.getMaximumHiz());
        System.out.printf("KaraTren Vagon Sayisi %d dir\n",KaraTren.getVagonSayisi());
        System.out.printf("Hizli Tren maksimum hizi %s dir\n",TCDDHizli.getMaximumHiz());
        System.out.printf("HizliTren Vagon Sayisi %d dir\n",TCDDHizli.getVagonSayisi());//constructor da atamistik	
   }
}