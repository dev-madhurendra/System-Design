package structural.proxy.virtualProxy;

// Virtual Proxy - implements lazy loading
public class ImageProxy implements Image {
    private String filename;
    private HighResolutionImage realImage;

    public ImageProxy(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new HighResolutionImage(filename);
        }
        realImage.display();
    }

    @Override
    public String getInfo() {
        if (realImage == null) {
            return "Image proxy: " + filename + " (Not loaded yet)";
        }
        return realImage.getInfo();
    }
}
