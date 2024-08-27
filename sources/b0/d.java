package b0;

/* loaded from: classes.dex */
public final class d implements h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2846a;

    @Override // b0.h
    public final void c(w2.b bVar, int i10, int[] iArr, w2.k kVar, int[] iArr2) {
        w2.k kVar2 = w2.k.f38799a;
        switch (this.f2846a) {
            case 1:
                n.e(iArr, iArr2, false);
                return;
            case 2:
                n.f(i10, iArr, iArr2, false);
                return;
            case 6:
                if (kVar == kVar2) {
                    n.f(i10, iArr, iArr2, false);
                    return;
                } else {
                    n.e(iArr, iArr2, true);
                    return;
                }
            default:
                if (kVar == kVar2) {
                    n.e(iArr, iArr2, false);
                    return;
                } else {
                    n.f(i10, iArr, iArr2, true);
                    return;
                }
        }
    }

    public final String toString() {
        switch (this.f2846a) {
            case 1:
                return "AbsoluteArrangement#Left";
            case 2:
                return "AbsoluteArrangement#Right";
            case 6:
                return "Arrangement#End";
            default:
                return "Arrangement#Start";
        }
    }
}
