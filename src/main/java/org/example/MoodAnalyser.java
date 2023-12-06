package org.example;

public class MoodAnalyser {
    private String message;
    public MoodAnalyser(){
    message=null;
    }
    public MoodAnalyser(String message){
        this.message=message;
        System.out.println(MoodAnalyse());
    }

    /*
    @desc: analyse mood according to the message given by user using try catch
      block if empty message then handle by first catch block if null message then
       handle by second catch block
    @return : String return mood HAPPY or SAD accordingly
     */
    private String MoodAnalyse(){
        String sad= "I am in Sad Mood";
           try {
               if ((message.length() / message.length()) == 1 && message.equals(sad)) {
                   return "SAD";
               }
               return "HAPPY";

           }
           catch(ArithmeticException e){
               System.out.println("oops! You provided empty String");
               return "HAPPY";
           }
           catch(Exception e){
               System.out.println("oops! You provided null String");
               return "HAPPY";
           }
    }
}
