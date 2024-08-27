package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: classes.dex */
public class i0 extends o implements SubMenu {
    public final q A;

    /* renamed from: z, reason: collision with root package name */
    public final o f23620z;

    public i0(Context context, o oVar, q qVar) {
        super(context);
        this.f23620z = oVar;
        this.A = qVar;
    }

    @Override // l.o
    public final boolean d(q qVar) {
        return this.f23620z.d(qVar);
    }

    @Override // l.o
    public final boolean e(o oVar, MenuItem menuItem) {
        if (!super.e(oVar, menuItem) && !this.f23620z.e(oVar, menuItem)) {
            return false;
        }
        return true;
    }

    @Override // l.o
    public final boolean f(q qVar) {
        return this.f23620z.f(qVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.A;
    }

    @Override // l.o
    public final String j() {
        int i10;
        q qVar = this.A;
        if (qVar != null) {
            i10 = qVar.f23663a;
        } else {
            i10 = 0;
        }
        if (i10 == 0) {
            return null;
        }
        return jr.h.n("android:menu:actionviewstates:", i10);
    }

    @Override // l.o
    public final o k() {
        return this.f23620z.k();
    }

    @Override // l.o
    public final boolean m() {
        return this.f23620z.m();
    }

    @Override // l.o
    public final boolean n() {
        return this.f23620z.n();
    }

    @Override // l.o
    public final boolean o() {
        return this.f23620z.o();
    }

    @Override // l.o, android.view.Menu
    public final void setGroupDividerEnabled(boolean z10) {
        this.f23620z.setGroupDividerEnabled(z10);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        x(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        x(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        x(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.A.setIcon(drawable);
        return this;
    }

    @Override // l.o, android.view.Menu
    public final void setQwertyMode(boolean z10) {
        this.f23620z.setQwertyMode(z10);
    }

    @Override // l.o
    public final void w(m mVar) {
        throw null;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i10) {
        x(0, null, i10, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i10) {
        x(i10, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i10) {
        this.A.setIcon(i10);
        return this;
    }
}
