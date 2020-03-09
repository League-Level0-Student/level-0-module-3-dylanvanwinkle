for (int i = 99; i > 0; i--) {
  print(i);
   if(i > 1){
  print(" bottles of beer on the wall, ");
 }else{
  print(" bottle of beer on the wall, ");
 }
  print(i);
  
 if(i > 1){
  println(" bottles of beer.");
 }else{
     println(" bottle of beer.");
 }
  print("Take one down and pass it around, ");
 if(i == 1){
  println(" no more bottles of beer on the wall."); 
 }
 if(i > 1){
  print(i-1);
  if(i > 2){
  println(" bottles of beer on the wall.");
  }
if(i <= 2){
    println(" bottle of beer on the wall.");
  
}  
}
}
println("No more bottles of beer on the wall, no more bottles of beer. ");
print("Go to the store and buy some more, 99 bottles of beer on the wall.");
