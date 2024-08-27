package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.assetgro.stockgro.prod.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import d4.b1;
import d4.n1;
import dp.b;
import java.util.ArrayList;
import java.util.WeakHashMap;
import s0.g;
import vn.a;
import vn.c;
import vn.d;
import wn.e;

@Deprecated
/* loaded from: classes2.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c, reason: collision with root package name */
    public final Rect f11565c;

    /* renamed from: d, reason: collision with root package name */
    public final RectF f11566d;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f11567e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f11568f;

    /* renamed from: g, reason: collision with root package name */
    public float f11569g;

    /* renamed from: h, reason: collision with root package name */
    public float f11570h;

    public FabTransformationBehavior() {
        this.f11565c = new Rect();
        this.f11566d = new RectF();
        this.f11567e = new RectF();
        this.f11568f = new int[2];
    }

    public static Pair u(float f10, float f11, boolean z10, e eVar) {
        vn.e d10;
        vn.e d11;
        if (f10 != g.f34069a && f11 != g.f34069a) {
            if ((z10 && f11 < g.f34069a) || (!z10 && f11 > g.f34069a)) {
                d10 = ((d) eVar.f39327b).d("translationXCurveUpwards");
                d11 = ((d) eVar.f39327b).d("translationYCurveUpwards");
            } else {
                d10 = ((d) eVar.f39327b).d("translationXCurveDownwards");
                d11 = ((d) eVar.f39327b).d("translationYCurveDownwards");
            }
        } else {
            d10 = ((d) eVar.f39327b).d("translationXLinear");
            d11 = ((d) eVar.f39327b).d("translationYLinear");
        }
        return new Pair(d10, d11);
    }

    public static float x(e eVar, vn.e eVar2, float f10) {
        long j10 = eVar2.f38188a;
        vn.e d10 = ((d) eVar.f39327b).d("expansion");
        return a.a(f10, g.f34069a, eVar2.b().getInterpolation(((float) (((d10.f38188a + d10.f38189b) + 17) - j10)) / ((float) eVar2.f38189b)));
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, o3.b
    public final boolean b(View view, View view2) {
        if (view.getVisibility() != 8) {
            if (!(view2 instanceof FloatingActionButton)) {
                return false;
            }
            int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
            if (expandedComponentIdHint != 0 && expandedComponentIdHint != view.getId()) {
                return false;
            }
            return true;
        }
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    @Override // o3.b
    public final void c(o3.e eVar) {
        if (eVar.f29551h == 0) {
            eVar.f29551h = 80;
        }
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    public final AnimatorSet t(View view, View view2, boolean z10, boolean z11) {
        ObjectAnimator ofFloat;
        ArrayList arrayList;
        ObjectAnimator ofFloat2;
        ObjectAnimator ofFloat3;
        ObjectAnimator ofFloat4;
        e z12 = z(view2.getContext(), z10);
        if (z10) {
            this.f11569g = view.getTranslationX();
            this.f11570h = view.getTranslationY();
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        WeakHashMap weakHashMap = n1.f13788a;
        float i10 = b1.i(view2) - b1.i(view);
        if (z10) {
            if (!z11) {
                view2.setTranslationZ(-i10);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, g.f34069a);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -i10);
        }
        ((d) z12.f39327b).d("elevation").a(ofFloat);
        arrayList2.add(ofFloat);
        RectF rectF = this.f11566d;
        float v10 = v(view, view2, (kq.e) z12.f39328c);
        float w10 = w(view, view2, (kq.e) z12.f39328c);
        Pair u10 = u(v10, w10, z10, z12);
        vn.e eVar = (vn.e) u10.first;
        vn.e eVar2 = (vn.e) u10.second;
        if (z10) {
            if (!z11) {
                view2.setTranslationX(-v10);
                view2.setTranslationY(-w10);
            }
            arrayList = arrayList3;
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, g.f34069a);
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, g.f34069a);
            float x10 = x(z12, eVar, -v10);
            float x11 = x(z12, eVar2, -w10);
            Rect rect = this.f11565c;
            view2.getWindowVisibleDisplayFrame(rect);
            rectF.set(rect);
            RectF rectF2 = this.f11567e;
            y(view2, rectF2);
            rectF2.offset(x10, x11);
            rectF2.intersect(rectF);
            rectF.set(rectF2);
            ofFloat3 = ofFloat6;
            ofFloat2 = ofFloat5;
        } else {
            arrayList = arrayList3;
            ofFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -v10);
            ofFloat3 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -w10);
        }
        eVar.a(ofFloat2);
        eVar2.a(ofFloat3);
        arrayList2.add(ofFloat2);
        arrayList2.add(ofFloat3);
        rectF.width();
        rectF.height();
        float v11 = v(view, view2, (kq.e) z12.f39328c);
        float w11 = w(view, view2, (kq.e) z12.f39328c);
        Pair u11 = u(v11, w11, z10, z12);
        vn.e eVar3 = (vn.e) u11.first;
        vn.e eVar4 = (vn.e) u11.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (!z10) {
            v11 = this.f11569g;
        }
        fArr[0] = v11;
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        if (!z10) {
            w11 = this.f11570h;
        }
        fArr2[0] = w11;
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, fArr2);
        eVar3.a(ofFloat7);
        eVar4.a(ofFloat8);
        arrayList2.add(ofFloat7);
        arrayList2.add(ofFloat8);
        boolean z13 = view2 instanceof ViewGroup;
        if (z13) {
            View findViewById = view2.findViewById(R.id.mtrl_child_content_container);
            ViewGroup viewGroup = null;
            if (findViewById != null) {
                if (findViewById instanceof ViewGroup) {
                    viewGroup = (ViewGroup) findViewById;
                }
            } else if (z13) {
                viewGroup = (ViewGroup) view2;
            }
            if (viewGroup != null) {
                if (z10) {
                    if (!z11) {
                        c.f38185a.set(viewGroup, Float.valueOf(g.f34069a));
                    }
                    ofFloat4 = ObjectAnimator.ofFloat(viewGroup, c.f38185a, 1.0f);
                } else {
                    ofFloat4 = ObjectAnimator.ofFloat(viewGroup, c.f38185a, g.f34069a);
                }
                ((d) z12.f39327b).d("contentFade").a(ofFloat4);
                arrayList2.add(ofFloat4);
            }
        }
        AnimatorSet animatorSet = new AnimatorSet();
        b.B1(animatorSet, arrayList2);
        animatorSet.addListener(new ko.b(z10, view2, view));
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList.get(i11));
        }
        return animatorSet;
    }

    public final float v(View view, View view2, kq.e eVar) {
        RectF rectF = this.f11566d;
        RectF rectF2 = this.f11567e;
        y(view, rectF);
        rectF.offset(this.f11569g, this.f11570h);
        y(view2, rectF2);
        eVar.getClass();
        return (rectF2.centerX() - rectF.centerX()) + g.f34069a;
    }

    public final float w(View view, View view2, kq.e eVar) {
        RectF rectF = this.f11566d;
        RectF rectF2 = this.f11567e;
        y(view, rectF);
        rectF.offset(this.f11569g, this.f11570h);
        y(view2, rectF2);
        eVar.getClass();
        return (rectF2.centerY() - rectF.centerY()) + g.f34069a;
    }

    public final void y(View view, RectF rectF) {
        rectF.set(g.f34069a, g.f34069a, view.getWidth(), view.getHeight());
        view.getLocationInWindow(this.f11568f);
        rectF.offsetTo(r0[0], r0[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    public abstract e z(Context context, boolean z10);

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11565c = new Rect();
        this.f11566d = new RectF();
        this.f11567e = new RectF();
        this.f11568f = new int[2];
    }
}
