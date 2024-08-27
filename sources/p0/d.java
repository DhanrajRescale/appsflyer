package p0;

import j2.g0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import t0.t;

/* loaded from: classes.dex */
public final class d extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30441a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f30442b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f30443c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f30444d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f30445e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(long j10, g0 g0Var, Function2 function2, int i10) {
        super(2);
        this.f30442b = j10;
        this.f30444d = g0Var;
        this.f30445e = function2;
        this.f30443c = i10;
    }

    public final void a(t0.n nVar, int i10) {
        int i11 = this.f30441a;
        int i12 = this.f30443c;
        Object obj = this.f30445e;
        Object obj2 = this.f30444d;
        switch (i11) {
            case 0:
                h.b((o) obj2, this.f30442b, (g1.o) obj, nVar, t.H0(i12 | 1));
                return;
            default:
                al.d.o(this.f30442b, (g0) obj2, (Function2) obj, nVar, t.H0(i12 | 1));
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f30441a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(o oVar, long j10, g1.o oVar2, int i10) {
        super(2);
        this.f30444d = oVar;
        this.f30442b = j10;
        this.f30445e = oVar2;
        this.f30443c = i10;
    }
}
