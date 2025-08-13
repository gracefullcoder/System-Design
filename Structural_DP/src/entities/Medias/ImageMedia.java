package Structural_DP.src.entities.Medias;


//Adapter Design Pattern as play function was not compatible so created an adapter for the image
public class ImageMedia {

    private String fileName;

    public ImageMedia(String fileName){
        this.fileName = fileName;
        System.out.println("Image Media Created");
    }

    public String getFileName() {
        return this.fileName;
    }
    
    public void display(){
        System.out.println("Displaying Image " + this.fileName);
    }
}
