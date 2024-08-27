package oo;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.assetgro.stockgro.prod.R;
import mo.c0;

/* loaded from: classes2.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public int f30167a;

    /* renamed from: b, reason: collision with root package name */
    public int f30168b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f30169c;

    /* renamed from: d, reason: collision with root package name */
    public int f30170d;

    /* renamed from: e, reason: collision with root package name */
    public int f30171e;

    /* renamed from: f, reason: collision with root package name */
    public int f30172f;

    public e(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f30169c = new int[0];
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_track_thickness);
        int[] iArr = un.a.f37293d;
        c0.a(context, attributeSet, i10, i11);
        c0.b(context, attributeSet, iArr, i10, i11, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, i11);
        this.f30167a = dp.b.n1(context, obtainStyledAttributes, 8, dimensionPixelSize);
        this.f30168b = Math.min(dp.b.n1(context, obtainStyledAttributes, 7, 0), this.f30167a / 2);
        this.f30171e = obtainStyledAttributes.getInt(4, 0);
        this.f30172f = obtainStyledAttributes.getInt(1, 0);
        if (!obtainStyledAttributes.hasValue(2)) {
            this.f30169c = new int[]{pn.e.i(context, R.attr.colorPrimary, -1)};
        } else if (obtainStyledAttributes.peekValue(2).type != 1) {
            this.f30169c = new int[]{obtainStyledAttributes.getColor(2, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(obtainStyledAttributes.getResourceId(2, -1));
            this.f30169c = intArray;
            if (intArray.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.f30170d = obtainStyledAttributes.getColor(6, -1);
        } else {
            this.f30170d = this.f30169c[0];
            TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{android.R.attr.disabledAlpha});
            float f10 = obtainStyledAttributes2.getFloat(0, 0.2f);
            obtainStyledAttributes2.recycle();
            this.f30170d = pn.e.c(this.f30170d, (int) (f10 * 255.0f));
        }
        obtainStyledAttributes.recycle();
    }

    public abstract void a();
}
