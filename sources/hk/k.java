package hk;

/* loaded from: classes.dex */
public final class k extends l {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f18539h;

    public k(int i10) {
        this.f18539h = i10;
    }

    @Override // hk.l
    public final int a(int i10, int i11, int i12, int i13) {
        switch (this.f18539h) {
            case 2:
                if (b(i10, i11, i12, i13) == 1.0f) {
                    return 2;
                }
                return l.f18540a.a(i10, i11, i12, i13);
            case 3:
            default:
                return 2;
            case 4:
                if (l.f18546g) {
                    return 2;
                }
                return 1;
        }
    }

    @Override // hk.l
    public final float b(int i10, int i11, int i12, int i13) {
        float f10 = 1.0f;
        switch (this.f18539h) {
            case 2:
                return Math.min(1.0f, l.f18540a.b(i10, i11, i12, i13));
            case 3:
                return Math.max(i12 / i10, i13 / i11);
            case 4:
                if (l.f18546g) {
                    return Math.min(i12 / i10, i13 / i11);
                }
                if (Math.max(i11 / i13, i10 / i12) != 0) {
                    f10 = 1.0f / Integer.highestOneBit(r3);
                }
                return f10;
            default:
                return 1.0f;
        }
    }
}
