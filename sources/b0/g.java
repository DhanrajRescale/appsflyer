package b0;

/* loaded from: classes.dex */
public final class g implements h, j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2862a;

    /* renamed from: b, reason: collision with root package name */
    public final float f2863b;

    public g(int i10) {
        this.f2862a = i10;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    this.f2863b = 0;
                    return;
                } else {
                    this.f2863b = 0;
                    return;
                }
            }
            this.f2863b = 0;
            return;
        }
        this.f2863b = 0;
    }

    @Override // b0.h, b0.j
    public final float a() {
        return this.f2863b;
    }

    @Override // b0.j
    public final void b(w2.b bVar, int i10, int[] iArr, int[] iArr2) {
        switch (this.f2862a) {
            case 0:
                n.d(i10, iArr, iArr2, false);
                return;
            case 1:
                n.g(i10, iArr, iArr2, false);
                return;
            case 2:
                n.h(i10, iArr, iArr2, false);
                return;
            default:
                n.i(i10, iArr, iArr2, false);
                return;
        }
    }

    @Override // b0.h
    public final void c(w2.b bVar, int i10, int[] iArr, w2.k kVar, int[] iArr2) {
        w2.k kVar2 = w2.k.f38799a;
        switch (this.f2862a) {
            case 0:
                if (kVar == kVar2) {
                    n.d(i10, iArr, iArr2, false);
                    return;
                } else {
                    n.d(i10, iArr, iArr2, true);
                    return;
                }
            case 1:
                if (kVar == kVar2) {
                    n.g(i10, iArr, iArr2, false);
                    return;
                } else {
                    n.g(i10, iArr, iArr2, true);
                    return;
                }
            case 2:
                if (kVar == kVar2) {
                    n.h(i10, iArr, iArr2, false);
                    return;
                } else {
                    n.h(i10, iArr, iArr2, true);
                    return;
                }
            default:
                if (kVar == kVar2) {
                    n.i(i10, iArr, iArr2, false);
                    return;
                } else {
                    n.i(i10, iArr, iArr2, true);
                    return;
                }
        }
    }

    public final String toString() {
        switch (this.f2862a) {
            case 0:
                return "Arrangement#Center";
            case 1:
                return "Arrangement#SpaceAround";
            case 2:
                return "Arrangement#SpaceBetween";
            default:
                return "Arrangement#SpaceEvenly";
        }
    }
}
