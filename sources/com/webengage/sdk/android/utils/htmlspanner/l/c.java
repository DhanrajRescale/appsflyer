package com.webengage.sdk.android.utils.htmlspanner.l;

import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;
import dv.s;

/* loaded from: classes2.dex */
public class c extends com.webengage.sdk.android.utils.htmlspanner.g {
    @Override // com.webengage.sdk.android.utils.htmlspanner.g
    public void a(s sVar, SpannableStringBuilder spannableStringBuilder, int i10, int i11, com.webengage.sdk.android.utils.htmlspanner.e eVar) {
        eVar.a(new URLSpan(sVar.f("href")), i10, i11);
    }
}
