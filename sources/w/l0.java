package w;

import t0.l3;
import t0.o3;

/* loaded from: classes.dex */
public final class l0 implements l3 {

    /* renamed from: a, reason: collision with root package name */
    public Object f38581a;

    /* renamed from: b, reason: collision with root package name */
    public Object f38582b;

    /* renamed from: c, reason: collision with root package name */
    public final y1 f38583c;

    /* renamed from: d, reason: collision with root package name */
    public final t0.n1 f38584d;

    /* renamed from: e, reason: collision with root package name */
    public m1 f38585e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f38586f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f38587g;

    /* renamed from: h, reason: collision with root package name */
    public long f38588h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ q0 f38589i;

    public l0(q0 q0Var, Number number, Number number2, y1 y1Var, n nVar) {
        this.f38589i = q0Var;
        this.f38581a = number;
        this.f38582b = number2;
        this.f38583c = y1Var;
        this.f38584d = t0.t.n0(number, o3.f35116a);
        this.f38585e = new m1(nVar, y1Var, this.f38581a, this.f38582b, null);
    }

    @Override // t0.l3
    public final Object getValue() {
        return this.f38584d.getValue();
    }
}
