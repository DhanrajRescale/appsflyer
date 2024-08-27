package y2;

import a2.m0;
import a2.n0;
import a2.o0;
import android.view.View;
import android.view.ViewGroup;
import c2.i1;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import vt.p0;

/* loaded from: classes.dex */
public final class f implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f41076a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.node.a f41077b;

    public f(q qVar, androidx.compose.ui.node.a aVar) {
        this.f41076a = qVar;
        this.f41077b = aVar;
    }

    @Override // a2.m0
    public final n0 a(o0 o0Var, List list, long j10) {
        n0 n0;
        n0 n02;
        k kVar = this.f41076a;
        if (kVar.getChildCount() == 0) {
            n02 = o0Var.n0(w2.a.j(j10), w2.a.i(j10), p0.d(), d.f41069c);
            return n02;
        }
        if (w2.a.j(j10) != 0) {
            kVar.getChildAt(0).setMinimumWidth(w2.a.j(j10));
        }
        if (w2.a.i(j10) != 0) {
            kVar.getChildAt(0).setMinimumHeight(w2.a.i(j10));
        }
        int j11 = w2.a.j(j10);
        int h10 = w2.a.h(j10);
        ViewGroup.LayoutParams layoutParams = kVar.getLayoutParams();
        Intrinsics.c(layoutParams);
        int k10 = k.k(kVar, j11, h10, layoutParams.width);
        int i10 = w2.a.i(j10);
        int g10 = w2.a.g(j10);
        ViewGroup.LayoutParams layoutParams2 = kVar.getLayoutParams();
        Intrinsics.c(layoutParams2);
        kVar.measure(k10, k.k(kVar, i10, g10, layoutParams2.height));
        n0 = o0Var.n0(kVar.getMeasuredWidth(), kVar.getMeasuredHeight(), p0.d(), new e(kVar, this.f41077b, 1));
        return n0;
    }

    @Override // a2.m0
    public final int b(i1 i1Var, List list, int i10) {
        k kVar = this.f41076a;
        ViewGroup.LayoutParams layoutParams = kVar.getLayoutParams();
        Intrinsics.c(layoutParams);
        kVar.measure(k.k(kVar, 0, i10, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return kVar.getMeasuredHeight();
    }

    @Override // a2.m0
    public final int c(i1 i1Var, List list, int i10) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        k kVar = this.f41076a;
        ViewGroup.LayoutParams layoutParams = kVar.getLayoutParams();
        Intrinsics.c(layoutParams);
        kVar.measure(makeMeasureSpec, k.k(kVar, 0, i10, layoutParams.height));
        return kVar.getMeasuredWidth();
    }

    @Override // a2.m0
    public final int d(i1 i1Var, List list, int i10) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        k kVar = this.f41076a;
        ViewGroup.LayoutParams layoutParams = kVar.getLayoutParams();
        Intrinsics.c(layoutParams);
        kVar.measure(makeMeasureSpec, k.k(kVar, 0, i10, layoutParams.height));
        return kVar.getMeasuredWidth();
    }

    @Override // a2.m0
    public final int e(i1 i1Var, List list, int i10) {
        k kVar = this.f41076a;
        ViewGroup.LayoutParams layoutParams = kVar.getLayoutParams();
        Intrinsics.c(layoutParams);
        kVar.measure(k.k(kVar, 0, i10, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return kVar.getMeasuredHeight();
    }
}
