package snake.game;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SnakeTest {
  @Test
  public void shouldIncreaseTheLengthOfSnake() {
    Snake snake = new Snake(0);
    int snakeLength = snake.getLength();
    int increment = 6;
    snake.increaseLength(increment);
    int expectedSnakeLength = snakeLength + increment;
    int actualSnakeLength = snake.getLength();

    assertEquals(expectedSnakeLength, actualSnakeLength);
  }

  @Test
  public void shouldDecreaseTheLengthOfSnake() {
    Snake snake = new Snake(0);
    int snakeLength = snake.getLength();
    int decrement = 6;
    snake.decreaseLength(decrement);
    int expectedSnakeLength = snakeLength - decrement;
    int actualSnakeLength = snake.getLength();

    assertEquals(expectedSnakeLength, actualSnakeLength);
  }
}
