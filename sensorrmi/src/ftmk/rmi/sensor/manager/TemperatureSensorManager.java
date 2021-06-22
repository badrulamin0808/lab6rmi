package ftmk.rmi.sensor.manager;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;

import ftmk.rmi.sensor.TemperatureSensor;

public class TemperatureSensorManager extends UnicastRemoteObject implements TemperatureSensor {

	public TemperatureSensorManager() throws RemoteException {
		super();
	}

	@Override
	public int getTemperature() throws RemoteException {
		
		return 35;
	}

	@Override
	public HashMap<String, Integer> getTemperatureDays() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float getAverageTemperature() throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

}