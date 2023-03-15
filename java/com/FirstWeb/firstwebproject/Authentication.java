package com.FirstWeb.firstwebproject;

import org.springframework.stereotype.Service;

@Service
public class Authentication {

    public Authentication() {
    }

    public boolean authemticate(String name, String password){

        boolean Vname= name.equalsIgnoreCase("sami");
        boolean Vpass=password.equalsIgnoreCase("1234");
        return Vname && Vpass;
    }

}
