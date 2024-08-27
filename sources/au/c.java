package au;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qu.b0;

/* loaded from: classes2.dex */
public abstract class c extends a {
    private final CoroutineContext _context;
    private transient yt.a<Object> intercepted;

    public c(yt.a aVar, CoroutineContext coroutineContext) {
        super(aVar);
        this._context = coroutineContext;
    }

    @Override // yt.a
    @NotNull
    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this._context;
        Intrinsics.c(coroutineContext);
        return coroutineContext;
    }

    @NotNull
    public final yt.a<Object> intercepted() {
        yt.a<Object> aVar = this.intercepted;
        if (aVar == null) {
            kotlin.coroutines.f fVar = (kotlin.coroutines.f) getContext().g(kotlin.coroutines.f.O);
            if (fVar != null) {
                aVar = new vu.h((b0) fVar, this);
            } else {
                aVar = this;
            }
            this.intercepted = aVar;
        }
        return aVar;
    }

    @Override // au.a
    public void releaseIntercepted() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        qu.i iVar;
        yt.a<Object> aVar = this.intercepted;
        if (aVar != null && aVar != this) {
            CoroutineContext.Element g10 = getContext().g(kotlin.coroutines.f.O);
            Intrinsics.c(g10);
            vu.h hVar = (vu.h) aVar;
            do {
                atomicReferenceFieldUpdater = vu.h.f38373h;
            } while (atomicReferenceFieldUpdater.get(hVar) == vu.i.f38382b);
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            if (obj instanceof qu.i) {
                iVar = (qu.i) obj;
            } else {
                iVar = null;
            }
            if (iVar != null) {
                iVar.l();
            }
        }
        this.intercepted = b.f2795a;
    }

    public c(yt.a aVar) {
        this(aVar, aVar != null ? aVar.getContext() : null);
    }
}
