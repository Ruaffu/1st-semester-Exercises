
//for(int input = 20; input >= 0; input--)
//{
//  if(input == 6)
//  {
//    println("Six");
//  }else if(input == 10){
//  println("Half");
//  }else{
//    println(input);
//  }
//}

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
