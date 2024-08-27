package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class f2 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26151a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hu.c f26152b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1.o f26153c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f26154d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n1.x0 f26155e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f26156f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f26157g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f26158h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f26159i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Function2 f26160j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f26161k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f26162l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f26163m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f2(hu.c cVar, g1.o oVar, Object obj, boolean z10, n1.x0 x0Var, float f10, long j10, long j11, long j12, Function2 function2, int i10, int i11, int i12) {
        super(2);
        this.f26151a = i12;
        this.f26152b = cVar;
        this.f26153c = oVar;
        this.f26163m = obj;
        this.f26154d = z10;
        this.f26155e = x0Var;
        this.f26156f = f10;
        this.f26157g = j10;
        this.f26158h = j11;
        this.f26159i = j12;
        this.f26160j = function2;
        this.f26161k = i10;
        this.f26162l = i11;
    }

    public final void a(t0.n nVar, int i10) {
        int i11 = this.f26151a;
        int i12 = this.f26161k;
        Object obj = this.f26163m;
        switch (i11) {
            case 0:
                m2.a(this.f26152b, this.f26153c, (p2) obj, this.f26154d, this.f26155e, this.f26156f, this.f26157g, this.f26158h, this.f26159i, this.f26160j, nVar, t0.t.H0(i12 | 1), this.f26162l);
                return;
            default:
                v4.a(this.f26152b, this.f26153c, (w4) obj, this.f26154d, this.f26155e, this.f26156f, this.f26157g, this.f26158h, this.f26159i, this.f26160j, nVar, t0.t.H0(i12 | 1), this.f26162l);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f26151a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }
}
