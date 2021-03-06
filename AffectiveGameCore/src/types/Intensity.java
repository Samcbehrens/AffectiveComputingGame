package types;
/**@author sambehrens
 *This creates the intensity type which is used in the emotion type. Intensity is a float 
 */
public class Intensity {
	private float intensity;
	
	/*
	 * constructor for intensity
	 */
	public Intensity(float constructorIntensity){
		this.intensity=constructorIntensity;
	}
	/*
	 * setter method for intensity
	 */
	public void setIntensity(float newIntensity){
		this.intensity=newIntensity;
	}
	
	/*
	 * getter method for intensity
	 */
	public float getIntensity(){
		return this.intensity;
	}
}
