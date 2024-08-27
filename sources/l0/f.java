package l0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class f extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23747a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f23748b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f23749c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f23750d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f23751e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g1.o oVar, Function0 function0, boolean z10, int i10) {
        super(2);
        this.f23747a = 0;
        this.f23750d = oVar;
        this.f23751e = function0;
        this.f23748b = z10;
        this.f23749c = i10;
    }

    public final void a(t0.n nVar, int i10) {
        int i11 = this.f23747a;
        boolean z10 = this.f23748b;
        int i12 = this.f23749c;
        Object obj = this.f23751e;
        Object obj2 = this.f23750d;
        switch (i11) {
            case 0:
                dp.b.d0((g1.o) obj2, (Function0) obj, z10, nVar, t0.t.H0(i12 | 1));
                return;
            case 1:
                al.d.E(z10, (u2.h) obj2, (v0) obj, nVar, t0.t.H0(i12 | 1));
                return;
            default:
                kp.j.a(z10, (g1.o) obj2, (Function1) obj, nVar, t0.t.H0(i12 | 1));
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f23747a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 1:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(boolean z10, Object obj, Object obj2, int i10, int i11) {
        super(2);
        this.f23747a = i11;
        this.f23748b = z10;
        this.f23750d = obj;
        this.f23751e = obj2;
        this.f23749c = i10;
    }
}
