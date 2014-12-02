import java.util.Vector;

import javax.bluetooth.RemoteDevice;

import BITalino.*;


public class test {
	
	public static Frame[] dataAcquired;
	
	public static void main(String[] args) throws Throwable {
	
		BITalino device = new BITalino();
		
		// find devices
		Vector<RemoteDevice> devices = device.findDevices();
		System.out.println(devices);
		
		// connect to BITalino device
		String macAddress = "00:12:12:31:11:04";
		int SamplingRate = 1000;
		device.open(macAddress,SamplingRate);
		
		//get BITalino version
		String versionName = device.version();
		
		// start acquisition on analog channels 0 and 4
		int[] aChannels = {0,4};
		device.start(aChannels);
		
		//read 300 samples
		dataAcquired = device.read(2000);
		
		// trigger digital outputs
		int[] digital = {1,1,1,1};
		device.trigger(digital);
		
		// stop acquisition
		device.stop();
		
		//close bluetooth connection
		device.close();
		
		
	}
	
}