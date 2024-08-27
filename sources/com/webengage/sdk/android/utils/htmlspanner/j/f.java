package com.webengage.sdk.android.utils.htmlspanner.j;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private String f12826a;

    public f(String str) {
        this.f12826a = str;
    }

    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return ((f) obj).f12826a.equalsIgnoreCase(this.f12826a);
        }
        return false;
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public String toString() {
        return this.f12826a;
    }
}
