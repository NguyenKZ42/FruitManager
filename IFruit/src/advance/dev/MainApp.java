package advance.dev;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class MainApp {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager fruitManager = new Manager();
		Scanner sc= new Scanner(System.in);
		int choice;
		
		do {
		System.out.println("---------- FRUIT MANAGER----------");
		
		System.out.println("1. Them trai cay:");
		System.out.println("2. Bo tra cay:");
		System.out.println("3. Cap nhat trai cay:");
		System.out.println("4. In ra tra cay:");
		System.out.println("5. Sap xep trai cay");
		System.out.println("0. Thoat");
		System.out.println("--> ENTER YOUR CHOICE : ");
		choice = sc.nextInt();
        sc.nextLine();
        
	switch (choice) {
	case 1: 
		 System.out.println("Ten trai cay : ");
		 String Name = sc.nextLine();
		 System.out.println("Can nang : ");
		 Double Weight = sc.nextDouble();
		 sc.nextLine();
		 System.out.println("Gia tien : ");
		 Double Price = sc.nextDouble();
		 sc.nextLine();
		 
		 Fruit fruit = new Fruit(Name, Weight, Price);
         fruitManager.addFruit(fruit);
         System.out.println("Thong tin trai cay da dc them!");
         break;
	case 2:
	    System.out.print("Nhap ten trai muon loai bo: ");
	    String fruitName = sc.nextLine();
	    boolean fruitFound = false;
	    Fruit fruitToRemove = null;
	    
	    for (Fruit f : fruitManager.getAllFruits()) {
	        if (f.getName().equalsIgnoreCase(fruitName)) {
	            fruitToRemove = f;
	            fruitFound = true;
	            break;
	        }
	    }
	    
	    if (fruitFound) {
	        fruitManager.removeFruit(fruitToRemove);
	        System.out.println("Trai nay da bi xoa!");
	    } else {
	        System.out.println("Ko tim thay trai!");
	    }
	    
	    break;
		    
	case 3:
		 System.out.print("Nhap ten trai muon cap nhap: ");
		    String fruitNames = sc.nextLine();
		    boolean fruitFounds = false;
		    
		    for (Fruit f : fruitManager.getAllFruits()) {
		        if (f.getName().equalsIgnoreCase(fruitNames)) {
		            System.out.print("Ten tra moi: ");
		            String newName = sc.nextLine();
		            
		            
		            System.out.print("Can nang: ");
		            Double newWeight= sc.nextDouble();
		            
		            System.out.print("Gia: ");
		            double newPrice = sc.nextDouble();
		            sc.nextLine();
		            
		            fruitManager.updateFruit(f, newName, newWeight, newPrice);
		            fruitFound = true;
		            break;
		        }
		    }
		    
		    if (!fruitFounds) {
		        System.out.println("Ko tim thay trai!");
		    }
		    
		    break;
	 case 4:
         System.out.println("Tat ca trai cay da them:");
         for (Fruit f : fruitManager.getAllFruits()) {
             System.out.println(f);
         }
         break;
     case 5:
         fruitManager.sortFruitsByName();
         System.out.println("Trai cay da duoc sap xep!");
         System.out.println();
         break;
     case 0:
         System.out.println("Exiting...");
         break;
     default:
         System.out.println("Lua chon ko hop le!");
         break;
 }
		} while (choice != 0);

		sc.close();
}
}
	
	
		