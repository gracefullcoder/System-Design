package Structural_DP.src.main;

import Structural_DP.src.entities.Medias.Media;

import java.util.ArrayList;
import java.util.List;

public class MediaCollection implements Media {

    List<Media> medias;

    public MediaCollection(List<Media> medias){
        this.medias = medias;
    }

    public MediaCollection(){
        this.medias = new ArrayList<>();
    }

    public void addMedia(Media media){
        this.medias.add(media);
    }


    //this both functions are example of composite desgin pattern where object and the collection of the object
    //are implementing same interface and corresponding methods are implemented in both collection and object and are working
    @Override
    public String getFileName() {
        StringBuilder sb = new StringBuilder("");

        for(Media media: this.medias){
            sb.append(media.getFileName() + "\n");
        }

        return sb.toString();
    }

    @Override
    public void play() {
        for(Media media: this.medias){
            media.play();
        }
    }
}
