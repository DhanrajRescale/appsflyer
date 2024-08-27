package bj;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ut.p;
import vt.g0;

/* loaded from: classes.dex */
public final class l extends iu.k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final l f7017b = new l(0);

    /* renamed from: c, reason: collision with root package name */
    public static final l f7018c = new l(1);

    /* renamed from: d, reason: collision with root package name */
    public static final l f7019d = new l(2);

    /* renamed from: e, reason: collision with root package name */
    public static final l f7020e = new l(3);

    /* renamed from: f, reason: collision with root package name */
    public static final l f7021f = new l(4);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7022a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i10) {
        super(1);
        this.f7022a = i10;
    }

    public final String a(zi.l lVar) {
        switch (this.f7022a) {
            case 2:
                if (lVar.f42495b != null) {
                    return ij.h.m(ij.h.f20067a, r4.f42506d);
                }
                return null;
            default:
                return ((zi.i) g0.u(lVar.f42494a.f42493b)).f42487a;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z10;
        switch (this.f7022a) {
            case 0:
                return Unit.f23355a;
            case 1:
                if (((zi.l) obj).f42495b != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 2:
                return a((zi.l) obj);
            case 3:
                zi.n nVar = ((zi.l) obj).f42495b;
                if (nVar != null) {
                    return new p(nVar.f42503a.a(), nVar.f42505c.a(), nVar.f42504b.a());
                }
                return null;
            default:
                return a((zi.l) obj);
        }
    }
}
