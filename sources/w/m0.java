package w;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class m0 extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38605a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qu.f0 f38606b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(qu.f0 f0Var, int i10) {
        super(0);
        this.f38605a = i10;
        this.f38606b = f0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        int i10 = this.f38605a;
        qu.f0 f0Var = this.f38606b;
        switch (i10) {
            case 0:
                return Float.valueOf(e.q(f0Var.H()));
            default:
                hl.f.A(f0Var, null);
                return Unit.f23355a;
        }
    }
}
