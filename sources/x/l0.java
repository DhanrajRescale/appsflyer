package x;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class l0 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39625a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f39626b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(m0 m0Var, int i10) {
        super(1);
        this.f39625a = i10;
        this.f39626b = m0Var;
    }

    public final void a(long j10) {
        int i10 = this.f39625a;
        m0 m0Var = this.f39626b;
        switch (i10) {
            case 0:
                Function0 function0 = m0Var.H;
                if (function0 != null) {
                    function0.mo2invoke();
                    return;
                }
                return;
            case 1:
                Function0 function02 = m0Var.G;
                if (function02 != null) {
                    function02.mo2invoke();
                    return;
                }
                return;
            default:
                if (m0Var.f39606t) {
                    m0Var.f39607u.mo2invoke();
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Object invoke(Object obj) {
        switch (this.f39625a) {
            case 0:
                a(((m1.c) obj).f27237a);
                return Unit.f23355a;
            case 1:
                a(((m1.c) obj).f27237a);
                return Unit.f23355a;
            default:
                a(((m1.c) obj).f27237a);
                return Unit.f23355a;
        }
    }
}
