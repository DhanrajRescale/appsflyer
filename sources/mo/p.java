package mo;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.internal.NavigationMenuView;
import k7.a2;

/* loaded from: classes2.dex */
public final class p extends a2 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s f27928f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(s sVar, NavigationMenuView navigationMenuView) {
        super(navigationMenuView);
        this.f27928f = sVar;
    }

    @Override // k7.a2, d4.c
    public final void d(View view, e4.m mVar) {
        int i10;
        super.d(view, mVar);
        s sVar = this.f27928f.f27933e.f27923g;
        if (sVar.f27930b.getChildCount() == 0) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        for (int i11 = 0; i11 < sVar.f27933e.f27920d.size(); i11++) {
            int c10 = sVar.f27933e.c(i11);
            if (c10 == 0 || c10 == 1) {
                i10++;
            }
        }
        mVar.f14996a.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(i10, 1, false));
    }
}
