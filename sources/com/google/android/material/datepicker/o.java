package com.google.android.material.datepicker;

import android.view.View;
import d4.d0;
import d4.d3;

/* loaded from: classes2.dex */
public final class o implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11301a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f11302b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f11303c;

    public o(int i10, View view, int i11) {
        this.f11301a = i10;
        this.f11302b = view;
        this.f11303c = i11;
    }

    @Override // d4.d0
    public final d3 g(View view, d3 d3Var) {
        int i10 = d3Var.f13731a.f(7).f36705b;
        int i11 = this.f11301a;
        View view2 = this.f11302b;
        if (i11 >= 0) {
            view2.getLayoutParams().height = i11 + i10;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.f11303c + i10, view2.getPaddingRight(), view2.getPaddingBottom());
        return d3Var;
    }
}
