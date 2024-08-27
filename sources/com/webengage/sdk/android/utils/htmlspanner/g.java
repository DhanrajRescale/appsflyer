package com.webengage.sdk.android.utils.htmlspanner;

import android.text.SpannableStringBuilder;
import dv.s;

/* loaded from: classes2.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    private c f12756a;

    public c a() {
        return this.f12756a;
    }

    public abstract void a(s sVar, SpannableStringBuilder spannableStringBuilder, int i10, int i11, e eVar);

    public boolean b() {
        return false;
    }

    public void a(c cVar) {
        this.f12756a = cVar;
    }

    public void a(s sVar, SpannableStringBuilder spannableStringBuilder, e eVar) {
    }

    public boolean a(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length();
        if (this.f12756a.e() && length > 2 && spannableStringBuilder.charAt(length - 1) == '\n' && spannableStringBuilder.charAt(length - 2) == '\n') {
            return false;
        }
        spannableStringBuilder.append("  \n");
        return true;
    }
}
