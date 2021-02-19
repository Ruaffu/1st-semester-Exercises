class Food 
{
  int x;
  int y;
  int type = 4;
  Player player;

  Food(int x, int y, Player player)
  {
    this.x = x;
    this.y = y;
    this.player = player;
  }

  void moveAwayFromPlayer()
  {
    int xDistance = Math.abs(player.x - this.x);
    int yDistance = Math.abs(player.y - this.y);

    // random chance (~25% chance) for at enemy flytter sig i en tilfældig retning.
    if (Math.random() < 0.25)
    {
      int randomMoveX = (int)random(0, 25);
      int randomMoveY = (int)random(0, 25);
      this.x = randomMoveX;
      this.y = randomMoveY;
    } else { 

      if (xDistance < yDistance)
      {
        // prevents ArrayIndexOutOfBoundsException. 
        if (x == grid.length - grid.length/25)return;
        if (x == grid.length/30)return;
        if (y == grid.length - grid.length/25)return;
        if (y == grid.length/30)return;

        if (player.x < this.x) {
          this.x += 1;
        } else if (player.x > this.x) {
          this.x -= 1;
        } else if (player.y < this.y) {
          this.y += 1;
        } else if (player.y > this.y) {
          this.x -= 1;
        }
      }
    }
  }
}
