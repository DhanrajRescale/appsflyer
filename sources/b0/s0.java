package b0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class s0 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2994a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2995b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a2.a1 f2996c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2997d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0(int i10, a2.a1 a1Var, int i11, int i12) {
        super(1);
        this.f2994a = i12;
        this.f2995b = i10;
        this.f2996c = a1Var;
        this.f2997d = i11;
    }

    public final void a(a2.z0 z0Var) {
        int i10 = this.f2994a;
        int i11 = this.f2997d;
        int i12 = this.f2995b;
        a2.a1 a1Var = this.f2996c;
        switch (i10) {
            case 0:
                z0Var.getClass();
                a2.z0.c(a1Var, i12, i11, s0.g.f34069a);
                return;
            case 1:
                int b10 = ku.c.b((i12 - a1Var.f29a) / 2.0f);
                int b11 = ku.c.b((i11 - a1Var.f30b) / 2.0f);
                z0Var.getClass();
                a2.z0.c(a1Var, b10, b11, s0.g.f34069a);
                return;
            default:
                int b12 = ku.c.b((i12 - a1Var.f29a) / 2.0f);
                int b13 = ku.c.b((i11 - a1Var.f30b) / 2.0f);
                z0Var.getClass();
                a2.z0.c(a1Var, b12, b13, s0.g.f34069a);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f2994a) {
            case 0:
                a((a2.z0) obj);
                return Unit.f23355a;
            case 1:
                a((a2.z0) obj);
                return Unit.f23355a;
            default:
                a((a2.z0) obj);
                return Unit.f23355a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(a2.a1 a1Var, int i10, int i11) {
        super(1);
        this.f2994a = 0;
        this.f2996c = a1Var;
        this.f2995b = i10;
        this.f2997d = i11;
    }
}
