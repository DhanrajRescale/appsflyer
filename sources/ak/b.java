package ak;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class b extends WeakReference {

    /* renamed from: a, reason: collision with root package name */
    public final xj.g f446a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f447b;

    /* renamed from: c, reason: collision with root package name */
    public e0 f448c;

    public b(xj.g gVar, z zVar, ReferenceQueue referenceQueue, boolean z10) {
        super(zVar, referenceQueue);
        e0 e0Var;
        if (gVar != null) {
            this.f446a = gVar;
            if (zVar.f609a && z10) {
                e0Var = zVar.f611c;
                al.d.V(e0Var);
            } else {
                e0Var = null;
            }
            this.f448c = e0Var;
            this.f447b = zVar.f609a;
            return;
        }
        throw new NullPointerException("Argument must not be null");
    }
}
