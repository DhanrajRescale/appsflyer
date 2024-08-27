package com.webengage.sdk.android.utils.htmlspanner.l.o;

import android.text.SpannableStringBuilder;
import com.webengage.sdk.android.utils.htmlspanner.l.i;
import com.webengage.sdk.android.utils.htmlspanner.n.a;
import dv.s;

/* loaded from: classes2.dex */
public class a extends e {
    public a(i iVar) {
        super(iVar);
    }

    @Override // com.webengage.sdk.android.utils.htmlspanner.l.o.e, com.webengage.sdk.android.utils.htmlspanner.l.i
    public void a(s sVar, SpannableStringBuilder spannableStringBuilder, int i10, int i11, com.webengage.sdk.android.utils.htmlspanner.n.a aVar, com.webengage.sdk.android.utils.htmlspanner.e eVar) {
        a.e eVar2;
        String f10 = sVar.f("align");
        if ("right".equalsIgnoreCase(f10)) {
            eVar2 = a.e.RIGHT;
        } else {
            if (!"center".equalsIgnoreCase(f10)) {
                if ("left".equalsIgnoreCase(f10)) {
                    eVar2 = a.e.LEFT;
                }
                super.a(sVar, spannableStringBuilder, i10, i11, aVar, eVar);
            }
            eVar2 = a.e.CENTER;
        }
        aVar = aVar.a(eVar2);
        super.a(sVar, spannableStringBuilder, i10, i11, aVar, eVar);
    }
}
