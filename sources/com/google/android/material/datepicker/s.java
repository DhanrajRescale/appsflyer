package com.google.android.material.datepicker;

import android.widget.BaseAdapter;
import java.util.Calendar;

/* loaded from: classes2.dex */
public final class s extends BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public static final int f11334d = y.d(null).getMaximum(4);

    /* renamed from: e, reason: collision with root package name */
    public static final int f11335e = (y.d(null).getMaximum(7) + y.d(null).getMaximum(5)) - 1;

    /* renamed from: a, reason: collision with root package name */
    public final r f11336a;

    /* renamed from: b, reason: collision with root package name */
    public android.support.v4.media.d f11337b;

    /* renamed from: c, reason: collision with root package name */
    public final d f11338c;

    public s(r rVar, d dVar) {
        this.f11336a = rVar;
        this.f11338c = dVar;
        throw null;
    }

    public final int a() {
        int i10 = this.f11338c.f11270e;
        r rVar = this.f11336a;
        Calendar calendar = rVar.f11327a;
        int i11 = calendar.get(7);
        if (i10 <= 0) {
            i10 = calendar.getFirstDayOfWeek();
        }
        int i12 = i11 - i10;
        if (i12 < 0) {
            return i12 + rVar.f11330d;
        }
        return i12;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i10) {
        if (i10 >= a() && i10 <= c()) {
            int a10 = (i10 - a()) + 1;
            Calendar b10 = y.b(this.f11336a.f11327a);
            b10.set(5, a10);
            return Long.valueOf(b10.getTimeInMillis());
        }
        return null;
    }

    public final int c() {
        return (a() + this.f11336a.f11331e) - 1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return f11335e;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return i10 / this.f11336a.f11330d;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View getView(int r5, android.view.View r6, android.view.ViewGroup r7) {
        /*
            r4 = this;
            android.content.Context r0 = r7.getContext()
            android.support.v4.media.d r1 = r4.f11337b
            if (r1 != 0) goto Lf
            android.support.v4.media.d r1 = new android.support.v4.media.d
            r1.<init>(r0)
            r4.f11337b = r1
        Lf:
            r0 = r6
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r6 != 0) goto L27
            android.content.Context r6 = r7.getContext()
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            r0 = 2131559054(0x7f0d028e, float:1.8743441E38)
            android.view.View r6 = r6.inflate(r0, r7, r1)
            r0 = r6
            android.widget.TextView r0 = (android.widget.TextView) r0
        L27:
            int r6 = r4.a()
            int r6 = r5 - r6
            if (r6 < 0) goto L5d
            com.google.android.material.datepicker.r r7 = r4.f11336a
            int r2 = r7.f11331e
            if (r6 < r2) goto L36
            goto L5d
        L36:
            r2 = 1
            int r6 = r6 + r2
            r0.setTag(r7)
            android.content.res.Resources r7 = r0.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            java.util.Locale r7 = r7.locale
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r3 = "%d"
            java.lang.String r6 = java.lang.String.format(r7, r3, r6)
            r0.setText(r6)
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L65
        L5d:
            r6 = 8
            r0.setVisibility(r6)
            r0.setEnabled(r1)
        L65:
            java.lang.Long r5 = r4.getItem(r5)
            if (r5 != 0) goto L6c
            goto L71
        L6c:
            r5.longValue()
            if (r0 != 0) goto L72
        L71:
            return r0
        L72:
            r0.getContext()
            java.util.Calendar r5 = com.google.android.material.datepicker.y.c()
            r5.getTimeInMillis()
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.s.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
