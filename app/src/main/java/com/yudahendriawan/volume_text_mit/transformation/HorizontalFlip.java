package com.yudahendriawan.volume_text_mit.transformation;

public class HorizontalFlip {

    public static String[][] horizontalFlip(String[][] matrix) {
        String[][] horMatrix = new String[4][10];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                horMatrix[i][j] = matrix[i][9 - j];
            }
        }
        return horMatrix;
    }

}
