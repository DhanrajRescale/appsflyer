package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.assetgro.stockgro.prod.R;
import d4.n1;
import d4.r0;
import java.util.WeakHashMap;
import k7.y1;

/* loaded from: classes2.dex */
public final class u extends y1 {

    /* renamed from: u, reason: collision with root package name */
    public final TextView f11341u;

    /* renamed from: v, reason: collision with root package name */
    public final MaterialCalendarGridView f11342v;

    public u(LinearLayout linearLayout, boolean z10) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.f11341u = textView;
        WeakHashMap weakHashMap = n1.f13788a;
        new r0(R.id.tag_accessibility_heading, 3).g(textView, Boolean.TRUE);
        this.f11342v = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (!z10) {
            textView.setVisibility(8);
        }
    }
}
