package bq;

import i5.w;

/* loaded from: classes2.dex */
public final class n implements mq.c, mq.b {

    /* renamed from: c, reason: collision with root package name */
    public static final w f7271c = new w(24);

    /* renamed from: d, reason: collision with root package name */
    public static final f f7272d = new f(1);

    /* renamed from: a, reason: collision with root package name */
    public mq.a f7273a;

    /* renamed from: b, reason: collision with root package name */
    public volatile mq.c f7274b;

    public n(w wVar, mq.c cVar) {
        this.f7273a = wVar;
        this.f7274b = cVar;
    }

    public final void a(mq.a aVar) {
        mq.c cVar;
        mq.c cVar2;
        mq.c cVar3 = this.f7274b;
        f fVar = f7272d;
        if (cVar3 != fVar) {
            aVar.e(cVar3);
            return;
        }
        synchronized (this) {
            cVar = this.f7274b;
            if (cVar != fVar) {
                cVar2 = cVar;
            } else {
                this.f7273a = new bm.c(13, this.f7273a, aVar);
                cVar2 = null;
            }
        }
        if (cVar2 != null) {
            aVar.e(cVar);
        }
    }

    @Override // mq.c
    public final Object get() {
        return this.f7274b.get();
    }
}
