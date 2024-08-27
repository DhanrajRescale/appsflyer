package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import k7.u0;
import k7.u1;

/* loaded from: classes2.dex */
public final class i extends LinearLayoutManager {
    public final /* synthetic */ int E;
    public final /* synthetic */ l F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l lVar, int i10, int i11) {
        super(i10);
        this.F = lVar;
        this.E = i11;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, k7.i1
    public final void D0(RecyclerView recyclerView, int i10) {
        u0 u0Var = new u0(this, recyclerView.getContext(), 2);
        u0Var.f22522a = i10;
        E0(u0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void G0(u1 u1Var, int[] iArr) {
        int i10 = this.E;
        l lVar = this.F;
        if (i10 == 0) {
            iArr[0] = lVar.f11294h.getWidth();
            iArr[1] = lVar.f11294h.getWidth();
        } else {
            iArr[0] = lVar.f11294h.getHeight();
            iArr[1] = lVar.f11294h.getHeight();
        }
    }
}
