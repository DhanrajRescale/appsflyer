package t7;

/* loaded from: classes.dex */
public final class t extends q {

    /* renamed from: a, reason: collision with root package name */
    public u f35528a;

    @Override // t7.o
    public final void c(p pVar) {
        u uVar = this.f35528a;
        int i10 = uVar.f35531z - 1;
        uVar.f35531z = i10;
        if (i10 == 0) {
            uVar.A = false;
            uVar.m();
        }
        pVar.w(this);
    }

    @Override // t7.q, t7.o
    public final void e(p pVar) {
        u uVar = this.f35528a;
        if (!uVar.A) {
            uVar.G();
            uVar.A = true;
        }
    }
}
