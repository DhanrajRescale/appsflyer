package wo;

import ak.h0;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.LinearInterpolator;
import com.assetgro.stockgro.prod.R;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.SnackbarContentLayout;
import d4.b1;
import d4.n1;
import d4.v0;
import d4.y0;
import java.util.List;
import java.util.WeakHashMap;
import mo.c0;

/* loaded from: classes2.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f39382a;

    /* renamed from: b, reason: collision with root package name */
    public final int f39383b;

    /* renamed from: c, reason: collision with root package name */
    public final int f39384c;

    /* renamed from: d, reason: collision with root package name */
    public final TimeInterpolator f39385d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f39386e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f39387f;

    /* renamed from: g, reason: collision with root package name */
    public final ViewGroup f39388g;

    /* renamed from: h, reason: collision with root package name */
    public final Context f39389h;

    /* renamed from: i, reason: collision with root package name */
    public final j f39390i;

    /* renamed from: j, reason: collision with root package name */
    public final l f39391j;

    /* renamed from: k, reason: collision with root package name */
    public int f39392k;

    /* renamed from: l, reason: collision with root package name */
    public h f39393l;

    /* renamed from: n, reason: collision with root package name */
    public int f39395n;

    /* renamed from: o, reason: collision with root package name */
    public int f39396o;

    /* renamed from: p, reason: collision with root package name */
    public int f39397p;

    /* renamed from: q, reason: collision with root package name */
    public int f39398q;

    /* renamed from: r, reason: collision with root package name */
    public int f39399r;

    /* renamed from: s, reason: collision with root package name */
    public int f39400s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f39401t;

    /* renamed from: u, reason: collision with root package name */
    public final AccessibilityManager f39402u;

    /* renamed from: w, reason: collision with root package name */
    public static final v4.b f39378w = vn.a.f38181b;

    /* renamed from: x, reason: collision with root package name */
    public static final LinearInterpolator f39379x = vn.a.f38180a;

    /* renamed from: y, reason: collision with root package name */
    public static final v4.c f39380y = vn.a.f38183d;
    public static final int[] A = {R.attr.snackbarStyle};
    public static final String B = k.class.getSimpleName();

    /* renamed from: z, reason: collision with root package name */
    public static final Handler f39381z = new Handler(Looper.getMainLooper(), new h0(1));

    /* renamed from: m, reason: collision with root package name */
    public final f f39394m = new f(this, 0);

    /* renamed from: v, reason: collision with root package name */
    public final g f39403v = new g(this);

    public k(Context context, ViewGroup viewGroup, SnackbarContentLayout snackbarContentLayout, SnackbarContentLayout snackbarContentLayout2) {
        int i10;
        if (snackbarContentLayout != null) {
            if (snackbarContentLayout2 != null) {
                this.f39388g = viewGroup;
                this.f39391j = snackbarContentLayout2;
                this.f39389h = context;
                c0.c(context, c0.f27903a, "Theme.AppCompat");
                LayoutInflater from = LayoutInflater.from(context);
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(A);
                int resourceId = obtainStyledAttributes.getResourceId(0, -1);
                obtainStyledAttributes.recycle();
                if (resourceId != -1) {
                    i10 = R.layout.mtrl_layout_snackbar;
                } else {
                    i10 = R.layout.design_layout_snackbar;
                }
                j jVar = (j) from.inflate(i10, viewGroup, false);
                this.f39390i = jVar;
                j.a(jVar, this);
                float actionTextColorAlpha = jVar.getActionTextColorAlpha();
                if (actionTextColorAlpha != 1.0f) {
                    snackbarContentLayout.f11433b.setTextColor(pn.e.p(pn.e.k(snackbarContentLayout, R.attr.colorSurface), actionTextColorAlpha, snackbarContentLayout.f11433b.getCurrentTextColor()));
                }
                snackbarContentLayout.setMaxInlineActionWidth(jVar.getMaxInlineActionWidth());
                jVar.addView(snackbarContentLayout);
                WeakHashMap weakHashMap = n1.f13788a;
                y0.f(jVar, 1);
                v0.s(jVar, 1);
                jVar.setFitsSystemWindows(true);
                b1.u(jVar, new eb.f(this, 6));
                n1.n(jVar, new x7.e(this, 5));
                this.f39402u = (AccessibilityManager) context.getSystemService("accessibility");
                this.f39384c = dp.b.E1(context, R.attr.motionDurationLong2, 250);
                this.f39382a = dp.b.E1(context, R.attr.motionDurationLong2, 150);
                this.f39383b = dp.b.E1(context, R.attr.motionDurationMedium1, 75);
                this.f39385d = dp.b.F1(context, R.attr.motionEasingEmphasizedInterpolator, f39379x);
                this.f39387f = dp.b.F1(context, R.attr.motionEasingEmphasizedInterpolator, f39380y);
                this.f39386e = dp.b.F1(context, R.attr.motionEasingEmphasizedInterpolator, f39378w);
                return;
            }
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        throw new IllegalArgumentException("Transient bottom bar must have non-null content");
    }

    public final void a(int i10) {
        o b10 = o.b();
        g gVar = this.f39403v;
        synchronized (b10.f39408a) {
            try {
                if (b10.c(gVar)) {
                    b10.a(b10.f39410c, i10);
                } else {
                    n nVar = b10.f39411d;
                    if (nVar != null && gVar != null && nVar.f39404a.get() == gVar) {
                        b10.a(b10.f39411d, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final View b() {
        h hVar = this.f39393l;
        if (hVar == null) {
            return null;
        }
        return (View) hVar.f39365b.get();
    }

    public final void c() {
        o b10 = o.b();
        g gVar = this.f39403v;
        synchronized (b10.f39408a) {
            try {
                if (b10.c(gVar)) {
                    b10.f39410c = null;
                    if (b10.f39411d != null) {
                        b10.g();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ViewParent parent = this.f39390i.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f39390i);
        }
    }

    public final void d() {
        o b10 = o.b();
        g gVar = this.f39403v;
        synchronized (b10.f39408a) {
            try {
                if (b10.c(gVar)) {
                    b10.f(b10.f39410c);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        boolean z10 = true;
        AccessibilityManager accessibilityManager = this.f39402u;
        if (accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) {
            z10 = false;
        }
        j jVar = this.f39390i;
        if (z10) {
            jVar.post(new f(this, 2));
            return;
        }
        if (jVar.getParent() != null) {
            jVar.setVisibility(0);
        }
        d();
    }

    public final void f() {
        int i10;
        boolean z10;
        j jVar = this.f39390i;
        ViewGroup.LayoutParams layoutParams = jVar.getLayoutParams();
        boolean z11 = layoutParams instanceof ViewGroup.MarginLayoutParams;
        String str = B;
        if (!z11) {
            Log.w(str, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        if (jVar.f39376j == null) {
            Log.w(str, "Unable to update margins because original view margins are not set");
            return;
        }
        if (jVar.getParent() == null) {
            return;
        }
        if (b() != null) {
            i10 = this.f39398q;
        } else {
            i10 = this.f39395n;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Rect rect = jVar.f39376j;
        int i11 = rect.bottom + i10;
        int i12 = rect.left + this.f39396o;
        int i13 = rect.right + this.f39397p;
        int i14 = rect.top;
        if (marginLayoutParams.bottomMargin == i11 && marginLayoutParams.leftMargin == i12 && marginLayoutParams.rightMargin == i13 && marginLayoutParams.topMargin == i14) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            marginLayoutParams.bottomMargin = i11;
            marginLayoutParams.leftMargin = i12;
            marginLayoutParams.rightMargin = i13;
            marginLayoutParams.topMargin = i14;
            jVar.requestLayout();
        }
        if ((z10 || this.f39400s != this.f39399r) && Build.VERSION.SDK_INT >= 29 && this.f39399r > 0) {
            ViewGroup.LayoutParams layoutParams2 = jVar.getLayoutParams();
            if ((layoutParams2 instanceof o3.e) && (((o3.e) layoutParams2).f29544a instanceof SwipeDismissBehavior)) {
                f fVar = this.f39394m;
                jVar.removeCallbacks(fVar);
                jVar.post(fVar);
            }
        }
    }
}
