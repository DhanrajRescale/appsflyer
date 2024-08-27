package n1;

/* loaded from: classes.dex */
public final class y0 extends g1.n implements c2.c0 {
    public long A;
    public long B;
    public int C;
    public t.g0 D;

    /* renamed from: n, reason: collision with root package name */
    public float f28208n;

    /* renamed from: o, reason: collision with root package name */
    public float f28209o;

    /* renamed from: p, reason: collision with root package name */
    public float f28210p;

    /* renamed from: q, reason: collision with root package name */
    public float f28211q;

    /* renamed from: r, reason: collision with root package name */
    public float f28212r;

    /* renamed from: s, reason: collision with root package name */
    public float f28213s;

    /* renamed from: t, reason: collision with root package name */
    public float f28214t;

    /* renamed from: u, reason: collision with root package name */
    public float f28215u;

    /* renamed from: v, reason: collision with root package name */
    public float f28216v;

    /* renamed from: w, reason: collision with root package name */
    public float f28217w;

    /* renamed from: x, reason: collision with root package name */
    public long f28218x;

    /* renamed from: y, reason: collision with root package name */
    public x0 f28219y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f28220z;

    @Override // g1.n
    public final boolean F0() {
        return false;
    }

    @Override // c2.c0
    public final a2.n0 a(a2.o0 o0Var, a2.l0 l0Var, long j10) {
        a2.n0 n0;
        a2.a1 E = l0Var.E(j10);
        n0 = o0Var.n0(E.f29a, E.f30b, vt.p0.d(), new x.z(26, E, this));
        return n0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb2.append(this.f28208n);
        sb2.append(", scaleY=");
        sb2.append(this.f28209o);
        sb2.append(", alpha = ");
        sb2.append(this.f28210p);
        sb2.append(", translationX=");
        sb2.append(this.f28211q);
        sb2.append(", translationY=");
        sb2.append(this.f28212r);
        sb2.append(", shadowElevation=");
        sb2.append(this.f28213s);
        sb2.append(", rotationX=");
        sb2.append(this.f28214t);
        sb2.append(", rotationY=");
        sb2.append(this.f28215u);
        sb2.append(", rotationZ=");
        sb2.append(this.f28216v);
        sb2.append(", cameraDistance=");
        sb2.append(this.f28217w);
        sb2.append(", transformOrigin=");
        sb2.append((Object) b1.a(this.f28218x));
        sb2.append(", shape=");
        sb2.append(this.f28219y);
        sb2.append(", clip=");
        sb2.append(this.f28220z);
        sb2.append(", renderEffect=null, ambientShadowColor=");
        v.e.t(this.A, sb2, ", spotShadowColor=");
        v.e.t(this.B, sb2, ", compositingStrategy=");
        sb2.append((Object) ("CompositingStrategy(value=" + this.C + ')'));
        sb2.append(')');
        return sb2.toString();
    }
}
