package g7;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l1 implements u0 {

    /* renamed from: a, reason: collision with root package name */
    public final t2 f16885a;

    public l1(t2 pageFetcherSnapshot) {
        Intrinsics.checkNotNullParameter(pageFetcherSnapshot, "pageFetcherSnapshot");
        this.f16885a = pageFetcherSnapshot;
    }

    @Override // g7.u0
    public final void j(w4 viewportHint) {
        u4 u4Var;
        Intrinsics.checkNotNullParameter(viewportHint, "viewportHint");
        t2 t2Var = this.f16885a;
        t2Var.getClass();
        Intrinsics.checkNotNullParameter(viewportHint, "viewportHint");
        hr.c cVar = t2Var.f17070g;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(viewportHint, "viewportHint");
        q.h hVar = (q.h) cVar.f18690b;
        if (viewportHint instanceof u4) {
            u4Var = (u4) viewportHint;
        } else {
            u4Var = null;
        }
        hVar.e(u4Var, new androidx.compose.foundation.layout.e(viewportHint, 9));
    }
}
