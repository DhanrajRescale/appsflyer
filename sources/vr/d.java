package vr;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import com.jsibbold.zoomage.ZoomageView;

/* loaded from: classes2.dex */
public final class d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f38290a = new float[9];

    /* renamed from: b, reason: collision with root package name */
    public final Matrix f38291b = new Matrix();

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f38292c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ZoomageView f38293d;

    public d(ZoomageView zoomageView, int i10) {
        this.f38293d = zoomageView;
        this.f38292c = i10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Matrix matrix = this.f38291b;
        ZoomageView zoomageView = this.f38293d;
        matrix.set(zoomageView.getImageMatrix());
        float[] fArr = this.f38290a;
        matrix.getValues(fArr);
        fArr[this.f38292c] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        matrix.setValues(fArr);
        zoomageView.setImageMatrix(matrix);
    }
}
