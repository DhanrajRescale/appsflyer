package yn;

import al.d;
import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import d4.n1;
import d4.w0;
import ek.h0;
import java.util.WeakHashMap;
import s0.g;
import wo.k;
import wo.o;

/* loaded from: classes2.dex */
public final class a extends d {

    /* renamed from: b, reason: collision with root package name */
    public int f41740b;

    /* renamed from: c, reason: collision with root package name */
    public int f41741c = -1;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f41742d;

    public a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f41742d = swipeDismissBehavior;
    }

    @Override // al.d
    public final void G0(View view, int i10) {
        this.f41741c = i10;
        this.f41740b = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f41742d;
            swipeDismissBehavior.f11162d = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f11162d = false;
        }
    }

    @Override // al.d
    public final void H0(int i10) {
        h0 h0Var = this.f41742d.f11160b;
        if (h0Var != null) {
            if (i10 != 0) {
                if (i10 == 1 || i10 == 2) {
                    o.b().d(((k) h0Var.f15593b).f39403v);
                    return;
                }
                return;
            }
            o.b().e(((k) h0Var.f15593b).f39403v);
        }
    }

    @Override // al.d
    public final void I0(View view, int i10, int i11) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f41742d;
        float f10 = width * swipeDismissBehavior.f11165g;
        float width2 = view.getWidth() * swipeDismissBehavior.f11166h;
        float abs = Math.abs(i10 - this.f41740b);
        if (abs <= f10) {
            view.setAlpha(1.0f);
        } else if (abs >= width2) {
            view.setAlpha(g.f34069a);
        } else {
            view.setAlpha(Math.min(Math.max(g.f34069a, 1.0f - ((abs - f10) / (width2 - f10))), 1.0f));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0050, code lost:
    
        if (java.lang.Math.abs(r9.getLeft() - r8.f41740b) >= java.lang.Math.round(r9.getWidth() * r3.f11164f)) goto L27;
     */
    @Override // al.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void J0(android.view.View r9, float r10, float r11) {
        /*
            r8 = this;
            r11 = -1
            r8.f41741c = r11
            int r11 = r9.getWidth()
            r0 = 0
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r2 = 1
            com.google.android.material.behavior.SwipeDismissBehavior r3 = r8.f41742d
            r4 = 0
            if (r1 == 0) goto L39
            java.util.WeakHashMap r5 = d4.n1.f13788a
            int r5 = d4.w0.d(r9)
            if (r5 != r2) goto L1a
            r5 = r2
            goto L1b
        L1a:
            r5 = r4
        L1b:
            int r6 = r3.f11163e
            r7 = 2
            if (r6 != r7) goto L21
            goto L52
        L21:
            if (r6 != 0) goto L2d
            if (r5 == 0) goto L2a
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L66
            goto L52
        L2a:
            if (r1 <= 0) goto L66
            goto L52
        L2d:
            if (r6 != r2) goto L66
            if (r5 == 0) goto L34
            if (r1 <= 0) goto L66
            goto L52
        L34:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L66
            goto L52
        L39:
            int r1 = r9.getLeft()
            int r5 = r8.f41740b
            int r1 = r1 - r5
            int r5 = r9.getWidth()
            float r5 = (float) r5
            float r6 = r3.f11164f
            float r5 = r5 * r6
            int r5 = java.lang.Math.round(r5)
            int r1 = java.lang.Math.abs(r1)
            if (r1 < r5) goto L66
        L52:
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 < 0) goto L61
            int r10 = r9.getLeft()
            int r0 = r8.f41740b
            if (r10 >= r0) goto L5f
            goto L61
        L5f:
            int r0 = r0 + r11
            goto L69
        L61:
            int r10 = r8.f41740b
            int r0 = r10 - r11
            goto L69
        L66:
            int r0 = r8.f41740b
            r2 = r4
        L69:
            l4.e r10 = r3.f11159a
            int r11 = r9.getTop()
            boolean r10 = r10.q(r0, r11)
            if (r10 == 0) goto L80
            androidx.lifecycle.y0 r10 = new androidx.lifecycle.y0
            r10.<init>(r3, r9, r2)
            java.util.WeakHashMap r11 = d4.n1.f13788a
            d4.v0.m(r9, r10)
            goto L89
        L80:
            if (r2 == 0) goto L89
            ek.h0 r10 = r3.f11160b
            if (r10 == 0) goto L89
            r10.p(r9)
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yn.a.J0(android.view.View, float, float):void");
    }

    @Override // al.d
    public final int Y(View view, int i10) {
        boolean z10;
        int width;
        int width2;
        int width3;
        WeakHashMap weakHashMap = n1.f13788a;
        if (w0.d(view) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = this.f41742d.f11163e;
        if (i11 == 0) {
            if (z10) {
                width = this.f41740b - view.getWidth();
                width2 = this.f41740b;
            } else {
                width = this.f41740b;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i11 == 1) {
            if (z10) {
                width = this.f41740b;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.f41740b - view.getWidth();
                width2 = this.f41740b;
            }
        } else {
            width = this.f41740b - view.getWidth();
            width2 = view.getWidth() + this.f41740b;
        }
        return Math.min(Math.max(width, i10), width2);
    }

    @Override // al.d
    public final int Z(View view, int i10) {
        return view.getTop();
    }

    @Override // al.d
    public final boolean h1(View view, int i10) {
        int i11 = this.f41741c;
        if ((i11 == -1 || i11 == i10) && this.f41742d.s(view)) {
            return true;
        }
        return false;
    }

    @Override // al.d
    public final int t0(View view) {
        return view.getWidth();
    }
}
