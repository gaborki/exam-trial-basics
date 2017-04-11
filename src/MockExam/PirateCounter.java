package MockExam;

/**
 * Created by Gabor on 11/04/2017.
 */

import java.util.*;

public class PirateCounter {

  static class Pirate {

    String name;
    boolean hasWoodenLeg;
    int gold;

    Pirate(String name, boolean hasWoodenLeg, int gold) {
      this.name = name;
      this.hasWoodenLeg = hasWoodenLeg;
      this.gold = gold;
    }
  }

  public static void main(String... args) {
    PirateCounter pc = new PirateCounter();
    ArrayList<Pirate> pirates = new ArrayList<>();
    pirates.add(new Pirate("Olaf", false, 12));
    pirates.add(new Pirate("Uwe", true, 9));
    pirates.add(new Pirate("Jack", true, 16));
    pirates.add(new Pirate("Morgan", false, 17));
    pirates.add(new Pirate("Hook", true, 20));
    System.out.println(pc.richLegs(pirates));
  }

  public ArrayList<String> richLegs(ArrayList<Pirate> crew) {
    ArrayList<String> realPirates = new ArrayList<String>();
    for (Pirate dude : crew) {
      if (dude.hasWoodenLeg && dude.gold > 15) {
        realPirates.add(dude.name);
      }
    }
    return realPirates;
  }
}
