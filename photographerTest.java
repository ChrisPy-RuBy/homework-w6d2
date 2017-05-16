import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit. *;
// this imports all the addons that allow junit to work


public class PhotographerTest {
  Photographer photographer;
  DigitalCamera digitalCamera;
  AnalogueCamera analogueCamera;

@Before
public void before(){
photographer = new Photographer("Sneaky Pete", 31);
digitalCamera = new DigitalCamera();
analogueCamera = new AnalogueCamera(); 
}

@Test
public void photographerHasName() {
  assertEquals("Sneaky Pete", photographer.getName());
}

@Test
public void photographerHasAge() {
  assertEquals(31, photographer.getAge());
}

@Test
public void isCameraPackEmpty() {
  assertEquals(0, photographer.packCount());
}

@Test
public void addCameraToPack() {
  photographer.addCameraToPack(digitalCamera);
  assertEquals(1, photographer.packCount());
}

@Test
public void addDifferentCameraToPack() {
  photographer.addCameraToPack(analogueCamera);
  assertEquals(1, photographer.packCount());
}

@Test public void addTwoCameraTypes() {
  photographer.addCameraToPack(digitalCamera);
  photographer.addCameraToPack(analogueCamera);
  assertEquals(2,photographer.packCount());
}

@Test
public void removeCameraFromPack() {
  photographer.addCameraToPack(digitalCamera);
  assertEquals(1, photographer.packCount());
  photographer.removeCameraFromPack();
  assertEquals(0, photographer.packCount());
}

@Test
public void removeCameraFromPackAlreadyEmpty() {
  photographer.removeCameraFromPack();
  assertEquals(0, photographer.packCount());
}
}
