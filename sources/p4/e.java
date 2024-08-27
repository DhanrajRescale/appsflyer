package p4;

import v.k0;
import v.l0;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public float f30635a;

    /* renamed from: b, reason: collision with root package name */
    public float f30636b;

    public e(float f10, w2.b bVar) {
        this.f30635a = f10;
        float b10 = bVar.b();
        float f11 = l0.f37559a;
        this.f30636b = b10 * 386.0878f * 160.0f * 0.84f;
    }

    public k0 a(float f10) {
        double b10 = b(f10);
        double d10 = l0.f37559a;
        double d11 = d10 - 1.0d;
        return new k0(f10, (float) (Math.exp((d10 / d11) * b10) * this.f30635a * this.f30636b), (long) (Math.exp(b10 / d11) * 1000.0d));
    }

    public double b(float f10) {
        float[] fArr = v.b.f37481a;
        return Math.log((Math.abs(f10) * 0.35f) / (this.f30635a * this.f30636b));
    }
}
