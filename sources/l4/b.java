package l4;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.gms.common.api.Api;
import d4.n1;
import d4.v0;
import e4.k;
import e4.m;
import e4.q;
import java.util.ArrayList;
import java.util.WeakHashMap;
import mt.p;
import s0.g;

/* loaded from: classes.dex */
public abstract class b extends d4.c {

    /* renamed from: n, reason: collision with root package name */
    public static final Rect f23936n = new Rect(Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o, reason: collision with root package name */
    public static final p f23937o = new p(3);

    /* renamed from: p, reason: collision with root package name */
    public static final x2.c f23938p = new Object();

    /* renamed from: h, reason: collision with root package name */
    public final AccessibilityManager f23943h;

    /* renamed from: i, reason: collision with root package name */
    public final View f23944i;

    /* renamed from: j, reason: collision with root package name */
    public a f23945j;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f23939d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    public final Rect f23940e = new Rect();

    /* renamed from: f, reason: collision with root package name */
    public final Rect f23941f = new Rect();

    /* renamed from: g, reason: collision with root package name */
    public final int[] f23942g = new int[2];

    /* renamed from: k, reason: collision with root package name */
    public int f23946k = Integer.MIN_VALUE;

    /* renamed from: l, reason: collision with root package name */
    public int f23947l = Integer.MIN_VALUE;

    /* renamed from: m, reason: collision with root package name */
    public int f23948m = Integer.MIN_VALUE;

    public b(View view) {
        if (view != null) {
            this.f23944i = view;
            this.f23943h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            WeakHashMap weakHashMap = n1.f13788a;
            if (v0.c(view) == 0) {
                v0.s(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    @Override // d4.c
    public final k b(View view) {
        if (this.f23945j == null) {
            this.f23945j = new a(this);
        }
        return this.f23945j;
    }

    @Override // d4.c
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
    }

    @Override // d4.c
    public final void d(View view, m mVar) {
        this.f13725a.onInitializeAccessibilityNodeInfo(view, mVar.f14996a);
        t(mVar);
    }

    public final boolean j(int i10) {
        if (this.f23947l != i10) {
            return false;
        }
        this.f23947l = Integer.MIN_VALUE;
        v(i10, false);
        x(i10, 8);
        return true;
    }

    public final AccessibilityEvent k(int i10, int i11) {
        View view = this.f23944i;
        if (i10 != -1) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(i11);
            m r10 = r(i10);
            obtain.getText().add(r10.h());
            AccessibilityNodeInfo accessibilityNodeInfo = r10.f14996a;
            obtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            obtain.setScrollable(accessibilityNodeInfo.isScrollable());
            obtain.setPassword(accessibilityNodeInfo.isPassword());
            obtain.setEnabled(accessibilityNodeInfo.isEnabled());
            obtain.setChecked(accessibilityNodeInfo.isChecked());
            if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            obtain.setClassName(accessibilityNodeInfo.getClassName());
            q.a(obtain, view, i10);
            obtain.setPackageName(view.getContext().getPackageName());
            return obtain;
        }
        AccessibilityEvent obtain2 = AccessibilityEvent.obtain(i11);
        view.onInitializeAccessibilityEvent(obtain2);
        return obtain2;
    }

    public final m l(int i10) {
        boolean z10;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        m mVar = new m(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        mVar.j("android.view.View");
        Rect rect = f23936n;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        mVar.f14997b = -1;
        View view = this.f23944i;
        obtain.setParent(view);
        u(i10, mVar);
        if (mVar.h() == null && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f23940e;
        mVar.f(rect2);
        if (!rect2.equals(rect)) {
            int actions = obtain.getActions();
            if ((actions & 64) == 0) {
                if ((actions & 128) == 0) {
                    obtain.setPackageName(view.getContext().getPackageName());
                    mVar.f14998c = i10;
                    obtain.setSource(view, i10);
                    if (this.f23946k == i10) {
                        obtain.setAccessibilityFocused(true);
                        mVar.a(128);
                    } else {
                        obtain.setAccessibilityFocused(false);
                        mVar.a(64);
                    }
                    if (this.f23947l == i10) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        mVar.a(2);
                    } else if (obtain.isFocusable()) {
                        mVar.a(1);
                    }
                    obtain.setFocused(z10);
                    int[] iArr = this.f23942g;
                    view.getLocationOnScreen(iArr);
                    Rect rect3 = this.f23939d;
                    obtain.getBoundsInScreen(rect3);
                    if (rect3.equals(rect)) {
                        mVar.f(rect3);
                        if (mVar.f14997b != -1) {
                            m mVar2 = new m(AccessibilityNodeInfo.obtain());
                            for (int i11 = mVar.f14997b; i11 != -1; i11 = mVar2.f14997b) {
                                mVar2.f14997b = -1;
                                AccessibilityNodeInfo accessibilityNodeInfo = mVar2.f14996a;
                                accessibilityNodeInfo.setParent(view, -1);
                                accessibilityNodeInfo.setBoundsInParent(rect);
                                u(i11, mVar2);
                                mVar2.f(rect2);
                                rect3.offset(rect2.left, rect2.top);
                            }
                        }
                        rect3.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
                    }
                    Rect rect4 = this.f23941f;
                    if (view.getLocalVisibleRect(rect4)) {
                        rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
                        if (rect3.intersect(rect4)) {
                            AccessibilityNodeInfo accessibilityNodeInfo2 = mVar.f14996a;
                            accessibilityNodeInfo2.setBoundsInScreen(rect3);
                            if (!rect3.isEmpty() && view.getWindowVisibility() == 0) {
                                Object parent = view.getParent();
                                while (true) {
                                    if (parent instanceof View) {
                                        View view2 = (View) parent;
                                        if (view2.getAlpha() <= g.f34069a || view2.getVisibility() != 0) {
                                            break;
                                        }
                                        parent = view2.getParent();
                                    } else if (parent != null) {
                                        accessibilityNodeInfo2.setVisibleToUser(true);
                                    }
                                }
                            }
                        }
                    }
                    return mVar;
                }
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
    }

    public final boolean m(MotionEvent motionEvent) {
        int i10;
        AccessibilityManager accessibilityManager = this.f23943h;
        if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7 && action != 9) {
            if (action != 10 || (i10 = this.f23948m) == Integer.MIN_VALUE) {
                return false;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f23948m = Integer.MIN_VALUE;
                x(Integer.MIN_VALUE, 128);
                x(i10, 256);
            }
            return true;
        }
        int n10 = n(motionEvent.getX(), motionEvent.getY());
        int i11 = this.f23948m;
        if (i11 != n10) {
            this.f23948m = n10;
            x(n10, 128);
            x(i11, 256);
        }
        if (n10 == Integer.MIN_VALUE) {
            return false;
        }
        return true;
    }

    public abstract int n(float f10, float f11);

    public abstract void o(ArrayList arrayList);

    public final void p(int i10) {
        View view;
        ViewParent parent;
        if (i10 != Integer.MIN_VALUE && this.f23943h.isEnabled() && (parent = (view = this.f23944i).getParent()) != null) {
            AccessibilityEvent k10 = k(i10, 2048);
            e4.b.b(k10, 0);
            parent.requestSendAccessibilityEvent(view, k10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean q(int r20, android.graphics.Rect r21) {
        /*
            Method dump skipped, instructions count: 500
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.b.q(int, android.graphics.Rect):boolean");
    }

    public final m r(int i10) {
        if (i10 == -1) {
            View view = this.f23944i;
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(view);
            m mVar = new m(obtain);
            WeakHashMap weakHashMap = n1.f13788a;
            view.onInitializeAccessibilityNodeInfo(obtain);
            ArrayList arrayList = new ArrayList();
            o(arrayList);
            if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
                throw new RuntimeException("Views cannot have both real and virtual children");
            }
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                mVar.f14996a.addChild(view, ((Integer) arrayList.get(i11)).intValue());
            }
            return mVar;
        }
        return l(i10);
    }

    public abstract boolean s(int i10, int i11, Bundle bundle);

    public void t(m mVar) {
    }

    public abstract void u(int i10, m mVar);

    public void v(int i10, boolean z10) {
    }

    public final boolean w(int i10) {
        int i11;
        View view = this.f23944i;
        if ((!view.isFocused() && !view.requestFocus()) || (i11 = this.f23947l) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            j(i11);
        }
        if (i10 == Integer.MIN_VALUE) {
            return false;
        }
        this.f23947l = i10;
        v(i10, true);
        x(i10, 8);
        return true;
    }

    public final void x(int i10, int i11) {
        View view;
        ViewParent parent;
        if (i10 == Integer.MIN_VALUE || !this.f23943h.isEnabled() || (parent = (view = this.f23944i).getParent()) == null) {
            return;
        }
        parent.requestSendAccessibilityEvent(view, k(i10, i11));
    }
}
