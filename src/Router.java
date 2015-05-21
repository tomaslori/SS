import java.util.Dictionary;
import java.util.List;


public abstract class Router {

	private List<Behaviour> behaviours;
	public Dictionary<Router, List<Router>> routeTable;
	public List<Frontier> frontiers;
	public int totalBandwidth;
	
	
	public Router (List<Behaviour> behaviours, Dictionary<Router, List<Router>> routeTable, List<Frontier> frontiers, int totalBandwidth) {
		this.behaviours = behaviours;
		this.routeTable = routeTable;
		this.frontiers = frontiers;
		this.totalBandwidth = totalBandwidth;
	}
	
	public abstract int expectedDelay();
	public abstract void trySendRequest(Request req);
	public abstract void notifyRequestSent(Request req);

	protected void resolvePath (Request req) {
		
		if (routeTable.get(req.destination) == null) { // not mapped in this network..
			
			// TODO: get best route (minimum expected delay)
			
		}

	}
	
}
