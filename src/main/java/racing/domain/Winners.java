package racing.domain;

import java.util.List;
import java.util.StringJoiner;

public class Winners {
  private List<Car> winners;

  public Winners(List<Car> winners) {
    this.winners = winners;
  }

  @Override
  public String toString() {
    StringJoiner joiner = new StringJoiner(",");
    for (Car x : winners) {
      joiner.add(x.getName());
    }
    return joiner.toString();
  }

}
