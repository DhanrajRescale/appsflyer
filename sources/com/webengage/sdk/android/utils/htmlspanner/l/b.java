package com.webengage.sdk.android.utils.htmlspanner.l;

import com.webengage.sdk.android.utils.htmlspanner.n.a;
import com.webengage.sdk.android.utils.htmlspanner.n.c;

/* loaded from: classes2.dex */
public class b extends i {

    /* renamed from: c, reason: collision with root package name */
    private final com.webengage.sdk.android.utils.htmlspanner.n.c f12833c;

    /* renamed from: d, reason: collision with root package name */
    private final com.webengage.sdk.android.utils.htmlspanner.n.c f12834d;

    public b(float f10, float f11) {
        c.a aVar = c.a.EM;
        this.f12833c = new com.webengage.sdk.android.utils.htmlspanner.n.c(f10, aVar);
        this.f12834d = new com.webengage.sdk.android.utils.htmlspanner.n.c(f11, aVar);
    }

    @Override // com.webengage.sdk.android.utils.htmlspanner.l.i
    public com.webengage.sdk.android.utils.htmlspanner.n.a c() {
        return super.c().b(this.f12833c).a(a.d.BOLD).a(a.b.BLOCK).d(this.f12834d).g(this.f12834d);
    }
}
