import java.util.ArrayList;


public class Inventory {
	
	
	// Liste des produit 
	
		private ArrayList <Produit> listProd = new ArrayList() ;

	
		//valeur total de l'inventaire
	     private int valTotal = 0 ;
	
	
	  // methodes getters
	
		public int getValTotal() 
		{
			return valTotal ;
		}
		
		public ArrayList <Produit> getList() 
		{
			return listProd ;
		}
		
			
	 // methodes setters
			
		public void setValTotal( int pam) 
		{
			valTotal = pam ;
		}
		
		
		
		
	    //Methode addProduct 
					
		public void addProduct(Produit prod)
		{
			listProd.add(prod);	
			
			//calcul de valtotal
			
			
			for(int i= 0 ; i < getList().size(); i++)
			{
				Produit p = getList().get(i);
				valTotal = valTotal + (p.getPrice()* p.getQuantity() ) ;
				
			}
			
			System.out.println("La valeur total de l'inventaire est : " + valTotal );
		}
      

	
}
