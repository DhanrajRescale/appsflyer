package com.firebase.ui.auth;

import el.l;

/* loaded from: classes.dex */
public class FirebaseUiException extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final int f10892a;

    public FirebaseUiException(int i10) {
        this(i10, l.R0(i10));
    }

    public FirebaseUiException(int i10, String str) {
        super(str);
        this.f10892a = i10;
    }

    public FirebaseUiException(int i10, Throwable th2) {
        this(i10, l.R0(i10), th2);
    }

    public FirebaseUiException(int i10, String str, Throwable th2) {
        super(str, th2);
        this.f10892a = i10;
    }
}
