package d4;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* loaded from: classes.dex */
public final class h2 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p2 f13745a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d3 f13746b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d3 f13747c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13748d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f13749e;

    public h2(p2 p2Var, d3 d3Var, d3 d3Var2, int i10, View view) {
        this.f13745a = p2Var;
        this.f13746b = d3Var;
        this.f13747c = d3Var2;
        this.f13748d = i10;
        this.f13749e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        p2 p2Var = this.f13745a;
        p2Var.f13805a.d(animatedFraction);
        float b10 = p2Var.f13805a.b();
        PathInterpolator pathInterpolator = k2.f13774e;
        d3 d3Var = this.f13746b;
        e.l lVar = new e.l(d3Var);
        for (int i10 = 1; i10 <= 256; i10 <<= 1) {
            if ((this.f13748d & i10) == 0) {
                ((u2) lVar.f14641b).c(i10, d3Var.f13731a.f(i10));
            } else {
                u3.c f10 = d3Var.f13731a.f(i10);
                u3.c f11 = this.f13747c.f13731a.f(i10);
                float f12 = 1.0f - b10;
                ((u2) lVar.f14641b).c(i10, d3.e(f10, (int) (((f10.f36704a - f11.f36704a) * f12) + 0.5d), (int) (((f10.f36705b - f11.f36705b) * f12) + 0.5d), (int) (((f10.f36706c - f11.f36706c) * f12) + 0.5d), (int) (((f10.f36707d - f11.f36707d) * f12) + 0.5d)));
            }
        }
        k2.g(this.f13749e, lVar.K(), Collections.singletonList(p2Var));
    }
}
