package nv;

import java.util.concurrent.CompletableFuture;

/* loaded from: classes2.dex */
public final class l extends CompletableFuture {

    /* renamed from: a, reason: collision with root package name */
    public final h f29227a;

    public l(c0 c0Var) {
        this.f29227a = c0Var;
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        if (z10) {
            this.f29227a.cancel();
        }
        return super.cancel(z10);
    }
}
