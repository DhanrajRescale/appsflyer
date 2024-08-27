package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class u1 extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26873a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v1 f26874b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u1(v1 v1Var, int i10) {
        super(0);
        this.f26873a = i10;
        this.f26874b = v1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        int i10 = this.f26873a;
        v1 v1Var = this.f26874b;
        switch (i10) {
            case 0:
                q0.i iVar = ((m5) c2.g.p(v1Var, n5.f26535b)).f26494c;
                if (iVar == null) {
                    long j10 = ((n1.t) c2.g.p(v1Var, e1.f26084a)).f28179a;
                    if (((v0) c2.g.p(v1Var, x0.f27075a)).e()) {
                        if (androidx.compose.ui.graphics.a.t(j10) > 0.5d) {
                            return n5.f26538e;
                        }
                        return n5.f26539f;
                    }
                    return n5.f26540g;
                }
                return iVar;
            default:
                v1Var.T0();
                return Unit.f23355a;
        }
    }
}
