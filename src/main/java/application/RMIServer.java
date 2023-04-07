package application;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

//Generate stubs command: "rmic -keep Calculator"
//Compile program with access control: "java -Djava.security.policy=server.policy RMIServer"
public class RMIServer {
    public static void main(String[] args) {
        try{
            ICalculator calc = new Calculator();
            String objName = "rmi://localhost/Calc";

            System.out.println("Registering the object on RMIRegistry...");
            LocateRegistry.createRegistry(1099);
            Naming.rebind(objName, calc);

            System.out.println("Waiting for client...");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
