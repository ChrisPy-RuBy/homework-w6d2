import java.util.*;
// still not really sure what this does!

public class Photographer {
// this creates the whole class

private String name;
private int age;
private ArrayList<Printable> cameraPack;
// this is the equivalent of the initialize method. It gives the object its properties

public Photographer(String name, int age) {
  this.name = name;
  this.age = age;
  this.cameraPack = new ArrayList<Printable>();

}

public String getName() {
  return this.name;
}

public int getAge() {
  return this.age;
}

public int packCount() {
  return this.cameraPack.size();
}

public void addCameraToPack(Printable camera) {
  this.cameraPack.add(camera);
}

public Printable removeCameraFromPack() {
  if (packCount()>0) {
  this.cameraPack.remove(0);
}
  return null;
  // cant return 0 here as classes are not compatible with ints
}
}



// addCamera method
// removeCamera method