package l0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class e extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f23741a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f23742b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f23743c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(n nVar, boolean z10, boolean z11) {
        super(1);
        this.f23741a = nVar;
        this.f23742b = z10;
        this.f23743c = z11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        i0.z0 z0Var;
        int i10;
        h2.v vVar = (h2.v) obj;
        long a10 = this.f23741a.a();
        h2.u uVar = e0.f23746c;
        if (this.f23742b) {
            z0Var = i0.z0.f19289b;
        } else {
            z0Var = i0.z0.f19290c;
        }
        i0.z0 z0Var2 = z0Var;
        if (this.f23743c) {
            i10 = 1;
        } else {
            i10 = 3;
        }
        ((h2.j) vVar).h(uVar, new d0(z0Var2, a10, i10, t0.t.e0(a10)));
        return Unit.f23355a;
    }
}
