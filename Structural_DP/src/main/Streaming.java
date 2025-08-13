package Structural_DP.src.main;

import Structural_DP.src.entities.Medias.*;
import Structural_DP.src.entities.decorators.HighResMediaDecorator;
import Structural_DP.src.entities.decorators.MediaDecorator;

import java.util.ArrayList;
import java.util.List;

public class Streaming {
    public static void main(String[] args) {

        List<Media> medias = new ArrayList<>();

        Media audio = new AudioMedia("vaibhav.mp3");
        Media video = new VideoMedia("vaibhav.mp4");
        Media image = new ImageMediaAdapter(new ImageMedia("vaibhav.jpg"));

        MediaDecorator highResVideo = new HighResMediaDecorator(video);

        medias.add(audio);
        medias.add(highResVideo);
        medias.add(image);

        MediaCollection mediaCollection= new MediaCollection(medias);

        System.out.println(mediaCollection.getFileName());
        mediaCollection.play();

    }
}
