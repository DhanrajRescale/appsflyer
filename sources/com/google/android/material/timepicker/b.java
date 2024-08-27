package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* loaded from: classes2.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f11549a;

    public b(ClockFaceView clockFaceView) {
        this.f11549a = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f11549a;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f11528v.f11536d) - clockFaceView.D;
        if (height != clockFaceView.f11553t) {
            clockFaceView.f11553t = height;
            clockFaceView.m();
            int i10 = clockFaceView.f11553t;
            ClockHandView clockHandView = clockFaceView.f11528v;
            clockHandView.f11544l = i10;
            clockHandView.invalidate();
        }
        return true;
    }
}
