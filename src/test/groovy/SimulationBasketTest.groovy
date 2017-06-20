import org.junit.Before
import org.junit.Test

class SimulationBasketTest {
    private SimulationBasket subject
    private static String VIGNESH = "Vignesh";

    @Before
    public void setUp() throws Exception {
        subject = new SimulationBasket(VIGNESH)
    }

    @Test
    public void "will run the basic functions"() throws Exception {
        assert subject.getName() == VIGNESH
    }
}
