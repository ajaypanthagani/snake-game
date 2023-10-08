package snake.game;

import java.util.Arrays;

public class Arena {
  private final String[][] arena;

  private Arena(Builder builder) {
    int height = builder.height;
    int width = builder.width;
    String tile = builder.tile;

    this.arena = new String[height][width];

    for (String[] row : arena) {
      Arrays.fill(row, tile);
    }
  }

  @Override
  public String toString() {
    StringBuilder arenaString = new StringBuilder();

    for (String[] row : arena) {
      for (String tile : row) {
        arenaString.append(tile);
      }
      arenaString.append("\n");
    }

    return arenaString.toString();
  }

  public void setTileAt(int x, int y, String tile){
    this.arena[x][y] = tile;
  }

  public static class Builder {
    private int height;
    private int width;
    private String tile;

    public Builder() {
      this.height = 1000;
      this.width = 1000;
      this.tile = " ";
    }

    public Builder height(int height) {
      this.height = height;
      return this;
    }

    public Builder width(int width) {
      this.width = width;
      return this;
    }

    public Builder tile(String tile) {
      this.tile = tile;
      return this;
    }

    public Arena build() {
      return new Arena(this);
    }
  }
}
