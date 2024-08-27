package com.firebase.ui.auth.data.model;

import com.firebase.ui.auth.FirebaseUiException;

/* loaded from: classes.dex */
public class PhoneNumberVerificationRequiredException extends FirebaseUiException {

    /* renamed from: b, reason: collision with root package name */
    public final String f10903b;

    public PhoneNumberVerificationRequiredException(String str) {
        super(4, "Phone number requires verification.");
        this.f10903b = str;
    }
}
