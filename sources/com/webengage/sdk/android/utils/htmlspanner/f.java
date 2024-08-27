package com.webengage.sdk.android.utils.htmlspanner;

import android.graphics.Typeface;

/* loaded from: classes2.dex */
public class f implements b {

    /* renamed from: a, reason: collision with root package name */
    private a f12752a = new a(null, null);

    /* renamed from: b, reason: collision with root package name */
    private a f12753b = new a("serif", Typeface.SERIF);

    /* renamed from: c, reason: collision with root package name */
    private a f12754c = new a("sans-serif", Typeface.SANS_SERIF);

    /* renamed from: d, reason: collision with root package name */
    private a f12755d = new a("monospace", Typeface.MONOSPACE);

    @Override // com.webengage.sdk.android.utils.htmlspanner.b
    public a a() {
        return this.f12755d;
    }

    @Override // com.webengage.sdk.android.utils.htmlspanner.b
    public a b() {
        return this.f12752a;
    }

    public a c() {
        return this.f12754c;
    }

    public a d() {
        return this.f12753b;
    }

    @Override // com.webengage.sdk.android.utils.htmlspanner.b
    public a a(String str) {
        if (str != null && str.length() > 0) {
            String[] split = str.split(",(\\s)*");
            for (int i10 = 0; i10 < split.length; i10++) {
                String str2 = split[i10];
                if (str2.startsWith("\"") && str2.endsWith("\"")) {
                    str2 = str2.substring(1, str2.length() - 1);
                }
                if (str2.startsWith("'") && str2.endsWith("'")) {
                    str2 = str2.substring(1, str2.length() - 1);
                }
                a b10 = b(str2);
                if (b10 != null) {
                    return b10;
                }
            }
        }
        return b();
    }

    public a b(String str) {
        if (str.equalsIgnoreCase("serif")) {
            return d();
        }
        if (str.equalsIgnoreCase("sans-serif")) {
            return c();
        }
        if (str.equalsIgnoreCase("monospace")) {
            return this.f12755d;
        }
        return null;
    }
}
