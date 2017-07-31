import java.util.Scanner;


public class Teste {
    
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Teste test = new Teste();
		
		// creation de produit
	    
		//Produit produit1 = new Produit(1,100,5);
		//Produit produit2 = new Produit(2,200,6);
		//Produit produit3 = new Produit(3,150,3);
		//Produit produit4 = new Produit(4,250,2);
		
		
		Inventory inv = new Inventory();
		// ajout des produit a l'inventaire
		//inv.addProduct(produit1);
		//inv.addProduct(produit2);
		//inv.addProduct(produit3);
		//inv.addProduct(produit4);
		
			
	
		//appel methode AjoutProd
		
        AjoutProd();
		 

	}
	
	 public static void AjoutProd()
		{   
		    Inventory invs = new Inventory();
			 
			System.out.println(" Donner l'id du produit : ");
			int id = scan.nextInt();
			
			System.out.println(" Donner le prix unitaire du produit : ");
			int prix = scan.nextInt();
			
			System.out.println(" Donner la quantité du produit : ");
			int quant = scan.nextInt();
			
			Produit prod1 = new Produit(id,prix,quant);
			invs.addProduct(prod1);
			
			
		}

}
