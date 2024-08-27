package com.webengage.sdk.android.utils.htmlspanner.l;

import android.text.SpannableStringBuilder;
import com.webengage.sdk.android.utils.htmlspanner.i.a;
import dv.s;

/* loaded from: classes2.dex */
public class a extends i {
    public a() {
        super(new com.webengage.sdk.android.utils.htmlspanner.n.a());
    }

    @Override // com.webengage.sdk.android.utils.htmlspanner.l.i
    public void a(s sVar, SpannableStringBuilder spannableStringBuilder, int i10, int i11, com.webengage.sdk.android.utils.htmlspanner.n.a aVar, com.webengage.sdk.android.utils.htmlspanner.e eVar) {
        a.y a10;
        a.y a11;
        if (a().d()) {
            String f10 = sVar.f("face");
            String f11 = sVar.f("size");
            String f12 = sVar.f("color");
            aVar = aVar.a(a().b(f10));
            if (f11 != null && (a11 = com.webengage.sdk.android.utils.htmlspanner.i.a.a("font-size", f11)) != null) {
                aVar = a11.a(aVar, a());
            }
            if (f12 != null && a().f() && (a10 = com.webengage.sdk.android.utils.htmlspanner.i.a.a("color", f12)) != null) {
                aVar = a10.a(aVar, a());
            }
        }
        super.a(sVar, spannableStringBuilder, i10, i11, aVar, eVar);
    }
}
