import org.example.Circle;
import org.example.FigureInvalidException;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class CircleTest {
    @Test
    public void Square_Circle_CorrectSquare() {
        int radius = 5;
        Circle newCircle = new Circle(radius);
        assertThat(newCircle.square()).isEqualTo(radius * radius * Math.PI);
    }

    @Test
    public void CircleCreate_InvalidField_ExceptionThrown() {
        int radius = -5;
        assertThatExceptionOfType(FigureInvalidException.class).isThrownBy(() -> new Circle(radius));
    }
}
