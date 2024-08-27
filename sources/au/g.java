package au;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.k;

/* loaded from: classes2.dex */
public abstract class g extends a {
    public g(yt.a aVar) {
        super(aVar);
        if (aVar != null && aVar.getContext() != k.f23369a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
        }
    }

    @Override // yt.a
    public final CoroutineContext getContext() {
        return k.f23369a;
    }
}
