public abstract class Calisan {
	
   private String isim;
   private String adres;
   private int telefon;
   public Calisan (String isim, String adres, int telefon)
   {
      System.out.println("Yeni bir calisan objesi olusturuyorum"); //Setter lar asagida 3 satirda
      this.isim = isim;
      this.adres = adres;
      this.telefon = telefon;
   }
   public String getIsim()
   {
      return isim;
   }
   public String getAdres()
   {
      return adres;
   }
   public void setAdres(String yeniAdres)
   {
      adres = yeniAdres;
   }
   public int getTelefon()
   {
     return telefon;
   }
       public double haftalikUcretHesapla()
   {
     System.out.println("Ucret Hesaplandi");
     return 0.0;
   }
   public void paraYolla()
   {
      System.out.println(haftalikUcretHesapla()+"TL parayi" + this.isim+ " " + this.adres +" e yolladim");
   }
   public String toString()   //system de yer alan toString metodu override ediliyor
   {
      return isim + " " + adres + " " + telefon;
   }
   public abstract String telefonGoster();//abstract metod sub class da implement edilmek zorunda
   
}