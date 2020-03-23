 int po = 450;
 int p = 450;
void setup(){
size(900,900);
noFill();
}
void draw(){
for(int i = 8; i > 0; i--){
  if(i % 2 == 0){

  }
  else
{

}
  ellipse(p,450,i*50,i*50);
}
p++;
size(900,900);
for(int i = 8; i > 0; i--){
  if(i % 2 == 0){

  }
  else
{

}
  ellipse(po,450,i*50,i*50);
}
po--;
}
