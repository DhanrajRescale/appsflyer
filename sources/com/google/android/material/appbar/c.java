package com.google.android.material.appbar;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import e4.y;

/* loaded from: classes2.dex */
public final class c implements y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f11139a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f11140b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f11141c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11142d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout.BaseBehavior f11143e;

    public c(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10) {
        this.f11143e = baseBehavior;
        this.f11139a = coordinatorLayout;
        this.f11140b = appBarLayout;
        this.f11141c = view;
        this.f11142d = i10;
    }

    @Override // e4.y
    public final boolean d(View view) {
        this.f11143e.A(this.f11139a, this.f11140b, this.f11141c, this.f11142d, new int[]{0, 0});
        return true;
    }
}
