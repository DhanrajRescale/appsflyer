package pd;

import a2.m0;
import a2.n0;
import a2.o0;
import java.util.List;
import t0.g1;
import vt.p0;

/* loaded from: classes.dex */
public final class k implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30921a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f30922b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b3.s f30923c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b3.n f30924d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g1 f30925e;

    public /* synthetic */ k(g1 g1Var, b3.s sVar, b3.n nVar, g1 g1Var2, int i10) {
        this.f30921a = i10;
        this.f30922b = g1Var;
        this.f30923c = sVar;
        this.f30924d = nVar;
        this.f30925e = g1Var2;
    }

    @Override // a2.m0
    public final n0 a(o0 o0Var, List list, long j10) {
        n0 n0;
        n0 n02;
        n0 n03;
        int i10 = this.f30921a;
        b3.s sVar = this.f30923c;
        g1 g1Var = this.f30925e;
        g1 g1Var2 = this.f30922b;
        switch (i10) {
            case 0:
                g1Var2.getValue();
                long f10 = this.f30923c.f(j10, o0Var.getLayoutDirection(), this.f30924d, list, 257);
                g1Var.getValue();
                n0 = o0Var.n0((int) (f10 >> 32), (int) (f10 & 4294967295L), p0.d(), new j(sVar, list, 0));
                return n0;
            case 1:
                g1Var2.getValue();
                long f11 = this.f30923c.f(j10, o0Var.getLayoutDirection(), this.f30924d, list, 257);
                g1Var.getValue();
                n02 = o0Var.n0((int) (f11 >> 32), (int) (f11 & 4294967295L), p0.d(), new j(sVar, list, 1));
                return n02;
            default:
                g1Var2.getValue();
                long f12 = this.f30923c.f(j10, o0Var.getLayoutDirection(), this.f30924d, list, 257);
                g1Var.getValue();
                n03 = o0Var.n0((int) (f12 >> 32), (int) (f12 & 4294967295L), p0.d(), new j(sVar, list, 2));
                return n03;
        }
    }
}
