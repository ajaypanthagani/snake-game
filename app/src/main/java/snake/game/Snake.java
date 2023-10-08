package snake.game;

import lombok.Builder;
import lombok.Getter;

public class Snake {
  @Getter private int length;

  public Snake(int length) {
    this.length = length;
  }

  public void increaseLength(int lengthIncrement) {
    this.length = this.length + lengthIncrement;
  }

  public void decreaseLength(int lengthDecrement) {
    this.length = this.length - lengthDecrement;
  }
}
