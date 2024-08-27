package p4;

/* loaded from: classes.dex */
public final class j extends h {

    /* renamed from: t, reason: collision with root package name */
    public final i f30659t;

    public j(vs.b bVar, d dVar) {
        super(bVar, dVar);
        i iVar = new i();
        this.f30659t = iVar;
        iVar.f30657b = this.f30653i * 0.75f * 62.5f;
    }

    @Override // p4.h
    public final boolean e(long j10) {
        float f10 = this.f30646b;
        float f11 = this.f30645a;
        float f12 = (float) j10;
        i iVar = this.f30659t;
        double exp = Math.exp((f12 / 1000.0f) * iVar.f30656a);
        e eVar = iVar.f30658c;
        eVar.f30636b = (float) (exp * f11);
        eVar.f30635a = (float) ((Math.exp((r2 * f12) / 1000.0f) * (f11 / iVar.f30656a)) + (f10 - r1));
        if (Math.abs(eVar.f30636b) < iVar.f30657b) {
            eVar.f30636b = s0.g.f34069a;
        }
        float f13 = eVar.f30635a;
        this.f30646b = f13;
        float f14 = eVar.f30636b;
        this.f30645a = f14;
        float f15 = this.f30651g;
        if (f13 < f15) {
            this.f30646b = f15;
            return true;
        }
        if (f13 > Float.MAX_VALUE) {
            this.f30646b = Float.MAX_VALUE;
            return true;
        }
        if (f13 >= Float.MAX_VALUE || f13 <= f15 || Math.abs(f14) < iVar.f30657b) {
            return true;
        }
        return false;
    }
}
