package x;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class e0 extends iu.k implements hu.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f39537a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f39538b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h2.g f39539c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function0 f39540d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(boolean z10, String str, h2.g gVar, Function0 function0) {
        super(3);
        this.f39537a = z10;
        this.f39538b = str;
        this.f39539c = gVar;
        this.f39540d = function0;
    }

    @Override // hu.c
    public final Object b(Object obj, Object obj2, Object obj3) {
        a0.l lVar;
        ((Number) obj3).intValue();
        t0.r rVar = (t0.r) ((t0.n) obj2);
        rVar.b0(-756081143);
        j1 j1Var = (j1) rVar.m(androidx.compose.foundation.e.f1221a);
        if (j1Var instanceof n1) {
            lVar = null;
        } else {
            rVar.b0(1841981168);
            Object Q = rVar.Q();
            if (Q == t0.m.f35080a) {
                Q = v.e.e(rVar);
            }
            lVar = (a0.l) Q;
            rVar.s(false);
        }
        g1.l lVar2 = g1.l.f16404b;
        boolean z10 = this.f39537a;
        g1.o s7 = d2.w0.s(lVar2, androidx.compose.foundation.a.l(z10, lVar, j1Var, new androidx.compose.foundation.b(z10, this.f39538b, this.f39539c, this.f39540d)));
        rVar.s(false);
        return s7;
    }
}
