package j3;

/* loaded from: classes.dex */
public abstract class l extends j {

    /* renamed from: u0, reason: collision with root package name */
    public int f20929u0 = 0;

    /* renamed from: v0, reason: collision with root package name */
    public int f20930v0 = 0;

    /* renamed from: w0, reason: collision with root package name */
    public int f20931w0 = 0;

    /* renamed from: x0, reason: collision with root package name */
    public int f20932x0 = 0;

    /* renamed from: y0, reason: collision with root package name */
    public int f20933y0 = 0;

    /* renamed from: z0, reason: collision with root package name */
    public int f20934z0 = 0;
    public boolean A0 = false;
    public int B0 = 0;
    public int C0 = 0;
    public final k3.b D0 = new Object();
    public k3.c E0 = null;

    public abstract void Y(int i10, int i11, int i12, int i13);

    public final void Z(d dVar, int i10, int i11, int i12, int i13) {
        k3.c cVar;
        d dVar2;
        while (true) {
            cVar = this.E0;
            if (cVar != null || (dVar2 = this.V) == null) {
                break;
            } else {
                this.E0 = ((e) dVar2).f20894w0;
            }
        }
        k3.b bVar = this.D0;
        bVar.f21978a = i10;
        bVar.f21979b = i12;
        bVar.f21980c = i11;
        bVar.f21981d = i13;
        cVar.b(dVar, bVar);
        dVar.T(bVar.f21982e);
        dVar.O(bVar.f21983f);
        dVar.G = bVar.f21985h;
        dVar.K(bVar.f21984g);
    }

    @Override // j3.j, j3.i
    public final void a() {
        for (int i10 = 0; i10 < this.f20927t0; i10++) {
            d dVar = this.f20926s0[i10];
            if (dVar != null) {
                dVar.H = true;
            }
        }
    }
}
