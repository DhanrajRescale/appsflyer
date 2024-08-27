package ws;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class h implements g {

    /* renamed from: e, reason: collision with root package name */
    public static final ObjectAnimator f39433e;

    /* renamed from: f, reason: collision with root package name */
    public static final ObjectAnimator f39434f;

    /* renamed from: a, reason: collision with root package name */
    public final View f39435a;

    /* renamed from: b, reason: collision with root package name */
    public final float f39436b;

    /* renamed from: c, reason: collision with root package name */
    public final ObjectAnimator f39437c;

    /* renamed from: d, reason: collision with root package name */
    public final ObjectAnimator f39438d;

    static {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        objectAnimator.setProperty(View.SCALE_X);
        f39433e = objectAnimator;
        ObjectAnimator objectAnimator2 = new ObjectAnimator();
        objectAnimator2.setProperty(View.SCALE_Y);
        f39434f = objectAnimator2;
    }

    public h(vs.b bVar, float f10) {
        ObjectAnimator animatorX = f39433e;
        Intrinsics.e(animatorX, "animatorX");
        ObjectAnimator animatorY = f39434f;
        Intrinsics.e(animatorY, "animatorY");
        this.f39435a = bVar;
        this.f39436b = f10;
        this.f39437c = animatorX;
        this.f39438d = animatorY;
        animatorX.setTarget(bVar);
        animatorY.setTarget(bVar);
    }

    public static void a(ObjectAnimator objectAnimator) {
        objectAnimator.setDuration(600L);
        objectAnimator.setInterpolator(new DecelerateInterpolator(2.0f));
    }
}
