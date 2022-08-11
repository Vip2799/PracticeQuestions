import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StockTest {


    @Test
    void getChangedPercentInNegative() {
        Stock stock1 = new Stock("AUF","AU Finance",1020,998);
        double actual = stock1.getChangedPercent();
        assertEquals(-2.15,actual,0.01);
    }

    @Test
    void getChangedPercentInPositive(){
        Stock stock2 = new Stock("RLC","Reliance",2003,2102);
        double actual = stock2.getChangedPercent();
        assertEquals(4.94,actual,0.01);
    }
}