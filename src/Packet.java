import java.util.List;

public class Packet {

	public List<Router> path;
	public int size;
	public boolean sent;
	public boolean received;
	
	public Packet (List<Router> path, int size) {
		this.path = path;
		this.size = size;
		sent = false;
		received = false;
	}
	
}
