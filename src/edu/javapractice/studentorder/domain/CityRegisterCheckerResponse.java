package edu.javapractice.studentorder.domain;

public class CityRegisterCheckerResponse
{
    private boolean existing;
    private Boolean temporal = null; // may equal null

    public CityRegisterCheckerResponse(boolean existing, Boolean temporal) {
        this.existing = existing;
        this.temporal = temporal;
    }
}
