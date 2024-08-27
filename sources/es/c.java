package es;

import androidx.recyclerview.widget.RecyclerView;
import com.mig35.carousellayoutmanager.CarouselLayoutManager;
import k7.i1;
import k7.n1;

/* loaded from: classes2.dex */
public final class c extends n1 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f15864a = true;

    @Override // k7.n1
    public final void a(RecyclerView recyclerView, int i10) {
        i1 layoutManager = recyclerView.getLayoutManager();
        if (!(layoutManager instanceof CarouselLayoutManager)) {
            this.f15864a = true;
            return;
        }
        CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) layoutManager;
        if (!this.f15864a && i10 == 0) {
            int M0 = (carouselLayoutManager.M0() * Math.round(carouselLayoutManager.K0())) - carouselLayoutManager.f12106v.f14633b;
            if (carouselLayoutManager.f12103s == 0) {
                recyclerView.k0(M0, 0, false);
            } else {
                recyclerView.k0(0, M0, false);
            }
            this.f15864a = true;
        }
        if (1 == i10 || 2 == i10) {
            this.f15864a = false;
        }
    }
}
