public class Hayvan {
    private String tur;
    private String isim;
    public Hayvan(String isim) 
    {
     this.isim=isim;
    }
   public void setHayvanTuru( String gelenTur )
   {
      tur=gelenTur; 
   }  
   public String getHayvanTuru()
   {
   return tur;	
   }
   public void sesCikart()
   {
       System.out.printf("Turum belli degil daha ne sesi cikartayim bilmiyorum\n");	
   }
    
}