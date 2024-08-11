import org.example.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class FactoryTest {
    private static ShapeFactory shapeFactory;
    private static final int lowerBound = 1;
    private static final int upperBound = 10;

    @BeforeAll
    public static void init() {
        shapeFactory = new ShapeFactory();
    }

    @Test
    public void CreateCircle_ValidValues_ValuesInBounds() {
        Circle newCircle = shapeFactory.createCircle();
        assertThat((int) newCircle.getRadius()).isBetween(lowerBound, upperBound);
    }

    @Test
    public void CreateSquare_ValidValues_ValuesInBounds() {
        Square newSquare = shapeFactory.createSquare();
        assertThat(newSquare.getWidth()).isBetween(lowerBound, upperBound);
    }

    @Test
    public void CreateRectangle_ValidValues_ValuesInBounds() {
        Rectangle newRectangle = shapeFactory.createRectangle();
        assertThat(newRectangle.getWidth()).isBetween(lowerBound, upperBound);
        assertThat(newRectangle.getHeight()).isBetween(lowerBound, upperBound);
    }

    @Test
    public void CreateTriangle_ValidValues_ValuesInBounds() {
        Triangle newTriangle = shapeFactory.createTriangle();
        assertThat(newTriangle.getSideA()).isBetween(lowerBound, upperBound);
        assertThat(newTriangle.getSideB()).isBetween(lowerBound, upperBound);
    }

    @Test
    public void CreateRectangle_ValidHasCorrectType() {
        Rectangle newRectangle = shapeFactory.createRectangle();
        assertThat(newRectangle.getWidth()).isInstanceOf(Integer.class);
        assertThat(newRectangle.getHeight()).isInstanceOf(Integer.class);
    }
}
