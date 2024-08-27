package com.webengage.sdk.android.utils.htmlspanner.l;

import android.text.SpannableStringBuilder;
import dv.s;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class g extends com.webengage.sdk.android.utils.htmlspanner.g {
    @Override // com.webengage.sdk.android.utils.htmlspanner.g
    public void a(s sVar, SpannableStringBuilder spannableStringBuilder, int i10, int i11, com.webengage.sdk.android.utils.htmlspanner.e eVar) {
        StringBuffer stringBuffer = new StringBuffer();
        a(stringBuffer, sVar);
        spannableStringBuilder.append((CharSequence) stringBuffer.toString());
        eVar.a(new com.webengage.sdk.android.utils.htmlspanner.m.e(a().b().a()), i10, spannableStringBuilder.length());
        a(spannableStringBuilder);
        a(spannableStringBuilder);
    }

    @Override // com.webengage.sdk.android.utils.htmlspanner.g
    public boolean b() {
        return true;
    }

    private void a(StringBuffer stringBuffer, Object obj) {
        if (obj instanceof dv.g) {
            stringBuffer.append(com.webengage.sdk.android.utils.htmlspanner.h.a(((dv.g) obj).b().toString(), true));
        } else if (obj instanceof s) {
            Iterator it = ((s) obj).f14590d.iterator();
            while (it.hasNext()) {
                a(stringBuffer, it.next());
            }
        }
    }
}
