package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Mood Analyser Program");
        MoodAnalyser mood= new MoodAnalyser();
        //UC1 print SAD or HAPPY
        System.out.println(mood.MoodAnalyse("I am in Sad Mood")); // SAD
        System.out.println(mood.MoodAnalyse("I am in Happy Mood")); // HAPPY
        System.out.println(mood.MoodAnalyse("I am in Any Mood"));   // HAPPY
        }
    }
