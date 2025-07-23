package structural.proxy.virtualProxy;

// Real subject - expensive to create
public class HighResolutionImage implements Image {
    private String filename;
    private byte[] imageData;

    public HighResolutionImage(String filename) {
        this.filename = filename;
        loadFromDisk(); // Expensive operation
    }

    private void loadFromDisk() {
        System.out.println("Loading high resolution image: " + filename);
        // Simulate expensive loading operation
        try {
            Thread.sleep(2000); // Simulate delay
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        this.imageData = new byte[1024 * 1024]; // Simulate large image data
        System.out.println("Image loaded: " + filename);
    }

    @Override
    public void display() {
        System.out.println("Displaying image: " + filename);
    }

    @Override
    public String getInfo() {
        return "High resolution image: " + filename + " (Size: " + imageData.length + " bytes)";
    }
}
