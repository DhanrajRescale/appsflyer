package com.google.protobuf;

import java.io.Serializable;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public enum a2 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(s0.g.f34069a)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(HttpUrl.FRAGMENT_ENCODE_SET),
    BYTE_STRING(h.f11917b),
    ENUM(null),
    MESSAGE(null);


    /* renamed from: a, reason: collision with root package name */
    public final Object f11888a;

    a2(Serializable serializable) {
    }
}
