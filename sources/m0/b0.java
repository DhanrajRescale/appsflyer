package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class b0 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25917a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25918b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(t0.g1 g1Var, int i10) {
        super(2);
        this.f25917a = i10;
        this.f25918b = g1Var;
    }

    public final void a(w2.i iVar, w2.i iVar2) {
        int i10 = this.f25917a;
        Object obj = this.f25918b;
        switch (i10) {
            case 0:
                ((t0.g1) obj).setValue(new n1.b1(a4.c(iVar, iVar2)));
                return;
            default:
                ((t0.g1) obj).setValue(new n1.b1(a4.c(iVar, iVar2)));
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f25917a) {
            case 0:
                a((w2.i) obj, (w2.i) obj2);
                return Unit.f23355a;
            case 1:
                a((w2.i) obj, (w2.i) obj2);
                return Unit.f23355a;
            default:
                t0.n nVar = (t0.n) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    t0.r rVar = (t0.r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return Unit.f23355a;
                    }
                }
                a3.a.u(this.f25918b);
                throw null;
        }
    }
}
