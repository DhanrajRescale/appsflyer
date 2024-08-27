package v;

import kotlin.jvm.functions.Function1;
import w.p1;

/* loaded from: classes.dex */
public final class f0 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37500a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f37501b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(g0 g0Var, int i10) {
        super(1);
        this.f37500a = i10;
        this.f37501b = g0Var;
    }

    public final w.f0 a(p1 p1Var) {
        w.f0 f0Var;
        w.f0 f0Var2;
        z zVar = z.f37638c;
        z zVar2 = z.f37637b;
        z zVar3 = z.f37636a;
        int i10 = this.f37500a;
        g0 g0Var = this.f37501b;
        switch (i10) {
            case 0:
                w.f0 f0Var3 = null;
                if (p1Var.a(zVar3, zVar2)) {
                    t tVar = g0Var.f37508r.f37527a.f37623c;
                    if (tVar != null) {
                        f0Var3 = tVar.f37610c;
                    }
                } else if (p1Var.a(zVar2, zVar)) {
                    t tVar2 = g0Var.f37509s.f37532a.f37623c;
                    if (tVar2 != null) {
                        f0Var3 = tVar2.f37610c;
                    }
                } else {
                    f0Var3 = androidx.compose.animation.b.f1170c;
                }
                if (f0Var3 == null) {
                    return androidx.compose.animation.b.f1170c;
                }
                return f0Var3;
            default:
                if (p1Var.a(zVar3, zVar2)) {
                    r0 r0Var = g0Var.f37508r.f37527a.f37622b;
                    if (r0Var == null || (f0Var2 = r0Var.f37605b) == null) {
                        return androidx.compose.animation.b.f1169b;
                    }
                    return f0Var2;
                }
                if (p1Var.a(zVar2, zVar)) {
                    r0 r0Var2 = g0Var.f37509s.f37532a.f37622b;
                    if (r0Var2 == null || (f0Var = r0Var2.f37605b) == null) {
                        return androidx.compose.animation.b.f1169b;
                    }
                    return f0Var;
                }
                return androidx.compose.animation.b.f1169b;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f37500a) {
            case 0:
                return a((p1) obj);
            default:
                return a((p1) obj);
        }
    }
}
