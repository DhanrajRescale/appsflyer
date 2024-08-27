package com.webengage.sdk.android.utils.htmlspanner.l;

import android.text.SpannableStringBuilder;
import dv.s;

/* loaded from: classes2.dex */
public class f extends n {

    /* renamed from: c, reason: collision with root package name */
    private int f12835c;

    public f(int i10, com.webengage.sdk.android.utils.htmlspanner.g gVar) {
        super(gVar);
        this.f12835c = i10;
    }

    @Override // com.webengage.sdk.android.utils.htmlspanner.l.n, com.webengage.sdk.android.utils.htmlspanner.g
    public void a(s sVar, SpannableStringBuilder spannableStringBuilder, int i10, int i11, com.webengage.sdk.android.utils.htmlspanner.e eVar) {
        super.a(sVar, spannableStringBuilder, i10, i11, eVar);
        for (int i12 = 0; i12 < this.f12835c; i12++) {
            a(spannableStringBuilder);
        }
    }
}
