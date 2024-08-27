package com.mixpanel.android.util;

/* loaded from: classes2.dex */
public class RemoteService$ServiceUnavailableException extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final int f12116a;

    public RemoteService$ServiceUnavailableException(String str) {
        super("Service Unavailable");
        int i10;
        try {
            i10 = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            i10 = 0;
        }
        this.f12116a = i10;
    }
}
