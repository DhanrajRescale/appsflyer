package com.mixpanel.android.java_websocket.exceptions;

/* loaded from: classes2.dex */
public class IncompleteHandshakeException extends RuntimeException {
    private static final long serialVersionUID = 7906596804233893092L;

    /* renamed from: a, reason: collision with root package name */
    public final int f12111a;

    public IncompleteHandshakeException(int i10) {
        this.f12111a = i10;
    }

    public IncompleteHandshakeException() {
        this.f12111a = 0;
    }
}
