package mt;

/* loaded from: classes2.dex */
public final class n extends at.e {

    /* renamed from: a, reason: collision with root package name */
    public final int f28041a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final long f28042b;

    public n(int i10) {
        this.f28042b = 0 + i10;
    }

    @Override // at.e
    public final void f(at.g gVar) {
        at.g gVar2;
        m mVar = new m(gVar, this.f28041a, this.f28042b);
        gVar.c(mVar);
        if (!mVar.f28040d) {
            long j10 = mVar.f28039c;
            while (true) {
                long j11 = mVar.f28038b;
                gVar2 = mVar.f28037a;
                if (j10 == j11 || mVar.get() != 0) {
                    break;
                }
                gVar2.b(Integer.valueOf((int) j10));
                j10++;
            }
            if (mVar.get() == 0) {
                mVar.lazySet(1);
                gVar2.onComplete();
            }
        }
    }
}
