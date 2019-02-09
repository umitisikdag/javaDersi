
public class Tren extends Tasit 
{
    public Integer vagonSayisi;
    
    public Tren() //constructor metod
    	
    {
    vagonSayisi=3;	
    }
    
        public void setVagonSayisi( Integer gelenVagonSayisi )
    {
      vagonSayisi = gelenVagonSayisi; 
    }  
    public Integer getVagonSayisi()
    {
      return vagonSayisi;
    } 
    
}