package com.webengage.sdk.android.utils.htmlspanner.j;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private String f12822a;

    /* renamed from: b, reason: collision with root package name */
    private String f12823b;

    public d(String str, String str2) {
        this.f12822a = str;
        this.f12823b = str2;
    }

    public String a() {
        return this.f12822a.trim();
    }

    public String b() {
        return this.f12823b.trim();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return dVar.f12822a.trim().equalsIgnoreCase(this.f12822a.trim()) && dVar.f12823b.trim().equalsIgnoreCase(this.f12823b.trim());
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public String toString() {
        return this.f12822a + ": " + this.f12823b;
    }
}
