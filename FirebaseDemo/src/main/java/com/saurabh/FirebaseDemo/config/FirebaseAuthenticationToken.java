package com.saurabh.FirebaseDemo.config;
import org.springframework.security.authentication.AbstractAuthenticationToken;

public class FirebaseAuthenticationToken extends AbstractAuthenticationToken{

    private final String uid;
    private final String username;
    private final Object credentials;

    public FirebaseAuthenticationToken(String uid,String username, Object credentials) {
        super(null);
        this.uid = uid;
        this.username = username;
        this.credentials = credentials;
        setAuthenticated(true);
        System.out.println("id: "+uid + " username: "+ username + " cred: "+ credentials.toString());
    }


    @Override
    public Object getCredentials() {
        return credentials;
    }

    @Override
    public Object getPrincipal() {
        return uid;
    }
}
