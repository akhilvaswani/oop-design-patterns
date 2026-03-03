/**
 * Extends IntList to maintain sorted order on insertion.
 * Overrides add() to find the right position, shift elements, and insert.
 *
 * Note: IntList is the base class provided by the instructor.
 */
public class SortedIntList extends IntList {

    public SortedIntList(int size) {
        super(size);
    }

    @Override
    public void add(int value) {
        // find where this value belongs
        int index = numElements;
        for (int i = 0; i < numElements; i++) {
            if (value < list[i]) {
                index = i;
                break;
            }
        }
        // shift everything right to make room
        for (int i = numElements; i > index; i--) {
            list[i] = list[i - 1];
        }
        list[index] = value;
        numElements++;
    }
}
