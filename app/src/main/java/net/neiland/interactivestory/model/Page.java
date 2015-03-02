package net.neiland.interactivestory.model;

/**
 * Created by Steven on 3/1/2015.
 */
public class Page {
    private int mImageId;
    private String mText;
    private Choice mChoice1;
    private Choice mChoice2;
    private boolean mIsFinal = false;

    public boolean isFinal() {
        return mIsFinal;
    }

    public void setFinal(boolean isFinal) {
        mIsFinal = isFinal;
    }

    public Page(int imageId, String text){
        setImageId(imageId);
        setText(text);
        setChoice1(null);
        setChoice2(null);
        setFinal(true);
    }

    public Page(int imageId, String text, Choice choice1, Choice choice2){
        setImageId(imageId);
        setText(text);
        setChoice1(choice1);
        setChoice2(choice2);
    }

    public Choice getChoice2() {
        return mChoice2;
    }

    public void setChoice2(Choice choice2) {
        mChoice2 = choice2;
    }

    public int getImageId() {
        return mImageId;
    }

    public void setImageId(int imageId) {
        mImageId = imageId;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public Choice getChoice1() {
        return mChoice1;
    }

    public void setChoice1(Choice choice1) {
        mChoice1 = choice1;
    }

}
