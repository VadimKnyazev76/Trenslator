public class Colculator {
    public static void main(String[] args) {
        int operand1 = 11;
        int operand2 = 2;
        String sign = "/";
         if (sign == "+"){
             System.out.println(operand1+operand2);
         }
         if (sign == "-"){
             System.out.println(operand1-operand2);
         }

         if (sign=="*"){
             System.out.println(operand1*operand2);
         }
        if (sign=="/"){
          if (operand2 !=0){
              System.out.println(operand1/operand2);

          }
          else {
              System.out.println("на 0 делить нельзя");
          }




        }
    }
}
