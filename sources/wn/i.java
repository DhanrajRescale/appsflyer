package wn;

import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import d4.d3;
import d4.n1;
import d4.v0;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class i implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CollapsingToolbarLayout f39334a;

    public i(CollapsingToolbarLayout collapsingToolbarLayout) {
        this.f39334a = collapsingToolbarLayout;
    }

    @Override // wn.d
    public final void a(AppBarLayout appBarLayout, int i10) {
        int i11;
        CollapsingToolbarLayout collapsingToolbarLayout = this.f39334a;
        collapsingToolbarLayout.f11127y = i10;
        d3 d3Var = collapsingToolbarLayout.A;
        if (d3Var != null) {
            i11 = d3Var.d();
        } else {
            i11 = 0;
        }
        int childCount = collapsingToolbarLayout.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = collapsingToolbarLayout.getChildAt(i12);
            h hVar = (h) childAt.getLayoutParams();
            n b10 = CollapsingToolbarLayout.b(childAt);
            int i13 = hVar.f39332a;
            if (i13 != 1) {
                if (i13 == 2) {
                    b10.b(Math.round((-i10) * hVar.f39333b));
                }
            } else {
                b10.b(hl.f.F(-i10, 0, ((collapsingToolbarLayout.getHeight() - CollapsingToolbarLayout.b(childAt).f39349b) - childAt.getHeight()) - ((FrameLayout.LayoutParams) ((h) childAt.getLayoutParams())).bottomMargin));
            }
        }
        collapsingToolbarLayout.d();
        if (collapsingToolbarLayout.f11118p != null && i11 > 0) {
            WeakHashMap weakHashMap = n1.f13788a;
            v0.k(collapsingToolbarLayout);
        }
        int height = collapsingToolbarLayout.getHeight();
        WeakHashMap weakHashMap2 = n1.f13788a;
        int d10 = (height - v0.d(collapsingToolbarLayout)) - i11;
        float scrimVisibleHeightTrigger = height - collapsingToolbarLayout.getScrimVisibleHeightTrigger();
        float f10 = d10;
        float min = Math.min(1.0f, scrimVisibleHeightTrigger / f10);
        mo.b bVar = collapsingToolbarLayout.f11113k;
        bVar.f27865d = min;
        bVar.f27867e = nn.d.b(1.0f, min, 0.5f, min);
        bVar.f27869f = collapsingToolbarLayout.f11127y + d10;
        bVar.p(Math.abs(i10) / f10);
    }
}
