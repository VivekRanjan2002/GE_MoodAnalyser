package org.example;

public class MoodAnalyser {

    /*
    @desc: analyse mood according to the message given by user
    @params: String Message
    @return : String return mood HAPPY or SAD accordingly
     */
    public String MoodAnalyse(String message){
        if(message.equals("I am in Sad Mood")) return "SAD";
        return "HAPPY";
    }
}
