package com.example.aaaaa.imooc_game.utils;

import android.graphics.Bitmap;

/**
 * Created by AAAAA on 2016/5/24.
 */
public class ImagePiece {
    private int index;
    private Bitmap bitmap;

    public ImagePiece(){

    }
    public ImagePiece(int index, Bitmap bitmap) {
        this.index = index;
        this.bitmap = bitmap;
    }
    public int getIndex()
    {
        return index;
    }

    public void setIndex(int index)
    {
        this.index = index;
    }

    public Bitmap getBitmap()
    {
        return bitmap;
    }

    public void setBitmap(Bitmap bitmap)
    {
        this.bitmap = bitmap;
    }

    public String toString(){
        return "ImagePiece [index="+index+", bitmap=" + bitmap + "]";
    }
}
