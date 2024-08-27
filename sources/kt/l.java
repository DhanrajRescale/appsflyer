package kt;

/* loaded from: classes2.dex */
public final class l implements at.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l.g f23517a;

    public l(l.g gVar) {
        this.f23517a = gVar;
    }

    @Override // at.b
    public final void c(ct.b bVar) {
        ((ct.a) this.f23517a.f23569c).c(bVar);
    }

    @Override // at.b
    public final void onComplete() {
        l.g gVar = this.f23517a;
        ((ct.a) gVar.f23569c).a();
        ((at.b) gVar.f23570d).onComplete();
    }

    @Override // at.b
    public final void onError(Throwable th2) {
        l.g gVar = this.f23517a;
        ((ct.a) gVar.f23569c).a();
        ((at.b) gVar.f23570d).onError(th2);
    }
}
