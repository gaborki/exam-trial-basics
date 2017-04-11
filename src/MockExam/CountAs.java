package MockExam;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.IO;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by Gabor on 11/04/2017.
 */
public class CountAs {

  public int howManyA(String file) {
    int count = 0;
    try {
      Path path = Paths.get(file);
      List<String> list = Files.readAllLines(path);
      for (String line : list) {
        for (int i = 0; i < line.length(); i++) {
          Character letter = Character.toLowerCase(line.charAt(i));
          if (letter == 'a') {
            count++;
          }
        }
      }
    } catch (IOException ex) {
      ex.printStackTrace();
      return 0;
    }
    return count;
  }

  public static void main(String[] args) {
    CountAs nem = new CountAs();
    System.out.println(
        nem.howManyA("/Users/Gabor/GreenFox/MockExam/exam-trial-basics/countas/afile.txt"));
  }
}
