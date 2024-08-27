package v;

import kotlin.jvm.functions.Function1;
import n1.b1;
import w.y1;
import w.z1;

/* loaded from: classes.dex */
public final class l extends iu.k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final l f37546b = new l(0);

    /* renamed from: c, reason: collision with root package name */
    public static final l f37547c = new l(1);

    /* renamed from: d, reason: collision with root package name */
    public static final l f37548d = new l(2);

    /* renamed from: e, reason: collision with root package name */
    public static final l f37549e = new l(3);

    /* renamed from: f, reason: collision with root package name */
    public static final l f37550f = new l(4);

    /* renamed from: g, reason: collision with root package name */
    public static final l f37551g = new l(8);

    /* renamed from: h, reason: collision with root package name */
    public static final l f37552h = new l(9);

    /* renamed from: i, reason: collision with root package name */
    public static final l f37553i = new l(10);

    /* renamed from: j, reason: collision with root package name */
    public static final l f37554j = new l(11);

    /* renamed from: k, reason: collision with root package name */
    public static final l f37555k = new l(12);

    /* renamed from: l, reason: collision with root package name */
    public static final l f37556l = new l(13);

    /* renamed from: m, reason: collision with root package name */
    public static final l f37557m = new l(14);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37558a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i10) {
        super(1);
        this.f37558a = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long k10 = hl.f.k(0, 0);
        int i10 = this.f37558a;
        switch (i10) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                switch (i10) {
                    case 0:
                        return Boolean.valueOf(booleanValue);
                    case 1:
                        return Boolean.valueOf(booleanValue);
                    default:
                        return Boolean.valueOf(booleanValue);
                }
            case 1:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                switch (i10) {
                    case 0:
                        return Boolean.valueOf(booleanValue2);
                    case 1:
                        return Boolean.valueOf(booleanValue2);
                    default:
                        return Boolean.valueOf(booleanValue2);
                }
            case 2:
                boolean booleanValue3 = ((Boolean) obj).booleanValue();
                switch (i10) {
                    case 0:
                        return Boolean.valueOf(booleanValue3);
                    case 1:
                        return Boolean.valueOf(booleanValue3);
                    default:
                        return Boolean.valueOf(booleanValue3);
                }
            case 3:
                long b10 = n1.t.b(((n1.t) obj).f28179a, o1.e.f29397t);
                return new w.s(n1.t.e(b10), n1.t.i(b10), n1.t.h(b10), n1.t.f(b10));
            case 4:
                l lVar = f37549e;
                t.g0 g0Var = new t.g0((o1.d) obj, 1);
                y1 y1Var = z1.f38739a;
                return new y1(lVar, g0Var);
            case 5:
                long j10 = ((b1) obj).f28122a;
                return new w.q(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)));
            case 6:
                w.q qVar = (w.q) obj;
                return new b1(androidx.compose.ui.graphics.a.i(qVar.f38641a, qVar.f38642b));
            case 7:
                switch (i10) {
                    case 7:
                        return w.e.v(s0.g.f34069a, null, 7);
                    default:
                        return androidx.compose.animation.b.f1169b;
                }
            case 8:
                ((Number) obj).intValue();
                return 0;
            case 9:
                long j11 = ((w2.j) obj).f38798a;
                return new w2.j(k10);
            case 10:
                ((Number) obj).intValue();
                return 0;
            case 11:
                ((Number) obj).intValue();
                return 0;
            case 12:
                long j12 = ((w2.j) obj).f38798a;
                return new w2.j(k10);
            case 13:
                ((Number) obj).intValue();
                return 0;
            default:
                switch (i10) {
                    case 7:
                        return w.e.v(s0.g.f34069a, null, 7);
                    default:
                        return androidx.compose.animation.b.f1169b;
                }
        }
    }
}
