import java.util.Dictionary;
import java.util.List;



public class CircuitRouter extends Router {
	
	public int usedBandwidth;

	public CircuitRouter(List<Behaviour> behaviours, Dictionary<Router, List<Router>> routeTable, List<Frontier> frontiers, int totalBandwidth) {
		super(behaviours, routeTable, frontiers, totalBandwidth);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void trySendRequest(Request req) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifyRequestSent(Request req) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int expectedDelay() {
		// TODO Auto-generated method stub
		return 0;
	}


}
