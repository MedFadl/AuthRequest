package com.medhat.security;


import jakarta.security.enterprise.authentication.mechanism.http.OpenIdAuthenticationMechanismDefinition;

@OpenIdAuthenticationMechanismDefinition(
        providerURI =
                "http://localhost:8080/realms/AuthRequestRealm/.well-known/openid-configuration",
        clientId =
                "authrequest",
        clientSecret =
                "",
        redirectToOriginalResource
                = true
)

//will proceed later because oven fe kza method c:

public class SecurityConfig {
}
