package proxy;

import lombok.Getter;

@Getter
public class RealImage implements Image{
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        this.loadFromDisk();
    }

    public void display() {
        System.out.println("IMAGE " + fileName + " displayed");
    }

    public void loadFromDisk() {
        System.out.println("IMAGE " + fileName + " loaded from disk");
    }
}
