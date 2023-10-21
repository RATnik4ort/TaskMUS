package com.host;

import java.util.*;

public class aa {
    private byte num = 0;
    public aa() {
        String[][] d = new String[12][20];
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[i].length; j++) {
                d[i][j] = rez();
                if (d[i][j].equals("NaN")) {
                    continue;
                } else {
                    System.out.println((i+1)+"."+(j+1)+": "+d[i][j]);
                    this.num++;
                }
            }
        }
        System.out.println(this.num);
    }

    private String rez() {
        int[] d = new int[12];
        float[] x = new float[20];
        Random r = new Random();
        double X;
        int a = 4;
        float x2 = 0;
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < x.length; j++) {
                d[i] = a;
                a++;
                X = x[j] = r.nextFloat(-7, 12);
                if (d[i] == 13) {                    
                    x2 = (float)(Math.pow((Math.asin(1/4*((X+2.5)/19))/2), 3));
                    break;
                } else if (d[i] == 6 || d[i] == 7 || d[i] == 8 || d[i] == 9 || d[i] == 14 || d[i] == 15) {
                    x2 = (float)(Math.tan(Math.pow(Math.pow(Math.E, X), (1/4)/X)));
                    break;
                } else {
                    x2 = (float)(Math.pow(Math.log10(Math.pow(Math.tan((Math.pow(Math.E, X)+1)/(Math.pow(0.5 / X, X))), 2)), 2/3-Math.atan(Math.pow(Math.pow((X+2.5)/19, 2), 2))));
                    break;
                }

            }
            break;
        }
        String For = String.format("%.4f", x2);
        return For;
    }
}