package com.google.android.recaptcha.internal;

import okhttp3.HttpUrl;
import s0.g;

/* loaded from: classes2.dex */
public enum zzjw {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(g.f34069a)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(HttpUrl.FRAGMENT_ENCODE_SET),
    BYTE_STRING(zzez.zzb),
    ENUM(null),
    MESSAGE(null);

    private final Object zzk;

    zzjw(Object obj) {
        this.zzk = obj;
    }
}
