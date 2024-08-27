package q0;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class v extends View {

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f31543f = {R.attr.state_pressed, R.attr.state_enabled};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f31544g = new int[0];

    /* renamed from: a, reason: collision with root package name */
    public i0 f31545a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f31546b;

    /* renamed from: c, reason: collision with root package name */
    public Long f31547c;

    /* renamed from: d, reason: collision with root package name */
    public androidx.activity.b f31548d;

    /* renamed from: e, reason: collision with root package name */
    public Function0 f31549e;

    private final void setRippleState(boolean z10) {
        long j10;
        int[] iArr;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f31548d;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l10 = this.f31547c;
        if (l10 != null) {
            j10 = l10.longValue();
        } else {
            j10 = 0;
        }
        long j11 = currentAnimationTimeMillis - j10;
        if (!z10 && j11 < 5) {
            androidx.activity.b bVar = new androidx.activity.b(this, 5);
            this.f31548d = bVar;
            postDelayed(bVar, 50L);
        } else {
            if (z10) {
                iArr = f31543f;
            } else {
                iArr = f31544g;
            }
            i0 i0Var = this.f31545a;
            if (i0Var != null) {
                i0Var.setState(iArr);
            }
        }
        this.f31547c = Long.valueOf(currentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$2(v vVar) {
        i0 i0Var = vVar.f31545a;
        if (i0Var != null) {
            i0Var.setState(f31544g);
        }
        vVar.f31548d = null;
    }

    public final void b(a0.n nVar, boolean z10, long j10, int i10, long j11, float f10, x.a aVar) {
        if (this.f31545a == null || !Intrinsics.a(Boolean.valueOf(z10), this.f31546b)) {
            i0 i0Var = new i0(z10);
            setBackground(i0Var);
            this.f31545a = i0Var;
            this.f31546b = Boolean.valueOf(z10);
        }
        i0 i0Var2 = this.f31545a;
        Intrinsics.c(i0Var2);
        this.f31549e = aVar;
        e(j10, j11, f10, i10);
        if (z10) {
            i0Var2.setHotspot(m1.c.d(nVar.f18a), m1.c.e(nVar.f18a));
        } else {
            i0Var2.setHotspot(i0Var2.getBounds().centerX(), i0Var2.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c() {
        this.f31549e = null;
        androidx.activity.b bVar = this.f31548d;
        if (bVar != null) {
            removeCallbacks(bVar);
            androidx.activity.b bVar2 = this.f31548d;
            Intrinsics.c(bVar2);
            bVar2.run();
        } else {
            i0 i0Var = this.f31545a;
            if (i0Var != null) {
                i0Var.setState(f31544g);
            }
        }
        i0 i0Var2 = this.f31545a;
        if (i0Var2 == null) {
            return;
        }
        i0Var2.setVisible(false, false);
        unscheduleDrawable(i0Var2);
    }

    public final void d() {
        setRippleState(false);
    }

    public final void e(long j10, long j11, float f10, int i10) {
        i0 i0Var = this.f31545a;
        if (i0Var == null) {
            return;
        }
        Integer num = i0Var.f31506c;
        if (num == null || num.intValue() != i10) {
            i0Var.f31506c = Integer.valueOf(i10);
            h0.f31499a.a(i0Var, i10);
        }
        if (Build.VERSION.SDK_INT < 28) {
            f10 *= 2;
        }
        long c10 = n1.t.c(j11, kotlin.ranges.d.c(f10, 1.0f));
        n1.t tVar = i0Var.f31505b;
        if (tVar == null || !n1.t.d(tVar.f28179a, c10)) {
            i0Var.f31505b = new n1.t(c10);
            i0Var.setColor(ColorStateList.valueOf(androidx.compose.ui.graphics.a.y(c10)));
        }
        Rect rect = new Rect(0, 0, ku.c.b(m1.f.e(j10)), ku.c.b(m1.f.c(j10)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        i0Var.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Function0 function0 = this.f31549e;
        if (function0 != null) {
            function0.mo2invoke();
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }
}
