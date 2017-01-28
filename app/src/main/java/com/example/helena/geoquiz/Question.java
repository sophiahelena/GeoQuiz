package com.example.helena.geoquiz;

/**
 * Created by helena on 5/12/16.
 */

public class Question {
    private int mTextResId;
    private boolean mAnswerTrue;

    /**
     * Constructor
     * @param textResId
     * @param answerTrue
     */
    public Question(int textResId, boolean answerTrue){
        //el prefijo m es el indicativo de una variable miembro
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
    }

    // Getters and Setters
    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }




}
