package io;

import android.content.Context;
import android.graphics.Color;
import com.assetgro.stockgro.prod.R;
import pn.e;
import s0.g;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final int f20453f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f20454a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20455b;

    /* renamed from: c, reason: collision with root package name */
    public final int f20456c;

    /* renamed from: d, reason: collision with root package name */
    public final int f20457d;

    /* renamed from: e, reason: collision with root package name */
    public final float f20458e;

    public a(Context context) {
        boolean v10 = e.v(context, R.attr.elevationOverlayEnabled, false);
        int i10 = e.i(context, R.attr.elevationOverlayColor, 0);
        int i11 = e.i(context, R.attr.elevationOverlayAccentColor, 0);
        int i12 = e.i(context, R.attr.colorSurface, 0);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f20454a = v10;
        this.f20455b = i10;
        this.f20456c = i11;
        this.f20457d = i12;
        this.f20458e = f10;
    }

    public final int a(int i10, float f10) {
        float f11;
        int i11;
        if (this.f20454a && u3.a.d(i10, 255) == this.f20457d) {
            if (this.f20458e > g.f34069a && f10 > g.f34069a) {
                f11 = Math.min(((((float) Math.log1p(f10 / r1)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
            } else {
                f11 = 0.0f;
            }
            int alpha = Color.alpha(i10);
            int p10 = e.p(u3.a.d(i10, 255), f11, this.f20455b);
            if (f11 > g.f34069a && (i11 = this.f20456c) != 0) {
                p10 = u3.a.b(u3.a.d(i11, f20453f), p10);
            }
            return u3.a.d(p10, alpha);
        }
        return i10;
    }
}
