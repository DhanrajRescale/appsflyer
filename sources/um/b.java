package um;

/* loaded from: classes2.dex */
public final class b extends e {

    /* renamed from: v, reason: collision with root package name */
    public int f37240v;

    /* renamed from: w, reason: collision with root package name */
    public int f37241w;

    /* renamed from: x, reason: collision with root package name */
    public int f37242x;

    /* renamed from: y, reason: collision with root package name */
    public int f37243y;

    /* renamed from: z, reason: collision with root package name */
    public String[] f37244z;

    @Override // um.h
    public final void a(i iVar) {
        c cVar = (c) iVar;
        if (cVar != null && !Float.isNaN(cVar.f37246a)) {
            float f10 = cVar.f37246a;
            if (f10 < this.f37274r) {
                this.f37274r = f10;
            }
            if (f10 > this.f37273q) {
                this.f37273q = f10;
            }
            c(cVar);
        }
    }
}
