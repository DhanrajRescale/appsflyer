package k7;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import com.assetgro.stockgro.prod.R;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k0 extends f1 implements k1 {
    public Rect B;
    public long C;

    /* renamed from: d, reason: collision with root package name */
    public float f22440d;

    /* renamed from: e, reason: collision with root package name */
    public float f22441e;

    /* renamed from: f, reason: collision with root package name */
    public float f22442f;

    /* renamed from: g, reason: collision with root package name */
    public float f22443g;

    /* renamed from: h, reason: collision with root package name */
    public float f22444h;

    /* renamed from: i, reason: collision with root package name */
    public float f22445i;

    /* renamed from: j, reason: collision with root package name */
    public float f22446j;

    /* renamed from: k, reason: collision with root package name */
    public float f22447k;

    /* renamed from: m, reason: collision with root package name */
    public final i0 f22449m;

    /* renamed from: o, reason: collision with root package name */
    public int f22451o;

    /* renamed from: q, reason: collision with root package name */
    public int f22453q;

    /* renamed from: r, reason: collision with root package name */
    public RecyclerView f22454r;

    /* renamed from: t, reason: collision with root package name */
    public VelocityTracker f22456t;

    /* renamed from: u, reason: collision with root package name */
    public ArrayList f22457u;

    /* renamed from: v, reason: collision with root package name */
    public ArrayList f22458v;

    /* renamed from: y, reason: collision with root package name */
    public e.l f22461y;

    /* renamed from: z, reason: collision with root package name */
    public j0 f22462z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f22437a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final float[] f22438b = new float[2];

    /* renamed from: c, reason: collision with root package name */
    public y1 f22439c = null;

    /* renamed from: l, reason: collision with root package name */
    public int f22448l = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f22450n = 0;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f22452p = new ArrayList();

    /* renamed from: s, reason: collision with root package name */
    public final x f22455s = new x(this, 1);

    /* renamed from: w, reason: collision with root package name */
    public View f22459w = null;

    /* renamed from: x, reason: collision with root package name */
    public int f22460x = -1;
    public final g0 A = new g0(this);

    public k0(ef.b bVar) {
        this.f22449m = bVar;
    }

    public static boolean q(View view, float f10, float f11, float f12, float f13) {
        if (f10 >= f12 && f10 <= f12 + view.getWidth() && f11 >= f13 && f11 <= f13 + view.getHeight()) {
            return true;
        }
        return false;
    }

    @Override // k7.k1
    public final void b(View view) {
        s(view);
        y1 M = this.f22454r.M(view);
        if (M == null) {
            return;
        }
        y1 y1Var = this.f22439c;
        if (y1Var != null && M == y1Var) {
            t(null, 0);
            return;
        }
        n(M, false);
        if (this.f22437a.remove(M.f22629a)) {
            this.f22449m.getClass();
            i0.a(M);
        }
    }

    @Override // k7.k1
    public final void c(View view) {
    }

    @Override // k7.f1
    public final void f(Rect rect, View view, RecyclerView recyclerView) {
        rect.setEmpty();
    }

    @Override // k7.f1
    public final void h(Canvas canvas, RecyclerView recyclerView) {
        float f10;
        float f11;
        this.f22460x = -1;
        if (this.f22439c != null) {
            float[] fArr = this.f22438b;
            p(fArr);
            float f12 = fArr[0];
            f11 = fArr[1];
            f10 = f12;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        y1 y1Var = this.f22439c;
        ArrayList arrayList = this.f22452p;
        int i10 = this.f22450n;
        i0 i0Var = this.f22449m;
        i0Var.getClass();
        int i11 = 0;
        for (int size = arrayList.size(); i11 < size; size = size) {
            h0 h0Var = (h0) arrayList.get(i11);
            float f13 = h0Var.f22376a;
            float f14 = h0Var.f22378c;
            y1 y1Var2 = h0Var.f22380e;
            if (f13 == f14) {
                h0Var.f22384i = y1Var2.f22629a.getTranslationX();
            } else {
                h0Var.f22384i = nn.d.b(f14, f13, h0Var.f22388m, f13);
            }
            float f15 = h0Var.f22377b;
            float f16 = h0Var.f22379d;
            if (f15 == f16) {
                h0Var.f22385j = y1Var2.f22629a.getTranslationY();
            } else {
                h0Var.f22385j = nn.d.b(f16, f15, h0Var.f22388m, f15);
            }
            int save = canvas.save();
            i0Var.f(canvas, recyclerView, h0Var.f22380e, h0Var.f22384i, h0Var.f22385j, h0Var.f22381f, false);
            canvas.restoreToCount(save);
            i11++;
        }
        if (y1Var != null) {
            int save2 = canvas.save();
            i0Var.f(canvas, recyclerView, y1Var, f10, f11, i10, true);
            canvas.restoreToCount(save2);
        }
    }

    @Override // k7.f1
    public final void i(Canvas canvas, RecyclerView recyclerView) {
        boolean z10 = false;
        if (this.f22439c != null) {
            float[] fArr = this.f22438b;
            p(fArr);
            float f10 = fArr[0];
            float f11 = fArr[1];
        }
        y1 y1Var = this.f22439c;
        ArrayList arrayList = this.f22452p;
        this.f22449m.getClass();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            h0 h0Var = (h0) arrayList.get(i10);
            int save = canvas.save();
            View view = h0Var.f22380e.f22629a;
            canvas.restoreToCount(save);
        }
        if (y1Var != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i11 = size - 1; i11 >= 0; i11--) {
            h0 h0Var2 = (h0) arrayList.get(i11);
            boolean z11 = h0Var2.f22387l;
            if (z11 && !h0Var2.f22383h) {
                arrayList.remove(i11);
            } else if (!z11) {
                z10 = true;
            }
        }
        if (z10) {
            recyclerView.invalidate();
        }
    }

    public final void j(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f22454r;
        if (recyclerView2 == recyclerView) {
            return;
        }
        g0 g0Var = this.A;
        if (recyclerView2 != null) {
            recyclerView2.e0(this);
            RecyclerView recyclerView3 = this.f22454r;
            recyclerView3.f2407q.remove(g0Var);
            if (recyclerView3.f2409r == g0Var) {
                recyclerView3.f2409r = null;
            }
            ArrayList arrayList = this.f22454r.C;
            if (arrayList != null) {
                arrayList.remove(this);
            }
            ArrayList arrayList2 = this.f22452p;
            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                h0 h0Var = (h0) arrayList2.get(0);
                h0Var.f22382g.cancel();
                this.f22449m.getClass();
                i0.a(h0Var.f22380e);
            }
            arrayList2.clear();
            this.f22459w = null;
            this.f22460x = -1;
            VelocityTracker velocityTracker = this.f22456t;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f22456t = null;
            }
            j0 j0Var = this.f22462z;
            if (j0Var != null) {
                j0Var.f22428a = false;
                this.f22462z = null;
            }
            if (this.f22461y != null) {
                this.f22461y = null;
            }
        }
        this.f22454r = recyclerView;
        if (recyclerView != null) {
            Resources resources = recyclerView.getResources();
            this.f22442f = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
            this.f22443g = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
            this.f22453q = ViewConfiguration.get(this.f22454r.getContext()).getScaledTouchSlop();
            this.f22454r.i(this);
            this.f22454r.f2407q.add(g0Var);
            RecyclerView recyclerView4 = this.f22454r;
            if (recyclerView4.C == null) {
                recyclerView4.C = new ArrayList();
            }
            recyclerView4.C.add(this);
            this.f22462z = new j0(this);
            this.f22461y = new e.l(this.f22454r.getContext(), this.f22462z, 0);
        }
    }

    public final int k(int i10) {
        int i11;
        if ((i10 & 12) != 0) {
            int i12 = 4;
            if (this.f22444h > s0.g.f34069a) {
                i11 = 8;
            } else {
                i11 = 4;
            }
            VelocityTracker velocityTracker = this.f22456t;
            i0 i0Var = this.f22449m;
            if (velocityTracker != null && this.f22448l > -1) {
                float f10 = this.f22443g;
                i0Var.getClass();
                velocityTracker.computeCurrentVelocity(CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT, f10);
                float xVelocity = this.f22456t.getXVelocity(this.f22448l);
                float yVelocity = this.f22456t.getYVelocity(this.f22448l);
                if (xVelocity > s0.g.f34069a) {
                    i12 = 8;
                }
                float abs = Math.abs(xVelocity);
                if ((i12 & i10) != 0 && i11 == i12 && abs >= this.f22442f && abs > Math.abs(yVelocity)) {
                    return i12;
                }
            }
            float width = this.f22454r.getWidth();
            i0Var.getClass();
            float f11 = width * 0.5f;
            if ((i10 & i11) != 0 && Math.abs(this.f22444h) > f11) {
                return i11;
            }
            return 0;
        }
        return 0;
    }

    public final void l(int i10, int i11, MotionEvent motionEvent) {
        View o10;
        if (this.f22439c == null && i10 == 2 && this.f22450n != 2) {
            i0 i0Var = this.f22449m;
            i0Var.getClass();
            if (this.f22454r.getScrollState() == 1) {
                return;
            }
            i1 layoutManager = this.f22454r.getLayoutManager();
            int i12 = this.f22448l;
            y1 y1Var = null;
            if (i12 != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i12);
                float x10 = motionEvent.getX(findPointerIndex) - this.f22440d;
                float y10 = motionEvent.getY(findPointerIndex) - this.f22441e;
                float abs = Math.abs(x10);
                float abs2 = Math.abs(y10);
                float f10 = this.f22453q;
                if ((abs >= f10 || abs2 >= f10) && ((abs <= abs2 || !layoutManager.d()) && ((abs2 <= abs || !layoutManager.e()) && (o10 = o(motionEvent)) != null))) {
                    y1Var = this.f22454r.M(o10);
                }
            }
            if (y1Var == null) {
                return;
            }
            RecyclerView recyclerView = this.f22454r;
            i0Var.d(recyclerView, y1Var);
            WeakHashMap weakHashMap = d4.n1.f13788a;
            int b10 = (i0Var.b(3084, d4.w0.d(recyclerView)) & 65280) >> 8;
            if (b10 == 0) {
                return;
            }
            float x11 = motionEvent.getX(i11);
            float y11 = motionEvent.getY(i11);
            float f11 = x11 - this.f22440d;
            float f12 = y11 - this.f22441e;
            float abs3 = Math.abs(f11);
            float abs4 = Math.abs(f12);
            float f13 = this.f22453q;
            if (abs3 < f13 && abs4 < f13) {
                return;
            }
            if (abs3 > abs4) {
                if (f11 < s0.g.f34069a && (b10 & 4) == 0) {
                    return;
                }
                if (f11 > s0.g.f34069a && (b10 & 8) == 0) {
                    return;
                }
            } else {
                if (f12 < s0.g.f34069a && (b10 & 1) == 0) {
                    return;
                }
                if (f12 > s0.g.f34069a && (b10 & 2) == 0) {
                    return;
                }
            }
            this.f22445i = s0.g.f34069a;
            this.f22444h = s0.g.f34069a;
            this.f22448l = motionEvent.getPointerId(0);
            t(y1Var, 1);
        }
    }

    public final int m(int i10) {
        int i11;
        if ((i10 & 3) != 0) {
            int i12 = 1;
            if (this.f22445i > s0.g.f34069a) {
                i11 = 2;
            } else {
                i11 = 1;
            }
            VelocityTracker velocityTracker = this.f22456t;
            i0 i0Var = this.f22449m;
            if (velocityTracker != null && this.f22448l > -1) {
                float f10 = this.f22443g;
                i0Var.getClass();
                velocityTracker.computeCurrentVelocity(CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT, f10);
                float xVelocity = this.f22456t.getXVelocity(this.f22448l);
                float yVelocity = this.f22456t.getYVelocity(this.f22448l);
                if (yVelocity > s0.g.f34069a) {
                    i12 = 2;
                }
                float abs = Math.abs(yVelocity);
                if ((i12 & i10) != 0 && i12 == i11 && abs >= this.f22442f && abs > Math.abs(xVelocity)) {
                    return i12;
                }
            }
            float height = this.f22454r.getHeight();
            i0Var.getClass();
            float f11 = height * 0.5f;
            if ((i10 & i11) != 0 && Math.abs(this.f22445i) > f11) {
                return i11;
            }
            return 0;
        }
        return 0;
    }

    public final void n(y1 y1Var, boolean z10) {
        ArrayList arrayList = this.f22452p;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            h0 h0Var = (h0) arrayList.get(size);
            if (h0Var.f22380e == y1Var) {
                h0Var.f22386k |= z10;
                if (!h0Var.f22387l) {
                    h0Var.f22382g.cancel();
                }
                arrayList.remove(size);
                return;
            }
        }
    }

    public final View o(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        y1 y1Var = this.f22439c;
        if (y1Var != null) {
            float f10 = this.f22446j + this.f22444h;
            float f11 = this.f22447k + this.f22445i;
            View view = y1Var.f22629a;
            if (q(view, x10, y10, f10, f11)) {
                return view;
            }
        }
        ArrayList arrayList = this.f22452p;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            h0 h0Var = (h0) arrayList.get(size);
            View view2 = h0Var.f22380e.f22629a;
            if (q(view2, x10, y10, h0Var.f22384i, h0Var.f22385j)) {
                return view2;
            }
        }
        RecyclerView recyclerView = this.f22454r;
        for (int e10 = recyclerView.f2386f.e() - 1; e10 >= 0; e10--) {
            View d10 = recyclerView.f2386f.d(e10);
            float translationX = d10.getTranslationX();
            float translationY = d10.getTranslationY();
            if (x10 >= d10.getLeft() + translationX && x10 <= d10.getRight() + translationX && y10 >= d10.getTop() + translationY && y10 <= d10.getBottom() + translationY) {
                return d10;
            }
        }
        return null;
    }

    public final void p(float[] fArr) {
        if ((this.f22451o & 12) != 0) {
            fArr[0] = (this.f22446j + this.f22444h) - this.f22439c.f22629a.getLeft();
        } else {
            fArr[0] = this.f22439c.f22629a.getTranslationX();
        }
        if ((this.f22451o & 3) != 0) {
            fArr[1] = (this.f22447k + this.f22445i) - this.f22439c.f22629a.getTop();
        } else {
            fArr[1] = this.f22439c.f22629a.getTranslationY();
        }
    }

    public final void r(y1 viewHolder) {
        ArrayList arrayList;
        int i10;
        int bottom;
        int abs;
        int top;
        int abs2;
        int left;
        int abs3;
        int right;
        int abs4;
        int i11;
        int i12;
        int i13;
        char c10;
        if (this.f22454r.isLayoutRequested()) {
            return;
        }
        char c11 = 2;
        if (this.f22450n != 2) {
            return;
        }
        this.f22449m.getClass();
        int i14 = (int) (this.f22446j + this.f22444h);
        int i15 = (int) (this.f22447k + this.f22445i);
        float abs5 = Math.abs(i15 - viewHolder.f22629a.getTop());
        View view = viewHolder.f22629a;
        if (abs5 < view.getHeight() * 0.5f && Math.abs(i14 - view.getLeft()) < view.getWidth() * 0.5f) {
            return;
        }
        ArrayList arrayList2 = this.f22457u;
        if (arrayList2 == null) {
            this.f22457u = new ArrayList();
            this.f22458v = new ArrayList();
        } else {
            arrayList2.clear();
            this.f22458v.clear();
        }
        int round = Math.round(this.f22446j + this.f22444h);
        int round2 = Math.round(this.f22447k + this.f22445i);
        int width = view.getWidth() + round;
        int height = view.getHeight() + round2;
        int i16 = (round + width) / 2;
        int i17 = (round2 + height) / 2;
        i1 layoutManager = this.f22454r.getLayoutManager();
        int v10 = layoutManager.v();
        int i18 = 0;
        while (i18 < v10) {
            View u10 = layoutManager.u(i18);
            if (u10 == view) {
                c10 = c11;
                i11 = round;
                i12 = round2;
                i13 = width;
            } else if (u10.getBottom() < round2 || u10.getTop() > height || u10.getRight() < round || u10.getLeft() > width) {
                i11 = round;
                i12 = round2;
                i13 = width;
                c10 = 2;
            } else {
                y1 M = this.f22454r.M(u10);
                c10 = 2;
                int abs6 = Math.abs(i16 - ((u10.getRight() + u10.getLeft()) / 2));
                int abs7 = Math.abs(i17 - ((u10.getBottom() + u10.getTop()) / 2));
                int i19 = (abs7 * abs7) + (abs6 * abs6);
                i11 = round;
                int size = this.f22457u.size();
                i12 = round2;
                i13 = width;
                int i20 = 0;
                int i21 = 0;
                while (i20 < size) {
                    int i22 = size;
                    if (i19 <= ((Integer) this.f22458v.get(i20)).intValue()) {
                        break;
                    }
                    i21++;
                    i20++;
                    size = i22;
                }
                this.f22457u.add(i21, M);
                this.f22458v.add(i21, Integer.valueOf(i19));
            }
            i18++;
            c11 = c10;
            round = i11;
            round2 = i12;
            width = i13;
        }
        ArrayList arrayList3 = this.f22457u;
        if (arrayList3.size() == 0) {
            return;
        }
        int width2 = view.getWidth() + i14;
        int height2 = view.getHeight() + i15;
        int left2 = i14 - view.getLeft();
        int top2 = i15 - view.getTop();
        int size2 = arrayList3.size();
        y1 target = null;
        int i23 = -1;
        int i24 = 0;
        while (i24 < size2) {
            y1 y1Var = (y1) arrayList3.get(i24);
            if (left2 > 0 && (right = y1Var.f22629a.getRight() - width2) < 0) {
                arrayList = arrayList3;
                i10 = width2;
                if (y1Var.f22629a.getRight() > view.getRight() && (abs4 = Math.abs(right)) > i23) {
                    i23 = abs4;
                    target = y1Var;
                }
            } else {
                arrayList = arrayList3;
                i10 = width2;
            }
            if (left2 < 0 && (left = y1Var.f22629a.getLeft() - i14) > 0 && y1Var.f22629a.getLeft() < view.getLeft() && (abs3 = Math.abs(left)) > i23) {
                i23 = abs3;
                target = y1Var;
            }
            if (top2 < 0 && (top = y1Var.f22629a.getTop() - i15) > 0 && y1Var.f22629a.getTop() < view.getTop() && (abs2 = Math.abs(top)) > i23) {
                i23 = abs2;
                target = y1Var;
            }
            if (top2 > 0 && (bottom = y1Var.f22629a.getBottom() - height2) < 0 && y1Var.f22629a.getBottom() > view.getBottom() && (abs = Math.abs(bottom)) > i23) {
                i23 = abs;
                target = y1Var;
            }
            i24++;
            arrayList3 = arrayList;
            width2 = i10;
        }
        if (target == null) {
            this.f22457u.clear();
            this.f22458v.clear();
            return;
        }
        target.c();
        viewHolder.c();
        RecyclerView recyclerView = this.f22454r;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(target, "target");
    }

    public final void s(View view) {
        if (view == this.f22459w) {
            this.f22459w = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0097, code lost:
    
        if (r1 > 0) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t(k7.y1 r23, int r24) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.k0.t(k7.y1, int):void");
    }

    public final void u(int i10, int i11, MotionEvent motionEvent) {
        float x10 = motionEvent.getX(i11);
        float y10 = motionEvent.getY(i11);
        float f10 = x10 - this.f22440d;
        this.f22444h = f10;
        this.f22445i = y10 - this.f22441e;
        if ((i10 & 4) == 0) {
            this.f22444h = Math.max(s0.g.f34069a, f10);
        }
        if ((i10 & 8) == 0) {
            this.f22444h = Math.min(s0.g.f34069a, this.f22444h);
        }
        if ((i10 & 1) == 0) {
            this.f22445i = Math.max(s0.g.f34069a, this.f22445i);
        }
        if ((i10 & 2) == 0) {
            this.f22445i = Math.min(s0.g.f34069a, this.f22445i);
        }
    }
}
