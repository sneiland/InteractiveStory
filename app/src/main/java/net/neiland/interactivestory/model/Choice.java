package net.neiland.interactivestory.model;

/**
 * Created by Steven on 3/1/2015.
 */
public class Choice {
    private String mText;
    private int mNextPage;

    public Choice(String text, int nextPage){
        setText(text);
        setNextPage(nextPage);
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public int getNextPage() {
        return mNextPage;
    }

    public void setNextPage(int nextPage) {
        mNextPage = nextPage;
    }
}
