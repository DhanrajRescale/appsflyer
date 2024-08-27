package com.webengage.sdk.android.utils.htmlspanner.l.o;

import android.text.SpannableStringBuilder;
import com.webengage.sdk.android.utils.htmlspanner.l.i;
import dv.s;

/* loaded from: classes2.dex */
public class e extends i {

    /* renamed from: c, reason: collision with root package name */
    private i f12853c;

    public e(i iVar) {
        super(new com.webengage.sdk.android.utils.htmlspanner.n.a());
        this.f12853c = iVar;
    }

    @Override // com.webengage.sdk.android.utils.htmlspanner.g
    public void a(com.webengage.sdk.android.utils.htmlspanner.c cVar) {
        super.a(cVar);
        if (d() != null) {
            d().a(cVar);
        }
    }

    @Override // com.webengage.sdk.android.utils.htmlspanner.l.i
    public com.webengage.sdk.android.utils.htmlspanner.n.a c() {
        return this.f12853c.c();
    }

    public i d() {
        return this.f12853c;
    }

    @Override // com.webengage.sdk.android.utils.htmlspanner.l.i
    public void a(s sVar, SpannableStringBuilder spannableStringBuilder, int i10, int i11, com.webengage.sdk.android.utils.htmlspanner.n.a aVar, com.webengage.sdk.android.utils.htmlspanner.e eVar) {
        i iVar = this.f12853c;
        if (iVar != null) {
            iVar.a(sVar, spannableStringBuilder, i10, i11, aVar, eVar);
        }
    }

    @Override // com.webengage.sdk.android.utils.htmlspanner.l.i, com.webengage.sdk.android.utils.htmlspanner.g
    public void a(s sVar, SpannableStringBuilder spannableStringBuilder, com.webengage.sdk.android.utils.htmlspanner.e eVar) {
        i iVar = this.f12853c;
        if (iVar != null) {
            iVar.a(sVar, spannableStringBuilder, eVar);
        }
    }
}
