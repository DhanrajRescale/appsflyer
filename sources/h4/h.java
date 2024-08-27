package h4;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import h.q0;

/* loaded from: classes.dex */
public final class h implements View.OnTouchListener {

    /* renamed from: r, reason: collision with root package name */
    public static final int f17961r = ViewConfiguration.getTapTimeout();

    /* renamed from: a, reason: collision with root package name */
    public final a f17962a;

    /* renamed from: b, reason: collision with root package name */
    public final AccelerateInterpolator f17963b;

    /* renamed from: c, reason: collision with root package name */
    public final View f17964c;

    /* renamed from: d, reason: collision with root package name */
    public q0 f17965d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f17966e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f17967f;

    /* renamed from: g, reason: collision with root package name */
    public final int f17968g;

    /* renamed from: h, reason: collision with root package name */
    public final int f17969h;

    /* renamed from: i, reason: collision with root package name */
    public final float[] f17970i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f17971j;

    /* renamed from: k, reason: collision with root package name */
    public final float[] f17972k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f17973l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f17974m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f17975n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f17976o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f17977p;

    /* renamed from: q, reason: collision with root package name */
    public final ListView f17978q;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, h4.a] */
    public h(ListView listView) {
        ?? obj = new Object();
        obj.f17954e = Long.MIN_VALUE;
        obj.f17956g = -1L;
        obj.f17955f = 0L;
        this.f17962a = obj;
        this.f17963b = new AccelerateInterpolator();
        this.f17966e = new float[]{s0.g.f34069a, s0.g.f34069a};
        this.f17967f = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
        this.f17970i = new float[]{s0.g.f34069a, s0.g.f34069a};
        this.f17971j = new float[]{s0.g.f34069a, s0.g.f34069a};
        this.f17972k = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
        this.f17964c = listView;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float[] fArr = this.f17972k;
        float f11 = ((int) ((1575.0f * f10) + 0.5f)) / 1000.0f;
        fArr[0] = f11;
        fArr[1] = f11;
        float[] fArr2 = this.f17971j;
        float f12 = ((int) ((f10 * 315.0f) + 0.5f)) / 1000.0f;
        fArr2[0] = f12;
        fArr2[1] = f12;
        this.f17968g = 1;
        float[] fArr3 = this.f17967f;
        fArr3[0] = Float.MAX_VALUE;
        fArr3[1] = Float.MAX_VALUE;
        float[] fArr4 = this.f17966e;
        fArr4[0] = 0.2f;
        fArr4[1] = 0.2f;
        float[] fArr5 = this.f17970i;
        fArr5[0] = 0.001f;
        fArr5[1] = 0.001f;
        this.f17969h = f17961r;
        obj.f17950a = 500;
        obj.f17951b = 500;
        this.f17978q = listView;
    }

    public static float b(float f10, float f11, float f12) {
        return f10 > f12 ? f12 : f10 < f11 ? f11 : f10;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float a(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.f17966e
            r0 = r0[r4]
            float[] r1 = r3.f17967f
            r1 = r1[r4]
            float r0 = r0 * r6
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r5, r0)
            float r6 = r6 - r5
            float r5 = r3.c(r6, r0)
            float r5 = r5 - r1
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.f17963b
            if (r6 >= 0) goto L25
            float r5 = -r5
            float r5 = r0.getInterpolation(r5)
            float r5 = -r5
            goto L2d
        L25:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 <= 0) goto L36
            float r5 = r0.getInterpolation(r5)
        L2d:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = b(r5, r6, r0)
            goto L37
        L36:
            r5 = r2
        L37:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L3c
            goto L58
        L3c:
            float[] r0 = r3.f17970i
            r0 = r0[r4]
            float[] r1 = r3.f17971j
            r1 = r1[r4]
            float[] r2 = r3.f17972k
            r4 = r2[r4]
            float r0 = r0 * r7
            if (r6 <= 0) goto L51
            float r5 = r5 * r0
            float r2 = b(r5, r1, r4)
            goto L58
        L51:
            float r5 = -r5
            float r5 = r5 * r0
            float r4 = b(r5, r1, r4)
            float r2 = -r4
        L58:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.h.a(int, float, float, float):float");
    }

    public final float c(float f10, float f11) {
        if (f11 == s0.g.f34069a) {
            return s0.g.f34069a;
        }
        int i10 = this.f17968g;
        if (i10 != 0 && i10 != 1) {
            return (i10 == 2 && f10 < s0.g.f34069a) ? f10 / (-f11) : s0.g.f34069a;
        }
        if (f10 >= f11) {
            return s0.g.f34069a;
        }
        if (f10 >= s0.g.f34069a) {
            return 1.0f - (f10 / f11);
        }
        if (this.f17976o && i10 == 1) {
            return 1.0f;
        }
        return s0.g.f34069a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
    
        if (r0 != 3) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.f17977p
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r8 = 3
            if (r0 == r8) goto L16
            goto L7c
        L16:
            r7.e()
            goto L7c
        L1a:
            r7.f17975n = r2
            r7.f17973l = r1
        L1e:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r7.f17964c
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.a(r1, r0, r3, r5)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.a(r2, r9, r8, r3)
            h4.a r9 = r7.f17962a
            r9.f17952c = r0
            r9.f17953d = r8
            boolean r8 = r7.f17976o
            if (r8 != 0) goto L7c
            boolean r8 = r7.f()
            if (r8 == 0) goto L7c
            h.q0 r8 = r7.f17965d
            if (r8 != 0) goto L60
            h.q0 r8 = new h.q0
            r9 = 5
            r8.<init>(r7, r9)
            r7.f17965d = r8
        L60:
            r7.f17976o = r2
            r7.f17974m = r2
            boolean r8 = r7.f17973l
            if (r8 != 0) goto L75
            int r8 = r7.f17969h
            if (r8 <= 0) goto L75
            h.q0 r9 = r7.f17965d
            long r5 = (long) r8
            java.util.WeakHashMap r8 = d4.n1.f13788a
            d4.v0.n(r4, r9, r5)
            goto L7a
        L75:
            h.q0 r8 = r7.f17965d
            r8.run()
        L7a:
            r7.f17973l = r2
        L7c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.h.d(android.view.View, android.view.MotionEvent):boolean");
    }

    public final void e() {
        int i10 = 0;
        if (this.f17974m) {
            this.f17976o = false;
            return;
        }
        a aVar = this.f17962a;
        aVar.getClass();
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i11 = (int) (currentAnimationTimeMillis - aVar.f17954e);
        int i12 = aVar.f17951b;
        if (i11 > i12) {
            i10 = i12;
        } else if (i11 >= 0) {
            i10 = i11;
        }
        aVar.f17958i = i10;
        aVar.f17957h = aVar.a(currentAnimationTimeMillis);
        aVar.f17956g = currentAnimationTimeMillis;
    }

    public final boolean f() {
        ListView listView;
        int count;
        a aVar = this.f17962a;
        float f10 = aVar.f17953d;
        int abs = (int) (f10 / Math.abs(f10));
        Math.abs(aVar.f17952c);
        if (abs == 0 || (count = (listView = this.f17978q).getCount()) == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i10 = firstVisiblePosition + childCount;
        if (abs > 0) {
            if (i10 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (abs >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public final /* bridge */ /* synthetic */ boolean onTouch(View view, MotionEvent motionEvent) {
        d(view, motionEvent);
        return false;
    }
}
