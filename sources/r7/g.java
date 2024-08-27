package r7;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* loaded from: classes.dex */
public final class g extends Animation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33444a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SwipeRefreshLayout f33445b;

    public /* synthetic */ g(SwipeRefreshLayout swipeRefreshLayout, int i10) {
        this.f33444a = i10;
        this.f33445b = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f10, Transformation transformation) {
        int i10 = this.f33444a;
        SwipeRefreshLayout swipeRefreshLayout = this.f33445b;
        switch (i10) {
            case 0:
                swipeRefreshLayout.setAnimationProgress(f10);
                return;
            case 1:
                swipeRefreshLayout.setAnimationProgress(1.0f - f10);
                return;
            case 2:
                swipeRefreshLayout.getClass();
                int abs = swipeRefreshLayout.f2464w - Math.abs(swipeRefreshLayout.f2463v);
                swipeRefreshLayout.setTargetOffsetTopAndBottom((swipeRefreshLayout.f2462u + ((int) ((abs - r5) * f10))) - swipeRefreshLayout.f2460s.getTop());
                e eVar = swipeRefreshLayout.f2466y;
                float f11 = 1.0f - f10;
                d dVar = eVar.f33436a;
                if (f11 != dVar.f33427p) {
                    dVar.f33427p = f11;
                }
                eVar.invalidateSelf();
                return;
            case 3:
                swipeRefreshLayout.e(f10);
                return;
            default:
                swipeRefreshLayout.getClass();
                swipeRefreshLayout.setAnimationProgress(((-0.0f) * f10) + s0.g.f34069a);
                swipeRefreshLayout.e(f10);
                return;
        }
    }
}
