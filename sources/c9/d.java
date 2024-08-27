package c9;

import android.graphics.drawable.Drawable;
import kotlin.NoWhenBranchMatchedException;
import o8.o;
import y8.k;
import y8.p;

/* loaded from: classes.dex */
public final class d implements f {

    /* renamed from: a, reason: collision with root package name */
    public final o f8068a;

    /* renamed from: b, reason: collision with root package name */
    public final k f8069b;

    public d(o oVar, k kVar) {
        this.f8068a = oVar;
        this.f8069b = kVar;
    }

    @Override // c9.f
    public final void a() {
        k kVar = this.f8069b;
        boolean z10 = kVar instanceof p;
        o oVar = this.f8068a;
        if (z10) {
            Drawable drawable = ((p) kVar).f41406a;
            oVar.getClass();
        } else {
            if (kVar instanceof y8.e) {
                Drawable drawable2 = ((y8.e) kVar).f41331a;
                oVar.getClass();
                return;
            }
            throw new NoWhenBranchMatchedException();
        }
    }
}
