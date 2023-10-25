package com.dillo.hibernateuser;

import com.dillo.hibernateuser.controller.UserService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	UserService obj = new UserService();
    	obj.createUser();
    }
}
