package Structural_DP.src.entities.Medias;

//Adapter Design Pattern as play function was not compatible so created an adapter for the image
public class ImageMediaAdapter implements Media {
    ImageMedia image;

    public ImageMediaAdapter(ImageMedia image) {
        this.image = image;
    }

    @Override
    public void play(){
        this.image.display();
    }

    @Override
    public String getFileName(){
        return this.image.getFileName();
    }
}
