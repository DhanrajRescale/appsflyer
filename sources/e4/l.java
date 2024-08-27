package e4;

import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final Object f14994a;

    public l(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
        this.f14994a = collectionItemInfo;
    }

    public static l a(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
        return new l(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10, z11));
    }
}
