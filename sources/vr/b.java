package vr;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import com.jsibbold.zoomage.ZoomageView;

/* loaded from: classes2.dex */
public final class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f38280a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f38281b = new float[9];

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Matrix f38282c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f38283d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f38284e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f38285f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f38286g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ZoomageView f38287h;

    public b(ZoomageView zoomageView, Matrix matrix, float f10, float f11, float f12, float f13) {
        this.f38287h = zoomageView;
        this.f38282c = matrix;
        this.f38283d = f10;
        this.f38284e = f11;
        this.f38285f = f12;
        this.f38286g = f13;
        this.f38280a = new Matrix(zoomageView.getImageMatrix());
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        Matrix matrix = this.f38280a;
        matrix.set(this.f38282c);
        float[] fArr = this.f38281b;
        matrix.getValues(fArr);
        fArr[2] = (this.f38283d * floatValue) + fArr[2];
        fArr[5] = (this.f38284e * floatValue) + fArr[5];
        fArr[0] = (this.f38285f * floatValue) + fArr[0];
        fArr[4] = (this.f38286g * floatValue) + fArr[4];
        matrix.setValues(fArr);
        this.f38287h.setImageMatrix(matrix);
    }
}
