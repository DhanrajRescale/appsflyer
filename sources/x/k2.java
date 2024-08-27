package x;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class k2 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39616a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f39617b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f39618c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f39619d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(qu.f0 f0Var, boolean z10, o2 o2Var) {
        super(2);
        this.f39616a = 0;
        this.f39618c = f0Var;
        this.f39617b = z10;
        this.f39619d = o2Var;
    }

    public final Boolean a(float f10, float f11) {
        int i10 = this.f39616a;
        Object obj = this.f39619d;
        Object obj2 = this.f39618c;
        switch (i10) {
            case 0:
                yk.g.H((qu.f0) obj2, null, null, new j2(this.f39617b, (o2) obj, f11, f10, null), 3);
                return Boolean.TRUE;
            default:
                if (this.f39617b) {
                    f10 = f11;
                }
                yk.g.H((qu.f0) obj2, null, null, new d0.j0((d0.g0) obj, f10, null), 3);
                return Boolean.TRUE;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        t0.r rVar;
        float r10;
        switch (this.f39616a) {
            case 0:
                return a(((Number) obj).floatValue(), ((Number) obj2).floatValue());
            case 1:
                return a(((Number) obj).floatValue(), ((Number) obj2).floatValue());
            default:
                t0.n nVar = (t0.n) obj;
                int i10 = 2;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    t0.r rVar2 = (t0.r) nVar;
                    if (rVar2.G()) {
                        rVar2.V();
                        return Unit.f23355a;
                    }
                }
                if (this.f39617b) {
                    rVar = (t0.r) nVar;
                    rVar.b0(-1945695414);
                    r10 = vl.b.u(rVar);
                } else {
                    rVar = (t0.r) nVar;
                    rVar.b0(-1945695391);
                    r10 = vl.b.r(rVar);
                }
                rVar.s(false);
                dp.b.p(m0.d1.f26028a.b(Float.valueOf(r10)), b1.d.b(nVar, -1705995688, new m0.e(i10, (hu.c) this.f39618c, (b0.p1) this.f39619d)), nVar, 48);
                return Unit.f23355a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k2(boolean z10, Object obj, Object obj2, int i10) {
        super(2);
        this.f39616a = i10;
        this.f39617b = z10;
        this.f39618c = obj;
        this.f39619d = obj2;
    }
}
