package v;

import kotlin.jvm.functions.Function0;
import w.u1;

/* loaded from: classes.dex */
public final class i extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37528a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u1 f37529b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(u1 u1Var, int i10) {
        super(0);
        this.f37528a = i10;
        this.f37529b = u1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        boolean z10;
        int i10 = this.f37528a;
        u1 u1Var = this.f37529b;
        switch (i10) {
            case 0:
                Object c10 = u1Var.c();
                z zVar = z.f37638c;
                if (c10 == zVar && u1Var.f38689c.getValue() == zVar) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                return Long.valueOf(u1Var.b());
        }
    }
}
