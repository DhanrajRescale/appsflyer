package com.google.android.gms.internal.p002firebaseauthapi;

import okhttp3.HttpUrl;
import s0.g;

/* loaded from: classes2.dex */
public enum zzajm {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(g.f34069a)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(HttpUrl.FRAGMENT_ENCODE_SET),
    BYTE_STRING(zzaff.zzb),
    ENUM(null),
    MESSAGE(null);

    private final Object zzk;

    zzajm(Object obj) {
        this.zzk = obj;
    }
}
