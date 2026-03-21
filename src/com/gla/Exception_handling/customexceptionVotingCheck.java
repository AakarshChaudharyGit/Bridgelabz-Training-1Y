package com.gla.Exception_handling;

class CustomException extends Exception{
    CustomException(String message) {
        super(message);
    }
}

public class customexceptionVotingCheck {

    public static void checkVoteValidity(int age) throws CustomException {
        if (age < 18) {
            throw new CustomException("Not eligible to vote");
        } else {
            System.out.println("Eligible to vote");
        }
    }

    public static void main(String[] args) {
        int age = 16;

        try {
            checkVoteValidity(age);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
}
