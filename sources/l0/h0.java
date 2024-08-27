package l0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class h0 extends iu.k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final h0 f23759b = new h0(0);

    /* renamed from: c, reason: collision with root package name */
    public static final h0 f23760c = new h0(1);

    /* renamed from: d, reason: collision with root package name */
    public static final h0 f23761d = new h0(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23762a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(int i10) {
        super(1);
        this.f23762a = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f23762a) {
            case 0:
                long j10 = ((m1.c) obj).f27237a;
                if (t0.t.e0(j10)) {
                    return new w.q(m1.c.d(j10), m1.c.e(j10));
                }
                return k0.f23783a;
            case 1:
                w.q qVar = (w.q) obj;
                return new m1.c(t0.t.g(qVar.f38641a, qVar.f38642b));
            default:
                return Unit.f23355a;
        }
    }
}
