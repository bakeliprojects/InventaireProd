import java.util.ArrayList;


public class Produit {
	
	private int id , price , quantity ;
	
    // methodes getters
	
	public int getId() 
	{
		return id ;
	}
	
	public int getPrice() 
	{
		return price ;
	}
	
	public int getQuantity() 
	{
		return quantity ;
	}
	
	 // methodes setters
	
		public void setId( int pam) 
		{
			id = pam ;
		}
		
		public void setPrice( int pam) 
		{
			price = pam ;
		}
		
		public void setQuantity( int pam) 
		{
			quantity = pam ;
		}
		
		
		//constructeur avec paramétre
				public Produit ()
				{
					
				}
		
		//constructeur avec paramétre
		public Produit (int pamid , int pamprice ,int pamQ )
		{
			id = pamid;
			price = pamprice;
			quantity = pamQ;
		}

}
