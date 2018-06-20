public class Override
{
String breed;
String speak;
void speak()
{
System.out.println("moo ");
}
  public static void main(String[] args){
  Override objectA= new Override();
  Dog objectB= new Dog();
  Cat objectC= new Cat();
   
  objectA.speak();
  objectB.speak();
  objectC.speak();
}
}
 
 class Dog extends Override{
 String breed;
 String color;
 void speak(){
 System.out.println("bark");
}
}

 class Cat extends Override{
 String breed;
 String speak;
 void speak(){
 System.out.println("meow");
}

}