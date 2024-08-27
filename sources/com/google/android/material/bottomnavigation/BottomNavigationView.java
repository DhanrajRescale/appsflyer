package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import com.assetgro.stockgro.prod.R;
import ek.u;
import h.c;
import mo.c0;
import no.k;
import pn.e;
import un.a;
import zn.b;
import zn.d;

/* loaded from: classes2.dex */
public class BottomNavigationView extends k {
    public BottomNavigationView(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c g10 = c0.g(getContext(), attributeSet, a.f37294e, R.attr.bottomNavigationStyle, 2132083693, new int[0]);
        setItemHorizontalTranslationEnabled(g10.q(2, true));
        if (g10.H(0)) {
            setMinimumHeight(g10.u(0, 0));
        }
        g10.q(1, true);
        g10.R();
        e.e(this, new u(this, 8));
    }

    @Override // no.k
    public int getMaxItemCount() {
        return 5;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i11) != 1073741824 && suggestedMinimumHeight > 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i11), getPaddingBottom() + getPaddingTop() + suggestedMinimumHeight), 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    public void setItemHorizontalTranslationEnabled(boolean z10) {
        b bVar = (b) getMenuView();
        if (bVar.J != z10) {
            bVar.setItemHorizontalTranslationEnabled(z10);
            getPresenter().d(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(zn.c cVar) {
        setOnItemReselectedListener(cVar);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(d dVar) {
        setOnItemSelectedListener(dVar);
    }
}
