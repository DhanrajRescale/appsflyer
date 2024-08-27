package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class c0 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25959a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f25960b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1.o f25961c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f25962d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b0.h1 f25963e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a0.l f25964f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ hu.c f25965g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f25966h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f25967i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(Function0 function0, g1.o oVar, boolean z10, b0.h1 h1Var, a0.l lVar, hu.c cVar, int i10, int i11, int i12) {
        super(2);
        this.f25959a = i12;
        this.f25960b = function0;
        this.f25961c = oVar;
        this.f25962d = z10;
        this.f25963e = h1Var;
        this.f25964f = lVar;
        this.f25965g = cVar;
        this.f25966h = i10;
        this.f25967i = i11;
    }

    public final void a(t0.n nVar, int i10) {
        int i11 = this.f25959a;
        int i12 = this.f25966h;
        switch (i11) {
            case 0:
                pp.b.e(this.f25960b, this.f25961c, this.f25962d, this.f25963e, this.f25964f, this.f25965g, nVar, t0.t.H0(i12 | 1), this.f25967i);
                return;
            default:
                a4.b(this.f25960b, this.f25961c, this.f25962d, this.f25963e, this.f25964f, this.f25965g, nVar, t0.t.H0(i12 | 1), this.f25967i);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f25959a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }
}
