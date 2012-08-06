package com.tweener.android.users;

public class User
{
    private String username;

    public User(final String username)
    {
        setUsername(username);
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(final String username)
    {
        this.username = username;
    }
}
