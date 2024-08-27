package x;

/* loaded from: classes.dex */
public final class r extends iu.k implements hu.c {

    /* renamed from: b, reason: collision with root package name */
    public static final r f39700b = new r(0);

    /* renamed from: c, reason: collision with root package name */
    public static final r f39701c = new r(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39702a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i10) {
        super(3);
        this.f39702a = i10;
    }

    public final a2.n0 a(a2.o0 o0Var, a2.l0 l0Var, long j10) {
        a2.n0 n0;
        a2.n0 n02;
        switch (this.f39702a) {
            case 0:
                a2.a1 E = l0Var.E(j10);
                int m02 = o0Var.m0(k0.f39613a * 2);
                int d02 = E.d0() - m02;
                if (d02 < 0) {
                    d02 = 0;
                }
                int b02 = E.b0() - m02;
                if (b02 < 0) {
                    b02 = 0;
                }
                n0 = o0Var.n0(d02, b02, vt.p0.d(), new q(E, m02, 0));
                return n0;
            default:
                a2.a1 E2 = l0Var.E(j10);
                int m03 = o0Var.m0(k0.f39613a * 2);
                n02 = o0Var.n0(E2.f29a + m03, E2.f30b + m03, vt.p0.d(), new q(E2, m03, 1));
                return n02;
        }
    }

    @Override // hu.c
    public final /* synthetic */ Object b(Object obj, Object obj2, Object obj3) {
        switch (this.f39702a) {
            case 0:
                return a((a2.o0) obj, (a2.l0) obj2, ((w2.a) obj3).f38776a);
            default:
                return a((a2.o0) obj, (a2.l0) obj2, ((w2.a) obj3).f38776a);
        }
    }
}
