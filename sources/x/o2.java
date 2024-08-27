package x;

import com.google.android.gms.common.api.Api;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class o2 implements y.d2 {

    /* renamed from: i, reason: collision with root package name */
    public static final d1.r f39652i;

    /* renamed from: a, reason: collision with root package name */
    public final t0.l1 f39653a;

    /* renamed from: e, reason: collision with root package name */
    public float f39657e;

    /* renamed from: b, reason: collision with root package name */
    public final t0.l1 f39654b = al.d.D0(0);

    /* renamed from: c, reason: collision with root package name */
    public final a0.l f39655c = new a0.l();

    /* renamed from: d, reason: collision with root package name */
    public final t0.l1 f39656d = al.d.D0(Api.BaseClientBuilder.API_PRIORITY_OTHER);

    /* renamed from: f, reason: collision with root package name */
    public final y.y f39658f = new y.y(new t.g0(this, 5));

    /* renamed from: g, reason: collision with root package name */
    public final t0.j0 f39659g = t0.t.N(new l2(this, 3));

    /* renamed from: h, reason: collision with root package name */
    public final t0.j0 f39660h = t0.t.N(new l2(this, 2));

    static {
        n2 n2Var = n2.f39646a;
        y yVar = y.f39781f;
        d1.r rVar = d1.s.f13291a;
        f39652i = new d1.r(n2Var, yVar);
    }

    public o2(int i10) {
        this.f39653a = al.d.D0(i10);
    }

    @Override // y.d2
    public final boolean a() {
        return this.f39658f.a();
    }

    @Override // y.d2
    public final Object b(s1 s1Var, Function2 function2, yt.a aVar) {
        Object b10 = this.f39658f.b(s1Var, function2, aVar);
        if (b10 == zt.a.f42823a) {
            return b10;
        }
        return Unit.f23355a;
    }

    @Override // y.d2
    public final boolean c() {
        return ((Boolean) this.f39660h.getValue()).booleanValue();
    }

    @Override // y.d2
    public final boolean d() {
        return ((Boolean) this.f39659g.getValue()).booleanValue();
    }

    @Override // y.d2
    public final float e(float f10) {
        return this.f39658f.e(f10);
    }

    public final Object f(int i10, w.n nVar, yt.a aVar) {
        Object j10 = iu.j.j(this, i10 - this.f39653a.i(), nVar, aVar);
        if (j10 == zt.a.f42823a) {
            return j10;
        }
        return Unit.f23355a;
    }

    public final int g() {
        return this.f39653a.i();
    }
}
