import org.example.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class CreatorTest {
    private static Creator creator;

    @BeforeAll
    public static void init() {
        creator = new Creator();
    }

    @Test
    public void Create_CreateShapes_ShapesAreCreatedInCorrectOrder() {
        int shapeAmount = 9;
        int count = 1;
        Class<? extends Shape> expectedShapeType;
        CircularLinkedList<Shape> shapeList = creator.create(shapeAmount);
        CircularLinkedListIterator<Shape> shapeListIterator = shapeList.iterator();
        while (shapeListIterator.hasNext() && shapeAmount > 0) {
            Shape nextShape = shapeListIterator.next();
            expectedShapeType = switch (count) {
                case 1 -> Circle.class;
                case 2 -> Square.class;
                case 3 -> Rectangle.class;
                default -> Triangle.class;
            };
            assertThat(nextShape.getClass()).isEqualTo(expectedShapeType);
            System.out.println(nextShape);
            shapeAmount--;
            if (count++ == 4) {
                count = 1;
            }
        }
    }

}
