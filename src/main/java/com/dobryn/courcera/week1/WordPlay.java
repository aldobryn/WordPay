package com.dobryn.courcera.week1;

/**
 * Created by adobryn on 20.12.2016.
 */
public class WordPlay
{
    public boolean isVowel(char ch)
    {
        String vows = "AEIOUaeiou";
        if (vows.indexOf(ch) > -1)
            return true;
        return false;
    }

    public String replaceVowels(String phrase, char ch)
    {
        StringBuilder res = new StringBuilder(phrase);

        for (int i = 0; i < res.length(); i++)
        {
            if(isVowel(res.charAt(i)))
            {
                res.setCharAt(i, ch);
            }
        }
        return res.toString();
    }

    public String emphasize(String phrase, char ch)
    {
        StringBuilder res = new StringBuilder();
        char tmp;
        for (int i = 0; i < phrase.length(); i++) {
            tmp = phrase.charAt(i);
            if (tmp == ch) {
                if (i % 2 == 0)
                    res.append('*');
                else
                    res.append('+');
            } else {
                res.append(tmp);
            }
        }
        return res.toString();
    }
}
