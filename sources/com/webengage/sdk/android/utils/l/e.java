package com.webengage.sdk.android.utils.l;

import java.io.Serializable;

/* loaded from: classes2.dex */
public enum e implements Serializable {
    GET("GET"),
    POST("POST"),
    PUT("PUT"),
    DELETE("DELETE");


    /* renamed from: f, reason: collision with root package name */
    private String f12951f;

    e(String str) {
        this.f12951f = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f12951f;
    }
}
