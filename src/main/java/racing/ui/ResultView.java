package racing.ui;

import racing.domain.Winners;
import racing.dto.RacingResult;

public class ResultView {

  public static void printRoundResult(RacingResult racingResult) {
    if(racingResult.needsResultHeader()){
      System.out.println("\n" + Message.RESULT_MESSAGE.getMessage());
    }
    System.out.println(racingResult.getCurrentStatus());
  }

  public static void printWinners(Winners winners) {
    System.out.println(winners + "가 최종 우승했습니다.");
  }
}
