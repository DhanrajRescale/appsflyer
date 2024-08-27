package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import d4.b2;
import e.l;
import h.e0;
import l.o;
import m.h;
import m.k1;
import m.l1;
import m.n;
import m.w3;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public TypedValue f1012a;

    /* renamed from: b, reason: collision with root package name */
    public TypedValue f1013b;

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f1014c;

    /* renamed from: d, reason: collision with root package name */
    public TypedValue f1015d;

    /* renamed from: e, reason: collision with root package name */
    public TypedValue f1016e;

    /* renamed from: f, reason: collision with root package name */
    public TypedValue f1017f;

    /* renamed from: g, reason: collision with root package name */
    public final Rect f1018g;

    /* renamed from: h, reason: collision with root package name */
    public k1 f1019h;

    public ContentFrameLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f1018g = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f1016e == null) {
            this.f1016e = new TypedValue();
        }
        return this.f1016e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f1017f == null) {
            this.f1017f = new TypedValue();
        }
        return this.f1017f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f1014c == null) {
            this.f1014c = new TypedValue();
        }
        return this.f1014c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f1015d == null) {
            this.f1015d = new TypedValue();
        }
        return this.f1015d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f1012a == null) {
            this.f1012a = new TypedValue();
        }
        return this.f1012a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f1013b == null) {
            this.f1013b = new TypedValue();
        }
        return this.f1013b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        k1 k1Var = this.f1019h;
        if (k1Var != null) {
            k1Var.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        n nVar;
        super.onDetachedFromWindow();
        k1 k1Var = this.f1019h;
        if (k1Var != null) {
            e0 e0Var = (e0) ((l) k1Var).f14641b;
            l1 l1Var = e0Var.f17645r;
            if (l1Var != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) l1Var;
                actionBarOverlayLayout.k();
                ActionMenuView actionMenuView = ((w3) actionBarOverlayLayout.f955e).f25780a.f1107a;
                if (actionMenuView != null && (nVar = actionMenuView.f981t) != null) {
                    nVar.f();
                    h hVar = nVar.f25651u;
                    if (hVar != null && hVar.b()) {
                        hVar.f23555j.dismiss();
                    }
                }
            }
            if (e0Var.f17655w != null) {
                e0Var.f17634l.getDecorView().removeCallbacks(e0Var.f17657x);
                if (e0Var.f17655w.isShowing()) {
                    try {
                        e0Var.f17655w.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                e0Var.f17655w = null;
            }
            b2 b2Var = e0Var.f17659y;
            if (b2Var != null) {
                b2Var.b();
            }
            o oVar = e0Var.z(0).f17597h;
            if (oVar != null) {
                oVar.c(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b3  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(k1 k1Var) {
        this.f1019h = k1Var;
    }
}
