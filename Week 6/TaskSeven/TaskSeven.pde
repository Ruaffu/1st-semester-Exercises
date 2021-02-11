//7a
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

//7b
/* 
It will work with a different input number as long as it's not
a negative number.
*/
