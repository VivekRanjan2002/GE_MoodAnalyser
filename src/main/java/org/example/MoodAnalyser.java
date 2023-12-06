package org.example;

public class MoodAnalyser {
    private String message;
    public MoodAnalyser(){
    message="";
    }
    public MoodAnalyser(String message){
        this.message=message;
        System.out.println(MoodAnalyse());
    }

    /*
    @desc: analyse mood according to the message given by user
    @return : String return mood HAPPY or SAD accordingly
     */
    private String MoodAnalyse(){
        if(message.equals("I am in Sad Mood")) return "SAD";
        return "HAPPY";
    }
}
