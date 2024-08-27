package com.webengage.sdk.android.utils.htmlspanner.j;

/* loaded from: classes2.dex */
public class c extends Exception {

    /* renamed from: a, reason: collision with root package name */
    private final a f12816a;

    /* loaded from: classes2.dex */
    public enum a {
        FOUND_SEMICOLON_WHEN_READING_PROPERTY_NAME,
        FOUND_END_BRACKET_BEFORE_SEMICOLON,
        FOUND_COLON_WHEN_READING_SELECTOR_NAME,
        FOUND_COLON_WHILE_READING_VALUE
    }

    public c(a aVar, String str) {
        super(nn.d.m(da.e.r(str, " Line number "), com.webengage.sdk.android.utils.htmlspanner.j.a.f12796a, "."));
        this.f12816a = aVar;
    }
}
