package v;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import w.p1;

/* loaded from: classes.dex */
public final class b0 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37482a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f37483b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i0 f37484c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(h0 h0Var, i0 i0Var, int i10) {
        super(1);
        this.f37482a = i10;
        this.f37483b = h0Var;
        this.f37484c = i0Var;
    }

    public final Float a(z zVar) {
        int i10 = this.f37482a;
        float f10 = 1.0f;
        h0 h0Var = this.f37483b;
        i0 i0Var = this.f37484c;
        switch (i10) {
            case 1:
                int ordinal = zVar.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            j0 j0Var = i0Var.f37532a.f37621a;
                            if (j0Var != null) {
                                f10 = j0Var.f37537a;
                            }
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                } else {
                    j0 j0Var2 = h0Var.f37527a.f37621a;
                    if (j0Var2 != null) {
                        f10 = j0Var2.f37537a;
                    }
                }
                return Float.valueOf(f10);
            default:
                int ordinal2 = zVar.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        if (ordinal2 == 2) {
                            i0Var.f37532a.getClass();
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                } else {
                    h0Var.f37527a.getClass();
                }
                return Float.valueOf(1.0f);
        }
    }

    public final w.f0 d(p1 p1Var) {
        w.f0 f0Var;
        w.f0 f0Var2;
        z zVar = z.f37638c;
        z zVar2 = z.f37637b;
        z zVar3 = z.f37636a;
        int i10 = this.f37482a;
        i0 i0Var = this.f37484c;
        h0 h0Var = this.f37483b;
        switch (i10) {
            case 0:
                if (p1Var.a(zVar3, zVar2)) {
                    j0 j0Var = h0Var.f37527a.f37621a;
                    if (j0Var == null || (f0Var2 = j0Var.f37538b) == null) {
                        return androidx.compose.animation.b.f1168a;
                    }
                    return f0Var2;
                }
                if (p1Var.a(zVar2, zVar)) {
                    j0 j0Var2 = i0Var.f37532a.f37621a;
                    if (j0Var2 == null || (f0Var = j0Var2.f37538b) == null) {
                        return androidx.compose.animation.b.f1168a;
                    }
                    return f0Var;
                }
                return androidx.compose.animation.b.f1168a;
            default:
                if (p1Var.a(zVar3, zVar2)) {
                    h0Var.f37527a.getClass();
                    return androidx.compose.animation.b.f1168a;
                }
                if (p1Var.a(zVar2, zVar)) {
                    i0Var.f37532a.getClass();
                    return androidx.compose.animation.b.f1168a;
                }
                return androidx.compose.animation.b.f1168a;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f37482a) {
            case 0:
                return d((p1) obj);
            case 1:
                return a((z) obj);
            case 2:
                return d((p1) obj);
            default:
                return a((z) obj);
        }
    }
}
