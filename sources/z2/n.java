package z2;

import android.content.Context;
import android.view.View;
import android.view.Window;
import kotlin.jvm.functions.Function2;
import t0.n1;
import t0.o3;
import t0.x1;
import w.p0;

/* loaded from: classes.dex */
public final class n extends d2.a {

    /* renamed from: i, reason: collision with root package name */
    public final Window f41938i;

    /* renamed from: j, reason: collision with root package name */
    public final n1 f41939j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f41940k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f41941l;

    public n(Context context, Window window) {
        super(context);
        this.f41938i = window;
        this.f41939j = t0.t.n0(l.f41936a, o3.f35116a);
    }

    @Override // d2.a
    public final void a(t0.n nVar, int i10) {
        int i11;
        int i12;
        t0.r rVar = (t0.r) nVar;
        rVar.c0(1735448596);
        if ((i10 & 6) == 0) {
            if (rVar.j(this)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && rVar.G()) {
            rVar.V();
        } else {
            ((Function2) this.f41939j.getValue()).invoke(rVar, 0);
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new p0(i10, 11, this);
        }
    }

    @Override // d2.a
    public final void e(int i10, int i11, int i12, int i13, boolean z10) {
        View childAt;
        super.e(i10, i11, i12, i13, z10);
        if (this.f41940k || (childAt = getChildAt(0)) == null) {
            return;
        }
        this.f41938i.setLayout(childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
    }

    @Override // d2.a
    public final void f(int i10, int i11) {
        if (this.f41940k) {
            super.f(i10, i11);
            return;
        }
        super.f(View.MeasureSpec.makeMeasureSpec(Math.round(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(Math.round(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density), Integer.MIN_VALUE));
    }

    @Override // d2.a
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f41941l;
    }
}
