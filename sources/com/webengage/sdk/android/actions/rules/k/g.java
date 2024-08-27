package com.webengage.sdk.android.actions.rules.k;

/* loaded from: classes2.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    private String f12525a;

    /* renamed from: b, reason: collision with root package name */
    int f12526b;

    /* renamed from: c, reason: collision with root package name */
    boolean f12527c;

    public g(String str, int i10) {
        this(str, i10, true);
    }

    public abstract Object a(Object obj, Object obj2);

    public String a() {
        return this.f12525a;
    }

    public int b() {
        return this.f12526b;
    }

    public boolean c() {
        return this.f12527c;
    }

    public g(String str, int i10, boolean z10) {
        this.f12525a = str;
        this.f12526b = i10;
        this.f12527c = z10;
    }
}
