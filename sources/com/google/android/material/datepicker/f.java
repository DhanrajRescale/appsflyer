package com.google.android.material.datepicker;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.assetgro.stockgro.prod.R;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class f extends BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public static final int f11274d;

    /* renamed from: a, reason: collision with root package name */
    public final Calendar f11275a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11276b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11277c;

    static {
        f11274d = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public f() {
        Calendar d10 = y.d(null);
        this.f11275a = d10;
        this.f11276b = d10.getMaximum(7);
        this.f11277c = d10.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f11276b;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i10) {
        int i11 = this.f11276b;
        if (i10 >= i11) {
            return null;
        }
        int i12 = i10 + this.f11277c;
        if (i12 > i11) {
            i12 -= i11;
        }
        return Integer.valueOf(i12);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i11 = i10 + this.f11277c;
        int i12 = this.f11276b;
        if (i11 > i12) {
            i11 -= i12;
        }
        Calendar calendar = this.f11275a;
        calendar.set(7, i11);
        textView.setText(calendar.getDisplayName(7, f11274d, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public f(int i10) {
        Calendar d10 = y.d(null);
        this.f11275a = d10;
        this.f11276b = d10.getMaximum(7);
        this.f11277c = i10;
    }
}
