package d4;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class j2 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public final g2 f13770a;

    /* renamed from: b, reason: collision with root package name */
    public d3 f13771b;

    public j2(View view, g2 g2Var) {
        d3 d3Var;
        this.f13770a = g2Var;
        WeakHashMap weakHashMap = n1.f13788a;
        d3 a10 = c1.a(view);
        if (a10 != null) {
            d3Var = new e.l(a10).K();
        } else {
            d3Var = null;
        }
        this.f13771b = d3Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        b3 b3Var;
        Interpolator interpolator;
        if (!view.isLaidOut()) {
            this.f13771b = d3.g(view, windowInsets);
            return k2.i(view, windowInsets);
        }
        d3 g10 = d3.g(view, windowInsets);
        if (this.f13771b == null) {
            WeakHashMap weakHashMap = n1.f13788a;
            this.f13771b = c1.a(view);
        }
        if (this.f13771b == null) {
            this.f13771b = g10;
            return k2.i(view, windowInsets);
        }
        g2 j10 = k2.j(view);
        if (j10 != null && Objects.equals(j10.f13742a, windowInsets)) {
            return k2.i(view, windowInsets);
        }
        d3 d3Var = this.f13771b;
        int i10 = 1;
        int i11 = 0;
        while (true) {
            b3Var = g10.f13731a;
            if (i10 > 256) {
                break;
            }
            if (!b3Var.f(i10).equals(d3Var.f13731a.f(i10))) {
                i11 |= i10;
            }
            i10 <<= 1;
        }
        if (i11 == 0) {
            return k2.i(view, windowInsets);
        }
        d3 d3Var2 = this.f13771b;
        if ((i11 & 8) != 0) {
            if (b3Var.f(8).f36707d > d3Var2.f13731a.f(8).f36707d) {
                interpolator = k2.f13774e;
            } else {
                interpolator = k2.f13775f;
            }
        } else {
            interpolator = k2.f13776g;
        }
        p2 p2Var = new p2(i11, interpolator, 160L);
        p2Var.f13805a.d(s0.g.f34069a);
        ValueAnimator duration = ValueAnimator.ofFloat(s0.g.f34069a, 1.0f).setDuration(p2Var.f13805a.a());
        u3.c f10 = b3Var.f(i11);
        u3.c f11 = d3Var2.f13731a.f(i11);
        int min = Math.min(f10.f36704a, f11.f36704a);
        int i12 = f10.f36705b;
        int i13 = f11.f36705b;
        int min2 = Math.min(i12, i13);
        int i14 = f10.f36706c;
        int i15 = f11.f36706c;
        int min3 = Math.min(i14, i15);
        int i16 = f10.f36707d;
        int i17 = i11;
        int i18 = f11.f36707d;
        tr.e eVar = new tr.e(7, u3.c.b(min, min2, min3, Math.min(i16, i18)), u3.c.b(Math.max(f10.f36704a, f11.f36704a), Math.max(i12, i13), Math.max(i14, i15), Math.max(i16, i18)));
        k2.f(view, p2Var, windowInsets, false);
        duration.addUpdateListener(new h2(p2Var, g10, d3Var2, i17, view));
        duration.addListener(new z1(1, this, p2Var, view));
        g0.a(view, new i2(this, view, p2Var, eVar, duration, 0));
        this.f13771b = g10;
        return k2.i(view, windowInsets);
    }
}
