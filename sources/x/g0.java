package x;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class g0 extends iu.k implements hu.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f39559a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f39560b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h2.g f39561c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f39562d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function0 f39563e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Function0 f39564f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Function0 f39565g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(h2.g gVar, String str, String str2, Function0 function0, Function0 function02, Function0 function03, boolean z10) {
        super(3);
        this.f39559a = z10;
        this.f39560b = str;
        this.f39561c = gVar;
        this.f39562d = str2;
        this.f39563e = function0;
        this.f39564f = function02;
        this.f39565g = function03;
    }

    @Override // hu.c
    public final Object b(Object obj, Object obj2, Object obj3) {
        a0.l lVar;
        ((Number) obj3).intValue();
        t0.r rVar = (t0.r) ((t0.n) obj2);
        rVar.b0(1969174843);
        j1 j1Var = (j1) rVar.m(androidx.compose.foundation.e.f1221a);
        if (j1Var instanceof n1) {
            lVar = null;
        } else {
            rVar.b0(1321106972);
            Object Q = rVar.Q();
            if (Q == t0.m.f35080a) {
                Q = v.e.e(rVar);
            }
            lVar = (a0.l) Q;
            rVar.s(false);
        }
        g1.l lVar2 = g1.l.f16404b;
        boolean z10 = this.f39559a;
        String str = this.f39560b;
        g1.o s7 = d2.w0.s(lVar2, androidx.compose.foundation.a.l(z10, lVar, j1Var, new androidx.compose.foundation.c(this.f39561c, str, this.f39562d, this.f39565g, this.f39563e, this.f39564f, z10)));
        rVar.s(false);
        return s7;
    }
}
