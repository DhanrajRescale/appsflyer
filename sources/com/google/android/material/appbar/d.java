package com.google.android.material.appbar;

import android.view.View;
import e4.y;

/* loaded from: classes2.dex */
public final class d implements y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f11144a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f11145b;

    public d(AppBarLayout appBarLayout, boolean z10) {
        this.f11144a = appBarLayout;
        this.f11145b = z10;
    }

    @Override // e4.y
    public final boolean d(View view) {
        this.f11144a.setExpanded(this.f11145b);
        return true;
    }
}
