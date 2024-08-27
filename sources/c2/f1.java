package c2;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class f1 extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i1 f7693a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1.n f7694b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d1 f7695c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f7696d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v f7697e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f7698f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f7699g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(i1 i1Var, g1.n nVar, d1 d1Var, long j10, v vVar, boolean z10, boolean z11) {
        super(0);
        this.f7693a = i1Var;
        this.f7694b = nVar;
        this.f7695c = d1Var;
        this.f7696d = j10;
        this.f7697e = vVar;
        this.f7698f = z10;
        this.f7699g = z11;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        int i10;
        i1 i1Var = this.f7693a;
        switch (((androidx.work.u) this.f7695c).f2637a) {
            case 0:
                i10 = 16;
                break;
            default:
                i10 = 8;
                break;
        }
        g1.n e10 = g.e(this.f7694b, i10);
        d1 d1Var = this.f7695c;
        long j10 = this.f7696d;
        v vVar = this.f7697e;
        boolean z10 = this.f7698f;
        boolean z11 = this.f7699g;
        if (e10 == null) {
            i1Var.a1(d1Var, j10, vVar, z10, z11);
        } else {
            i1Var.getClass();
            vVar.e(e10, -1.0f, z11, new f1(i1Var, e10, d1Var, j10, vVar, z10, z11));
        }
        return Unit.f23355a;
    }
}
