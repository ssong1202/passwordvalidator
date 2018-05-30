package com.example.song.passwordvalidator;
// song sheng nan
public class Validator {
    private int x;
    public int Valid(String password){
        x=0;
        //the word cannot be the 'password'
        if(!password.equals("password")&&password.length()>=8){
            x++;
        }
        //the word's length is at leat 8
        if (password.length()>=8){
            x++;
        }
        //the word contians number
        if (password.matches(".*[0-9].*")&&password.length()>=8){
            x++;
        }
        //the word contains small letter
        if (password.matches(".*[a-z].*")&&password.length()>=8){
            x++;
        }
        //the word contains large letter
        if (password.matches(".*[A-Z].*")&&password.length()>=8){
            x++;
        }
        return x;
    }
}
