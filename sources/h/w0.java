package h;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class w0 extends k.b implements l.m {

    /* renamed from: c, reason: collision with root package name */
    public final Context f17760c;

    /* renamed from: d, reason: collision with root package name */
    public final l.o f17761d;

    /* renamed from: e, reason: collision with root package name */
    public k.a f17762e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f17763f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x0 f17764g;

    public w0(x0 x0Var, Context context, u uVar) {
        this.f17764g = x0Var;
        this.f17760c = context;
        this.f17762e = uVar;
        l.o oVar = new l.o(context);
        oVar.f23647l = 1;
        this.f17761d = oVar;
        oVar.f23640e = this;
    }

    @Override // k.b
    public final void a() {
        x0 x0Var = this.f17764g;
        if (x0Var.f17773o != this) {
            return;
        }
        boolean z10 = x0Var.f17780v;
        boolean z11 = x0Var.f17781w;
        if (!z10 && !z11) {
            this.f17762e.d(this);
        } else {
            x0Var.f17774p = this;
            x0Var.f17775q = this.f17762e;
        }
        this.f17762e = null;
        x0Var.t0(false);
        ActionBarContextView actionBarContextView = x0Var.f17770l;
        if (actionBarContextView.f941k == null) {
            actionBarContextView.e();
        }
        x0Var.f17767i.setHideOnContentScrollEnabled(x0Var.B);
        x0Var.f17773o = null;
    }

    @Override // k.b
    public final View b() {
        WeakReference weakReference = this.f17763f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // k.b
    public final Menu c() {
        return this.f17761d;
    }

    @Override // k.b
    public final MenuInflater d() {
        return new k.j(this.f17760c);
    }

    @Override // k.b
    public final CharSequence e() {
        return this.f17764g.f17770l.getSubtitle();
    }

    @Override // k.b
    public final CharSequence f() {
        return this.f17764g.f17770l.getTitle();
    }

    @Override // k.b
    public final void g() {
        if (this.f17764g.f17773o != this) {
            return;
        }
        l.o oVar = this.f17761d;
        oVar.z();
        try {
            this.f17762e.b(this, oVar);
        } finally {
            oVar.y();
        }
    }

    @Override // k.b
    public final boolean h() {
        return this.f17764g.f17770l.f949s;
    }

    @Override // k.b
    public final void i(View view) {
        this.f17764g.f17770l.setCustomView(view);
        this.f17763f = new WeakReference(view);
    }

    @Override // k.b
    public final void j(int i10) {
        k(this.f17764g.f17765g.getResources().getString(i10));
    }

    @Override // k.b
    public final void k(CharSequence charSequence) {
        this.f17764g.f17770l.setSubtitle(charSequence);
    }

    @Override // k.b
    public final void l(int i10) {
        m(this.f17764g.f17765g.getResources().getString(i10));
    }

    @Override // k.b
    public final void m(CharSequence charSequence) {
        this.f17764g.f17770l.setTitle(charSequence);
    }

    @Override // l.m
    public final void n(l.o oVar) {
        if (this.f17762e == null) {
            return;
        }
        g();
        m.n nVar = this.f17764g.f17770l.f934d;
        if (nVar != null) {
            nVar.n();
        }
    }

    @Override // k.b
    public final void o(boolean z10) {
        this.f21747b = z10;
        this.f17764g.f17770l.setTitleOptional(z10);
    }

    @Override // l.m
    public final boolean v(l.o oVar, MenuItem menuItem) {
        k.a aVar = this.f17762e;
        if (aVar != null) {
            return aVar.a(this, menuItem);
        }
        return false;
    }
}
