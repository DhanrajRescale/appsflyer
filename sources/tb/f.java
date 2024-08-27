package tb;

import c0.a0;
import c0.b0;
import c0.m0;
import kotlin.jvm.functions.Function0;
import vt.g0;

/* loaded from: classes.dex */
public final class f extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35700a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f35701b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(m0 m0Var, int i10) {
        super(0);
        this.f35700a = i10;
        this.f35701b = m0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        m0 m0Var = this.f35701b;
        int i10 = this.f35700a;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        return m0Var.g();
                    default:
                        if (m0Var != null) {
                            return m0Var.g();
                        }
                        return null;
                }
            case 1:
                return mo2invoke();
            case 2:
                switch (i10) {
                    case 0:
                        return m0Var.g();
                    default:
                        if (m0Var != null) {
                            return m0Var.g();
                        }
                        return null;
                }
            default:
                return mo2invoke();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Boolean mo2invoke() {
        int i10 = this.f35700a;
        m0 m0Var = this.f35701b;
        switch (i10) {
            case 1:
                c0.n nVar = (c0.n) g0.D(((a0) m0Var.g()).f7447j);
                if (nVar == null) {
                    return Boolean.FALSE;
                }
                return Boolean.valueOf(((b0) nVar).f7464a == ((a0) m0Var.g()).f7450m - 1);
            default:
                c0.n nVar2 = (c0.n) g0.D(((a0) m0Var.g()).f7447j);
                if (nVar2 == null) {
                    return Boolean.FALSE;
                }
                return Boolean.valueOf(((b0) nVar2).f7464a == ((a0) m0Var.g()).f7450m - 1);
        }
    }
}
