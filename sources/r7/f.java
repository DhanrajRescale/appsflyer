package r7;

import android.view.animation.Animation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* loaded from: classes.dex */
public final class f implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33442a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SwipeRefreshLayout f33443b;

    public /* synthetic */ f(SwipeRefreshLayout swipeRefreshLayout, int i10) {
        this.f33442a = i10;
        this.f33443b = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        j jVar;
        int i10 = this.f33442a;
        SwipeRefreshLayout swipeRefreshLayout = this.f33443b;
        switch (i10) {
            case 0:
                if (swipeRefreshLayout.f2444c) {
                    swipeRefreshLayout.f2466y.setAlpha(255);
                    swipeRefreshLayout.f2466y.start();
                    if (swipeRefreshLayout.D && (jVar = swipeRefreshLayout.f2443b) != null) {
                        jVar.i();
                    }
                    swipeRefreshLayout.f2454m = swipeRefreshLayout.f2460s.getTop();
                    return;
                }
                swipeRefreshLayout.f();
                return;
            default:
                swipeRefreshLayout.getClass();
                g gVar = new g(swipeRefreshLayout, 1);
                swipeRefreshLayout.A = gVar;
                gVar.setDuration(150L);
                a aVar = swipeRefreshLayout.f2460s;
                aVar.f33406a = null;
                aVar.clearAnimation();
                swipeRefreshLayout.f2460s.startAnimation(swipeRefreshLayout.A);
                return;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
