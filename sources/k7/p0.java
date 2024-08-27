package k7;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.search.SearchAuth;

/* loaded from: classes.dex */
public class p0 {

    /* renamed from: a, reason: collision with root package name */
    public int f22522a = -1;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f22523b;

    /* renamed from: c, reason: collision with root package name */
    public i1 f22524c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f22525d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f22526e;

    /* renamed from: f, reason: collision with root package name */
    public View f22527f;

    /* renamed from: g, reason: collision with root package name */
    public final s1 f22528g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f22529h;

    /* renamed from: i, reason: collision with root package name */
    public final LinearInterpolator f22530i;

    /* renamed from: j, reason: collision with root package name */
    public final DecelerateInterpolator f22531j;

    /* renamed from: k, reason: collision with root package name */
    public PointF f22532k;

    /* renamed from: l, reason: collision with root package name */
    public final DisplayMetrics f22533l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f22534m;

    /* renamed from: n, reason: collision with root package name */
    public float f22535n;

    /* renamed from: o, reason: collision with root package name */
    public int f22536o;

    /* renamed from: p, reason: collision with root package name */
    public int f22537p;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, k7.s1] */
    public p0(Context context) {
        ?? obj = new Object();
        obj.f22570d = -1;
        obj.f22572f = false;
        obj.f22573g = 0;
        obj.f22567a = 0;
        obj.f22568b = 0;
        obj.f22569c = Integer.MIN_VALUE;
        obj.f22571e = null;
        this.f22528g = obj;
        this.f22530i = new LinearInterpolator();
        this.f22531j = new DecelerateInterpolator();
        this.f22534m = false;
        this.f22536o = 0;
        this.f22537p = 0;
        this.f22533l = context.getResources().getDisplayMetrics();
    }

    public static int a(int i10, int i11, int i12, int i13, int i14) {
        if (i14 != -1) {
            if (i14 != 0) {
                if (i14 == 1) {
                    return i13 - i11;
                }
                throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            }
            int i15 = i12 - i10;
            if (i15 > 0) {
                return i15;
            }
            int i16 = i13 - i11;
            if (i16 < 0) {
                return i16;
            }
            return 0;
        }
        return i12 - i10;
    }

    public int b(View view, int i10) {
        i1 i1Var = this.f22524c;
        if (i1Var != null && i1Var.d()) {
            j1 j1Var = (j1) view.getLayoutParams();
            return a((view.getLeft() - ((j1) view.getLayoutParams()).f22431b.left) - ((ViewGroup.MarginLayoutParams) j1Var).leftMargin, view.getRight() + ((j1) view.getLayoutParams()).f22431b.right + ((ViewGroup.MarginLayoutParams) j1Var).rightMargin, i1Var.E(), i1Var.f22417n - i1Var.F(), i10);
        }
        return 0;
    }

    public int c(View view, int i10) {
        i1 i1Var = this.f22524c;
        if (i1Var != null && i1Var.e()) {
            j1 j1Var = (j1) view.getLayoutParams();
            return a((view.getTop() - ((j1) view.getLayoutParams()).f22431b.top) - ((ViewGroup.MarginLayoutParams) j1Var).topMargin, view.getBottom() + ((j1) view.getLayoutParams()).f22431b.bottom + ((ViewGroup.MarginLayoutParams) j1Var).bottomMargin, i1Var.G(), i1Var.f22418o - i1Var.D(), i10);
        }
        return 0;
    }

    public float d(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int e(int i10) {
        float abs = Math.abs(i10);
        if (!this.f22534m) {
            this.f22535n = d(this.f22533l);
            this.f22534m = true;
        }
        return (int) Math.ceil(abs * this.f22535n);
    }

    public PointF f(int i10) {
        Object obj = this.f22524c;
        if (obj instanceof t1) {
            return ((t1) obj).a(i10);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + t1.class.getCanonicalName());
        return null;
    }

    public final void g(int i10, int i11) {
        PointF f10;
        RecyclerView recyclerView = this.f22523b;
        int i12 = -1;
        if (this.f22522a == -1 || recyclerView == null) {
            i();
        }
        if (this.f22525d && this.f22527f == null && this.f22524c != null && (f10 = f(this.f22522a)) != null) {
            float f11 = f10.x;
            if (f11 != s0.g.f34069a || f10.y != s0.g.f34069a) {
                recyclerView.h0((int) Math.signum(f11), (int) Math.signum(f10.y), null);
            }
        }
        boolean z10 = false;
        this.f22525d = false;
        View view = this.f22527f;
        s1 s1Var = this.f22528g;
        if (view != null) {
            this.f22523b.getClass();
            y1 N = RecyclerView.N(view);
            if (N != null) {
                i12 = N.e();
            }
            if (i12 == this.f22522a) {
                h(this.f22527f, recyclerView.f2424y0, s1Var);
                s1Var.a(recyclerView);
                i();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f22527f = null;
            }
        }
        if (this.f22526e) {
            u1 u1Var = recyclerView.f2424y0;
            if (this.f22523b.f2402n.v() == 0) {
                i();
            } else {
                int i13 = this.f22536o;
                int i14 = i13 - i10;
                if (i13 * i14 <= 0) {
                    i14 = 0;
                }
                this.f22536o = i14;
                int i15 = this.f22537p;
                int i16 = i15 - i11;
                if (i15 * i16 <= 0) {
                    i16 = 0;
                }
                this.f22537p = i16;
                if (i14 == 0 && i16 == 0) {
                    PointF f12 = f(this.f22522a);
                    if (f12 != null) {
                        if (f12.x != s0.g.f34069a || f12.y != s0.g.f34069a) {
                            float f13 = f12.y;
                            float sqrt = (float) Math.sqrt((f13 * f13) + (r10 * r10));
                            float f14 = f12.x / sqrt;
                            f12.x = f14;
                            float f15 = f12.y / sqrt;
                            f12.y = f15;
                            this.f22532k = f12;
                            this.f22536o = (int) (f14 * 10000.0f);
                            this.f22537p = (int) (f15 * 10000.0f);
                            int e10 = e(SearchAuth.StatusCodes.AUTH_DISABLED);
                            LinearInterpolator linearInterpolator = this.f22530i;
                            s1Var.f22567a = (int) (this.f22536o * 1.2f);
                            s1Var.f22568b = (int) (this.f22537p * 1.2f);
                            s1Var.f22569c = (int) (e10 * 1.2f);
                            s1Var.f22571e = linearInterpolator;
                            s1Var.f22572f = true;
                        }
                    }
                    s1Var.f22570d = this.f22522a;
                    i();
                }
            }
            if (s1Var.f22570d >= 0) {
                z10 = true;
            }
            s1Var.a(recyclerView);
            if (z10 && this.f22526e) {
                this.f22525d = true;
                recyclerView.f2418v0.b();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void h(android.view.View r6, k7.u1 r7, k7.s1 r8) {
        /*
            r5 = this;
            android.graphics.PointF r7 = r5.f22532k
            r0 = 1
            r1 = 0
            r2 = -1
            r3 = 0
            if (r7 == 0) goto L15
            float r7 = r7.x
            int r7 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r7 != 0) goto Lf
            goto L15
        Lf:
            if (r7 <= 0) goto L13
            r7 = r0
            goto L16
        L13:
            r7 = r2
            goto L16
        L15:
            r7 = r1
        L16:
            int r7 = r5.b(r6, r7)
            android.graphics.PointF r4 = r5.f22532k
            if (r4 == 0) goto L2a
            float r4 = r4.y
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 != 0) goto L25
            goto L2a
        L25:
            if (r3 <= 0) goto L29
            r1 = r0
            goto L2a
        L29:
            r1 = r2
        L2a:
            int r6 = r5.c(r6, r1)
            int r1 = r7 * r7
            int r2 = r6 * r6
            int r2 = r2 + r1
            double r1 = (double) r2
            double r1 = java.lang.Math.sqrt(r1)
            int r1 = (int) r1
            int r1 = r5.e(r1)
            double r1 = (double) r1
            r3 = 4599717252057688074(0x3fd57a786c22680a, double:0.3356)
            double r1 = r1 / r3
            double r1 = java.lang.Math.ceil(r1)
            int r1 = (int) r1
            if (r1 <= 0) goto L59
            int r7 = -r7
            int r6 = -r6
            android.view.animation.DecelerateInterpolator r2 = r5.f22531j
            r8.f22567a = r7
            r8.f22568b = r6
            r8.f22569c = r1
            r8.f22571e = r2
            r8.f22572f = r0
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.p0.h(android.view.View, k7.u1, k7.s1):void");
    }

    public final void i() {
        if (this.f22526e) {
            this.f22526e = false;
            this.f22537p = 0;
            this.f22536o = 0;
            this.f22532k = null;
            this.f22523b.f2424y0.f22586a = -1;
            this.f22527f = null;
            this.f22522a = -1;
            this.f22525d = false;
            i1 i1Var = this.f22524c;
            if (i1Var.f22408e == this) {
                i1Var.f22408e = null;
            }
            this.f22524c = null;
            this.f22523b = null;
        }
    }
}
