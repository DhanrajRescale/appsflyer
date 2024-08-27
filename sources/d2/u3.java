package d2;

import android.view.View;
import com.assetgro.stockgro.prod.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class u3 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f13649a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t0.f2 f13650b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f13651c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(t0.f2 f2Var, View view, yt.a aVar) {
        super(2, aVar);
        this.f13650b = f2Var;
        this.f13651c = view;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new u3(this.f13650b, this.f13651c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((u3) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [au.i, kotlin.jvm.functions.Function2] */
    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = zt.a.f42823a;
        int i10 = this.f13649a;
        t0.f2 f2Var = this.f13650b;
        View view = this.f13651c;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    ut.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ut.n.b(obj);
                this.f13649a = 1;
                Object U = el.l.U(f2Var.f35015r, new au.i(2, null), this);
                if (U != obj2) {
                    U = Unit.f23355a;
                }
                if (U == obj2) {
                    return obj2;
                }
            }
            return Unit.f23355a;
        } finally {
            if (e4.b(view) == f2Var) {
                view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
            }
        }
    }
}
