package dn;

import android.graphics.ColorFilter;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.d;
import m1.f;
import n1.r;
import n1.u;
import t0.h2;
import t0.n1;
import t0.o3;
import t0.t;
import ut.g;
import ut.h;
import w2.k;

/* loaded from: classes2.dex */
public final class a extends q1.b implements h2 {

    /* renamed from: e, reason: collision with root package name */
    public final Drawable f14418e;

    /* renamed from: f, reason: collision with root package name */
    public final n1 f14419f;

    /* renamed from: g, reason: collision with root package name */
    public final n1 f14420g;

    /* renamed from: h, reason: collision with root package name */
    public final g f14421h;

    public a(Drawable drawable) {
        long j10;
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        this.f14418e = drawable;
        o3 o3Var = o3.f35116a;
        this.f14419f = t.n0(0, o3Var);
        g gVar = c.f14423a;
        if (drawable.getIntrinsicWidth() >= 0 && drawable.getIntrinsicHeight() >= 0) {
            j10 = t.j(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        } else {
            j10 = f.f27252c;
        }
        this.f14420g = t.n0(new f(j10), o3Var);
        this.f14421h = h.a(new hj.b(this, 1));
        if (drawable.getIntrinsicWidth() >= 0 && drawable.getIntrinsicHeight() >= 0) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
    }

    @Override // t0.h2
    public final void a() {
        b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // t0.h2
    public final void b() {
        Drawable drawable = this.f14418e;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        drawable.setVisible(false, false);
        drawable.setCallback(null);
    }

    @Override // q1.b
    public final void c(float f10) {
        this.f14418e.setAlpha(d.f(ku.c.b(f10 * 255), 0, 255));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // t0.h2
    public final void d() {
        Drawable.Callback callback = (Drawable.Callback) this.f14421h.getValue();
        Drawable drawable = this.f14418e;
        drawable.setCallback(callback);
        drawable.setVisible(true, true);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    @Override // q1.b
    public final void e(u uVar) {
        ColorFilter colorFilter;
        if (uVar != null) {
            colorFilter = uVar.f28180a;
        } else {
            colorFilter = null;
        }
        this.f14418e.setColorFilter(colorFilter);
    }

    @Override // q1.b
    public final void f(k layoutDirection) {
        int i10;
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        int ordinal = layoutDirection.ordinal();
        if (ordinal != 0) {
            i10 = 1;
            if (ordinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            i10 = 0;
        }
        this.f14418e.setLayoutDirection(i10);
    }

    @Override // q1.b
    public final long h() {
        return ((f) this.f14420g.getValue()).f27254a;
    }

    @Override // q1.b
    public final void i(p1.h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        r a10 = hVar.f0().a();
        ((Number) this.f14419f.getValue()).intValue();
        int b10 = ku.c.b(f.e(hVar.d()));
        int b11 = ku.c.b(f.c(hVar.d()));
        Drawable drawable = this.f14418e;
        drawable.setBounds(0, 0, b10, b11);
        try {
            a10.h();
            drawable.draw(n1.d.a(a10));
        } finally {
            a10.s();
        }
    }
}
