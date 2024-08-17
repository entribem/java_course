import org.assertj.core.data.Index;
import org.example.CircularLinkedList;
import org.example.CircularLinkedListIterator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class CllTest {
    CircularLinkedList<Integer> cll;
    @BeforeEach
    void init() {
        cll = new CircularLinkedList<>();
    }

    @Test
    public void get_getValueFromCenter_ValueIsCorrect() {
        // create the following list: 1 2 3
        cll.addFirst(3);
        cll.addFirst(2);
        cll.addFirst(1);
        // get value of the second element
        int val = cll.get(1);
        assertThat(val).isEqualTo(2);
    }

    @Test
    public void addFirst_addValue_ValueIsAtBeginning() {
        int count = 1;
        // create the following list: 1 2 3
        cll.addFirst(3);
        cll.addFirst(2);
        cll.addFirst(1);
        CircularLinkedListIterator<Integer> listIterator = cll.iterator();
        while (listIterator.hasNext()) {
            int currVal = listIterator.next();
            assertThat(currVal).isEqualTo(count++);
        }
    }

    @Test
    public void addLast_addValue_ValueIsAtEnd() {
        int count = 1;
        // create the following list: 1 2 3
        cll.addLast(1);
        cll.addLast(2);
        cll.addLast(3);
        CircularLinkedListIterator<Integer> listIterator = cll.iterator();
        while (listIterator.hasNext()) {
            int currVal = listIterator.next();
            System.out.println("val = " + currVal);
            assertThat(currVal).isEqualTo(count++);
        }
    }

    @Test
    public void add_addValueAtBeginning_ValuesAreInCorrectOrder() {
        int count = 1;
        // create the following list: 1 2 3
        cll.add(0, 3);
        cll.add(0, 2);
        cll.add(0, 1);
        CircularLinkedListIterator<Integer> listIterator = cll.iterator();
        while (listIterator.hasNext()) {
            int currVal = listIterator.next();
            System.out.println("val = " + currVal);
            assertThat(currVal).isEqualTo(count++);
        }
    }

    @Test
    public void add_addValueInCenter_ValuesAreInCorrectOrder() {
        int count = 1;
        // create the following list: 1 2 3 4
        cll.add(0, 1);
        cll.add(1, 2);
        cll.add(2, 4);
        cll.add(2, 3);
        CircularLinkedListIterator<Integer> listIterator = cll.iterator();
        while (listIterator.hasNext()) {
            int currVal = listIterator.next();
            System.out.println("val = " + currVal);
            assertThat(currVal).isEqualTo(count++);
        }
    }

    @Test
    public void add_addValueAtEnd_ValuesAreInCorrectOrder() { // final list should be 1 2 3
        int count = 1;
        // create the following list: 1 2 3
        cll.add(0, 1);
        cll.add(1, 2);
        cll.add(2, 3);
        CircularLinkedListIterator<Integer> listIterator = cll.iterator();
        while (listIterator.hasNext()) {
            int currVal = listIterator.next();
            System.out.println("val = " + currVal);
            assertThat(currVal).isEqualTo(count++);
        }
    }

    @Test
    public void removeFirst_removeFromEmptyList_ExceptionThrown() {
        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> cll.removeFirst());
    }

    @Test
    public void removeFirst_removeValueFromBeginning_ValuesAreInCorrectOrder() {
        int count = 2;
        // create the following list: 1 2 3 4
        cll.add(0, 1);
        cll.add(1, 2);
        cll.add(2, 3);
        cll.add(3, 4);
        // remove 1 - > final list should be 2 3 4
        cll.removeFirst();
        CircularLinkedListIterator<Integer> listIterator = cll.iterator();
        while (listIterator.hasNext()) {
            int currVal = listIterator.next();
            System.out.println("val = " + currVal);
            assertThat(currVal).isEqualTo(count++);
        }
    }

    @Test
    public void removeLast_removeValueFromEnd_ValuesAreInCorrectOrder() {
        int count = 1;
        // create the following list: 1 2 3 4
        cll.add(0, 1);
        cll.add(1, 2);
        cll.add(2, 3);
        cll.add(3, 4);
        // remove 4 - > final list should be 1 2 3
        cll.removeLast();
        CircularLinkedListIterator<Integer> listIterator = cll.iterator();
        while (listIterator.hasNext()) {
            int currVal = listIterator.next();
            System.out.println("val = " + currVal);
            assertThat(currVal).isEqualTo(count++);
        }
    }

    @Test
    public void remove_removeValueFromBeginning_ValuesAreInCorrectOrder() {
        int count = 2;
        // create the following list: 1 2 3 4
        cll.add(0, 1);
        cll.add(1, 2);
        cll.add(2, 3);
        cll.add(3, 4);
        // remove 1 - > final list should be 2 3 4
        cll.remove(0);
        CircularLinkedListIterator<Integer> listIterator = cll.iterator();
        while (listIterator.hasNext()) {
            int currVal = listIterator.next();
            System.out.println("val = " + currVal);
            assertThat(currVal).isEqualTo(count++);
        }
    }

    @Test
    public void remove_removeValueFromCenter_ValuesAreInCorrectOrder() {
        int count = 1;
        // create the following list: 1 2 3 4
        cll.add(0, 1);
        cll.add(1, 2);
        cll.add(2, 3);
        cll.add(3, 4);
        // remove 4 - > final list should be 1 2 3
        cll.remove(3);
        CircularLinkedListIterator<Integer> listIterator = cll.iterator();
        while (listIterator.hasNext()) {
            int currVal = listIterator.next();
            System.out.println("val = " + currVal);
            assertThat(currVal).isEqualTo(count++);
        }
    }

    @Test
    public void remove_removeValueFromEnd_ValuesAreInCorrectOrder() {
        int count = 1;
        // create the following list: 1 2 5 3
        cll.add(0, 1);
        cll.add(1, 2);
        cll.add(2, 5);
        cll.add(3, 3);
        // remove 5 -> final list should be 1 2 3
        cll.remove(2);
        CircularLinkedListIterator<Integer> listIterator = cll.iterator();
        while (listIterator.hasNext()) {
            int currVal = listIterator.next();
            System.out.println("val = " + currVal);
            assertThat(currVal).isEqualTo(count++);
        }
    }

    @Test
    public void remove_removeValueWithInvalidIndex_ExceptionThrown() {
        cll.add(0, 1);
        cll.add(1, 2);
        cll.add(2, 3);
        // maximum index in the list is 2 -> throw exception
        assertThatExceptionOfType(IndexOutOfBoundsException.class).isThrownBy(() -> cll.remove(4));
    }

    @Test
    public void add_addValueWithInvalidIndex_ExceptionThrown() {
        cll.add(0, 1);
        cll.add(1, 2);
        cll.add(2, 3);

        // maximum index in the list is 2 -> throw exception
        assertThatExceptionOfType(IndexOutOfBoundsException.class).isThrownBy(() -> cll.add(4, 4));
    }
}
