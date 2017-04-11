package MockExam;

/**
 * Created by Gabor on 11/04/2017.
 */
public class Cuboid {

  int a;
  int b;
  int c;

  public Cuboid(int a, int b, int c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  int getSurface() {
    return (a * b) + (a * c) + (b * c);
  }

  int getVolume() {
    return a * b * c;
  }
}
