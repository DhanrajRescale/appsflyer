package com.google.android.material.appbar;

import android.view.View;
import android.widget.ScrollView;
import com.google.android.material.appbar.AppBarLayout;
import e4.m;

/* loaded from: classes2.dex */
public final class b extends d4.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout.BaseBehavior f11138d;

    public b(AppBarLayout.BaseBehavior baseBehavior) {
        this.f11138d = baseBehavior;
    }

    @Override // d4.c
    public final void d(View view, m mVar) {
        this.f13725a.onInitializeAccessibilityNodeInfo(view, mVar.f14996a);
        mVar.r(this.f11138d.f11102o);
        mVar.j(ScrollView.class.getName());
    }
}
