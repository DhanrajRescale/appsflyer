package r0;

import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class m0 extends iu.k implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public static final m0 f32573b = new m0(0);

    /* renamed from: c, reason: collision with root package name */
    public static final m0 f32574c = new m0(1);

    /* renamed from: d, reason: collision with root package name */
    public static final m0 f32575d = new m0(2);

    /* renamed from: e, reason: collision with root package name */
    public static final m0 f32576e = new m0(3);

    /* renamed from: f, reason: collision with root package name */
    public static final m0 f32577f = new m0(4);

    /* renamed from: g, reason: collision with root package name */
    public static final m0 f32578g = new m0(5);

    /* renamed from: h, reason: collision with root package name */
    public static final m0 f32579h = new m0(6);

    /* renamed from: i, reason: collision with root package name */
    public static final m0 f32580i = new m0(7);

    /* renamed from: j, reason: collision with root package name */
    public static final m0 f32581j = new m0(8);

    /* renamed from: k, reason: collision with root package name */
    public static final m0 f32582k = new m0(9);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32583a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(int i10) {
        super(0);
        this.f32583a = i10;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        int i10 = this.f32583a;
        switch (i10) {
            case 0:
                t0.m3 m3Var = n0.f32600a;
                long j10 = s0.b.f34041t;
                return new l0(j10, s0.b.f34031j, s0.b.f34042u, s0.b.f34032k, s0.b.f34026e, s0.b.f34044w, s0.b.f34033l, s0.b.f34045x, s0.b.f34034m, s0.b.H, s0.b.f34037p, s0.b.I, s0.b.f34038q, s0.b.f34022a, s0.b.f34028g, s0.b.f34046y, s0.b.f34035n, s0.b.G, s0.b.f34036o, j10, s0.b.f34027f, s0.b.f34025d, s0.b.f34023b, s0.b.f34029h, s0.b.f34024c, s0.b.f34030i, s0.b.f34039r, s0.b.f34040s, s0.b.f34043v, s0.b.f34047z, s0.b.F, s0.b.A, s0.b.B, s0.b.C, s0.b.D, s0.b.E);
            case 1:
                switch (i10) {
                    case 1:
                        return Boolean.TRUE;
                    default:
                        return Boolean.TRUE;
                }
            case 2:
                return new n1.t(n1.t.f28170b);
            case 3:
                switch (i10) {
                    case 1:
                        return Boolean.TRUE;
                    default:
                        return Boolean.TRUE;
                }
            case 4:
                return UUID.randomUUID();
            case 5:
                return null;
            case 6:
                return new u2();
            case 7:
                return new w2.e(0);
            case 8:
                return s0.o.f34174a;
            default:
                return new o3();
        }
    }
}
