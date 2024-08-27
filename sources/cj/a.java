package cj;

import hv.q;
import hv.t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a extends vm.c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8160a;

    public a(boolean z10) {
        this.f8160a = z10;
    }

    @Override // vm.c
    public final String a(float f10) {
        if (this.f8160a) {
            long j10 = f10;
            jv.a b10 = jv.a.b("hh:mm");
            Intrinsics.checkNotNullExpressionValue(b10, "ofPattern(...)");
            hv.e l10 = hv.e.l(0, j10);
            q p10 = q.p();
            l10.getClass();
            String a10 = b10.a(t.p(l10, p10));
            Intrinsics.checkNotNullExpressionValue(a10, "format(...)");
            return a10;
        }
        long j11 = f10;
        jv.a b11 = jv.a.b("dd/M");
        Intrinsics.checkNotNullExpressionValue(b11, "ofPattern(...)");
        hv.e l11 = hv.e.l(0, j11);
        q p11 = q.p();
        l11.getClass();
        String a11 = b11.a(t.p(l11, p11));
        Intrinsics.checkNotNullExpressionValue(a11, "format(...)");
        return a11;
    }
}
