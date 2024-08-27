package qj;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.assetgro.stockgro.widget.ScrollableRulerViewStopOnLine;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m0 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ScrollableRulerViewStopOnLine f32039a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f32040b;

    public m0(ScrollableRulerViewStopOnLine scrollableRulerViewStopOnLine, float f10) {
        this.f32039a = scrollableRulerViewStopOnLine;
        this.f32040b = f10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        super.onAnimationEnd(animation);
        float f10 = this.f32040b;
        ScrollableRulerViewStopOnLine scrollableRulerViewStopOnLine = this.f32039a;
        scrollableRulerViewStopOnLine.setInitialXValue(f10);
        scrollableRulerViewStopOnLine.getClass();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        super.onAnimationStart(animation);
    }
}
