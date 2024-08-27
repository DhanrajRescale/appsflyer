package com.firebase.ui.auth;

import zp.d;

/* loaded from: classes.dex */
public class FirebaseUiUserCollisionException extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final int f10893a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10894b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10895c;

    /* renamed from: d, reason: collision with root package name */
    public final d f10896d;

    public FirebaseUiUserCollisionException(String str, String str2, d dVar) {
        super("Recoverable error.");
        this.f10893a = 13;
        this.f10894b = str;
        this.f10895c = str2;
        this.f10896d = dVar;
    }
}
