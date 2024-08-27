package m;

import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public abstract class z1 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final float f25825a;

    /* renamed from: b, reason: collision with root package name */
    public final int f25826b;

    /* renamed from: c, reason: collision with root package name */
    public final int f25827c;

    /* renamed from: d, reason: collision with root package name */
    public final View f25828d;

    /* renamed from: e, reason: collision with root package name */
    public y1 f25829e;

    /* renamed from: f, reason: collision with root package name */
    public y1 f25830f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f25831g;

    /* renamed from: h, reason: collision with root package name */
    public int f25832h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f25833i = new int[2];

    public z1(View view) {
        this.f25828d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f25825a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f25826b = tapTimeout;
        this.f25827c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        y1 y1Var = this.f25830f;
        View view = this.f25828d;
        if (y1Var != null) {
            view.removeCallbacks(y1Var);
        }
        y1 y1Var2 = this.f25829e;
        if (y1Var2 != null) {
            view.removeCallbacks(y1Var2);
        }
    }

    public abstract l.g0 b();

    public abstract boolean c();

    public boolean d() {
        l.g0 b10 = b();
        if (b10 != null && b10.a()) {
            b10.dismiss();
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
    
        if (r14 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007d, code lost:
    
        if (r4 != 3) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0100  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m.z1.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f25831g = false;
        this.f25832h = -1;
        y1 y1Var = this.f25829e;
        if (y1Var != null) {
            this.f25828d.removeCallbacks(y1Var);
        }
    }
}
