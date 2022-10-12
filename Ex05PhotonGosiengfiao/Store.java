import java.util.ArrayList;
import java.util.Arrays;

public class Store {
  private String name;
  private double earnings;
  private ArrayList<Item> itemList;
  private static ArrayList<Store> storeList = new ArrayList();

  public Store(String name){
	  // Initialize name to parameter and earnings to zero
	  // Initialize itemList as a new ArrayList
	  // add 'this' store to storeList
	  this.name = name;
	  this.earnings =0;
	  this.itemList = new ArrayList();
	  storeList.add(this);
  }
  public String getName(){
    return name;
  }
  public double getEarnings(){
    return earnings;
  }
  public void sellItem(int index){
	  // check if index is within the size of the itemList (if not, print statement that there are only x items in the store)
	    // get Item at index from itemList and add its cost to earnings
	    // print statement indicating the sale
	  if (index < this.itemList.size() || index <=0) {
		  this.earnings += this.itemList.get(index).getCost();
		  System.out.printf("%s was sold for %.2f Php! Total earnings of %s is now %.2f.%n%n", this.itemList.get(index).getName(), this.itemList.get(index).getCost(), this.name, this.earnings);
	  }
	  else {
		  System.out.printf("There are only %d items in this store.%n%n", this.itemList.size());
	  }
  }
  public void sellItem(String name){
    // check if Item with given name is in the itemList (you will need to loop over itemList) (if not, print statement that the store doesn't sell it)
    // get Item from itemList and add its cost to earnings
    // print statement indicating the sale
	  boolean found = false;
	  for (Item i : itemList) {
		  if(i.getName().equals(name)) {
			  found=true;
			  this.earnings += i.getCost();
			  System.out.printf("%s was sold for %.2f Php! Total earnings of %s is now %.2f.%n%n", i.getName(), i.getCost(), this.name, this.earnings);
		  }
	  }
	  if (!found) {
		  System.out.printf("The store does not sell this item.%n%n");
	  }
  }
  public void sellItem(Item i){
    // check if Item i exists in the store (there is a method that can help with this) (if not, print statement that the store doesn't sell it)
    // get Item i from itemList and add its cost to earnings
    // print statement indicating the sale
	  if(this.itemList.contains(i)) {
		  this.earnings += i.getCost();
		  System.out.printf("%s was sold for %.2f Php! Total earnings of %s is now %.2f.%n%n", i.getName(), i.getCost(), this.name, this.earnings);
	  }
	  else {
		  System.out.printf("The store does not sell this item.%n%n");
	  }
  }
  public void addItem(Item i){
    // add Item i to store's itemList
	  this.itemList.add(i);
  }
  public void exists(Item i) {
	  System.out.println(itemList.contains(i));
  }
  public void filterType(String type){
    // loop over itemList and print all items with the specified type
	  System.out.printf("Filter: %s%n", type);
	  for (Item i : itemList) {
		  if(i.getType().equals(type)) {
			  System.out.println(i.getName());
		  }
	  }
	  System.out.println("");
  }
  public void filterCheap(double maxCost){
    // loop over itemList and print all items with a cost lower than or equal to the specified value
	  System.out.printf("Filter: Costs below or exactly %.2f %n", maxCost);
	  for (Item i : itemList) {
		  if(i.getCost() <= maxCost) {
			  System.out.println(i.getName());
		  }
	  }
	  System.out.println("");
  }
  public void filterExpensive(double minCost){
    // loop over itemList and print all items with a cost higher than or equal to the specified value
	  System.out.printf("Filter: Costs above or exactly %.2f %n", minCost);
	  for (Item i : itemList) {
		  if(i.getCost() >= minCost) {
			  System.out.println(i.getName());
		  }
	  }
	  System.out.println("");
  }
  public static void printStats(){
    // loop over storeList and print the name and the earnings'Store.java'
	  for (Store s : storeList) {
		  System.out.printf("%s %nEarnings: %.2f%n%n", s.name, s.earnings);
	  }
  }
}