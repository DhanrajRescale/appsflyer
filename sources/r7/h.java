package r7;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* loaded from: classes.dex */
public final class h extends Animation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33446a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f33447b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SwipeRefreshLayout f33448c;

    public h(SwipeRefreshLayout swipeRefreshLayout, int i10, int i11) {
        this.f33448c = swipeRefreshLayout;
        this.f33446a = i10;
        this.f33447b = i11;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f10, Transformation transformation) {
        this.f33448c.f2466y.setAlpha((int) (((this.f33447b - r0) * f10) + this.f33446a));
    }
}
