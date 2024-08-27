package nv;

import java.util.concurrent.Executor;
import okhttp3.Request;

/* loaded from: classes2.dex */
public final class p implements h {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f29237a;

    /* renamed from: b, reason: collision with root package name */
    public final h f29238b;

    public p(Executor executor, h hVar) {
        this.f29237a = executor;
        this.f29238b = hVar;
    }

    @Override // nv.h
    public final void cancel() {
        this.f29238b.cancel();
    }

    @Override // nv.h
    public final v0 execute() {
        return this.f29238b.execute();
    }

    @Override // nv.h
    public final boolean isCanceled() {
        return this.f29238b.isCanceled();
    }

    @Override // nv.h
    public final Request request() {
        return this.f29238b.request();
    }

    @Override // nv.h
    public final void v(k kVar) {
        this.f29238b.v(new ep.m(2, this, kVar));
    }

    @Override // nv.h
    public final h clone() {
        return new p(this.f29237a, this.f29238b.clone());
    }
}
