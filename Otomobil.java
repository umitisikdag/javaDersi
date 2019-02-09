public class Otomobil extends Tasit
{
   private String otomobilRenk;
   private String otomobilModel;
   private String otomobilYil; 
   private String otomobilPencereSayisi;
   private Integer otomobilKapiSayisi;
   public Otomobil()   //constructor metod
   {
   otomobilPencereSayisi="5";
   otomobilKapiSayisi=4;	
   }
    public void setKapiSayisi( int gelenKapiSayisi )
   {
      otomobilKapiSayisi= gelenKapiSayisi; 
   }  
   public Integer getKapiSayisi()
   {
   return otomobilKapiSayisi;	
   }
   public Integer birKapiEkle()
   {
   otomobilKapiSayisi++;
   return otomobilKapiSayisi;	
   }
     public Integer ikiKapiEkle()
   {
   otomobilKapiSayisi+=2;
   return otomobilKapiSayisi;	
   }
    public void setPencereSayisi( String gelenPencereSayisi )
   {
      otomobilPencereSayisi= gelenPencereSayisi; 
   }  
   public String getPencereSayisi()
   {
   return otomobilPencereSayisi;	
   }
   	
   public void setRenk( String gelenRenk )
   {
      otomobilRenk = gelenRenk; 
   }  
   public String getRenk()
   {
      return otomobilRenk;
   }  
      public void setModel( String gelenModel )
   {
      otomobilModel = gelenModel; 
   }  
   public String getModel()
   {
      return otomobilModel;
   }  
   public void setYil( String gelenYil )
   {
      otomobilYil = gelenYil; 
   }  
   public String getYil()
   {
      return otomobilYil;
   }  	
   	
}