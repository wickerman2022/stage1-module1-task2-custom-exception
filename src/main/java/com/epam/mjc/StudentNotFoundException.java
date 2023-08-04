package com.epam.mjc;


public class StudentNotFoundException extends IllegalArgumentException {
    
    public StudentNotFoundException(long studentID) {
        super("Could not find student with ID " + studentID);
    }
}
