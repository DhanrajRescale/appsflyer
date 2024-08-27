package com.google.android.material.carousel;

import android.graphics.Rect;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import k7.i1;
import k7.j1;
import k7.u0;
import k7.u1;
import p003do.a;
import p003do.b;
import s0.g;
import wn.e;

/* loaded from: classes2.dex */
public class CarouselLayoutManager extends i1 {

    /* renamed from: p, reason: collision with root package name */
    public int f11232p;

    public CarouselLayoutManager() {
        new a();
        q0();
    }

    public static float G0(float f10, e eVar) {
        b bVar = (b) eVar.f39327b;
        bVar.getClass();
        b bVar2 = (b) eVar.f39328c;
        bVar2.getClass();
        bVar.getClass();
        bVar2.getClass();
        return vn.a.b(g.f34069a, g.f34069a, g.f34069a, g.f34069a, f10);
    }

    public static e H0(float f10, List list, boolean z10) {
        float f11 = Float.MAX_VALUE;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        float f12 = -3.4028235E38f;
        float f13 = Float.MAX_VALUE;
        float f14 = Float.MAX_VALUE;
        for (int i14 = 0; i14 < list.size(); i14++) {
            ((b) list.get(i14)).getClass();
            float abs = Math.abs(g.f34069a - f10);
            if (g.f34069a <= f10 && abs <= f11) {
                i10 = i14;
                f11 = abs;
            }
            if (g.f34069a > f10 && abs <= f13) {
                i12 = i14;
                f13 = abs;
            }
            if (g.f34069a <= f14) {
                i11 = i14;
                f14 = 0.0f;
            }
            if (g.f34069a > f12) {
                i13 = i14;
                f12 = 0.0f;
            }
        }
        if (i10 == -1) {
            i10 = i11;
        }
        if (i12 == -1) {
            i12 = i13;
        }
        return new e((b) list.get(i10), (b) list.get(i12));
    }

    @Override // k7.i1
    public final void D0(RecyclerView recyclerView, int i10) {
        u0 u0Var = new u0(this, recyclerView.getContext(), 1);
        u0Var.f22522a = i10;
        E0(u0Var);
    }

    public final boolean I0() {
        if (C() == 1) {
            return true;
        }
        return false;
    }

    public final void J0() {
        I0();
        throw null;
    }

    @Override // k7.i1
    public final void P(View view) {
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // k7.i1
    public final void V(AccessibilityEvent accessibilityEvent) {
        super.V(accessibilityEvent);
        if (v() > 0) {
            accessibilityEvent.setFromIndex(i1.H(u(0)));
            accessibilityEvent.setToIndex(i1.H(u(v() - 1)));
        }
    }

    @Override // k7.i1
    public final boolean d() {
        return true;
    }

    @Override // k7.i1
    public final void e0(u6.g gVar, u1 u1Var) {
        if (u1Var.b() <= 0) {
            m0(gVar);
        } else {
            I0();
            P(gVar.e(0));
            throw null;
        }
    }

    @Override // k7.i1
    public final void f0(u1 u1Var) {
        if (v() != 0) {
            i1.H(u(0));
        }
    }

    @Override // k7.i1
    public final int j(u1 u1Var) {
        throw null;
    }

    @Override // k7.i1
    public final int k(u1 u1Var) {
        return this.f11232p;
    }

    @Override // k7.i1
    public final int l(u1 u1Var) {
        return 0 - 0;
    }

    @Override // k7.i1
    public final boolean p0(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
        return false;
    }

    @Override // k7.i1
    public final j1 r() {
        return new j1(-2, -2);
    }

    @Override // k7.i1
    public final int s0(int i10, u6.g gVar, u1 u1Var) {
        if (v() != 0 && i10 != 0) {
            int i11 = this.f11232p;
            int i12 = i11 + i10;
            if (i12 < 0 || i12 > 0) {
                i10 = 0 - i11;
            }
            this.f11232p = i11 + i10;
            J0();
            throw null;
        }
        return 0;
    }

    @Override // k7.i1
    public final void t0(int i10) {
    }

    @Override // k7.i1
    public final void y(View view, Rect rect) {
        super.y(view, rect);
        rect.centerX();
        throw null;
    }
}
