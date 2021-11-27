package proxy;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        // the image will be loaded from a disk only once
        ProxyImage proxyImage = new ProxyImage("src/java/data/images/image.jpeg");
        proxyImage.display();

        proxyImage.display();
    }
}
