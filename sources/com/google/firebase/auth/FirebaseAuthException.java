package com.google.firebase.auth;

import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.FirebaseException;

/* loaded from: classes2.dex */
public class FirebaseAuthException extends FirebaseException {

    /* renamed from: a, reason: collision with root package name */
    public final String f11651a;

    public FirebaseAuthException(String str, String str2) {
        super(str2);
        this.f11651a = Preconditions.checkNotEmpty(str);
    }
}
