package MockExam;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gabor on 11/04/2017.
 */
  public class Seconds {
    public static void main(String[] args) {

      List<Integer> example = new ArrayList<>();
      for (int n = 0; n < 10; n++) {
        example.add(n);
      }

      secondItems(example);
    }
  public List<Integer> secondItems(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
          if (i % 2 == 1) {
            result.add(numbers.get(i));
          }
        }
        return result;
      }
}
