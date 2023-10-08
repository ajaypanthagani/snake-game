package snake.game;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArenaTest {
  @Test
  public void shouldBuildTheArena() {
    Arena arena = new Arena.Builder().height(2).width(5).tile("*").build();
    String expectedArena = "*****\n*****\n";
    String actualArena = arena.toString();

    assertEquals(expectedArena, actualArena);
  }

  @Test
  public void shouldSetTheArenaTile() {
    Arena arena = new Arena.Builder().height(2).width(5).tile("*").build();
    arena.setTileAt(0, 1, "#");
    String expectedArena = "*#***\n*****\n";
    String actualArena = arena.toString();

    assertEquals(expectedArena, actualArena);
  }
}
