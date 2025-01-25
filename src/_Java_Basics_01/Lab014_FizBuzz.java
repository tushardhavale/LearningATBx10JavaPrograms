package _Java_Basics_01;

public class Lab014_FizBuzz {
    public static void main(String args[]) {
        for (int i=1; i<=100; i++){
        if ( i%3==0 && i%5==0){
            System.out.println("FizBuz");
    } else if (i%3==0){
System.out.println("Fiz");
}else if(i%5==0) {
System.out.println("Buz");
}
else{
System.out.println(i);
}
}
}
}