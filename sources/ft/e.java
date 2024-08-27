package ft;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class e extends AtomicReference implements ct.b {
    private static final long serialVersionUID = -754898800686245608L;

    public e(e eVar) {
        lazySet(eVar);
    }

    @Override // ct.b
    public final void a() {
        b.b(this);
    }

    public final boolean b() {
        return b.c((ct.b) get());
    }
}
