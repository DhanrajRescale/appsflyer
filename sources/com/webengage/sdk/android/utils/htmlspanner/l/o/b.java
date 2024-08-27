package com.webengage.sdk.android.utils.htmlspanner.l.o;

import android.text.SpannableStringBuilder;
import com.webengage.sdk.android.utils.htmlspanner.l.i;
import dv.s;

/* loaded from: classes2.dex */
public class b extends e {
    public b(i iVar) {
        super(iVar);
    }

    @Override // com.webengage.sdk.android.utils.htmlspanner.l.o.e, com.webengage.sdk.android.utils.htmlspanner.l.i
    public void a(s sVar, SpannableStringBuilder spannableStringBuilder, int i10, int i11, com.webengage.sdk.android.utils.htmlspanner.n.a aVar, com.webengage.sdk.android.utils.htmlspanner.e eVar) {
        if (sVar.f("border") != null) {
            eVar.a(new com.webengage.sdk.android.utils.htmlspanner.m.c(aVar, i10, i11, a().f()), i10, i11);
        }
        super.a(sVar, spannableStringBuilder, i10, i11, aVar, eVar);
    }
}
