package application;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ICalculator extends Remote {
    double addition(double a, double b) throws RemoteException;
    double subtraction(double a, double b) throws RemoteException;
    double multiplication(double a, double b) throws RemoteException;
    double division(double a, double b) throws RemoteException;
}
