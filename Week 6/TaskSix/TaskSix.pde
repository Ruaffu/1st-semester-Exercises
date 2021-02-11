//6a
int a = 5;
int b = 5;

if (a == 10 || b == 10 || a+b == 10)
{
  println("Success!");
} else
{
  println("Failure!");
}

//6b
int x = 9;
int y = 9;
int z = 12;

if (x == 10 || x == 20 || x == 30)
{
  println("Failure!");
} else if (y == 10 || y == 20 || y == 30)
{
  println("Failure!");
} else if (z == 10 || z == 20 || z == 30)
{
  println("Failure!");
} else if (x+y+z == 30)
{
  println("Success!");
}
