package com.dobryn.courcera.week1;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by adobryn on 27.12.2016.
 */
public class WordLengths
{
    public void countWordLengths(File resource, int[] counts)
    {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(resource));
            String text;

            while ((text = reader.readLine()) != null) {

                Pattern pattern = Pattern.compile("\\b[^\\s]+\\b");
                Matcher matcher = pattern.matcher(text);
                while (matcher.find())
                {
                    counts[matcher.group().length()]++;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
            }
        }
    }

    public int indexOfMax(int[] counts)
    {
        int max_index = 0;

        for(int i=0; i < counts.length; i++)
        {
             if(counts[i] > counts[max_index])
             {
                 max_index = i;

             }
        }
        return max_index;
    }
}
