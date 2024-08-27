package com.webengage.sdk.android.utils.htmlspanner.l.o;

import android.text.SpannableStringBuilder;
import com.webengage.sdk.android.Logger;
import com.webengage.sdk.android.utils.htmlspanner.i.a;
import com.webengage.sdk.android.utils.htmlspanner.l.i;
import dv.s;

/* loaded from: classes2.dex */
public class d extends e {
    public d(i iVar) {
        super(iVar);
    }

    private com.webengage.sdk.android.utils.htmlspanner.n.a a(com.webengage.sdk.android.utils.htmlspanner.n.a aVar, String str) {
        com.webengage.sdk.android.utils.htmlspanner.n.a aVar2 = aVar;
        for (String str2 : str.split(";")) {
            String[] split = str2.split(":");
            if (split.length != 2) {
                Logger.e("WebEngage", "Could not parse pair: ".concat(str2));
                Logger.e("WebEngage", "Could not parse attribute: ".concat(str));
                return aVar;
            }
            a.y a10 = com.webengage.sdk.android.utils.htmlspanner.i.a.a(split[0].toLowerCase().trim(), split[1].toLowerCase().trim());
            if (a10 != null) {
                aVar2 = a10.a(aVar2, a());
            }
        }
        return aVar2;
    }

    @Override // com.webengage.sdk.android.utils.htmlspanner.l.o.e, com.webengage.sdk.android.utils.htmlspanner.l.i
    public void a(s sVar, SpannableStringBuilder spannableStringBuilder, int i10, int i11, com.webengage.sdk.android.utils.htmlspanner.n.a aVar, com.webengage.sdk.android.utils.htmlspanner.e eVar) {
        String f10 = sVar.f("style");
        if (!a().d() || f10 == null) {
            super.a(sVar, spannableStringBuilder, i10, i11, aVar, eVar);
        } else {
            super.a(sVar, spannableStringBuilder, i10, i11, a(aVar, f10), eVar);
        }
    }
}
