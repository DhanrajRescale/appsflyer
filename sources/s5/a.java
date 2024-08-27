package s5;

import b5.v;

/* loaded from: classes.dex */
public abstract class a extends e {

    /* renamed from: j, reason: collision with root package name */
    public final long f34226j;

    /* renamed from: k, reason: collision with root package name */
    public final long f34227k;

    /* renamed from: l, reason: collision with root package name */
    public final long f34228l;

    /* renamed from: m, reason: collision with root package name */
    public b f34229m;

    /* renamed from: n, reason: collision with root package name */
    public int[] f34230n;

    public a(g5.f fVar, g5.i iVar, v vVar, int i10, Object obj, long j10, long j11, long j12, long j13, long j14) {
        super(fVar, iVar, 1, vVar, i10, obj, j10, j11);
        vVar.getClass();
        this.f34226j = j14;
        this.f34227k = j12;
        this.f34228l = j13;
    }

    public final int a(int i10) {
        int[] iArr = this.f34230n;
        yk.j.I0(iArr);
        return iArr[i10];
    }

    public long b() {
        long j10 = this.f34226j;
        if (j10 != -1) {
            return 1 + j10;
        }
        return -1L;
    }

    public abstract boolean c();
}
