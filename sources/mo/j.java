package mo;

import android.view.View;

/* loaded from: classes2.dex */
public final class j extends d4.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f27917d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f27918e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k f27919f;

    public j(k kVar, int i10, boolean z10) {
        this.f27919f = kVar;
        this.f27917d = i10;
        this.f27918e = z10;
    }

    @Override // d4.c
    public final void d(View view, e4.m mVar) {
        s sVar;
        this.f13725a.onInitializeAccessibilityNodeInfo(view, mVar.f14996a);
        int i10 = this.f27917d;
        int i11 = 0;
        int i12 = i10;
        while (true) {
            sVar = this.f27919f.f27923g;
            if (i11 >= i10) {
                break;
            }
            if (sVar.f27933e.c(i11) == 2) {
                i12--;
            }
            i11++;
        }
        if (sVar.f27930b.getChildCount() == 0) {
            i12--;
        }
        mVar.l(e4.l.a(i12, 1, 1, 1, this.f27918e, view.isSelected()));
    }
}
