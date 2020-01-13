package nyandoro.kapadokia.miwork;

import android.widget.ImageView;

public class Word {

    private String miwork;
    private String defaultTranslation;
    private int imageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED= -1;
    //empty constructor constructor
    public Word(){

    }

    public Word(String mMiworkTranslation,String mDefaultTranslation){
      miwork =mMiworkTranslation;
      defaultTranslation=mDefaultTranslation;

    }

    //a constructor to accomodate three parmeters, image resource ID is included here
    public Word(String mMiworkTranslation,String mDefaultTranslation,int imageResourceId){
        miwork =mMiworkTranslation;
        defaultTranslation=mDefaultTranslation;
        this.imageResourceId = imageResourceId;

    }

    public String getMiworkTranslation() {
        return miwork;
    }

    public void setMiworkTranslation(String miwork) {
        this.miwork = miwork;
    }

    public String getdefaultTranslation() {
        return defaultTranslation;
    }

    public void setDefaultTranslation(String defaultTranslation) {
        this.defaultTranslation = defaultTranslation;
    }
    public int getImageResourceId() {
        return imageResourceId;
    }

    //returns an image resource ID
    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }

    //check if the activity has an image
    public boolean hasImage(){
        return imageResourceId !=NO_IMAGE_PROVIDED;
    }
}
