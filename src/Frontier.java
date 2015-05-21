import java.util.Dictionary;
import java.util.List;


public abstract class Frontier extends Router {

	public Frontier(List<Behaviour> behaviours, Dictionary<Router, List<Router>> routeTable, List<Frontier> frontiers, int totalBandwidth) {
		super(behaviours, routeTable, frontiers, totalBandwidth);
	}

}
