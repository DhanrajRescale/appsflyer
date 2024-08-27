package rj;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import x.d0;

/* loaded from: classes.dex */
public final class q extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33917a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1.o f33918b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d0 f33919c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f33920d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f33921e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f33922f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f33923g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Function0 f33924h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f33925i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f33926j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(g1.o oVar, d0 d0Var, boolean z10, String str, long j10, long j11, Function0 function0, int i10, int i11) {
        super(2);
        this.f33918b = oVar;
        this.f33919c = d0Var;
        this.f33920d = z10;
        this.f33921e = str;
        this.f33922f = j10;
        this.f33923g = j11;
        this.f33924h = function0;
        this.f33925i = i10;
        this.f33926j = i11;
    }

    public final void a(t0.n nVar, int i10) {
        int i11 = this.f33917a;
        int i12 = this.f33925i;
        switch (i11) {
            case 0:
                g1.o oVar = this.f33918b;
                boolean z10 = this.f33920d;
                d0 d0Var = this.f33919c;
                String str = this.f33921e;
                al.d.p(t0.t.H0(i12 | 1), this.f33926j, this.f33922f, this.f33923g, d0Var, nVar, oVar, str, this.f33924h, z10);
                return;
            default:
                g1.o oVar2 = this.f33918b;
                d0 d0Var2 = this.f33919c;
                boolean z11 = this.f33920d;
                String str2 = this.f33921e;
                al.d.q(t0.t.H0(i12 | 1), this.f33926j, this.f33922f, this.f33923g, d0Var2, nVar, oVar2, str2, this.f33924h, z11);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f33917a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(g1.o oVar, boolean z10, d0 d0Var, String str, long j10, long j11, Function0 function0, int i10, int i11) {
        super(2);
        this.f33918b = oVar;
        this.f33920d = z10;
        this.f33919c = d0Var;
        this.f33921e = str;
        this.f33922f = j10;
        this.f33923g = j11;
        this.f33924h = function0;
        this.f33925i = i10;
        this.f33926j = i11;
    }
}
