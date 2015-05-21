import java.util.ArrayList;
import java.util.List;


public class PacketRequest extends Request {

	public static int MAX_PACKET_SIZE = 100;
	public List<Packet> packets;
	
	public PacketRequest(Router destination, int reqSize) {
		super(destination, reqSize);
		packets = new ArrayList<Packet>();
		int remainigSize = reqSize;
		while (remainigSize > 0) {
			int packetSize = (remainigSize > MAX_PACKET_SIZE)? MAX_PACKET_SIZE : remainigSize;
			List<Router> path = new ArrayList<Router>();
			path.add(destination);
			packets.add(new Packet(path, packetSize));
			remainigSize -= packetSize;
		}
	}
}
