
public class UcanYuzenOtomobil extends UcanOtomobil implements Yuzebilir
{

   public UcanYuzenOtomobil() {}

      public void yuzmeyeBasla(String KalkisYeri)
   {
   System.out.printf("Yuzmeye %s dan basladim\n",KalkisYeri);	
   }
   public void yuzmeyiBitir(String VarisYeri)
   {
   System.out.printf("Yuzmeyi %s de bitirdim\n",VarisYeri);		
   }
}

