import java.util.Scanner;
public final class TrackerMain {

    private TrackerMain() {

    }

    public static void main(String[] args) {
        try (TorrentTracker torrenttracker = new TorrentTracker()) {
            torrenttracker.start();
            System.out.print("Run!");
            int i = 0;
            Scanner scanner = new Scanner(System.in);
            while (true) {
                if (scanner.hasNext()) {
                    String command = scanner.next();
                    System.out.println(command);
                    if (command.equals("exit")) {
                        break;
                    }
                }
            }
        }
    }
}
