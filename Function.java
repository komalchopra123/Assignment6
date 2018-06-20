class SimpleFunction{
 void printf(){
 System.out.println("null");
}

 void printf(int n){
 System.out.println(n);
}

 void printf(float r){
 System.out.println(r);
}
}
 
 class Function{
 public static void main(String[] args){
 SimpleFunction ab= new SimpleFunction();
 ab.printf();
 ab.printf(4);
 ab.printf(5f);
}
}
 