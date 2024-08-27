package com.google.android.material.datepicker;

import android.graphics.Canvas;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import k7.f1;

/* loaded from: classes2.dex */
public final class j extends f1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f11283a;

    public j(l lVar) {
        this.f11283a = lVar;
        y.d(null);
        y.d(null);
    }

    @Override // k7.f1
    public final void h(Canvas canvas, RecyclerView recyclerView) {
        if ((recyclerView.getAdapter() instanceof a0) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            int i10 = l.f11287m;
            this.f11283a.getClass();
            throw null;
        }
    }
}
