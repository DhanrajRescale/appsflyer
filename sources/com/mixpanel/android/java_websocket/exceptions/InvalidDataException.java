package com.mixpanel.android.java_websocket.exceptions;

/* loaded from: classes2.dex */
public class InvalidDataException extends Exception {
    private static final long serialVersionUID = 3731842424390998726L;

    /* renamed from: a, reason: collision with root package name */
    public final int f12112a;

    public InvalidDataException(int i10) {
        this.f12112a = i10;
    }

    public InvalidDataException(int i10, String str) {
        super(str);
        this.f12112a = i10;
    }

    public InvalidDataException(int i10, Exception exc) {
        super(exc);
        this.f12112a = i10;
    }
}
