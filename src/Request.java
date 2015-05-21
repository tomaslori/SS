
public abstract class Request {
	
	public Router destination;
	public int reqSize;
	
	public Request (Router destination, int reqSize) {
		this.destination = destination;
		this.reqSize = reqSize;
	}
}
