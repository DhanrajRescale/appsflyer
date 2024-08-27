package l4;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.OverScroller;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import h.q0;
import java.util.Arrays;
import s0.g;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: x, reason: collision with root package name */
    public static final d f23954x = new d(0);

    /* renamed from: a, reason: collision with root package name */
    public int f23955a;

    /* renamed from: b, reason: collision with root package name */
    public int f23956b;

    /* renamed from: d, reason: collision with root package name */
    public float[] f23958d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f23959e;

    /* renamed from: f, reason: collision with root package name */
    public float[] f23960f;

    /* renamed from: g, reason: collision with root package name */
    public float[] f23961g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f23962h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f23963i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f23964j;

    /* renamed from: k, reason: collision with root package name */
    public int f23965k;

    /* renamed from: l, reason: collision with root package name */
    public VelocityTracker f23966l;

    /* renamed from: m, reason: collision with root package name */
    public final float f23967m;

    /* renamed from: n, reason: collision with root package name */
    public float f23968n;

    /* renamed from: o, reason: collision with root package name */
    public int f23969o;

    /* renamed from: p, reason: collision with root package name */
    public final int f23970p;

    /* renamed from: q, reason: collision with root package name */
    public int f23971q;

    /* renamed from: r, reason: collision with root package name */
    public final OverScroller f23972r;

    /* renamed from: s, reason: collision with root package name */
    public final al.d f23973s;

    /* renamed from: t, reason: collision with root package name */
    public View f23974t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f23975u;

    /* renamed from: v, reason: collision with root package name */
    public final ViewGroup f23976v;

    /* renamed from: c, reason: collision with root package name */
    public int f23957c = -1;

    /* renamed from: w, reason: collision with root package name */
    public final q0 f23977w = new q0(this, 6);

    public e(Context context, ViewGroup viewGroup, al.d dVar) {
        if (viewGroup != null) {
            if (dVar != null) {
                this.f23976v = viewGroup;
                this.f23973s = dVar;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int i10 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
                this.f23970p = i10;
                this.f23969o = i10;
                this.f23956b = viewConfiguration.getScaledTouchSlop();
                this.f23967m = viewConfiguration.getScaledMaximumFlingVelocity();
                this.f23968n = viewConfiguration.getScaledMinimumFlingVelocity();
                this.f23972r = new OverScroller(context, f23954x);
                return;
            }
            throw new IllegalArgumentException("Callback may not be null");
        }
        throw new IllegalArgumentException("Parent view may not be null");
    }

    public final void a() {
        this.f23957c = -1;
        float[] fArr = this.f23958d;
        if (fArr != null) {
            Arrays.fill(fArr, g.f34069a);
            Arrays.fill(this.f23959e, g.f34069a);
            Arrays.fill(this.f23960f, g.f34069a);
            Arrays.fill(this.f23961g, g.f34069a);
            Arrays.fill(this.f23962h, 0);
            Arrays.fill(this.f23963i, 0);
            Arrays.fill(this.f23964j, 0);
            this.f23965k = 0;
        }
        VelocityTracker velocityTracker = this.f23966l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f23966l = null;
        }
    }

    public final void b(View view, int i10) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.f23976v;
        if (parent == viewGroup) {
            this.f23974t = view;
            this.f23957c = i10;
            this.f23973s.G0(view, i10);
            p(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + viewGroup + ")");
    }

    public final boolean c(float f10, float f11, int i10, int i11) {
        float abs = Math.abs(f10);
        float abs2 = Math.abs(f11);
        if ((this.f23962h[i10] & i11) != i11 || (this.f23971q & i11) == 0 || (this.f23964j[i10] & i11) == i11 || (this.f23963i[i10] & i11) == i11) {
            return false;
        }
        int i12 = this.f23956b;
        if (abs <= i12 && abs2 <= i12) {
            return false;
        }
        if (abs < abs2 * 0.5f) {
            this.f23973s.getClass();
        }
        if ((this.f23963i[i10] & i11) != 0 || abs <= this.f23956b) {
            return false;
        }
        return true;
    }

    public final boolean d(View view, float f10, float f11) {
        boolean z10;
        boolean z11;
        if (view == null) {
            return false;
        }
        al.d dVar = this.f23973s;
        if (dVar.t0(view) > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (dVar.u0() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 && z11) {
            float f12 = (f11 * f11) + (f10 * f10);
            int i10 = this.f23956b;
            if (f12 <= i10 * i10) {
                return false;
            }
            return true;
        }
        if (z10) {
            if (Math.abs(f10) <= this.f23956b) {
                return false;
            }
            return true;
        }
        if (!z11 || Math.abs(f11) <= this.f23956b) {
            return false;
        }
        return true;
    }

    public final void e(int i10) {
        float[] fArr = this.f23958d;
        if (fArr != null) {
            int i11 = this.f23965k;
            int i12 = 1 << i10;
            if ((i11 & i12) != 0) {
                fArr[i10] = 0.0f;
                this.f23959e[i10] = 0.0f;
                this.f23960f[i10] = 0.0f;
                this.f23961g[i10] = 0.0f;
                this.f23962h[i10] = 0;
                this.f23963i[i10] = 0;
                this.f23964j[i10] = 0;
                this.f23965k = (~i12) & i11;
            }
        }
    }

    public final int f(int i10, int i11, int i12) {
        int abs;
        if (i10 == 0) {
            return 0;
        }
        float width = this.f23976v.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i10) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int abs2 = Math.abs(i11);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(sin / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i10) / i12) + 1.0f) * 256.0f);
        }
        return Math.min(abs, 600);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        if (r2 == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g() {
        /*
            r9 = this;
            int r0 = r9.f23955a
            r1 = 2
            if (r0 != r1) goto L5b
            android.widget.OverScroller r0 = r9.f23972r
            boolean r2 = r0.computeScrollOffset()
            int r3 = r0.getCurrX()
            int r4 = r0.getCurrY()
            android.view.View r5 = r9.f23974t
            int r5 = r5.getLeft()
            int r5 = r3 - r5
            android.view.View r6 = r9.f23974t
            int r6 = r6.getTop()
            int r6 = r4 - r6
            if (r5 == 0) goto L2c
            android.view.View r7 = r9.f23974t
            java.util.WeakHashMap r8 = d4.n1.f13788a
            r7.offsetLeftAndRight(r5)
        L2c:
            if (r6 == 0) goto L35
            android.view.View r7 = r9.f23974t
            java.util.WeakHashMap r8 = d4.n1.f13788a
            r7.offsetTopAndBottom(r6)
        L35:
            if (r5 != 0) goto L39
            if (r6 == 0) goto L40
        L39:
            al.d r5 = r9.f23973s
            android.view.View r6 = r9.f23974t
            r5.I0(r6, r3, r4)
        L40:
            if (r2 == 0) goto L52
            int r5 = r0.getFinalX()
            if (r3 != r5) goto L52
            int r3 = r0.getFinalY()
            if (r4 != r3) goto L52
            r0.abortAnimation()
            goto L54
        L52:
            if (r2 != 0) goto L5b
        L54:
            h.q0 r0 = r9.f23977w
            android.view.ViewGroup r2 = r9.f23976v
            r2.post(r0)
        L5b:
            int r0 = r9.f23955a
            if (r0 != r1) goto L61
            r0 = 1
            goto L62
        L61:
            r0 = 0
        L62:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.e.g():boolean");
    }

    public final View h(int i10, int i11) {
        ViewGroup viewGroup = this.f23976v;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f23973s.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i10 >= childAt.getLeft() && i10 < childAt.getRight() && i11 >= childAt.getTop() && i11 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i(int r11, int r12, int r13, int r14) {
        /*
            r10 = this;
            android.view.View r0 = r10.f23974t
            int r2 = r0.getLeft()
            android.view.View r0 = r10.f23974t
            int r3 = r0.getTop()
            int r4 = r11 - r2
            int r5 = r12 - r3
            android.widget.OverScroller r1 = r10.f23972r
            r11 = 0
            if (r4 != 0) goto L1e
            if (r5 != 0) goto L1e
            r1.abortAnimation()
            r10.p(r11)
            return r11
        L1e:
            android.view.View r12 = r10.f23974t
            float r0 = r10.f23968n
            int r0 = (int) r0
            float r6 = r10.f23967m
            int r6 = (int) r6
            int r7 = java.lang.Math.abs(r13)
            if (r7 >= r0) goto L2e
            r13 = r11
            goto L35
        L2e:
            if (r7 <= r6) goto L35
            if (r13 <= 0) goto L34
            r13 = r6
            goto L35
        L34:
            int r13 = -r6
        L35:
            float r0 = r10.f23968n
            int r0 = (int) r0
            int r7 = java.lang.Math.abs(r14)
            if (r7 >= r0) goto L40
        L3e:
            r14 = r11
            goto L48
        L40:
            if (r7 <= r6) goto L48
            if (r14 <= 0) goto L46
            r14 = r6
            goto L48
        L46:
            int r11 = -r6
            goto L3e
        L48:
            int r11 = java.lang.Math.abs(r4)
            int r0 = java.lang.Math.abs(r5)
            int r6 = java.lang.Math.abs(r13)
            int r7 = java.lang.Math.abs(r14)
            int r8 = r6 + r7
            int r9 = r11 + r0
            if (r13 == 0) goto L62
            float r11 = (float) r6
            float r6 = (float) r8
        L60:
            float r11 = r11 / r6
            goto L65
        L62:
            float r11 = (float) r11
            float r6 = (float) r9
            goto L60
        L65:
            if (r14 == 0) goto L6b
            float r0 = (float) r7
            float r6 = (float) r8
        L69:
            float r0 = r0 / r6
            goto L6e
        L6b:
            float r0 = (float) r0
            float r6 = (float) r9
            goto L69
        L6e:
            al.d r6 = r10.f23973s
            int r12 = r6.t0(r12)
            int r12 = r10.f(r4, r13, r12)
            int r13 = r6.u0()
            int r13 = r10.f(r5, r14, r13)
            float r12 = (float) r12
            float r12 = r12 * r11
            float r11 = (float) r13
            float r11 = r11 * r0
            float r11 = r11 + r12
            int r6 = (int) r11
            r1.startScroll(r2, r3, r4, r5, r6)
            r11 = 2
            r10.p(r11)
            r11 = 1
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.e.i(int, int, int, int):boolean");
    }

    public final boolean j(int i10) {
        if ((this.f23965k & (1 << i10)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i10 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
    
        if (r9.f23957c == (-1)) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006e, code lost:
    
        l();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.e.k(android.view.MotionEvent):void");
    }

    public final void l() {
        VelocityTracker velocityTracker = this.f23966l;
        float f10 = this.f23967m;
        velocityTracker.computeCurrentVelocity(CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT, f10);
        float xVelocity = this.f23966l.getXVelocity(this.f23957c);
        float f11 = this.f23968n;
        float abs = Math.abs(xVelocity);
        float f12 = g.f34069a;
        if (abs < f11) {
            xVelocity = 0.0f;
        } else if (abs > f10) {
            if (xVelocity > g.f34069a) {
                xVelocity = f10;
            } else {
                xVelocity = -f10;
            }
        }
        float yVelocity = this.f23966l.getYVelocity(this.f23957c);
        float f13 = this.f23968n;
        float abs2 = Math.abs(yVelocity);
        if (abs2 >= f13) {
            if (abs2 > f10) {
                if (yVelocity <= g.f34069a) {
                    f10 = -f10;
                }
                f12 = f10;
            } else {
                f12 = yVelocity;
            }
        }
        this.f23975u = true;
        this.f23973s.J0(this.f23974t, xVelocity, f12);
        this.f23975u = false;
        if (this.f23955a == 1) {
            p(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r3v3, types: [al.d] */
    public final void m(float f10, float f11, int i10) {
        boolean c10 = c(f10, f11, i10, 1);
        boolean z10 = c10;
        if (c(f11, f10, i10, 4)) {
            z10 = (c10 ? 1 : 0) | 4;
        }
        boolean z11 = z10;
        if (c(f10, f11, i10, 2)) {
            z11 = (z10 ? 1 : 0) | 2;
        }
        ?? r02 = z11;
        if (c(f11, f10, i10, 8)) {
            r02 = (z11 ? 1 : 0) | 8;
        }
        if (r02 != 0) {
            int[] iArr = this.f23963i;
            iArr[i10] = iArr[i10] | r02;
            this.f23973s.E0(r02, i10);
        }
    }

    public final void n(float f10, float f11, int i10) {
        float[] fArr = this.f23958d;
        int i11 = 0;
        if (fArr == null || fArr.length <= i10) {
            int i12 = i10 + 1;
            float[] fArr2 = new float[i12];
            float[] fArr3 = new float[i12];
            float[] fArr4 = new float[i12];
            float[] fArr5 = new float[i12];
            int[] iArr = new int[i12];
            int[] iArr2 = new int[i12];
            int[] iArr3 = new int[i12];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f23959e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f23960f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f23961g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f23962h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f23963i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f23964j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f23958d = fArr2;
            this.f23959e = fArr3;
            this.f23960f = fArr4;
            this.f23961g = fArr5;
            this.f23962h = iArr;
            this.f23963i = iArr2;
            this.f23964j = iArr3;
        }
        float[] fArr9 = this.f23958d;
        this.f23960f[i10] = f10;
        fArr9[i10] = f10;
        float[] fArr10 = this.f23959e;
        this.f23961g[i10] = f11;
        fArr10[i10] = f11;
        int[] iArr7 = this.f23962h;
        int i13 = (int) f10;
        int i14 = (int) f11;
        ViewGroup viewGroup = this.f23976v;
        if (i13 < viewGroup.getLeft() + this.f23969o) {
            i11 = 1;
        }
        if (i14 < viewGroup.getTop() + this.f23969o) {
            i11 |= 4;
        }
        if (i13 > viewGroup.getRight() - this.f23969o) {
            i11 |= 2;
        }
        if (i14 > viewGroup.getBottom() - this.f23969o) {
            i11 |= 8;
        }
        iArr7[i10] = i11;
        this.f23965k |= 1 << i10;
    }

    public final void o(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            int pointerId = motionEvent.getPointerId(i10);
            if (j(pointerId)) {
                float x10 = motionEvent.getX(i10);
                float y10 = motionEvent.getY(i10);
                this.f23960f[pointerId] = x10;
                this.f23961g[pointerId] = y10;
            }
        }
    }

    public final void p(int i10) {
        this.f23976v.removeCallbacks(this.f23977w);
        if (this.f23955a != i10) {
            this.f23955a = i10;
            this.f23973s.H0(i10);
            if (this.f23955a == 0) {
                this.f23974t = null;
            }
        }
    }

    public final boolean q(int i10, int i11) {
        if (this.f23975u) {
            return i(i10, i11, (int) this.f23966l.getXVelocity(this.f23957c), (int) this.f23966l.getYVelocity(this.f23957c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d4, code lost:
    
        if (r13 != r12) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean r(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.e.r(android.view.MotionEvent):boolean");
    }

    public final boolean s(View view, int i10, int i11) {
        this.f23974t = view;
        this.f23957c = -1;
        boolean i12 = i(i10, i11, 0, 0);
        if (!i12 && this.f23955a == 0 && this.f23974t != null) {
            this.f23974t = null;
        }
        return i12;
    }

    public final boolean t(View view, int i10) {
        if (view == this.f23974t && this.f23957c == i10) {
            return true;
        }
        if (view != null && this.f23973s.h1(view, i10)) {
            this.f23957c = i10;
            b(view, i10);
            return true;
        }
        return false;
    }
}
