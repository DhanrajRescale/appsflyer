package ok;

import rk.k;

/* loaded from: classes.dex */
public abstract class e extends a {

    /* renamed from: b, reason: collision with root package name */
    public final int f30105b = Integer.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public final int f30106c = Integer.MIN_VALUE;

    @Override // ok.g
    public final void b(f fVar) {
        int i10 = this.f30105b;
        int i11 = this.f30106c;
        if (k.h(i10, i11)) {
            ((nk.g) fVar).o(i10, i11);
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + i10 + " and height: " + i11 + ", either provide dimensions in the constructor or call override()");
    }

    @Override // ok.g
    public final void d(f fVar) {
    }
}
