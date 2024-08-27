package h;

import android.content.Context;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.Window;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import d4.n1;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m.s3;
import m.w3;

/* loaded from: classes.dex */
public final class s0 extends vl.b {

    /* renamed from: g, reason: collision with root package name */
    public final w3 f17738g;

    /* renamed from: h, reason: collision with root package name */
    public final Window.Callback f17739h;

    /* renamed from: i, reason: collision with root package name */
    public final e.l f17740i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f17741j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f17742k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f17743l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f17744m = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public final q0 f17745n = new q0(this, 0);

    public s0(Toolbar toolbar, CharSequence charSequence, y yVar) {
        t9.c cVar = new t9.c(this, 3);
        toolbar.getClass();
        w3 w3Var = new w3(toolbar, false);
        this.f17738g = w3Var;
        yVar.getClass();
        this.f17739h = yVar;
        w3Var.f25790k = yVar;
        toolbar.setOnMenuItemClickListener(cVar);
        if (!w3Var.f25786g) {
            w3Var.f25787h = charSequence;
            if ((w3Var.f25781b & 8) != 0) {
                Toolbar toolbar2 = w3Var.f25780a;
                toolbar2.setTitle(charSequence);
                if (w3Var.f25786g) {
                    n1.o(toolbar2.getRootView(), charSequence);
                }
            }
        }
        this.f17740i = new e.l(this, 3);
    }

    @Override // vl.b
    public final Context C() {
        return this.f17738g.f25780a.getContext();
    }

    @Override // vl.b
    public final void F() {
        this.f17738g.f25780a.setVisibility(8);
    }

    @Override // vl.b
    public final boolean G() {
        w3 w3Var = this.f17738g;
        Toolbar toolbar = w3Var.f25780a;
        q0 q0Var = this.f17745n;
        toolbar.removeCallbacks(q0Var);
        Toolbar toolbar2 = w3Var.f25780a;
        WeakHashMap weakHashMap = n1.f13788a;
        d4.v0.m(toolbar2, q0Var);
        return true;
    }

    @Override // vl.b
    public final void J() {
    }

    @Override // vl.b
    public final void K() {
        this.f17738g.f25780a.removeCallbacks(this.f17745n);
    }

    @Override // vl.b
    public final boolean L(int i10, KeyEvent keyEvent) {
        int i11;
        Menu t02 = t0();
        if (t02 == null) {
            return false;
        }
        if (keyEvent != null) {
            i11 = keyEvent.getDeviceId();
        } else {
            i11 = -1;
        }
        boolean z10 = true;
        if (KeyCharacterMap.load(i11).getKeyboardType() == 1) {
            z10 = false;
        }
        t02.setQwertyMode(z10);
        return t02.performShortcut(i10, keyEvent, 0);
    }

    @Override // vl.b
    public final boolean M(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            Y();
        }
        return true;
    }

    @Override // vl.b
    public final boolean Y() {
        return this.f17738g.f25780a.w();
    }

    @Override // vl.b
    public final boolean g() {
        m.n nVar;
        ActionMenuView actionMenuView = this.f17738g.f25780a.f1107a;
        if (actionMenuView != null && (nVar = actionMenuView.f981t) != null && nVar.f()) {
            return true;
        }
        return false;
    }

    @Override // vl.b
    public final boolean i() {
        l.q qVar;
        s3 s3Var = this.f17738g.f25780a.f1116g0;
        if (s3Var != null && (qVar = s3Var.f25719b) != null) {
            if (s3Var == null) {
                qVar = null;
            }
            if (qVar != null) {
                qVar.collapseActionView();
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // vl.b
    public final void i0(boolean z10) {
    }

    @Override // vl.b
    public final void j0() {
        w3 w3Var = this.f17738g;
        w3Var.a(w3Var.f25781b & (-9));
    }

    @Override // vl.b
    public final void k0(boolean z10) {
    }

    @Override // vl.b
    public final void l0(String str) {
        w3 w3Var = this.f17738g;
        w3Var.f25786g = true;
        w3Var.f25787h = str;
        if ((w3Var.f25781b & 8) != 0) {
            Toolbar toolbar = w3Var.f25780a;
            toolbar.setTitle(str);
            if (w3Var.f25786g) {
                n1.o(toolbar.getRootView(), str);
            }
        }
    }

    @Override // vl.b
    public final void m(boolean z10) {
        if (z10 == this.f17743l) {
            return;
        }
        this.f17743l = z10;
        ArrayList arrayList = this.f17744m;
        if (arrayList.size() <= 0) {
            return;
        }
        a3.a.u(arrayList.get(0));
        throw null;
    }

    @Override // vl.b
    public final void n0(CharSequence charSequence) {
        w3 w3Var = this.f17738g;
        if (!w3Var.f25786g) {
            w3Var.f25787h = charSequence;
            if ((w3Var.f25781b & 8) != 0) {
                Toolbar toolbar = w3Var.f25780a;
                toolbar.setTitle(charSequence);
                if (w3Var.f25786g) {
                    n1.o(toolbar.getRootView(), charSequence);
                }
            }
        }
    }

    @Override // vl.b
    public final int s() {
        return this.f17738g.f25781b;
    }

    public final Menu t0() {
        boolean z10 = this.f17742k;
        w3 w3Var = this.f17738g;
        if (!z10) {
            r0 r0Var = new r0(this);
            hr.c cVar = new hr.c(this, 1);
            Toolbar toolbar = w3Var.f25780a;
            toolbar.f1118h0 = r0Var;
            toolbar.f1120i0 = cVar;
            ActionMenuView actionMenuView = toolbar.f1107a;
            if (actionMenuView != null) {
                actionMenuView.f982u = r0Var;
                actionMenuView.f983v = cVar;
            }
            this.f17742k = true;
        }
        return w3Var.f25780a.getMenu();
    }
}
