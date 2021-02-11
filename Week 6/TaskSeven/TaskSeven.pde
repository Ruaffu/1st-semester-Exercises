int input = 20;
int half = input/2;

while (input >= 0)
{
  if (input == 6)
  {
    println("Six");
  } else if (input == half) {
    println("Half");
  } else {
    println(input);
  }
  input--;
}
