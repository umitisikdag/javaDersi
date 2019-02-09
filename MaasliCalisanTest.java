public class MaasliCalisanTest {


       public static void main(String [] args)
   {
      double ucret;
      /*Asagidaki tanim hata verir cunku Calisan bir Abstract sinif dir
      Calisan GonulluHemsire =new Calisan("Ayse Kurnaz","Kavacik,Istanbul",4321212);
      GonulluHemsire.paraYolla();*/	
      MaasliCalisan Doktor = new MaasliCalisan("Halil Ibrahim", "Sisli,Istanbul", 2121122, 72000.00);
      System.out.printf("Doktor Bilgileri=%s\n",Doktor.toString());
      System.out.printf("Doktor Telefonu=%s\n",Doktor.telefonGoster());
      ucret=Doktor.haftalikUcretHesapla();
      System.out.printf("Haftalik ucreti=%f\n",ucret);
      Doktor.paraYolla();

    }
    
}