package c2;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class g1 extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7702a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i1 f7703b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1.n f7704c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d1 f7705d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f7706e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v f7707f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f7708g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f7709h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f7710i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g1(i1 i1Var, g1.n nVar, d1 d1Var, long j10, v vVar, boolean z10, boolean z11, float f10, int i10) {
        super(0);
        this.f7702a = i10;
        this.f7703b = i1Var;
        this.f7704c = nVar;
        this.f7705d = d1Var;
        this.f7706e = j10;
        this.f7707f = vVar;
        this.f7708g = z10;
        this.f7709h = z11;
        this.f7710i = f10;
    }

    public final void a() {
        int i10 = 16;
        int i11 = this.f7702a;
        g1.n nVar = this.f7704c;
        d1 d1Var = this.f7705d;
        switch (i11) {
            case 0:
                i1 i1Var = this.f7703b;
                switch (((androidx.work.u) d1Var).f2637a) {
                    case 0:
                        break;
                    default:
                        i10 = 8;
                        break;
                }
                g1.n e10 = g.e(nVar, i10);
                d1 d1Var2 = this.f7705d;
                long j10 = this.f7706e;
                v vVar = this.f7707f;
                boolean z10 = this.f7708g;
                boolean z11 = this.f7709h;
                float f10 = this.f7710i;
                if (e10 == null) {
                    i1Var.a1(d1Var2, j10, vVar, z10, z11);
                    return;
                } else {
                    i1Var.getClass();
                    vVar.e(e10, f10, z11, new g1(i1Var, e10, d1Var2, j10, vVar, z10, z11, f10, 0));
                    return;
                }
            default:
                i1 i1Var2 = this.f7703b;
                switch (((androidx.work.u) d1Var).f2637a) {
                    case 0:
                        break;
                    default:
                        i10 = 8;
                        break;
                }
                i1Var2.k1(g.e(nVar, i10), this.f7705d, this.f7706e, this.f7707f, this.f7708g, this.f7709h, this.f7710i);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* bridge */ /* synthetic */ Object mo2invoke() {
        switch (this.f7702a) {
            case 0:
                a();
                return Unit.f23355a;
            default:
                a();
                return Unit.f23355a;
        }
    }
}
