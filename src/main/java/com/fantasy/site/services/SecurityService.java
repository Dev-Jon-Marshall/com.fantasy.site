package com.fantasy.site.services;

/**
 * Created by Jonathan.Marshall on 6/1/2017.
 */
public interface SecurityService
{
    String findLoggedInUsername();

    void autologin(String username, String password);
}
