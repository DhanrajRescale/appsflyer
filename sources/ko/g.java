package ko;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* loaded from: classes2.dex */
public final class g implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f23311a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f23312b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f23313c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f23314d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f23315e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f23316f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f23317g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Matrix f23318h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ k f23319i;

    public g(k kVar, float f10, float f11, float f12, float f13, float f14, float f15, float f16, Matrix matrix) {
        this.f23319i = kVar;
        this.f23311a = f10;
        this.f23312b = f11;
        this.f23313c = f12;
        this.f23314d = f13;
        this.f23315e = f14;
        this.f23316f = f15;
        this.f23317g = f16;
        this.f23318h = matrix;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        k kVar = this.f23319i;
        kVar.f23346s.setAlpha(vn.a.b(this.f23311a, this.f23312b, s0.g.f34069a, 0.2f, floatValue));
        FloatingActionButton floatingActionButton = kVar.f23346s;
        float f10 = this.f23313c;
        float f11 = this.f23314d;
        floatingActionButton.setScaleX(vn.a.a(f10, f11, floatValue));
        kVar.f23346s.setScaleY(vn.a.a(this.f23315e, f11, floatValue));
        float f12 = this.f23316f;
        float f13 = this.f23317g;
        kVar.f23343p = vn.a.a(f12, f13, floatValue);
        float a10 = vn.a.a(f12, f13, floatValue);
        Matrix matrix = this.f23318h;
        kVar.a(a10, matrix);
        kVar.f23346s.setImageMatrix(matrix);
    }
}
