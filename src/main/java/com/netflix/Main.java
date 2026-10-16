package com.netflix;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println("Netflix 2.0\n");

        String favMovieTitle = "The Princess Diaries";
        String favMovieGenre = "Horror";
        int yearReleased = 2001;
        int movieDurationMins = 115;
        int timesWatched = 6;
        String favStreamingPlatform = "Hulu";
        double timeSpentWatchingHrs = 18.5;
        float favMovieRating = 8.5f;
        double timeSpentWatchingPerMonth = timeSpentWatchingHrs * 4;
        String interestingFact = "I love falling asleep to nostalgic movies from childhood";

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("--- ~ Sama's Movie Profile ~ ---");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("1. My favorite movie: " + favMovieTitle);
        System.out.println("2. My favorite genre: " + favMovieGenre);
        System.out.println("3. The release year: " + yearReleased);
        System.out.println("4. Movie duration: " + movieDurationMins + " mins");
        System.out.println("5. How many times I've watched it: " + timesWatched + " times");
        System.out.println("6. My favorite streaming platform: " + favStreamingPlatform);
        System.out.println("7. Time spent watching movies/series per week: " + timeSpentWatchingHrs + " hrs");
        System.out.println("8. My movie rating: " + favMovieRating + " / 10");

        System.out.println("\n");

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Bonus Challenge:");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("1. Time spent watching per month: " + timeSpentWatchingPerMonth + " hrs");
        System.out.println("2. Interesting Fact: " + interestingFact + ".");

        String funFactAboutMe = "I lived in NYC for almost a year";
        System.out.println(funFactAboutMe+ "\n\n");

        ArrayList<String> movies = new ArrayList<>();
        movies.add("Avatar");
        movies.add("Titanic");
        movies.add("Spree");
        movies.add("Obsession");
        System.out.println(movies);

        // IN CLASS EXERCISE ----->

//        double moneyReceived = 100;
//        boolean isInvited; // default is false, do NOT need to assign a value
//        if (moneyReceived < 50) {
//            isInvited = false;
//        } else if (moneyReceived > 200) {
//            isInvited = true;
//            String thankYouNote = "I love you!";
//            System.out.println(thankYouNote);
//        } else {
//            isInvited = true;
//        }



    }

}
