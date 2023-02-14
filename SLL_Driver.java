package LabSinglyLinkedListImplementation;

public class SLL_Driver {
	public static void main(String[] args) {
		SLL<String> myList = new SLL<String>();
      String[] cityNames = {"Jubail", "Riyadh", "Abha", "Dammam", "Taif"};
		for(int i = 0; i < cityNames.length; i++)
			myList.addToHead(cityNames[i]);
			
		 System.out.println("Original list: " + myList);
       System.out.println("Element deleted from head: " + myList.deleteFromHead());
       System.out.println("Modified list: " + myList);
       System.out.println("It is " + myList.contains("Dammam") + " that the list contains Dammam.");
	}
}