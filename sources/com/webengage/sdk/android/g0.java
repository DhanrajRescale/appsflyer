package com.webengage.sdk.android;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class g0 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private String f12549a;

    /* renamed from: b, reason: collision with root package name */
    private Object f12550b;

    private g0() {
        this.f12549a = null;
        this.f12550b = null;
    }

    public String a() {
        return this.f12549a;
    }

    public Object b() {
        return this.f12550b;
    }

    public boolean equals(Object obj) {
        return false;
    }

    public int hashCode() {
        if (this.f12549a == null || this.f12550b == null) {
            return super.hashCode();
        }
        return (this.f12549a + this.f12550b).hashCode();
    }

    public g0(String str, Object obj) {
        this.f12549a = str;
        this.f12550b = obj;
    }
}
