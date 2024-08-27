package i0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class l0 extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19038a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0.v0 f19039b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(l0.v0 v0Var, int i10) {
        super(0);
        this.f19038a = i10;
        this.f19039b = v0Var;
    }

    public final void a() {
        int i10 = this.f19038a;
        l0.v0 v0Var = this.f19039b;
        switch (i10) {
            case 4:
                v0Var.d(true);
                v0Var.l();
                return;
            case 5:
                v0Var.f();
                v0Var.l();
                return;
            case 6:
                v0Var.m();
                v0Var.l();
                return;
            default:
                p2.c0 e10 = l0.v0.e(v0Var.k().f30522a, d2.w0.b(0, v0Var.k().f30522a.f20699a.length()));
                v0Var.f23838c.invoke(e10);
                v0Var.f23852q = p2.c0.a(v0Var.f23852q, null, e10.f30523b, 5);
                v0Var.h(true);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Boolean mo2invoke() {
        int i10 = this.f19038a;
        l0.v0 v0Var = this.f19039b;
        switch (i10) {
            case 0:
                v0Var.m();
                return Boolean.TRUE;
            case 1:
                v0Var.h(true);
                return Boolean.TRUE;
            case 2:
                v0Var.d(true);
                return Boolean.TRUE;
            default:
                v0Var.f();
                return Boolean.TRUE;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* bridge */ /* synthetic */ Object mo2invoke() {
        switch (this.f19038a) {
            case 0:
                return mo2invoke();
            case 1:
                return mo2invoke();
            case 2:
                return mo2invoke();
            case 3:
                return mo2invoke();
            case 4:
                a();
                return Unit.f23355a;
            case 5:
                a();
                return Unit.f23355a;
            case 6:
                a();
                return Unit.f23355a;
            default:
                a();
                return Unit.f23355a;
        }
    }
}
