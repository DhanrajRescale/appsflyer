package com.webengage.sdk.android.utils.htmlspanner.l;

import android.text.SpannableStringBuilder;
import com.webengage.sdk.android.Logger;
import dv.s;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class h extends com.webengage.sdk.android.utils.htmlspanner.g {
    private void a(String str, com.webengage.sdk.android.utils.htmlspanner.e eVar) {
        try {
            Iterator<com.webengage.sdk.android.utils.htmlspanner.j.e> it = com.webengage.sdk.android.utils.htmlspanner.j.a.a(str).iterator();
            while (it.hasNext()) {
                eVar.a(com.webengage.sdk.android.utils.htmlspanner.i.a.a(it.next(), a()));
            }
        } catch (Exception e10) {
            Logger.e("WebEngage", "Unparseable CSS definition", e10);
        }
    }

    @Override // com.webengage.sdk.android.utils.htmlspanner.g
    public boolean b() {
        return true;
    }

    @Override // com.webengage.sdk.android.utils.htmlspanner.g
    public void a(s sVar, SpannableStringBuilder spannableStringBuilder, int i10, int i11, com.webengage.sdk.android.utils.htmlspanner.e eVar) {
        if (a().d() && sVar.f14590d.size() == 1) {
            Object obj = sVar.f14590d.get(0);
            if (obj instanceof dv.g) {
                a(((dv.g) obj).b(), eVar);
            }
        }
    }
}
