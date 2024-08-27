package ib;

import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.assetgro.stockgro.feature_social.presentation.RiaProfileActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m0.v4;
import m0.w4;
import t0.g1;
import t0.o3;

/* loaded from: classes.dex */
public final class o extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19807a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComposeView f19808b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RiaProfileActivity f19809c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f19810d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(ComposeView composeView, RiaProfileActivity riaProfileActivity, ViewGroup viewGroup, int i10) {
        super(2);
        this.f19807a = i10;
        this.f19808b = composeView;
        this.f19809c = riaProfileActivity;
        this.f19810d = viewGroup;
    }

    public final void a(t0.n nVar, int i10) {
        Object obj = t0.m.f35080a;
        o3 o3Var = o3.f35116a;
        int i11 = this.f19807a;
        RiaProfileActivity riaProfileActivity = this.f19809c;
        ComposeView composeView = this.f19808b;
        switch (i11) {
            case 0:
                if ((i10 & 11) == 2) {
                    t0.r rVar = (t0.r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                }
                String simpleName = composeView.getParent().getClass().getSimpleName();
                t0.r rVar2 = (t0.r) nVar;
                Object g10 = v.e.g(rVar2, 773894976, -723523240);
                if (g10 == obj) {
                    g10 = v.e.o(t0.t.I(kotlin.coroutines.k.f23369a, rVar2), rVar2);
                }
                rVar2.s(false);
                qu.f0 f0Var = ((t0.d0) g10).f34970a;
                rVar2.s(false);
                w4 c10 = v4.c(null, null, rVar2, 6, 14);
                rVar2.b0(1853114622);
                Object Q = rVar2.Q();
                if (Q == obj) {
                    Q = t0.t.n0(Boolean.FALSE, o3Var);
                    rVar2.k0(Q);
                }
                rVar2.s(false);
                v4.a(b1.d.c(1553481737, new k(riaProfileActivity, f0Var, c10), rVar2), null, c10, false, null, s0.g.f34069a, n1.t.f28176h, 0L, 0L, b.f19760c, rVar2, 806879750, 442);
                iu.j.f(false, new j(1, c10, f0Var), rVar2, 0, 1);
                t0.t.e(c10.c(), new n(c10, this.f19810d, this.f19808b, simpleName, (g1) Q, null), rVar2);
                return;
            default:
                if ((i10 & 11) == 2) {
                    t0.r rVar3 = (t0.r) nVar;
                    if (rVar3.G()) {
                        rVar3.V();
                        return;
                    }
                }
                String simpleName2 = composeView.getParent().getClass().getSimpleName();
                t0.r rVar4 = (t0.r) nVar;
                Object g11 = v.e.g(rVar4, 773894976, -723523240);
                if (g11 == obj) {
                    g11 = v.e.o(t0.t.I(kotlin.coroutines.k.f23369a, rVar4), rVar4);
                }
                rVar4.s(false);
                qu.f0 f0Var2 = ((t0.d0) g11).f34970a;
                rVar4.s(false);
                w4 c11 = v4.c(null, null, rVar4, 6, 14);
                rVar4.b0(-1166278736);
                Object Q2 = rVar4.Q();
                if (Q2 == obj) {
                    Q2 = t0.t.n0(Boolean.FALSE, o3Var);
                    rVar4.k0(Q2);
                }
                rVar4.s(false);
                v4.a(b1.d.c(1484707859, new s(riaProfileActivity, f0Var2, c11), rVar4), null, c11, false, null, s0.g.f34069a, n1.t.f28176h, 0L, 0L, b.f19758a, rVar4, 806879750, 442);
                iu.j.f(false, new j(3, c11, f0Var2), rVar4, 0, 1);
                t0.t.e(c11.c(), new v(c11, this.f19810d, this.f19808b, simpleName2, (g1) Q2, null), rVar4);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f19807a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }
}
