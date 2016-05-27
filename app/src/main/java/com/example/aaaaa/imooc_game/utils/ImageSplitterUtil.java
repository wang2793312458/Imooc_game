package com.example.aaaaa.imooc_game.utils;

import android.graphics.Bitmap;

import java.util.ArrayList;
import java.util.List;

/*
 *
 * @param bitmap
 * @param piece
 *            切成piece*piece块
 * @return List<ImagePiece>
 */

public class ImageSplitterUtil {
    //静态方法
    public static List<ImagePiece> splitImage(Bitmap bitmap, int piece) {
        List<ImagePiece> imagePieces = new ArrayList<ImagePiece>();

        int width = bitmap.getWidth();
        int height = bitmap.getHeight();

        //正方形图片宽度
        int pieceWidth = Math.min(width, height) / piece;
        //通过for循环来切割图片
        for (int i = 0; i < piece; i++) {
            for (int j = 0; j < piece; j++) {
                ImagePiece imagePiece = new ImagePiece();
                imagePiece.setIndex(j + i * piece);

                int x = j * pieceWidth;
                int y = i * pieceWidth;

                imagePiece.setBitmap(Bitmap.createBitmap(bitmap, x, y, pieceWidth, pieceWidth));
                imagePieces.add(imagePiece);
            }
        }
        return imagePieces;
    }
}
