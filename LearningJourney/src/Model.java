public class Model {
    public double calculate(double number1, double number2,String operator){
       switch(operator){
case "+":
return number1+number2;
case "-":
return number1-number2;
case "\u00D7":
return number1*number2;
case "\u00F7":
if(number2==0) return 0;
return number1/number2;
default:
return 0;
       } 
        
       
    }
}
