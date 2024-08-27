package ij;

import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;
import k7.f1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o extends f1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f20085a;

    public o(int i10) {
        this.f20085a = i10 / 2;
    }

    @Override // k7.f1
    public final void g(Rect outRect, RecyclerView parent) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(parent, "parent");
        int paddingLeft = parent.getPaddingLeft();
        int i10 = this.f20085a;
        if (paddingLeft != i10) {
            parent.setPadding(i10, i10, i10, i10);
            parent.setClipToPadding(false);
        }
        outRect.top = i10;
        outRect.bottom = i10;
        outRect.left = i10;
        outRect.right = i10;
    }
}
