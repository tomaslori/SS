
// TODO: Para extenderla facil y rapido usar las distribuciones de org.apache.commons.math.distribution.
public abstract class Distribution {

	public double mean;
	public double stdDev;
	
	public Distribution (double mean, double stdDev) {
		this.mean = mean;
		this.stdDev = stdDev;
	}
	
	public abstract float getRandom();
	
}
