package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.assetgro.stockgro.prod.R;
import java.util.Calendar;
import k7.j1;
import k7.y1;
import k7.z0;

/* loaded from: classes2.dex */
public final class v extends z0 {

    /* renamed from: d, reason: collision with root package name */
    public final d f11343d;

    /* renamed from: e, reason: collision with root package name */
    public final ek.u f11344e;

    /* renamed from: f, reason: collision with root package name */
    public final int f11345f;

    public v(ContextThemeWrapper contextThemeWrapper, d dVar, ek.u uVar) {
        int i10;
        r rVar = dVar.f11266a;
        r rVar2 = dVar.f11269d;
        if (rVar.f11327a.compareTo(rVar2.f11327a) <= 0) {
            if (rVar2.f11327a.compareTo(dVar.f11267b.f11327a) <= 0) {
                int i11 = s.f11334d;
                int i12 = l.f11287m;
                int dimensionPixelSize = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i11;
                if (p.s(android.R.attr.windowFullscreen, contextThemeWrapper)) {
                    i10 = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height);
                } else {
                    i10 = 0;
                }
                this.f11345f = dimensionPixelSize + i10;
                this.f11343d = dVar;
                this.f11344e = uVar;
                if (!this.f22651a.a()) {
                    this.f22652b = true;
                    return;
                }
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        throw new IllegalArgumentException("firstPage cannot be after currentPage");
    }

    @Override // k7.z0
    public final int a() {
        return this.f11343d.f11272g;
    }

    @Override // k7.z0
    public final long b(int i10) {
        Calendar b10 = y.b(this.f11343d.f11266a.f11327a);
        b10.add(2, i10);
        return new r(b10).f11327a.getTimeInMillis();
    }

    @Override // k7.z0
    public final void h(y1 y1Var, int i10) {
        u uVar = (u) y1Var;
        d dVar = this.f11343d;
        Calendar b10 = y.b(dVar.f11266a.f11327a);
        b10.add(2, i10);
        r rVar = new r(b10);
        uVar.f11341u.setText(rVar.c());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) uVar.f11342v.findViewById(R.id.month_grid);
        if (materialCalendarGridView.a() != null && rVar.equals(materialCalendarGridView.a().f11336a)) {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.a().getClass();
            throw null;
        }
        new s(rVar, dVar);
        throw null;
    }

    @Override // k7.z0
    public final y1 i(int i10, RecyclerView recyclerView) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, (ViewGroup) recyclerView, false);
        if (p.s(android.R.attr.windowFullscreen, recyclerView.getContext())) {
            linearLayout.setLayoutParams(new j1(-1, this.f11345f));
            return new u(linearLayout, true);
        }
        return new u(linearLayout, false);
    }
}
