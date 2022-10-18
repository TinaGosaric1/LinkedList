import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        placesToVisit.add("Sydney");
        placesToVisit.add("Melbourne");
        placesToVisit.add("Brisbane");
        placesToVisit.add("Perth");
        placesToVisit.add("Canberra");
        placesToVisit.add("Adelaide");
        placesToVisit.add("Darwin");

        printList(placesToVisit);

        placesToVisit.add(1,"Alice Springs");
        printList(placesToVisit);

        placesToVisit.remove(4);
        printList(placesToVisit);
    }
    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator(); //iterator can traverse only in forward direction
        while(i.hasNext()){ //is there another entry?
            System.out.println("Now visiting " + i.next()); //printing current value and later moving to the next entry
        }
        System.out.println("====================");
    }
    private static boolean addInOrder(LinkedList<String> linkedList, String newCity){
        ListIterator<String> stringListIterator = linkedList.listIterator(); //listIterator traverses both in forward and backward directions

        while(stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity); //compareTo() method compares two strings lexicographically
            if(comparison == 0){ //cities are equal
                System.out.println(newCity + " is already included as a destination");
                return false;
            } else if(comparison > 0) { //newCity comes before
                stringListIterator.previous(); //we have to move back one place, since we already moved forward with .next()
                stringListIterator.add(newCity);
                return true;
            } else if(comparison < 0){

            }

            }

        stringListIterator.add(newCity); //there was no suitable option in the while loop, so we have to add newCity to the end of the list
        return true;

        }


}