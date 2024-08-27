package a8;

import android.view.View;
import android.view.ViewGroup;
import k7.j1;
import k7.k1;

/* loaded from: classes.dex */
public final class f implements k1 {
    @Override // k7.k1
    public final void b(View view) {
    }

    @Override // k7.k1
    public final void c(View view) {
        j1 j1Var = (j1) view.getLayoutParams();
        if (((ViewGroup.MarginLayoutParams) j1Var).width == -1 && ((ViewGroup.MarginLayoutParams) j1Var).height == -1) {
        } else {
            throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
        }
    }
}
