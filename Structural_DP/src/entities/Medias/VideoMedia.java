package Structural_DP.src.entities.Medias;

public class VideoMedia implements Media {
  private String fileName;

    public VideoMedia(String fileName){
        this.fileName = fileName;
    }

    @Override
    public String getFileName() {
        return this.fileName;
    }

    @Override
    public void play() {
        System.out.println("Playing Video File " + this.fileName);
    }
}
