package k7;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.google.android.material.carousel.CarouselLayoutManager;

/* loaded from: classes.dex */
public final class u0 extends p0 {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f22584q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f22585r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(Object obj, Context context, int i10) {
        super(context);
        this.f22584q = i10;
        this.f22585r = obj;
    }

    @Override // k7.p0
    public final int b(View view, int i10) {
        int i11 = this.f22584q;
        Object obj = this.f22585r;
        switch (i11) {
            case 1:
                ((CarouselLayoutManager) obj).getClass();
                throw null;
            case 2:
            default:
                return super.b(view, i10);
            case 3:
                com.mig35.carousellayoutmanager.CarouselLayoutManager carouselLayoutManager = (com.mig35.carousellayoutmanager.CarouselLayoutManager) obj;
                if (!carouselLayoutManager.d()) {
                    return 0;
                }
                return Math.round(carouselLayoutManager.L0(i1.H(view)) * carouselLayoutManager.M0());
        }
    }

    @Override // k7.p0
    public final int c(View view, int i10) {
        switch (this.f22584q) {
            case 3:
                com.mig35.carousellayoutmanager.CarouselLayoutManager carouselLayoutManager = (com.mig35.carousellayoutmanager.CarouselLayoutManager) this.f22585r;
                if (!carouselLayoutManager.e()) {
                    return 0;
                }
                return Math.round(carouselLayoutManager.L0(i1.H(view)) * carouselLayoutManager.M0());
            default:
                return super.c(view, i10);
        }
    }

    @Override // k7.p0
    public final float d(DisplayMetrics displayMetrics) {
        switch (this.f22584q) {
            case 0:
                return 100.0f / displayMetrics.densityDpi;
            case 1:
            default:
                return 25.0f / displayMetrics.densityDpi;
            case 2:
                return 100.0f / displayMetrics.densityDpi;
        }
    }

    @Override // k7.p0
    public final int e(int i10) {
        switch (this.f22584q) {
            case 0:
                return Math.min(100, super.e(i10));
            default:
                return super.e(i10);
        }
    }

    @Override // k7.p0
    public final PointF f(int i10) {
        switch (this.f22584q) {
            case 1:
                ((CarouselLayoutManager) this.f22585r).getClass();
                return null;
            default:
                return super.f(i10);
        }
    }

    @Override // k7.p0
    public final void h(View view, u1 u1Var, s1 s1Var) {
        switch (this.f22584q) {
            case 0:
                v0 v0Var = (v0) this.f22585r;
                int[] b10 = v0Var.b(v0Var.f22605a.getLayoutManager(), view);
                int i10 = b10[0];
                int i11 = b10[1];
                int ceil = (int) Math.ceil(e(Math.max(Math.abs(i10), Math.abs(i11))) / 0.3356d);
                if (ceil > 0) {
                    DecelerateInterpolator decelerateInterpolator = this.f22531j;
                    s1Var.f22567a = i10;
                    s1Var.f22568b = i11;
                    s1Var.f22569c = ceil;
                    s1Var.f22571e = decelerateInterpolator;
                    s1Var.f22572f = true;
                    return;
                }
                return;
            default:
                super.h(view, u1Var, s1Var);
                return;
        }
    }
}
