package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;

/* loaded from: classes2.dex */
public final class g implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11278a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f11279b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f11280c;

    public /* synthetic */ g(l lVar, v vVar, int i10) {
        this.f11278a = i10;
        this.f11280c = lVar;
        this.f11279b = vVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f11278a;
        v vVar = this.f11279b;
        l lVar = this.f11280c;
        switch (i10) {
            case 0:
                int R0 = ((LinearLayoutManager) lVar.f11294h.getLayoutManager()).R0() - 1;
                if (R0 >= 0) {
                    Calendar b10 = y.b(vVar.f11343d.f11266a.f11327a);
                    b10.add(2, R0);
                    lVar.p(new r(b10));
                    return;
                }
                return;
            default:
                int Q0 = ((LinearLayoutManager) lVar.f11294h.getLayoutManager()).Q0() + 1;
                if (Q0 < lVar.f11294h.getAdapter().a()) {
                    Calendar b11 = y.b(vVar.f11343d.f11266a.f11327a);
                    b11.add(2, Q0);
                    lVar.p(new r(b11));
                    return;
                }
                return;
        }
    }
}
