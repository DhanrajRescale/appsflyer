package com.google.firebase.remoteconfig;

/* loaded from: classes2.dex */
public class FirebaseRemoteConfigServerException extends FirebaseRemoteConfigException {

    /* renamed from: a, reason: collision with root package name */
    public final int f11851a;

    public FirebaseRemoteConfigServerException(int i10, String str) {
        super(str);
        this.f11851a = i10;
    }

    public FirebaseRemoteConfigServerException(int i10, String str, FirebaseRemoteConfigServerException firebaseRemoteConfigServerException) {
        super(str, firebaseRemoteConfigServerException);
        this.f11851a = i10;
    }

    public FirebaseRemoteConfigServerException(int i10, String str, int i11) {
        super(str);
        this.f11851a = i10;
    }

    public FirebaseRemoteConfigServerException(String str) {
        super(str);
        this.f11851a = -1;
    }
}
