import java.util.Queue;
public class ServiceStation {
    private Queue<Transport> infoAuto;
    public ServiceStation() {
        this.infoAuto = infoAuto;
    }

    public void addToQueue (Transport transport) {
        if (transport.needService()) {
            infoAuto.offer(transport);
        }
    }

    public void technicalInspection (Transport transport) {
        while (infoAuto.poll() != null) {
            System.out.println(infoAuto.poll());
        }
    }
}
