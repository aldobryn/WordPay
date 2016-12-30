package com.dobryn.courcera.week1;

/**
 * Created by adobryn on 20.12.2016.
 */
public class CaesarCipher
{
    public char shiftChar(char ch, int key)
    {
        String punctMarks = " .,?!:";
        char curr = ch;
        if(punctMarks.indexOf(ch) > -1)
        {
            return ch;
        }
        else {
            if (Character.toLowerCase(curr) == curr) {
                curr = (char) (curr + key);

                if (curr > 'z')
                    curr = (char) (curr - 26);
                if (curr < 'a')
                    curr = (char) (curr + 26);
            } else {
                curr = (char) (curr + key);

                if (curr > 'Z')
                    curr = (char) (curr - 26);
                if (curr < 'A')
                    curr = (char) (curr + 26);
            }
        }
        return curr;
    }

    public String encrypt(String input, int key)
       {
           StringBuilder res = new StringBuilder();
           char curr;
           for(int i=0; i < input.length(); i++)
           {
               curr = shiftChar(input.charAt(i), key);
               res.append(curr);
           }
           return res.toString();
       }

    public String encryptTwoKeys(String input, int key1, int key2)
    {
        StringBuilder res = new StringBuilder();
        char curr;
        for(int i=0; i < input.length(); i++)
        {
            if(i%2 == 0)
                curr = shiftChar(input.charAt(i), key1);
            else
                curr = shiftChar(input.charAt(i), key2);
            res.append(curr);
        }
        return res.toString();
    }

}
