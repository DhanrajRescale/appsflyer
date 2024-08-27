package r1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class d0 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32874a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f32875b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(e0 e0Var, int i10) {
        super(1);
        this.f32874a = i10;
        this.f32875b = e0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f32874a;
        e0 e0Var = this.f32875b;
        switch (i10) {
            case 0:
                e0Var.f32889d = true;
                e0Var.f32891f.mo2invoke();
                return Unit.f23355a;
            default:
                p1.h hVar = (p1.h) obj;
                c cVar = e0Var.f32887b;
                float f10 = e0Var.f32896k;
                float f11 = e0Var.f32897l;
                long j10 = m1.c.f27233b;
                p1.b f02 = hVar.f0();
                long b10 = f02.b();
                f02.a().h();
                f02.f30498a.c(f10, f11, j10);
                cVar.a(hVar);
                f02.a().s();
                f02.c(b10);
                return Unit.f23355a;
        }
    }
}
