package e0;

import kotlin.jvm.functions.Function0;
import t0.l1;

/* loaded from: classes.dex */
public final class g extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14685a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f14686b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(j0 j0Var, int i10) {
        super(0);
        this.f14685a = i10;
        this.f14686b = j0Var;
    }

    public final Integer a() {
        int i10;
        int i11;
        int i12 = this.f14685a;
        j0 j0Var = this.f14686b;
        switch (i12) {
            case 0:
                return Integer.valueOf(j0Var.j());
            case 1:
                return Integer.valueOf(j0Var.j());
            case 2:
                if (j0Var.f14725k.a()) {
                    i10 = j0Var.f14734t.i();
                } else {
                    i10 = j0Var.f14718d.f14650b.i();
                }
                return Integer.valueOf(i10);
            default:
                boolean a10 = j0Var.f14725k.a();
                c0 c0Var = j0Var.f14718d;
                if (!a10) {
                    i11 = c0Var.f14650b.i();
                } else {
                    l1 l1Var = j0Var.f14733s;
                    if (l1Var.i() != -1) {
                        i11 = l1Var.i();
                    } else if (Math.abs(c0Var.f14651c.i()) >= Math.abs(Math.min(j0Var.f14731q.c0(m0.f14759a), j0Var.k() / 2.0f) / j0Var.k())) {
                        if (((Boolean) j0Var.f14717c.getValue()).booleanValue()) {
                            i11 = j0Var.f14719e + 1;
                        } else {
                            i11 = j0Var.f14719e;
                        }
                    } else {
                        i11 = c0Var.f14650b.i();
                    }
                }
                return Integer.valueOf(j0Var.h(i11));
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* bridge */ /* synthetic */ Object mo2invoke() {
        switch (this.f14685a) {
            case 0:
                return a();
            case 1:
                return a();
            case 2:
                return a();
            default:
                return a();
        }
    }
}
