
public class Behaviour {
	
	public Router source;
	public Router destination;
	public Distribution frequencyDistr;
	public Distribution sizeDistr;
	private int nextRequest;
	
	public Behaviour (Router destination, Distribution frequencyDistr, Distribution sizeDistr) {
		this.destination = destination;
		this.frequencyDistr = frequencyDistr;
		this.sizeDistr = sizeDistr;
		this.nextRequest = 0;
	}
	
	public void Update() {
		nextRequest--;
		
		if (nextRequest > 0)
			return;
		
		nextRequest = Math.round(frequencyDistr.getRandom());
		AppRequest req = new AppRequest(destination, Math.round(sizeDistr.getRandom()));
		source.trySendRequest(req);
		destination.notifyRequestSent(req);
	}

}
