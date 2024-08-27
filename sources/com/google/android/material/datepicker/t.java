package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes2.dex */
public final class t implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f11339a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f11340b;

    public t(v vVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f11340b = vVar;
        this.f11339a = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        MaterialCalendarGridView materialCalendarGridView = this.f11339a;
        s a10 = materialCalendarGridView.a();
        if (i10 >= a10.a() && i10 <= a10.c()) {
            ek.u uVar = this.f11340b.f11344e;
            long longValue = materialCalendarGridView.a().getItem(i10).longValue();
            Object obj = uVar.f15627b;
            if (longValue >= ((e) ((l) obj).f11289c.f11268c).f11273a) {
                ((l) obj).getClass();
                throw null;
            }
        }
    }
}
