package application;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Calculator extends UnicastRemoteObject implements ICalculator {
    public Calculator() throws RemoteException {

    }

    @Override
    public double addition(double a, double b) throws RemoteException {
        return a + b;
    }

    @Override
    public double subtraction(double a, double b) throws RemoteException {
        return a - b;
    }

    @Override
    public double multiplication(double a, double b) throws RemoteException {
        return a * b;
    }

    @Override
    public double division(double a, double b) throws RemoteException {
        return a / b;
    }
}
