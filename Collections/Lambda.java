interface Calculator{
    int operate(int a,int b);
}
public class Lambda {
    public static void main(String[] args) {
       Calculator addition = (a,b) -> (a+b);
       System.out.println("the addition of 6 and 7 is"+addition.operate(6, 7));
         Calculator multiplication = (a,b) -> (a*b);
         System.out.println("the multiplication of 6 and 7 is"+multiplication.operate(6, 7));
            Calculator subtraction = (a,b) -> (a-b);
            System.out.println("the subtraction of 6 and 7 is"+subtraction.operate(6, 7));
             Calculator division = (a,b) -> (a/b);
             System.out.println("the division of 6 and 7 is"+division.operate(6, 7));
             
    }
}