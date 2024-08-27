package mf;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.mig35.carousellayoutmanager.CarouselLayoutManager;
import k7.i1;
import k7.n1;
import k7.z0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a extends n1 {
    @Override // k7.n1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        CarouselLayoutManager carouselLayoutManager;
        z0 adapter;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        i1 layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof CarouselLayoutManager) {
            carouselLayoutManager = (CarouselLayoutManager) layoutManager;
        } else {
            carouselLayoutManager = null;
        }
        if (carouselLayoutManager != null && (adapter = recyclerView.getAdapter()) != null) {
            int a10 = adapter.a();
            for (int i12 = 0; i12 < a10; i12++) {
                View q10 = carouselLayoutManager.q(i12);
                if (q10 != null) {
                    q10.setAlpha(1 - (Math.abs((q10.getLeft() - recyclerView.getPaddingLeft()) / recyclerView.getWidth()) * 3));
                }
            }
        }
    }
}
