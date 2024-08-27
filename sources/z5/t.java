package z5;

/* loaded from: classes.dex */
public class t implements y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42116a;

    /* renamed from: b, reason: collision with root package name */
    public final long f42117b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f42118c;

    public /* synthetic */ t(Object obj, int i10, long j10) {
        this.f42116a = i10;
        this.f42118c = obj;
        this.f42117b = j10;
    }

    @Override // z5.y
    public final boolean c() {
        switch (this.f42116a) {
            case 1:
                return false;
            default:
                return true;
        }
    }

    @Override // z5.y
    public final x h(long j10) {
        long j11;
        int i10 = this.f42116a;
        int i11 = 1;
        Object obj = this.f42118c;
        switch (i10) {
            case 0:
                u uVar = (u) obj;
                yk.j.I0(uVar.f42129k);
                tr.e eVar = uVar.f42129k;
                long[] jArr = (long[]) eVar.f36361b;
                long[] jArr2 = (long[]) eVar.f36362c;
                int f10 = e5.x.f(jArr, e5.x.j((uVar.f42123e * j10) / 1000000, 0L, uVar.f42128j - 1), false);
                long j12 = 0;
                if (f10 == -1) {
                    j11 = 0;
                } else {
                    j11 = jArr[f10];
                }
                if (f10 != -1) {
                    j12 = jArr2[f10];
                }
                long j13 = (j11 * 1000000) / ((u) obj).f42123e;
                long j14 = this.f42117b;
                z zVar = new z(j13, j12 + j14);
                if (j13 != j10 && f10 != jArr.length - 1) {
                    int i12 = f10 + 1;
                    return new x(zVar, new z((jArr[i12] * 1000000) / ((u) obj).f42123e, j14 + jArr2[i12]));
                }
                return new x(zVar, zVar);
            case 1:
                return (x) obj;
            default:
                b6.b bVar = (b6.b) obj;
                x b10 = bVar.f3711g[0].b(j10);
                while (true) {
                    b6.e[] eVarArr = bVar.f3711g;
                    if (i11 < eVarArr.length) {
                        x b11 = eVarArr[i11].b(j10);
                        if (b11.f42138a.f42142b < b10.f42138a.f42142b) {
                            b10 = b11;
                        }
                        i11++;
                    } else {
                        return b10;
                    }
                }
        }
    }

    @Override // z5.y
    public final long i() {
        switch (this.f42116a) {
            case 0:
                return ((u) this.f42118c).b();
            default:
                return this.f42117b;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t(long j10) {
        this(j10, 0L);
        this.f42116a = 1;
    }

    public t(long j10, long j11) {
        this.f42116a = 1;
        this.f42117b = j10;
        z zVar = j11 == 0 ? z.f42140c : new z(0L, j11);
        this.f42118c = new x(zVar, zVar);
    }
}
