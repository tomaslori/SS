import java.util.Dictionary;
import java.util.List;
import java.util.Queue;


public class PacketRouter extends Router {

	private Queue<Packet> packetsQueue;
	
	public PacketRouter(List<Behaviour> behaviours, Dictionary<Router, List<Router>> routeTable, List<Frontier> frontiers, int totalBandwidth) {
		super(behaviours, routeTable, frontiers, totalBandwidth);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void trySendRequest(Request req) {
		PacketRequest preq = new PacketRequest(req.destination, req.reqSize);
		// TODO
	}

	@Override
	public void notifyRequestSent(Request req) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public int expectedDelay() {
		int sum = 0;
		for (Packet each : packetsQueue)
			sum += each.size;
		return (int) Math.ceil(sum/totalBandwidth);
	}

	
}
