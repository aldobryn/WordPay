package com.dobryn.courcera.week1;

import java.io.File;

public class Main {

    public static void main(String[] args)
    {
        WordLengths wl = new WordLengths();
        File wordsFile = new File("C:\\Users\\adobryn\\WordPay\\small.txt");
        int[] words = new int[20];
        wl.countWordLengths(wordsFile, words);
        for(int i=1; i<20; i++)
        {
            if(words[i] > 0)
                System.out.println(i + ": " + words[i]);
        }

        System.out.println(wl.indexOfMax(words));

    }
}
