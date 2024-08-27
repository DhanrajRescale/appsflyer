package to;

/* loaded from: classes2.dex */
public final class k extends vl.b {
    @Override // vl.b
    public final void p(float f10, float f11, v vVar) {
        vVar.d(s0.g.f34069a, f11 * f10, 180.0f, 90.0f);
        float f12 = f11 * 2.0f * f10;
        r rVar = new r(s0.g.f34069a, s0.g.f34069a, f12, f12);
        rVar.f36315f = 180.0f;
        rVar.f36316g = 90.0f;
        vVar.f36328g.add(rVar);
        p pVar = new p(rVar);
        vVar.a(180.0f);
        vVar.f36329h.add(pVar);
        vVar.f36326e = 270.0f;
        float f13 = (s0.g.f34069a + f12) * 0.5f;
        float f14 = (f12 - s0.g.f34069a) / 2.0f;
        double d10 = 270.0f;
        vVar.f36324c = (((float) Math.cos(Math.toRadians(d10))) * f14) + f13;
        vVar.f36325d = (f14 * ((float) Math.sin(Math.toRadians(d10)))) + f13;
    }
}
