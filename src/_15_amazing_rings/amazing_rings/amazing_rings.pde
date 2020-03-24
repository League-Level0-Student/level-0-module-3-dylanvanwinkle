
 int x2 = 780;
 int x1 = 120;
void setup(){
size(900,900);
noFill();
}
void draw(){
  if(x1 == 900){
    x1 = 120;
  }
    if(x2 == 0){
    x2 = 780;
  }
 background(#4800F5);
for(int i = 40; i > 0; i--){
  if(i % 2 == 0){

  }
  else
{

}
  ellipse(x1,450,i*10,i*10);
}
x1++;
x1++;
size(900,900);
for(int i = 40; i > 0; i--){
  if(i % 2 == 0){

  }
  else
{

}
  ellipse(x2,450,i*10,i*10);
}
x2--;
x2--;
}
