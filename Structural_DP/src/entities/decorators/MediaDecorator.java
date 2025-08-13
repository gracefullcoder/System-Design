package Structural_DP.src.entities.decorators;

import Structural_DP.src.entities.Medias.Media;

public abstract class MediaDecorator implements Media {
    private Media decoratedMedia;

    public MediaDecorator(Media decoratedMedia){
        this.decoratedMedia = decoratedMedia;
    }

    @Override
    public void play(){
        decoratedMedia.play();
    }

    @Override
    public String getFileName() {
        return decoratedMedia.getFileName();
    }
}
