package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import com.assetgro.stockgro.prod.R;
import d4.n1;
import d4.w0;
import java.util.WeakHashMap;
import mo.c0;
import oo.d;
import oo.e;
import oo.k;
import oo.o;
import oo.p;
import oo.q;
import oo.s;
import oo.t;
import un.a;

/* loaded from: classes2.dex */
public final class LinearProgressIndicator extends d {
    public LinearProgressIndicator(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.linearProgressIndicatorStyle, 2132083917);
        l.d sVar;
        Context context2 = getContext();
        t tVar = (t) this.f30155a;
        p pVar = new p(tVar);
        if (tVar.f30243g == 0) {
            sVar = new q(tVar);
        } else {
            sVar = new s(context2, tVar);
        }
        setIndeterminateDrawable(new o(context2, tVar, pVar, sVar));
        setProgressDrawable(new k(getContext(), tVar, new p(tVar)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [oo.t, oo.e] */
    @Override // oo.d
    public final e a(Context context, AttributeSet attributeSet) {
        ?? eVar = new e(context, attributeSet, R.attr.linearProgressIndicatorStyle, 2132083917);
        int[] iArr = a.f37309t;
        boolean z10 = false;
        c0.a(context, attributeSet, R.attr.linearProgressIndicatorStyle, 2132083917);
        c0.b(context, attributeSet, iArr, R.attr.linearProgressIndicatorStyle, 2132083917, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.linearProgressIndicatorStyle, 2132083917);
        eVar.f30243g = obtainStyledAttributes.getInt(0, 1);
        eVar.f30244h = obtainStyledAttributes.getInt(1, 0);
        obtainStyledAttributes.recycle();
        eVar.a();
        if (eVar.f30244h == 1) {
            z10 = true;
        }
        eVar.f30245i = z10;
        return eVar;
    }

    @Override // oo.d
    public final void b(int i10, boolean z10) {
        e eVar = this.f30155a;
        if (eVar != null && ((t) eVar).f30243g == 0 && isIndeterminate()) {
            return;
        }
        super.b(i10, z10);
    }

    public int getIndeterminateAnimationType() {
        return ((t) this.f30155a).f30243g;
    }

    public int getIndicatorDirection() {
        return ((t) this.f30155a).f30244h;
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        e eVar = this.f30155a;
        t tVar = (t) eVar;
        boolean z11 = true;
        if (((t) eVar).f30244h != 1) {
            WeakHashMap weakHashMap = n1.f13788a;
            if ((w0.d(this) != 1 || ((t) eVar).f30244h != 2) && (w0.d(this) != 0 || ((t) eVar).f30244h != 3)) {
                z11 = false;
            }
        }
        tVar.f30245i = z11;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        int paddingRight = i10 - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i11 - (getPaddingBottom() + getPaddingTop());
        o indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
        k progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
    }

    public void setIndeterminateAnimationType(int i10) {
        e eVar = this.f30155a;
        if (((t) eVar).f30243g == i10) {
            return;
        }
        if (c() && isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        ((t) eVar).f30243g = i10;
        ((t) eVar).a();
        if (i10 == 0) {
            o indeterminateDrawable = getIndeterminateDrawable();
            q qVar = new q((t) eVar);
            indeterminateDrawable.f30218m = qVar;
            qVar.f23559a = indeterminateDrawable;
        } else {
            o indeterminateDrawable2 = getIndeterminateDrawable();
            s sVar = new s(getContext(), (t) eVar);
            indeterminateDrawable2.f30218m = sVar;
            sVar.f23559a = indeterminateDrawable2;
        }
        invalidate();
    }

    @Override // oo.d
    public void setIndicatorColor(@NonNull int... iArr) {
        super.setIndicatorColor(iArr);
        ((t) this.f30155a).a();
    }

    public void setIndicatorDirection(int i10) {
        e eVar = this.f30155a;
        ((t) eVar).f30244h = i10;
        t tVar = (t) eVar;
        boolean z10 = true;
        if (i10 != 1) {
            WeakHashMap weakHashMap = n1.f13788a;
            if ((w0.d(this) != 1 || ((t) eVar).f30244h != 2) && (w0.d(this) != 0 || i10 != 3)) {
                z10 = false;
            }
        }
        tVar.f30245i = z10;
        invalidate();
    }

    @Override // oo.d
    public void setTrackCornerRadius(int i10) {
        super.setTrackCornerRadius(i10);
        ((t) this.f30155a).a();
        invalidate();
    }
}
