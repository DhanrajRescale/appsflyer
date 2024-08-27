package iq;

/* loaded from: classes2.dex */
public final class h implements fq.g {

    /* renamed from: a, reason: collision with root package name */
    public boolean f20493a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f20494b = false;

    /* renamed from: c, reason: collision with root package name */
    public fq.c f20495c;

    /* renamed from: d, reason: collision with root package name */
    public final f f20496d;

    public h(f fVar) {
        this.f20496d = fVar;
    }

    @Override // fq.g
    public final fq.g e(String str) {
        if (!this.f20493a) {
            this.f20493a = true;
            this.f20496d.g(this.f20495c, str, this.f20494b);
            return this;
        }
        throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
    }

    @Override // fq.g
    public final fq.g f(boolean z10) {
        if (!this.f20493a) {
            this.f20493a = true;
            this.f20496d.e(this.f20495c, z10 ? 1 : 0, this.f20494b);
            return this;
        }
        throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
    }
}
