import org.example.Creator;
import org.example.Shape;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class CreatorTest {
    private static Creator creator;
    private static final int amount = 10;

    @BeforeAll
    public static void init() {
        creator = new Creator();
    }

    @Test
    public void Create_CreateRandomShapes_AllShapesAreCreated() {
        List<Shape> shapeList = creator.create(amount);
        assertThat(shapeList).hasSize(amount);
    }

    @Test
    public void Create_CreateRandomShapes_OnlyShapesAreCreated() {
        List<Shape> shapeList = creator.create(amount);
        assertThat(shapeList).hasOnlyElementsOfType(Shape.class);
    }
}
