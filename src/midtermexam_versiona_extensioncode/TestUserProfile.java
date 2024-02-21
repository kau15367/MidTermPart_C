/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 * The user profile for the OnlineVids system. The user has a userID
 * and a favourite genre that must be one of the choices in the
 * genres array. This code is to be used for SYST 17796 midterm exam.
 * Students are reminded to add themselves as modifiers when editing the
 * code.
 * @author dancye, 2019
 */
public class TestUserProfile 
        
{
    public static void main(String[] args) {
        
        
    }
    
    private String userID;//the userID
    private String genre;// the user's preferred genre of movie
    private String[] genres = {"Comedy", "Drama", "Action", "Mystery"};//available genres of movies
    
    /**
     * A constructor that takes in the userID and the favourite genre
     * @param givenID the ID to assign to this user
     * @param givenGenre the users favourite genre
     */
    public TestUserProfile(String givenID, String givenGenre)
    {
        userID = givenID;
        genre= givenGenre;
    }

    /**
     * A getter for the userID
     * @return the userID
     */
    public String getUserID() {
        return userID;
    }

    /**
     * @param userID the userID to set
     */
    public void setUserID(String userID) {
        this.userID = userID;
    }

    /**
     * A getter for the genre
     * @return the genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * @param genre the genre to set
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    
    
    
    
//end class

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String userID=scanner.nextLine();
        System.out.println("Available genres: Comedy, Drama, Action, Mystery");
        System.out.print("Choose your favorite genre: ");
        String chosenGenre = scanner.nextLine();

        String[] genres = {"Comedy", "Drama", "Action", "Mystery"};
        boolean validGenre = false;
        for (String genre : genres) {
            if (genre.equalsIgnoreCase(chosenGenre)) {
                validGenre = true;
                break;
            }
        }
        if (validGenre) {
            UserProfile userProfile = new UserProfile(userID,chosenGenre);
            System.out.println("User Profile created successfully!");
            System.out.println("User ID: " + userProfile.getUserID());
            System.out.println("Favorite Genre: " + userProfile.getGenre());
        } else {
            System.out.println("Invalid genre choice. Please choose from the available genres.");
        }

        scanner.close();


}
}
