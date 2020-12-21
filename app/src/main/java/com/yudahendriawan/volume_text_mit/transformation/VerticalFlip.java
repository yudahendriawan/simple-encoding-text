package com.yudahendriawan.volume_text_mit.transformation;

public class VerticalFlip {

    public static String[][] verticalFlip(String[][] matrix) {
        String[][] verMatrix = new String[4][10];
        for (int i = 0; i < 4; i++) {
            System.arraycopy(matrix[3 - i], 0, verMatrix[i], 0, 10);
        }
        return verMatrix;
    }

}
