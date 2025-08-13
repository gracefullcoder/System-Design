package Structural_DP.src.entities.decorators;

import Structural_DP.src.entities.Medias.Media;

public class HighResMediaDecorator extends MediaDecorator{

    public HighResMediaDecorator(Media media){
        super(media);
    }

    @Override
    public void play(){
        super.play();
        System.out.println("Now Streaming High Quality Media of " + super.getFileName());
    }
}
