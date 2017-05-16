import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotnull;
import rg.junit. *;
// this imports all the addons that allow junit to work


public class photographerTest {
  Photographer photographer;
  DigitalCamera digitalCamera;
  AnalogueCamera analogueCamera;

@Before
photographer = new Photographer("Sneaky Pete", 31);
digitalCamera = new DigitalCamera();
analogueCamera = new AnalogueCamera(); 
}