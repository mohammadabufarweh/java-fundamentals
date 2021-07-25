public class Main {
  public static void main(String[] args) {
    String greeting = "Welcome to my Java program.";
    System.out.println(greeting);

    pluralize("nickName",5);
       flipNHeads(5);

  }
   public static void pluralize ( String nickName ,int num ){
    if (num ==1 ) {
    System.out.println(nickName );
    } else {
    System.out.println(nickName +'s' );
    }
    }
 public static void flipNHeads ( int flip ){
     for (int i = 0; i < flip; i++) {
    double randomDbl = Math.random();
    if (randomDbl >=0.5 ) {
    System.out.println("heads" );
    } else {
    System.out.println("tail" );
    }
    }
}

}
