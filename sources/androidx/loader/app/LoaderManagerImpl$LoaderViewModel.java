package androidx.loader.app;

import androidx.lifecycle.a1;
import t.k0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class LoaderManagerImpl$LoaderViewModel extends a1 {

    /* renamed from: d, reason: collision with root package name */
    public static final e f2005d = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final k0 f2006b = new k0();

    /* renamed from: c, reason: collision with root package name */
    public boolean f2007c = false;

    @Override // androidx.lifecycle.a1
    public final void d() {
        k0 k0Var = this.f2006b;
        int h10 = k0Var.h();
        for (int i10 = 0; i10 < h10; i10++) {
            c cVar = (c) k0Var.i(i10);
            androidx.loader.content.e eVar = cVar.f2010c;
            eVar.cancelLoad();
            eVar.abandon();
            d dVar = cVar.f2012e;
            if (dVar != null) {
                cVar.removeObserver(dVar);
                if (dVar.f2016c) {
                    dVar.f2015b.onLoaderReset(dVar.f2014a);
                }
            }
            eVar.unregisterListener(cVar);
            if (dVar != null) {
                boolean z10 = dVar.f2016c;
            }
            eVar.reset();
        }
        int i11 = k0Var.f34878d;
        Object[] objArr = k0Var.f34877c;
        for (int i12 = 0; i12 < i11; i12++) {
            objArr[i12] = null;
        }
        k0Var.f34878d = 0;
        k0Var.f34875a = false;
    }
}
