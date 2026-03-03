/**
 * Quick test — adds 1, 4, 3 to a list and prints to verify order.
 */
public class ListTest {
    public static void main(String[] args) {
        SortedIntList myList = new SortedIntList(10);
        myList.add(1);
        myList.add(4);
        myList.add(3);
        System.out.println(myList);
        // expected: [1, 3, 4]
    }
}
