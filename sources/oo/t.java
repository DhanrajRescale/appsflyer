package oo;

/* loaded from: classes2.dex */
public final class t extends e {

    /* renamed from: g, reason: collision with root package name */
    public int f30243g;

    /* renamed from: h, reason: collision with root package name */
    public int f30244h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f30245i;

    @Override // oo.e
    public final void a() {
        if (this.f30243g == 0) {
            if (this.f30168b <= 0) {
                if (this.f30169c.length < 3) {
                    throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
                }
                return;
            }
            throw new IllegalArgumentException("Rounded corners are not supported in contiguous indeterminate animation.");
        }
    }
}
