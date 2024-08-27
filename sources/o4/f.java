package o4;

import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import h.q0;
import s0.g;

/* loaded from: classes.dex */
public final class f extends al.d {

    /* renamed from: b, reason: collision with root package name */
    public final int f29577b;

    /* renamed from: c, reason: collision with root package name */
    public l4.e f29578c;

    /* renamed from: d, reason: collision with root package name */
    public final q0 f29579d = new q0(this, 8);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ DrawerLayout f29580e;

    public f(DrawerLayout drawerLayout, int i10) {
        this.f29580e = drawerLayout;
        this.f29577b = i10;
    }

    @Override // al.d
    public final void E0(int i10, int i11) {
        View e10;
        int i12 = i10 & 1;
        DrawerLayout drawerLayout = this.f29580e;
        if (i12 == 1) {
            e10 = drawerLayout.e(3);
        } else {
            e10 = drawerLayout.e(5);
        }
        if (e10 != null && drawerLayout.h(e10) == 0) {
            this.f29578c.b(e10, i11);
        }
    }

    @Override // al.d
    public final void F0() {
        this.f29580e.postDelayed(this.f29579d, 160L);
    }

    @Override // al.d
    public final void G0(View view, int i10) {
        ((d) view.getLayoutParams()).f29570c = false;
        int i11 = 3;
        if (this.f29577b == 3) {
            i11 = 5;
        }
        DrawerLayout drawerLayout = this.f29580e;
        View e10 = drawerLayout.e(i11);
        if (e10 != null) {
            drawerLayout.c(e10);
        }
    }

    @Override // al.d
    public final void H0(int i10) {
        this.f29580e.t(this.f29578c.f23974t, i10);
    }

    @Override // al.d
    public final void I0(View view, int i10, int i11) {
        float width;
        int i12;
        int width2 = view.getWidth();
        DrawerLayout drawerLayout = this.f29580e;
        if (drawerLayout.a(view, 3)) {
            width = i10 + width2;
        } else {
            width = drawerLayout.getWidth() - i10;
        }
        float f10 = width / width2;
        drawerLayout.q(view, f10);
        if (f10 == g.f34069a) {
            i12 = 4;
        } else {
            i12 = 0;
        }
        view.setVisibility(i12);
        drawerLayout.invalidate();
    }

    @Override // al.d
    public final void J0(View view, float f10, float f11) {
        int i10;
        DrawerLayout drawerLayout = this.f29580e;
        drawerLayout.getClass();
        float f12 = ((d) view.getLayoutParams()).f29569b;
        int width = view.getWidth();
        if (drawerLayout.a(view, 3)) {
            if (f10 <= g.f34069a && (f10 != g.f34069a || f12 <= 0.5f)) {
                i10 = -width;
            } else {
                i10 = 0;
            }
        } else {
            int width2 = drawerLayout.getWidth();
            if (f10 < g.f34069a || (f10 == g.f34069a && f12 > 0.5f)) {
                width2 -= width;
            }
            i10 = width2;
        }
        this.f29578c.q(i10, view.getTop());
        drawerLayout.invalidate();
    }

    @Override // al.d
    public final int Y(View view, int i10) {
        DrawerLayout drawerLayout = this.f29580e;
        if (drawerLayout.a(view, 3)) {
            return Math.max(-view.getWidth(), Math.min(i10, 0));
        }
        int width = drawerLayout.getWidth();
        return Math.max(width - view.getWidth(), Math.min(i10, width));
    }

    @Override // al.d
    public final int Z(View view, int i10) {
        return view.getTop();
    }

    @Override // al.d
    public final boolean h1(View view, int i10) {
        DrawerLayout drawerLayout = this.f29580e;
        drawerLayout.getClass();
        if (DrawerLayout.n(view) && drawerLayout.a(view, this.f29577b) && drawerLayout.h(view) == 0) {
            return true;
        }
        return false;
    }

    @Override // al.d
    public final int t0(View view) {
        this.f29580e.getClass();
        if (DrawerLayout.n(view)) {
            return view.getWidth();
        }
        return 0;
    }
}
