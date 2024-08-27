package com.webengage.sdk.android.utils.htmlspanner.l.o;

import android.text.SpannableStringBuilder;
import com.webengage.sdk.android.utils.htmlspanner.l.i;
import com.webengage.sdk.android.utils.htmlspanner.m.f;
import dv.s;

/* loaded from: classes2.dex */
public class c extends e {
    public c(i iVar) {
        super(iVar);
    }

    @Override // com.webengage.sdk.android.utils.htmlspanner.l.o.e, com.webengage.sdk.android.utils.htmlspanner.l.i
    public void a(s sVar, SpannableStringBuilder spannableStringBuilder, int i10, int i11, com.webengage.sdk.android.utils.htmlspanner.n.a aVar, com.webengage.sdk.android.utils.htmlspanner.e eVar) {
        int i12 = i11 + 1;
        eVar.a(new f(aVar, i10, i12), i10, i12);
        a(spannableStringBuilder);
        super.a(sVar, spannableStringBuilder, i10, i12, aVar, eVar);
    }
}
