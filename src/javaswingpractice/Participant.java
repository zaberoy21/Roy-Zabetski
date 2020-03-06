/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswingpractice;

/**
 *
 * @author zaberoy21
 */
public class Participant
{
    private String firstName;
    private String lastName;
    private int tier;

    public Participant(String firstName, String lastName, int tier)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.tier = tier;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getlastName()
    {
        return lastName;
    }

    public int getTier()
    {
        return tier;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public void setLastName(String LastName)
    {
        this.lastName = lastName;
    }

    public void setTier(int tier)
    {
        this.tier = tier;
    }
    
    public String toString()
    {
        return firstName + " " + lastName;
    }
    
}
