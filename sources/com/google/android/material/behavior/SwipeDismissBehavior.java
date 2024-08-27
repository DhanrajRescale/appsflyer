package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import d4.n1;
import d4.v0;
import e4.f;
import ek.h0;
import java.util.WeakHashMap;
import l4.e;
import o3.b;
import s0.g;
import yn.a;

/* loaded from: classes2.dex */
public class SwipeDismissBehavior<V extends View> extends b {

    /* renamed from: a, reason: collision with root package name */
    public e f11159a;

    /* renamed from: b, reason: collision with root package name */
    public h0 f11160b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f11161c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f11162d;

    /* renamed from: e, reason: collision with root package name */
    public int f11163e = 2;

    /* renamed from: f, reason: collision with root package name */
    public final float f11164f = 0.5f;

    /* renamed from: g, reason: collision with root package name */
    public float f11165g = g.f34069a;

    /* renamed from: h, reason: collision with root package name */
    public float f11166h = 0.5f;

    /* renamed from: i, reason: collision with root package name */
    public final a f11167i = new a(this);

    @Override // o3.b
    public boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z10 = this.f11161c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.f11161c = false;
            }
        } else {
            z10 = coordinatorLayout.p(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f11161c = z10;
        }
        if (!z10) {
            return false;
        }
        if (this.f11159a == null) {
            this.f11159a = new e(coordinatorLayout.getContext(), coordinatorLayout, this.f11167i);
        }
        if (!this.f11162d && this.f11159a.r(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // o3.b
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i10) {
        WeakHashMap weakHashMap = n1.f13788a;
        if (v0.c(view) == 0) {
            v0.s(view, 1);
            n1.k(view, 1048576);
            n1.h(view, 0);
            if (s(view)) {
                n1.l(view, f.f14981n, new h0(this, 8));
            }
        }
        return false;
    }

    @Override // o3.b
    public final boolean r(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.f11159a != null) {
            if (!this.f11162d || motionEvent.getActionMasked() != 3) {
                this.f11159a.k(motionEvent);
                return true;
            }
            return true;
        }
        return false;
    }

    public boolean s(View view) {
        return true;
    }
}
