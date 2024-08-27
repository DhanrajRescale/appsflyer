package b0;

/* loaded from: classes.dex */
public final class f implements j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2859a;

    @Override // b0.j
    public final void b(w2.b bVar, int i10, int[] iArr, int[] iArr2) {
        switch (this.f2859a) {
            case 0:
                n.f(i10, iArr, iArr2, false);
                return;
            default:
                n.e(iArr, iArr2, false);
                return;
        }
    }

    public final String toString() {
        switch (this.f2859a) {
            case 0:
                return "Arrangement#Bottom";
            default:
                return "Arrangement#Top";
        }
    }
}
