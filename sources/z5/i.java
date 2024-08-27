package z5;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public final d f42086a;

    /* renamed from: b, reason: collision with root package name */
    public final h f42087b;

    /* renamed from: c, reason: collision with root package name */
    public e f42088c;

    /* renamed from: d, reason: collision with root package name */
    public final int f42089d;

    public i(f fVar, h hVar, long j10, long j11, long j12, long j13, long j14, int i10) {
        this.f42087b = hVar;
        this.f42089d = i10;
        this.f42086a = new d(fVar, j10, j11, j12, j13, j14);
    }

    public static int b(q qVar, long j10, mj.b bVar) {
        if (j10 == qVar.getPosition()) {
            return 0;
        }
        bVar.f27810a = j10;
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d3, code lost:
    
        return b(r28, r8, r29);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(z5.q r28, mj.b r29) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z5.i.a(z5.q, mj.b):int");
    }

    public final void c(long j10) {
        e eVar = this.f42088c;
        if (eVar != null && eVar.f42074a == j10) {
            return;
        }
        d dVar = this.f42086a;
        this.f42088c = new e(j10, dVar.f42060a.e(j10), dVar.f42062c, dVar.f42063d, dVar.f42064e, dVar.f42065f, dVar.f42066g);
    }
}
