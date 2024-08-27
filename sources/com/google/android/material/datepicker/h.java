package com.google.android.material.datepicker;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes2.dex */
public final class h extends d4.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11281d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f11282e;

    public /* synthetic */ h(l lVar, int i10) {
        this.f11281d = i10;
        this.f11282e = lVar;
    }

    @Override // d4.c
    public final void d(View view, e4.m mVar) {
        String string;
        AccessibilityNodeInfo accessibilityNodeInfo = mVar.f14996a;
        int i10 = this.f11281d;
        View.AccessibilityDelegate accessibilityDelegate = this.f13725a;
        switch (i10) {
            case 0:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                mVar.k(null);
                return;
            case 1:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                mVar.r(false);
                return;
            default:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                l lVar = this.f11282e;
                if (lVar.f11298l.getVisibility() == 0) {
                    string = lVar.getString(R.string.mtrl_picker_toggle_to_year_selection);
                } else {
                    string = lVar.getString(R.string.mtrl_picker_toggle_to_day_selection);
                }
                mVar.o(string);
                return;
        }
    }
}
