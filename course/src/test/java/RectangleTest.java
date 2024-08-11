import org.example.FigureInvalidException;
import org.example.Rectangle;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;


public class RectangleTest {
    @Test
    public void Square_Rectangle_CorrectSquare() {
        int width = 5;
        int height = 7;
        Rectangle newRectangle = new Rectangle(width, height);
        assertThat(newRectangle.square()).isEqualTo(width * height);
    }

    @Test
    public void RectangleCreate_InvalidField_ExceptionThrown() {
        int width = 5;
        int height = -2;
        assertThatExceptionOfType(FigureInvalidException.class).isThrownBy(() -> new Rectangle(width, height));
    }
}
