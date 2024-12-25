package com.anweb.Finance.loan.model;

public class JwtResponse {
    private String jwtToken;
    private String user;

    // Constructor
    private JwtResponse(String jwtToken, String user) {
        this.jwtToken = jwtToken;
        this.user = user;
    }

    // Getters
    public String getJwtToken() {
        return jwtToken;
    }

    public String getUser() {
        return user;
    }

    // Builder class
    public static class Builder {
        private String jwtToken;
        private String user;

        public Builder jwtToken(String jwtToken) {
            this.jwtToken = jwtToken;
            return this;
        }

        public Builder user(String user) {
            this.user = user;
            return this;
        }

        public JwtResponse build() {
            return new JwtResponse(jwtToken, user);
        }
    }
}
