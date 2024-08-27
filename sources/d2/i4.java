package d2;

import com.assetgro.stockgro.prod.R;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class i4 implements t0.u, androidx.lifecycle.r {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f13460a;

    /* renamed from: b, reason: collision with root package name */
    public final t0.u f13461b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f13462c;

    /* renamed from: d, reason: collision with root package name */
    public androidx.lifecycle.o f13463d;

    /* renamed from: e, reason: collision with root package name */
    public Function2 f13464e = r1.f13601a;

    public i4(a0 a0Var, t0.y yVar) {
        this.f13460a = a0Var;
        this.f13461b = yVar;
    }

    @Override // t0.u
    public final void a() {
        if (!this.f13462c) {
            this.f13462c = true;
            this.f13460a.getView().setTag(R.id.wrapped_composition_tag, null);
            androidx.lifecycle.o oVar = this.f13463d;
            if (oVar != null) {
                oVar.c(this);
            }
        }
        this.f13461b.a();
    }

    @Override // androidx.lifecycle.r
    public final void c(androidx.lifecycle.t tVar, androidx.lifecycle.m mVar) {
        if (mVar == androidx.lifecycle.m.ON_DESTROY) {
            a();
        } else if (mVar == androidx.lifecycle.m.ON_CREATE && !this.f13462c) {
            e(this.f13464e);
        }
    }

    @Override // t0.u
    public final void e(Function2 function2) {
        this.f13460a.setOnViewTreeOwnersAvailable(new y0(4, this, function2));
    }
}
