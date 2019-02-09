public class MaasliCalisan extends Calisan {

   private double maas; 
   public MaasliCalisan(String isim, String adres, int telefon, double maas)
   {
       super(isim, adres, telefon);//super kelimesi ust -miras alinan- sinifin constructor unu cagirir.
       setMaas(maas);
   }
   public double getMaas()
   {
       return maas;
   }
   public void setMaas(double yeniMaas)//yillik toplam maasi girilecek
   {
       if(yeniMaas>= 0.0)
       {
          maas = yeniMaas;
       }
   }
   public double haftalikUcretHesapla()
   {
      System.out.println(getIsim() + "in haftaligi hesaplaniyor");
      return maas/52;
   }
     public void paraYolla()
   {
       System.out.println("Haftalik ucreti " + getIsim()+ " isimli calisana " + haftalikUcretHesapla() + " TL yolladim");
   }
   public String telefonGoster()
   {
      return "+90-212-"+getTelefon();	
   }
}
    
