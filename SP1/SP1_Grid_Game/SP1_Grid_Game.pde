
int size = 40;
int[][] grid = new int[25][25];

Player player;
Enemy enemys[] = new Enemy[4];
Food food[] = new Food[4];

void setup()
{
  size(1001, 1001);
  frameRate(24);
  player = new Player(3, 4);

  for (int i = 0; i < enemys.length; i++) {
    enemys[i] = new Enemy((int)random(0, grid.length), (int)random(0, grid[0].length), player);
  }

  for (int i = 0; i < food.length; i++) {
    food[i] = new Food((int)random(0, grid.length), (int)random(0, grid[0].length), player);
  }
}

void draw()
{
  clearBoard();
  updateEntities();
  drawBoard();
  resolveCollisions();
  ui();
  isGameOver();
}


void clearBoard()
{
  for (int x = 0; x < grid.length; x++)
  {
    for (int y = 0; y < grid[0].length; y++)
    {
      grid[x][y] = 0;
    }
  }
}

// the grid
void drawBoard()
{
  for (int x = 0; x < grid.length; x++)
  {
    for (int y = 0; y < grid[0].length; y++)
    {
      fill(getColorFromType(grid[x][y]));

      rect(x * size, y * size, size, size);
    }
  }
}

void resolveCollisions()
{
  for (int i = 0; i < enemys.length; i++) {
    if (grid[player.x][player.y] == grid[enemys[i].x][enemys[i].y])
    {
      player.takeDamage();
    }
  }

  for (int i = 0; i < food.length; i++) {
    if (grid[player.x][player.y] == grid[food[i].x][food[i].y]) {
      player.increaseScore();
    }
  }
}

void updateEntities()
{
  grid[player.x][player.y] = player.type;

  for (int i = 0; i < enemys.length; i++) {
    grid[enemys[i].x][enemys[i].y] = enemys[i].type;
    enemys[i].MoveTowardsPlayer();
  }

  for (int i = 0; i < enemys.length; i++) {
    grid[food[i].x][food[i].y] = food[i].type;
    food[i].moveAwayFromPlayer();
  }
}

// colors
color getColorFromType(int type) 
{
  color c = color(255);

  switch(type)
  {
  case 0: 
    c = color(127);
    break;
  case 1: 
    c = color(255, 0, 0);
    break;
  case 2: 
    c = color(0, 255, 0);
    break;
  case 3: 
    c = color(100, 255, 240);
    break;
  case 4: 
    c = color (64, 116, 255);
    break;
  }    

  return c;
}

// displays the game over screen and the final score
void isGameOver()
{
  boolean gameOver;
  if (player.health < -1)
  {
    gameOver = true;
  } else {
    gameOver = false;
  }

  if (gameOver == true)
  {
    stroke(0);
    fill(0);
    rect(0, 0, 1000, 1000);
    textSize(50);
    fill(255);
    text("Game Over the Final Score is: "+ player.score, 100, height/2);
    stop();
  }
}

// healthbar and score 
void ui()
{
  // Health bar
  stroke(0);
  fill(255, 200);
  rect(200, 5, 100, 40);
  fill(200, 0, 0, 200);
  rect(200, 5, player.health, 40);
  textSize(20);
  fill(0);
  text("Health", 201, 30);

  // Score
  stroke(0);
  fill(255, 200);
  rect(400, 5, 100, 40);
  textSize(20);
  fill(0);
  text("Score: " + player.score, 401, 30);
}

// player controls
void keyPressed()
{
  if (key == 'w')
  {
    if (player.y == grid.length/30)return;
    player.y--;
  }
  if (key == 'a')
  {
    if (player.x == grid.length/30)return;
    player.x--;
  }
  if (key == 's')
  {
    if (player.y == grid.length - grid.length/25)return;
    player.y++;
  }
  if (key == 'd')
  {
    if (player.x == grid.length - grid.length/25)return;
    player.x++;
  }
}
