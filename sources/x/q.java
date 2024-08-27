package x;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class q extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39680a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a2.a1 f39681b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f39682c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(int i10, a2.a1 a1Var) {
        super(1);
        this.f39680a = 2;
        this.f39682c = i10;
        this.f39681b = a1Var;
    }

    public final void a(a2.z0 z0Var) {
        int i10 = this.f39680a;
        a2.a1 a1Var = this.f39681b;
        int i11 = this.f39682c;
        switch (i10) {
            case 0:
                int i12 = (-i11) / 2;
                a2.z0.k(z0Var, a1Var, i12 - ((a1Var.f29a - a1Var.d0()) / 2), i12 - ((a1Var.f30b - a1Var.b0()) / 2), null, 12);
                return;
            case 1:
                int i13 = i11 / 2;
                z0Var.getClass();
                a2.z0.c(a1Var, i13, i13, s0.g.f34069a);
                return;
            case 2:
                a2.z0.g(z0Var, a1Var, 0, (i11 - a1Var.f30b) / 2);
                return;
            default:
                z0Var.getClass();
                a2.z0.c(a1Var, 0, -i11, s0.g.f34069a);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f39680a) {
            case 0:
                a((a2.z0) obj);
                return Unit.f23355a;
            case 1:
                a((a2.z0) obj);
                return Unit.f23355a;
            case 2:
                a((a2.z0) obj);
                return Unit.f23355a;
            default:
                a((a2.z0) obj);
                return Unit.f23355a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(a2.a1 a1Var, int i10, int i11) {
        super(1);
        this.f39680a = i11;
        this.f39681b = a1Var;
        this.f39682c = i10;
    }
}
