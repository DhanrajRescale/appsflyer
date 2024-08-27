package t7;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import d4.n1;
import d4.y0;
import java.util.HashMap;
import java.util.WeakHashMap;
import m.k3;

/* loaded from: classes.dex */
public final class f extends p {
    public static final k3 A;
    public static final k3 B;
    public static final k3 C;

    /* renamed from: x, reason: collision with root package name */
    public static final String[] f35458x = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: y, reason: collision with root package name */
    public static final k3 f35459y;

    /* renamed from: z, reason: collision with root package name */
    public static final k3 f35460z;

    static {
        new b(0);
        f35459y = new k3("topLeft", 1, PointF.class);
        f35460z = new k3("bottomRight", 2, PointF.class);
        A = new k3("bottomRight", 3, PointF.class);
        B = new k3("topLeft", 4, PointF.class);
        C = new k3("position", 5, PointF.class);
    }

    public static void I(w wVar) {
        View view = wVar.f35536b;
        WeakHashMap weakHashMap = n1.f13788a;
        if (y0.c(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            HashMap hashMap = wVar.f35535a;
            hashMap.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            hashMap.put("android:changeBounds:parent", wVar.f35536b.getParent());
        }
    }

    @Override // t7.p
    public final void d(w wVar) {
        I(wVar);
    }

    @Override // t7.p
    public final void g(w wVar) {
        I(wVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, t7.e] */
    @Override // t7.p
    public final Animator k(ViewGroup viewGroup, w wVar, w wVar2) {
        int i10;
        f fVar;
        ObjectAnimator ofObject;
        if (wVar == null || wVar2 == null) {
            return null;
        }
        HashMap hashMap = wVar.f35535a;
        HashMap hashMap2 = wVar2.f35535a;
        ViewGroup viewGroup2 = (ViewGroup) hashMap.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) hashMap2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        Rect rect = (Rect) hashMap.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) hashMap2.get("android:changeBounds:bounds");
        int i11 = rect.left;
        int i12 = rect2.left;
        int i13 = rect.top;
        int i14 = rect2.top;
        int i15 = rect.right;
        int i16 = rect2.right;
        int i17 = rect.bottom;
        int i18 = rect2.bottom;
        int i19 = i15 - i11;
        int i20 = i17 - i13;
        int i21 = i16 - i12;
        int i22 = i18 - i14;
        Rect rect3 = (Rect) hashMap.get("android:changeBounds:clip");
        Rect rect4 = (Rect) hashMap2.get("android:changeBounds:clip");
        if ((i19 != 0 && i20 != 0) || (i21 != 0 && i22 != 0)) {
            if (i11 == i12 && i13 == i14) {
                i10 = 0;
            } else {
                i10 = 1;
            }
            if (i15 != i16 || i17 != i18) {
                i10++;
            }
        } else {
            i10 = 0;
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i10++;
        }
        int i23 = i10;
        if (i23 > 0) {
            View view = wVar2.f35536b;
            y.a(view, i11, i13, i15, i17);
            if (i23 == 2) {
                if (i19 == i21 && i20 == i22) {
                    fVar = this;
                    fVar.f35522t.getClass();
                    ofObject = ObjectAnimator.ofObject(view, C, (TypeConverter) null, mt.p.y(i11, i13, i12, i14));
                } else {
                    fVar = this;
                    ?? obj = new Object();
                    obj.f35455e = view;
                    fVar.f35522t.getClass();
                    ObjectAnimator ofObject2 = ObjectAnimator.ofObject(obj, f35459y, (TypeConverter) null, mt.p.y(i11, i13, i12, i14));
                    fVar.f35522t.getClass();
                    ObjectAnimator ofObject3 = ObjectAnimator.ofObject(obj, f35460z, (TypeConverter) null, mt.p.y(i15, i17, i16, i18));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ofObject2, ofObject3);
                    animatorSet.addListener(new c(obj));
                    ofObject = animatorSet;
                }
            } else {
                fVar = this;
                if (i11 == i12 && i13 == i14) {
                    fVar.f35522t.getClass();
                    ofObject = ObjectAnimator.ofObject(view, A, (TypeConverter) null, mt.p.y(i15, i17, i16, i18));
                } else {
                    fVar.f35522t.getClass();
                    ofObject = ObjectAnimator.ofObject(view, B, (TypeConverter) null, mt.p.y(i11, i13, i12, i14));
                }
            }
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                zq.f.j0(viewGroup4, true);
                fVar.a(new d(viewGroup4));
            }
            return ofObject;
        }
        return null;
    }

    @Override // t7.p
    public final String[] p() {
        return f35458x;
    }
}
