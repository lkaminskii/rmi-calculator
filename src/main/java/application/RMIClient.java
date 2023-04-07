package application;
import java.rmi.Naming;

//Compile: "java -Djava.security.policy=server.policy RMIClient"
public class RMIClient {
    public static void main(String[] args) throws Exception {
        String objName = "rmi//localhost:1099/Calc";
        ICalculator calc = (ICalculator) Naming.lookup(objName);
        System.out.println("The result of the sum is: " + calc.addition(1, 2));
    }
}
