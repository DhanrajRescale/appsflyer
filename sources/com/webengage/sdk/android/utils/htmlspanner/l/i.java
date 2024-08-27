package com.webengage.sdk.android.utils.htmlspanner.l;

import android.text.SpannableStringBuilder;
import com.webengage.sdk.android.utils.htmlspanner.n.a;
import com.webengage.sdk.android.utils.htmlspanner.n.c;
import dv.s;

/* loaded from: classes2.dex */
public class i extends com.webengage.sdk.android.utils.htmlspanner.g {

    /* renamed from: b, reason: collision with root package name */
    private com.webengage.sdk.android.utils.htmlspanner.n.a f12836b;

    public i() {
        this.f12836b = new com.webengage.sdk.android.utils.htmlspanner.n.a();
    }

    @Override // com.webengage.sdk.android.utils.htmlspanner.g
    public final void a(s sVar, SpannableStringBuilder spannableStringBuilder, int i10, int i11, com.webengage.sdk.android.utils.htmlspanner.e eVar) {
        a(sVar, spannableStringBuilder, i10, i11, eVar.a(sVar, c()), eVar);
    }

    public com.webengage.sdk.android.utils.htmlspanner.n.a c() {
        this.f12836b.a(a().b("sans-serif"));
        return this.f12836b;
    }

    public i(com.webengage.sdk.android.utils.htmlspanner.n.a aVar) {
        this.f12836b = aVar;
    }

    public void a(s sVar, SpannableStringBuilder spannableStringBuilder, int i10, int i11, com.webengage.sdk.android.utils.htmlspanner.n.a aVar, com.webengage.sdk.android.utils.htmlspanner.e eVar) {
        com.webengage.sdk.android.utils.htmlspanner.m.i iVar;
        if (aVar.f() == a.b.BLOCK) {
            a(spannableStringBuilder);
            if (aVar.l() != null) {
                com.webengage.sdk.android.utils.htmlspanner.n.c l10 = aVar.l();
                if (l10.c() == c.a.PX) {
                    if (l10.b() > 0) {
                        a(spannableStringBuilder);
                        iVar = new com.webengage.sdk.android.utils.htmlspanner.m.i(Integer.valueOf(l10.b()));
                        eVar.a(iVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length());
                    }
                } else if (l10.a() > s0.g.f34069a) {
                    a(spannableStringBuilder);
                    iVar = new com.webengage.sdk.android.utils.htmlspanner.m.i(Float.valueOf(l10.a()));
                    eVar.a(iVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length());
                }
            }
        }
        if (aVar.k() != null && aVar.a() == null) {
            eVar.a(new com.webengage.sdk.android.utils.htmlspanner.n.b(a().b().b(), aVar, i10, spannableStringBuilder.length()));
        }
        if (spannableStringBuilder.length() > i10) {
            eVar.a(new com.webengage.sdk.android.utils.htmlspanner.n.b(a().b().b(), aVar, i10, spannableStringBuilder.length()));
        }
    }

    @Override // com.webengage.sdk.android.utils.htmlspanner.g
    public void a(s sVar, SpannableStringBuilder spannableStringBuilder, com.webengage.sdk.android.utils.htmlspanner.e eVar) {
        com.webengage.sdk.android.utils.htmlspanner.m.i iVar;
        com.webengage.sdk.android.utils.htmlspanner.n.a a10 = eVar.a(sVar, c());
        if (spannableStringBuilder.length() > 0 && a10.f() == a.b.BLOCK && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
            spannableStringBuilder.append('\n');
        }
        if (a10.n() != null) {
            com.webengage.sdk.android.utils.htmlspanner.n.c n10 = a10.n();
            if (n10.c() == c.a.PX) {
                if (n10.b() <= 0 || !a(spannableStringBuilder)) {
                    return;
                } else {
                    iVar = new com.webengage.sdk.android.utils.htmlspanner.m.i(Integer.valueOf(n10.b()));
                }
            } else if (n10.a() <= s0.g.f34069a || !a(spannableStringBuilder)) {
                return;
            } else {
                iVar = new com.webengage.sdk.android.utils.htmlspanner.m.i(Float.valueOf(n10.a()));
            }
            eVar.a(iVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
    }
}
