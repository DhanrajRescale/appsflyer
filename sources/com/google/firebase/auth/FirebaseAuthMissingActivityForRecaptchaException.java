package com.google.firebase.auth;

/* loaded from: classes2.dex */
public class FirebaseAuthMissingActivityForRecaptchaException extends FirebaseAuthException {
    public FirebaseAuthMissingActivityForRecaptchaException() {
        super("ERROR_MISSING_ACTIVITY", "App verification failed - a valid Activity is required to complete the Recaptcha flow");
    }
}
