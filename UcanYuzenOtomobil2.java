
public class UcanYuzenOtomobil2 extends Otomobil implements Yuzebilir,Ucabilir
{
   public UcanYuzenOtomobil2() {}
   public void ucusaBasla(String KalkisYeri)
   {
   System.out.printf("Ucusa %s dan basladim\n",KalkisYeri);	
   }
   public void ucusuBitir(String InisYeri)
   {
   System.out.printf("Ucusumu %s de bitirdim\n",InisYeri);		
   }
    public void yuzmeyeBasla(String KalkisYeri)
   {
   System.out.printf("Yuzmeye %s dan basladim\n",KalkisYeri);	
   }
   public void yuzmeyiBitir(String VarisYeri)
   {
   System.out.printf("Yuzmeyi %s de bitirdim\n",VarisYeri);		
   }
   
}