package com.webengage.sdk.android.utils.htmlspanner.l;

import android.text.SpannableStringBuilder;
import dv.s;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class d extends com.webengage.sdk.android.utils.htmlspanner.l.o.e {
    public d(i iVar) {
        super(iVar);
    }

    private String b(s sVar) {
        if (sVar.a() == null) {
            return null;
        }
        return sVar.a().c();
    }

    @Override // com.webengage.sdk.android.utils.htmlspanner.l.o.e, com.webengage.sdk.android.utils.htmlspanner.l.i
    public void a(s sVar, SpannableStringBuilder spannableStringBuilder, int i10, int i11, com.webengage.sdk.android.utils.htmlspanner.n.a aVar, com.webengage.sdk.android.utils.htmlspanner.e eVar) {
        com.webengage.sdk.android.utils.htmlspanner.m.h hVar;
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
            spannableStringBuilder.append("\n");
        }
        if (!"ol".equals(b(sVar))) {
            if ("ul".equals(b(sVar))) {
                hVar = new com.webengage.sdk.android.utils.htmlspanner.m.h();
            }
            super.a(sVar, spannableStringBuilder, i10, i11, aVar, eVar);
        }
        hVar = new com.webengage.sdk.android.utils.htmlspanner.m.h(a(sVar));
        eVar.a(hVar, i10, i11);
        super.a(sVar, spannableStringBuilder, i10, i11, aVar, eVar);
    }

    private int a(s sVar) {
        if (sVar.a() == null) {
            return -1;
        }
        Iterator it = sVar.a().f14590d.iterator();
        int i10 = 1;
        while (it.hasNext()) {
            Object next = it.next();
            if (next == sVar) {
                return i10;
            }
            if ((next instanceof s) && "li".equals(((s) next).c())) {
                i10++;
            }
        }
        return -1;
    }
}
