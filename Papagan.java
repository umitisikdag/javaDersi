public class Papagan extends Hayvan {
    public String duyulanSarki;
    public Papagan(String isim) 
    {
    	super(isim);
    	this.setHayvanTuru("Papagan");
    }
 
     public void setDuyulanSarki( String gelenSarki )
   {
      duyulanSarki=gelenSarki; 
   }  
   public String getDuyulanSarki()
   {
   return duyulanSarki;	
   }
      public void sesCikart()
   {
       System.out.printf("cik..cik...cik....\n");	
   }
       public void sesCikart(String duyduguSes)
   {
       System.out.printf(duyduguSes+"\n");	
   }
       public void sesCikart(String Sarkici,String sarkiIsmi)
   {
       this.setDuyulanSarki(sarkiIsmi);
       System.out.printf("Simdi size  "+Sarkici+" dan "+getDuyulanSarki()+" sarkisini soyluyorum.\n");	
   }
}