package com.google.android.material.timepicker;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.assetgro.stockgro.prod.R;
import e4.l;
import e4.m;

/* loaded from: classes2.dex */
public final class c extends d4.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f11550d;

    public c(ClockFaceView clockFaceView) {
        this.f11550d = clockFaceView;
    }

    @Override // d4.c
    public final void d(View view, m mVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f13725a;
        AccessibilityNodeInfo accessibilityNodeInfo = mVar.f14996a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int intValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (intValue > 0) {
            accessibilityNodeInfo.setTraversalAfter((View) this.f11550d.f11532z.get(intValue - 1));
        }
        mVar.l(l.a(0, 1, intValue, 1, false, view.isSelected()));
        accessibilityNodeInfo.setClickable(true);
        mVar.b(e4.f.f14974g);
    }

    @Override // d4.c
    public final boolean g(View view, int i10, Bundle bundle) {
        if (i10 == 16) {
            long uptimeMillis = SystemClock.uptimeMillis();
            ClockFaceView clockFaceView = this.f11550d;
            view.getHitRect(clockFaceView.f11529w);
            float centerX = clockFaceView.f11529w.centerX();
            float centerY = clockFaceView.f11529w.centerY();
            clockFaceView.f11528v.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
            clockFaceView.f11528v.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
            return true;
        }
        return super.g(view, i10, bundle);
    }
}
