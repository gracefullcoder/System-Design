package Structural_DP.src.entities.Medias;

public class AudioMedia implements Media {

    private String fileName;

    public AudioMedia(String fileName){
        this.fileName = fileName;
    }

    @Override
    public String getFileName() {
        return this.fileName;
    }

    @Override
    public void play() {
        System.out.println("Playing Audio File " + this.fileName);
    }
}
