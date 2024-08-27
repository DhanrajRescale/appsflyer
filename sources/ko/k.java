package ko;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import com.assetgro.stockgro.prod.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.messaging.t;
import java.util.ArrayList;
import ll.o;
import qu.i0;
import to.w;

/* loaded from: classes2.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public to.l f23328a;

    /* renamed from: b, reason: collision with root package name */
    public to.h f23329b;

    /* renamed from: c, reason: collision with root package name */
    public Drawable f23330c;

    /* renamed from: d, reason: collision with root package name */
    public a f23331d;

    /* renamed from: e, reason: collision with root package name */
    public LayerDrawable f23332e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f23333f;

    /* renamed from: h, reason: collision with root package name */
    public float f23335h;

    /* renamed from: i, reason: collision with root package name */
    public float f23336i;

    /* renamed from: j, reason: collision with root package name */
    public float f23337j;

    /* renamed from: k, reason: collision with root package name */
    public int f23338k;

    /* renamed from: l, reason: collision with root package name */
    public Animator f23339l;

    /* renamed from: m, reason: collision with root package name */
    public vn.d f23340m;

    /* renamed from: n, reason: collision with root package name */
    public vn.d f23341n;

    /* renamed from: o, reason: collision with root package name */
    public float f23342o;

    /* renamed from: q, reason: collision with root package name */
    public int f23344q;

    /* renamed from: s, reason: collision with root package name */
    public final FloatingActionButton f23346s;

    /* renamed from: t, reason: collision with root package name */
    public final o f23347t;

    /* renamed from: y, reason: collision with root package name */
    public o3.f f23352y;

    /* renamed from: z, reason: collision with root package name */
    public static final v4.a f23327z = vn.a.f38182c;
    public static final int A = R.attr.motionDurationLong2;
    public static final int B = R.attr.motionEasingEmphasizedInterpolator;
    public static final int C = R.attr.motionDurationMedium1;
    public static final int D = R.attr.motionEasingEmphasizedAccelerateInterpolator;
    public static final int[] E = {android.R.attr.state_pressed, android.R.attr.state_enabled};
    public static final int[] F = {android.R.attr.state_hovered, android.R.attr.state_focused, android.R.attr.state_enabled};
    public static final int[] G = {android.R.attr.state_focused, android.R.attr.state_enabled};
    public static final int[] H = {android.R.attr.state_hovered, android.R.attr.state_enabled};
    public static final int[] I = {android.R.attr.state_enabled};
    public static final int[] J = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public boolean f23334g = true;

    /* renamed from: p, reason: collision with root package name */
    public float f23343p = 1.0f;

    /* renamed from: r, reason: collision with root package name */
    public int f23345r = 0;

    /* renamed from: u, reason: collision with root package name */
    public final Rect f23348u = new Rect();

    /* renamed from: v, reason: collision with root package name */
    public final RectF f23349v = new RectF();

    /* renamed from: w, reason: collision with root package name */
    public final RectF f23350w = new RectF();

    /* renamed from: x, reason: collision with root package name */
    public final Matrix f23351x = new Matrix();

    public k(FloatingActionButton floatingActionButton, o oVar) {
        int i10 = 1;
        this.f23346s = floatingActionButton;
        this.f23347t = oVar;
        t tVar = new t(10);
        m mVar = (m) this;
        tVar.a(E, d(new i(mVar, 2)));
        tVar.a(F, d(new i(mVar, i10)));
        tVar.a(G, d(new i(mVar, i10)));
        tVar.a(H, d(new i(mVar, i10)));
        tVar.a(I, d(new i(mVar, 3)));
        tVar.a(J, d(new i(mVar, 0)));
        this.f23342o = floatingActionButton.getRotation();
    }

    public static ValueAnimator d(i iVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f23327z);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(iVar);
        valueAnimator.addUpdateListener(iVar);
        valueAnimator.setFloatValues(s0.g.f34069a, 1.0f);
        return valueAnimator;
    }

    public final void a(float f10, Matrix matrix) {
        matrix.reset();
        if (this.f23346s.getDrawable() != null && this.f23344q != 0) {
            RectF rectF = this.f23349v;
            RectF rectF2 = this.f23350w;
            rectF.set(s0.g.f34069a, s0.g.f34069a, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
            int i10 = this.f23344q;
            rectF2.set(s0.g.f34069a, s0.g.f34069a, i10, i10);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            int i11 = this.f23344q;
            matrix.postScale(f10, f10, i11 / 2.0f, i11 / 2.0f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [android.animation.TypeEvaluator, java.lang.Object, ko.h] */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.animation.TypeEvaluator, java.lang.Object, ko.h] */
    public final AnimatorSet b(vn.d dVar, float f10, float f11, float f12) {
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float[] fArr = {f10};
        FloatingActionButton floatingActionButton = this.f23346s;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) property, fArr);
        dVar.d("opacity").a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_X, f11);
        dVar.d("scale").a(ofFloat2);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 26) {
            ?? obj = new Object();
            obj.f23320a = new FloatEvaluator();
            ofFloat2.setEvaluator(obj);
        }
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_Y, f11);
        dVar.d("scale").a(ofFloat3);
        if (i10 == 26) {
            ?? obj2 = new Object();
            obj2.f23320a = new FloatEvaluator();
            ofFloat3.setEvaluator(obj2);
        }
        arrayList.add(ofFloat3);
        Matrix matrix = this.f23351x;
        a(f12, matrix);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(floatingActionButton, new t7.b(), new f(this), new Matrix(matrix));
        dVar.d("iconScale").a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        dp.b.B1(animatorSet, arrayList);
        return animatorSet;
    }

    public final AnimatorSet c(float f10, float f11, float f12, int i10, int i11) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(s0.g.f34069a, 1.0f);
        FloatingActionButton floatingActionButton = this.f23346s;
        ofFloat.addUpdateListener(new g(this, floatingActionButton.getAlpha(), f10, floatingActionButton.getScaleX(), f11, floatingActionButton.getScaleY(), this.f23343p, f12, new Matrix(this.f23351x)));
        arrayList.add(ofFloat);
        dp.b.B1(animatorSet, arrayList);
        animatorSet.setDuration(dp.b.E1(floatingActionButton.getContext(), i10, floatingActionButton.getContext().getResources().getInteger(R.integer.material_motion_duration_long_1)));
        animatorSet.setInterpolator(dp.b.F1(floatingActionButton.getContext(), i11, vn.a.f38181b));
        return animatorSet;
    }

    public abstract float e();

    public void f(Rect rect) {
        int i10;
        float f10;
        if (this.f23333f) {
            i10 = (this.f23338k - this.f23346s.getSizeDimension()) / 2;
        } else {
            i10 = 0;
        }
        if (this.f23334g) {
            f10 = e() + this.f23337j;
        } else {
            f10 = s0.g.f34069a;
        }
        int max = Math.max(i10, (int) Math.ceil(f10));
        int max2 = Math.max(i10, (int) Math.ceil(f10 * 1.5f));
        rect.set(max, max2, max, max2);
    }

    public abstract void g(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i10);

    public abstract void h();

    public abstract void i();

    public abstract void j(int[] iArr);

    public abstract void k(float f10, float f11, float f12);

    public final void l() {
    }

    public void m(ColorStateList colorStateList) {
        Drawable drawable = this.f23330c;
        if (drawable != null) {
            v3.b.h(drawable, ro.a.c(colorStateList));
        }
    }

    public final void n(to.l lVar) {
        this.f23328a = lVar;
        to.h hVar = this.f23329b;
        if (hVar != null) {
            hVar.setShapeAppearanceModel(lVar);
        }
        Object obj = this.f23330c;
        if (obj instanceof w) {
            ((w) obj).setShapeAppearanceModel(lVar);
        }
        a aVar = this.f23331d;
        if (aVar != null) {
            aVar.f23295o = lVar;
            aVar.invalidateSelf();
        }
    }

    public abstract boolean o();

    public abstract void p();

    public final void q() {
        Rect rect = this.f23348u;
        f(rect);
        i0.l(this.f23332e, "Didn't initialize content background");
        boolean o10 = o();
        o oVar = this.f23347t;
        if (o10) {
            FloatingActionButton.b((FloatingActionButton) oVar.f24937b, new InsetDrawable((Drawable) this.f23332e, rect.left, rect.top, rect.right, rect.bottom));
        } else {
            LayerDrawable layerDrawable = this.f23332e;
            if (layerDrawable != null) {
                FloatingActionButton.b((FloatingActionButton) oVar.f24937b, layerDrawable);
            } else {
                oVar.getClass();
            }
        }
        int i10 = rect.left;
        int i11 = rect.top;
        int i12 = rect.right;
        int i13 = rect.bottom;
        ((FloatingActionButton) oVar.f24937b).f11359l.set(i10, i11, i12, i13);
        FloatingActionButton floatingActionButton = (FloatingActionButton) oVar.f24937b;
        int i14 = floatingActionButton.f11356i;
        floatingActionButton.setPadding(i10 + i14, i11 + i14, i12 + i14, i13 + i14);
    }
}
