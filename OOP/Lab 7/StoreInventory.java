/*
Tyler Paulley
3/30/14
Chapter 10
Exercise #2
StoreInventory.java
*/

import java.io.*;
import java.util.*;
public class StoreInventory
{
	public static void main(String[] args) throws FileNotFoundException
	{
		double totalInventory;
		int itemCount = 0;
		Scanner inFile = new Scanner(new FileReader("Ch10_Ex2Data.txt"));

		Vector<Integer> itemId = new Vector<Integer>();
		Vector<String> itemName = new Vector<String>();
		Vector<Integer> partsOrdered = new Vector<Integer>();
		Vector<Integer> partsInStore = new Vector<Integer>();
		Vector<Integer> partsSold = new Vector<Integer>();
		Vector<Double> manufPrice = new Vector<Double>();
		Vector<Double> sellingPrice = new Vector<Double>();

		while(inFile.hasNext())
		{
			itemId.addElement(inFile.nextInt());
			inFile.nextLine();
			itemName.addElement(inFile.nextLine());
			partsOrdered.addElement(inFile.nextInt());
			manufPrice.addElement(inFile.nextDouble());
			sellingPrice.addElement(inFile.nextDouble());
			partsInStore.addElement(partsOrdered.elementAt(itemCount));
			itemCount++;
		}

		for(int i = 0; i < itemCount; i++)
			partsSold.addElement(0);

		checkInventory("Cooking Range", itemName, partsInStore);
		checkInventory("Power Drill", itemName, partsInStore);

		System.out.print("This is the inventory unchanged after it has been read from the file.\n");
		printReport(itemId, itemName, partsOrdered, partsInStore, partsSold, manufPrice, sellingPrice);

		System.out.println();
		System.out.print("We will now sell some of our products.\n");
		sellItem("Circular Saw", 40, itemName, partsInStore, sellingPrice, partsSold);

		System.out.println();
		System.out.print("This is what happens when we try to sell an item that we don't carry.\n");
		sellItem("Refrigerator", 40, itemName, partsInStore, sellingPrice, partsSold);

		System.out.println();
		System.out.print("This is the updated store report after having sold fourty saws.\n");
		printReport(itemId, itemName, partsOrdered, partsInStore, partsSold, manufPrice, sellingPrice);

		System.out.println();
		System.out.print("Thank you for trying out our store. Please come again.\n");

		inFile.close();
	}

	public static boolean checkInventory(String itemKey, Vector<String> itemName,
										 Vector<Integer> partsInStore)
	{
		if(itemName.indexOf(itemKey) < 0)
		{

			System.out.println("The item " + itemKey + " isn't sold by the store.\n");
			return false;
		}

		if(itemName.indexOf(itemKey) >= 0)
		{
			int place = itemName.indexOf(itemKey);

			if((partsInStore.elementAt(place)) == 0)
				System.out.println("Sorry the store is sold out of the item " + itemKey + ".\n");

			else
				System.out.print("The store has " + partsInStore.elementAt(place)
								 + " of the item " + itemKey + " in stock.\n");

		}
		return true;
	}

	public static void sellItem(String itemKey, int quantity, Vector<String> itemName,
							    Vector<Integer> partsInStore, Vector<Double> sellingPrice,
							    Vector<Integer> partsSold)
	{
		boolean inInventory = checkInventory(itemKey, itemName, partsInStore);

		if(!inInventory)
		System.out.print("Sorry the item cannot be sold since it is out of stock or not sold here.\n");

		if(inInventory)
		{
			int newAmount;
			int place = itemName.indexOf(itemKey);
			System.out.print("Now selling " + quantity + " " + itemKey + "(s).\n");
			newAmount =	partsInStore.elementAt(place) - quantity;
			partsInStore.removeElementAt(place);
			partsInStore.insertElementAt(newAmount, place);

			newAmount = partsSold.elementAt(place) + quantity;
			partsSold.removeElementAt(place);
			partsSold.insertElementAt(newAmount, place);

			System.out.print(quantity + " " + itemKey + "(s) were sold from the store for $"
							+ quantity * sellingPrice.elementAt(place) + "\n");
		}
	}

	public static void printTotalInventory(Vector<Integer> partsInStore,
										   Vector<Double> sellingPrice)
	{
		double runningTotalValue = 0;

		for(int i = 0; i < partsInStore.size(); i++)
			runningTotalValue += partsInStore.elementAt(i) * sellingPrice.elementAt(i);

		System.out.printf("Total Inventory: $%.2f%n", runningTotalValue);
	}

	public static void printItemCount(Vector<Integer> partsInStore)
	{
		int totalStockNumber = 0;
		for(int i = 0; i < partsInStore.size(); i++)
			totalStockNumber += partsInStore.elementAt(i);
		System.out.print("Total Number of Items in the Store: " + totalStockNumber + "\n");
	}


	public static void printReport(Vector<Integer> itemId, Vector<String> itemName,
								   Vector<Integer> partsOrdered, Vector<Integer> partsInStore,
								   Vector<Integer> partsSold, Vector<Double> manufPrice,
								   Vector<Double> sellingPrice)
	{
		System.out.println();
		System.out.printf("%50s %n", "Tyler's Terrific Hardware Store");
		System.out.print("itemId       itemName    pOrdered pInStore pSold manufPrice sellingPrice\n");
		for(int i = 0; i < itemName.size(); i++)
			System.out.printf("%d %16s %11d %8d %5d %10.2f %12.2f %n", itemId.elementAt(i),
							  itemName.elementAt(i), partsOrdered.elementAt(i),
							  partsInStore.elementAt(i), partsSold.elementAt(i),
							  manufPrice.elementAt(i), sellingPrice.elementAt(i));

		printTotalInventory(partsInStore, sellingPrice);
		printItemCount(partsInStore);
	}
}























