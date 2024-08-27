package androidx.media3.exoplayer.dash;

import b5.k0;
import g5.e;
import java.util.List;
import l5.k;
import mt.p;
import n5.h;
import r5.a;
import r5.v;
import v5.q;

/* loaded from: classes.dex */
public final class DashMediaSource$Factory implements v {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f2079h = 0;

    /* renamed from: a, reason: collision with root package name */
    public final k f2080a;

    /* renamed from: b, reason: collision with root package name */
    public final e f2081b;

    /* renamed from: c, reason: collision with root package name */
    public h f2082c = new h();

    /* renamed from: e, reason: collision with root package name */
    public kq.e f2084e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public final long f2085f = 30000;

    /* renamed from: g, reason: collision with root package name */
    public final long f2086g = 5000000;

    /* renamed from: d, reason: collision with root package name */
    public final p f2083d = new p(11);

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kq.e] */
    public DashMediaSource$Factory(e eVar) {
        this.f2080a = new k(eVar);
        this.f2081b = eVar;
    }

    @Override // r5.v
    public final a a(k0 k0Var) {
        q qVar;
        k0Var.f3390b.getClass();
        m5.e eVar = new m5.e();
        List list = k0Var.f3390b.f3293e;
        if (!list.isEmpty()) {
            qVar = new tr.e(14, eVar, list);
        } else {
            qVar = eVar;
        }
        return new l5.h(k0Var, this.f2081b, qVar, this.f2080a, this.f2083d, this.f2082c.b(k0Var), this.f2084e, this.f2085f, this.f2086g);
    }

    @Override // r5.v
    public final v b(h hVar) {
        if (hVar != null) {
            this.f2082c = hVar;
            return this;
        }
        throw new NullPointerException("MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
    }

    @Override // r5.v
    public final v c(kq.e eVar) {
        if (eVar != null) {
            this.f2084e = eVar;
            return this;
        }
        throw new NullPointerException("MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
    }
}
