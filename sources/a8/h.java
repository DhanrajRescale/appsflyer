package a8;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import k7.u1;

/* loaded from: classes.dex */
public final class h extends LinearLayoutManager {
    public final /* synthetic */ ViewPager2 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ViewPager2 viewPager2) {
        super(1);
        this.E = viewPager2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void G0(u1 u1Var, int[] iArr) {
        ViewPager2 viewPager2 = this.E;
        int offscreenPageLimit = viewPager2.getOffscreenPageLimit();
        if (offscreenPageLimit == -1) {
            super.G0(u1Var, iArr);
            return;
        }
        int pageSize = viewPager2.getPageSize() * offscreenPageLimit;
        iArr[0] = pageSize;
        iArr[1] = pageSize;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, k7.i1
    public final void W(u6.g gVar, u1 u1Var, e4.m mVar) {
        super.W(gVar, u1Var, mVar);
        this.E.f2528t.getClass();
    }

    @Override // k7.i1
    public final void Y(u6.g gVar, u1 u1Var, View view, e4.m mVar) {
        this.E.f2528t.l(view, mVar);
    }

    @Override // k7.i1
    public final boolean l0(u6.g gVar, u1 u1Var, int i10, Bundle bundle) {
        this.E.f2528t.getClass();
        return super.l0(gVar, u1Var, i10, bundle);
    }

    @Override // k7.i1
    public final boolean p0(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
        return false;
    }
}
