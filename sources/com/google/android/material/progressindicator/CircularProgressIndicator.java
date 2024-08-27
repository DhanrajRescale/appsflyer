package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import com.assetgro.stockgro.prod.R;
import dp.b;
import mo.c0;
import oo.d;
import oo.e;
import oo.f;
import oo.h;
import oo.i;
import oo.k;
import oo.o;
import un.a;

/* loaded from: classes2.dex */
public final class CircularProgressIndicator extends d {
    public CircularProgressIndicator(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.circularProgressIndicatorStyle, 2132083905);
        Context context2 = getContext();
        i iVar = (i) this.f30155a;
        setIndeterminateDrawable(new o(context2, iVar, new f(iVar), new h(iVar)));
        setProgressDrawable(new k(getContext(), iVar, new f(iVar)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [oo.e, oo.i] */
    @Override // oo.d
    public final e a(Context context, AttributeSet attributeSet) {
        ?? eVar = new e(context, attributeSet, R.attr.circularProgressIndicatorStyle, 2132083905);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_size_medium);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_inset_medium);
        int[] iArr = a.f37299j;
        c0.a(context, attributeSet, R.attr.circularProgressIndicatorStyle, 2132083905);
        c0.b(context, attributeSet, iArr, R.attr.circularProgressIndicatorStyle, 2132083905, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.circularProgressIndicatorStyle, 2132083905);
        eVar.f30192g = Math.max(b.n1(context, obtainStyledAttributes, 2, dimensionPixelSize), eVar.f30167a * 2);
        eVar.f30193h = b.n1(context, obtainStyledAttributes, 1, dimensionPixelSize2);
        eVar.f30194i = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        return eVar;
    }

    public int getIndicatorDirection() {
        return ((i) this.f30155a).f30194i;
    }

    public int getIndicatorInset() {
        return ((i) this.f30155a).f30193h;
    }

    public int getIndicatorSize() {
        return ((i) this.f30155a).f30192g;
    }

    public void setIndicatorDirection(int i10) {
        ((i) this.f30155a).f30194i = i10;
        invalidate();
    }

    public void setIndicatorInset(int i10) {
        e eVar = this.f30155a;
        if (((i) eVar).f30193h != i10) {
            ((i) eVar).f30193h = i10;
            invalidate();
        }
    }

    public void setIndicatorSize(int i10) {
        int max = Math.max(i10, getTrackThickness() * 2);
        e eVar = this.f30155a;
        if (((i) eVar).f30192g != max) {
            ((i) eVar).f30192g = max;
            ((i) eVar).getClass();
            invalidate();
        }
    }

    @Override // oo.d
    public void setTrackThickness(int i10) {
        super.setTrackThickness(i10);
        ((i) this.f30155a).getClass();
    }
}
