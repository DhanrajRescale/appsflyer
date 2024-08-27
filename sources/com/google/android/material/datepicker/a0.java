package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.assetgro.stockgro.prod.R;
import java.util.Locale;
import k7.y1;
import k7.z0;

/* loaded from: classes2.dex */
public final class a0 extends z0 {

    /* renamed from: d, reason: collision with root package name */
    public final l f11263d;

    public a0(l lVar) {
        this.f11263d = lVar;
    }

    @Override // k7.z0
    public final int a() {
        return this.f11263d.f11289c.f11271f;
    }

    @Override // k7.z0
    public final void h(y1 y1Var, int i10) {
        String format;
        l lVar = this.f11263d;
        int i11 = lVar.f11289c.f11266a.f11329c + i10;
        String format2 = String.format(Locale.getDefault(), "%d", Integer.valueOf(i11));
        TextView textView = ((z) y1Var).f11348u;
        textView.setText(format2);
        Context context = textView.getContext();
        if (y.c().get(1) == i11) {
            format = String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i11));
        } else {
            format = String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i11));
        }
        textView.setContentDescription(format);
        android.support.v4.media.d dVar = lVar.f11292f;
        if (y.c().get(1) == i11) {
            Object obj = dVar.f814f;
        } else {
            Object obj2 = dVar.f812d;
        }
        throw null;
    }

    @Override // k7.z0
    public final y1 i(int i10, RecyclerView recyclerView) {
        return new z((TextView) LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.mtrl_calendar_year, (ViewGroup) recyclerView, false));
    }
}
