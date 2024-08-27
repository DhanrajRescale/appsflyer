package d2;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.assetgro.stockgro.prod.R;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class h4 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13448a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i4 f13449b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function2 f13450c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h4(i4 i4Var, Function2 function2, int i10) {
        super(2);
        this.f13448a = i10;
        this.f13449b = i4Var;
        this.f13450c = function2;
    }

    public final void a(t0.n nVar, int i10) {
        boolean z10;
        Set set;
        View view;
        Object obj;
        int i11 = this.f13448a;
        Function2 function2 = this.f13450c;
        int i12 = 0;
        i4 i4Var = this.f13449b;
        switch (i11) {
            case 0:
                if ((i10 & 3) == 2) {
                    t0.r rVar = (t0.r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                }
                AndroidCompositionLocals_androidKt.a(i4Var.f13460a, function2, nVar, 0);
                return;
            default:
                if ((i10 & 3) == 2) {
                    t0.r rVar2 = (t0.r) nVar;
                    if (rVar2.G()) {
                        rVar2.V();
                        return;
                    }
                }
                Object tag = i4Var.f13460a.getTag(R.id.inspection_slot_table_set);
                if ((tag instanceof Set) && (!(tag instanceof ju.a) || (tag instanceof ju.e))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    set = (Set) tag;
                } else {
                    set = null;
                }
                a0 a0Var = i4Var.f13460a;
                if (set == null) {
                    Object parent = a0Var.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                    } else {
                        view = null;
                    }
                    if (view != null) {
                        obj = view.getTag(R.id.inspection_slot_table_set);
                    } else {
                        obj = null;
                    }
                    if ((obj instanceof Set) && (!(obj instanceof ju.a) || (obj instanceof ju.e))) {
                        set = (Set) obj;
                    } else {
                        set = null;
                    }
                }
                if (set != null) {
                    t0.r rVar3 = (t0.r) nVar;
                    set.add(rVar3.f35168c);
                    rVar3.f35181p = true;
                    rVar3.B = true;
                    rVar3.f35168c.e();
                    rVar3.G.e();
                    t0.q2 q2Var = rVar3.H;
                    t0.o2 o2Var = q2Var.f35143a;
                    q2Var.f35147e = o2Var.f35114i;
                    q2Var.f35148f = o2Var.f35115j;
                }
                t0.r rVar4 = (t0.r) nVar;
                rVar4.b0(-1497286344);
                boolean j10 = rVar4.j(i4Var);
                Object Q = rVar4.Q();
                to.e eVar = t0.m.f35080a;
                if (j10 || Q == eVar) {
                    Q = new f4(i4Var, null);
                    rVar4.k0(Q);
                }
                rVar4.s(false);
                t0.t.e(a0Var, (Function2) Q, rVar4);
                rVar4.b0(-1497286198);
                boolean j11 = rVar4.j(i4Var);
                Object Q2 = rVar4.Q();
                if (j11 || Q2 == eVar) {
                    Q2 = new g4(i4Var, null);
                    rVar4.k0(Q2);
                }
                rVar4.s(false);
                t0.t.e(a0Var, (Function2) Q2, rVar4);
                dp.b.p(f1.b.f15905a.b(set), b1.d.b(rVar4, -1193460702, new h4(i4Var, function2, i12)), rVar4, 48);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f13448a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }
}
