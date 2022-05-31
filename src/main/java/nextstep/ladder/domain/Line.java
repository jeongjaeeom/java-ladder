package nextstep.ladder.domain;

import java.util.List;

public class Line {

  private final List<Position> positions;

  public Line(List<Position> positions) {
    this.positions = positions;
  }

  public int move(int startPoint) {
   return positions.get(startPoint).move();
  }
}
