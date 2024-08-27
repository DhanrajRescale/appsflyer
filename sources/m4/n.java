package m4;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class n extends WeakReference {

    /* renamed from: a, reason: collision with root package name */
    public final e f27500a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27501b;

    /* renamed from: c, reason: collision with root package name */
    public Object f27502c;

    public n(m mVar, int i10, e eVar, ReferenceQueue referenceQueue) {
        super(mVar, referenceQueue);
        this.f27501b = i10;
        this.f27500a = eVar;
    }

    public final boolean a() {
        boolean z10;
        Object obj = this.f27502c;
        if (obj != null) {
            this.f27500a.c(obj);
            z10 = true;
        } else {
            z10 = false;
        }
        this.f27502c = null;
        return z10;
    }
}
