import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {

    @Test
    void testingAreaForSpecificValue() {
        Rectangle rectangle1 = new Rectangle(120, 24);
        double actualArea = rectangle1.area();
        assertEquals(2880, actualArea);
    }

    @Test
    void testingAreaForDefaultValue() {
        Rectangle rectangle2 = new Rectangle();
        double actualArea = rectangle2.area();
        assertEquals(1, actualArea);
    }

    @Test
    void perimeterForSpecificValues() {
        Rectangle rectangle = new Rectangle(120, 24);
        double actualPerimeter = rectangle.perimeter();
        assertEquals(288, actualPerimeter);
    }

    @Test
    void permeterForDefaultValues() {
        Rectangle rectangle = new Rectangle();
        double actualPerimeter = rectangle.perimeter();
        assertEquals(4.0, actualPerimeter);
    }
}