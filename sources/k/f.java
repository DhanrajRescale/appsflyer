package k;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class f extends b implements l.m {

    /* renamed from: c, reason: collision with root package name */
    public Context f21754c;

    /* renamed from: d, reason: collision with root package name */
    public ActionBarContextView f21755d;

    /* renamed from: e, reason: collision with root package name */
    public a f21756e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f21757f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f21758g;

    /* renamed from: h, reason: collision with root package name */
    public l.o f21759h;

    @Override // k.b
    public final void a() {
        if (this.f21758g) {
            return;
        }
        this.f21758g = true;
        this.f21756e.d(this);
    }

    @Override // k.b
    public final View b() {
        WeakReference weakReference = this.f21757f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // k.b
    public final Menu c() {
        return this.f21759h;
    }

    @Override // k.b
    public final MenuInflater d() {
        return new j(this.f21755d.getContext());
    }

    @Override // k.b
    public final CharSequence e() {
        return this.f21755d.getSubtitle();
    }

    @Override // k.b
    public final CharSequence f() {
        return this.f21755d.getTitle();
    }

    @Override // k.b
    public final void g() {
        this.f21756e.b(this, this.f21759h);
    }

    @Override // k.b
    public final boolean h() {
        return this.f21755d.f949s;
    }

    @Override // k.b
    public final void i(View view) {
        WeakReference weakReference;
        this.f21755d.setCustomView(view);
        if (view != null) {
            weakReference = new WeakReference(view);
        } else {
            weakReference = null;
        }
        this.f21757f = weakReference;
    }

    @Override // k.b
    public final void j(int i10) {
        k(this.f21754c.getString(i10));
    }

    @Override // k.b
    public final void k(CharSequence charSequence) {
        this.f21755d.setSubtitle(charSequence);
    }

    @Override // k.b
    public final void l(int i10) {
        m(this.f21754c.getString(i10));
    }

    @Override // k.b
    public final void m(CharSequence charSequence) {
        this.f21755d.setTitle(charSequence);
    }

    @Override // l.m
    public final void n(l.o oVar) {
        g();
        m.n nVar = this.f21755d.f934d;
        if (nVar != null) {
            nVar.n();
        }
    }

    @Override // k.b
    public final void o(boolean z10) {
        this.f21747b = z10;
        this.f21755d.setTitleOptional(z10);
    }

    @Override // l.m
    public final boolean v(l.o oVar, MenuItem menuItem) {
        return this.f21756e.a(this, menuItem);
    }
}
