package m0;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class w0 extends iu.k implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public static final w0 f26991b = new w0(0);

    /* renamed from: c, reason: collision with root package name */
    public static final w0 f26992c = new w0(1);

    /* renamed from: d, reason: collision with root package name */
    public static final w0 f26993d = new w0(2);

    /* renamed from: e, reason: collision with root package name */
    public static final w0 f26994e = new w0(3);

    /* renamed from: f, reason: collision with root package name */
    public static final w0 f26995f = new w0(4);

    /* renamed from: g, reason: collision with root package name */
    public static final w0 f26996g = new w0(5);

    /* renamed from: h, reason: collision with root package name */
    public static final w0 f26997h = new w0(6);

    /* renamed from: i, reason: collision with root package name */
    public static final w0 f26998i = new w0(7);

    /* renamed from: j, reason: collision with root package name */
    public static final w0 f26999j = new w0(8);

    /* renamed from: k, reason: collision with root package name */
    public static final w0 f27000k = new w0(9);

    /* renamed from: l, reason: collision with root package name */
    public static final w0 f27001l = new w0(10);

    /* renamed from: m, reason: collision with root package name */
    public static final w0 f27002m = new w0(11);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27003a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w0(int i10) {
        super(0);
        this.f27003a = i10;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        int i10 = this.f27003a;
        switch (i10) {
            case 0:
                t0.m3 m3Var = x0.f27075a;
                long d10 = androidx.compose.ui.graphics.a.d(4284612846L);
                long d11 = androidx.compose.ui.graphics.a.d(4281794739L);
                long d12 = androidx.compose.ui.graphics.a.d(4278442694L);
                long d13 = androidx.compose.ui.graphics.a.d(4278290310L);
                long j10 = n1.t.f28173e;
                long d14 = androidx.compose.ui.graphics.a.d(4289724448L);
                long j11 = n1.t.f28170b;
                return new v0(d10, d11, d12, d13, j10, j10, d14, j10, j11, j11, j11, j10);
            case 1:
                return Float.valueOf(1.0f);
            case 2:
                return new n1.t(n1.t.f28170b);
            case 3:
                return new w2.e(0);
            case 4:
                return l1.f26444a;
            case 5:
                switch (i10) {
                    case 5:
                        return Boolean.TRUE;
                    default:
                        return Boolean.FALSE;
                }
            case 6:
                return new m5();
            case 7:
                switch (i10) {
                    case 5:
                        return Boolean.TRUE;
                    default:
                        return Boolean.FALSE;
                }
            case 8:
                return null;
            case 9:
                return new e6();
            case 10:
                return d9.f26075a;
            default:
                return new c9();
        }
    }
}
