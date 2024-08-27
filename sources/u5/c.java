package u5;

import android.os.SystemClock;
import b5.j1;
import e5.x;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class c implements s {

    /* renamed from: a, reason: collision with root package name */
    public final j1 f36759a;

    /* renamed from: b, reason: collision with root package name */
    public final int f36760b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f36761c;

    /* renamed from: d, reason: collision with root package name */
    public final b5.v[] f36762d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f36763e;

    /* renamed from: f, reason: collision with root package name */
    public int f36764f;

    public c(j1 j1Var, int[] iArr) {
        boolean z10;
        b5.v[] vVarArr;
        if (iArr.length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        yk.j.H0(z10);
        j1Var.getClass();
        this.f36759a = j1Var;
        int length = iArr.length;
        this.f36760b = length;
        this.f36762d = new b5.v[length];
        int i10 = 0;
        while (true) {
            int length2 = iArr.length;
            vVarArr = j1Var.f3379d;
            if (i10 >= length2) {
                break;
            }
            this.f36762d[i10] = vVarArr[iArr[i10]];
            i10++;
        }
        Arrays.sort(this.f36762d, new t0.s(6));
        this.f36761c = new int[this.f36760b];
        int i11 = 0;
        while (true) {
            int i12 = this.f36760b;
            if (i11 < i12) {
                int[] iArr2 = this.f36761c;
                b5.v vVar = this.f36762d[i11];
                int i13 = 0;
                while (true) {
                    if (i13 < vVarArr.length) {
                        if (vVar == vVarArr[i13]) {
                            break;
                        } else {
                            i13++;
                        }
                    } else {
                        i13 = -1;
                        break;
                    }
                }
                iArr2[i11] = i13;
                i11++;
            } else {
                this.f36763e = new long[i12];
                return;
            }
        }
    }

    @Override // u5.s
    public final boolean a(int i10, long j10) {
        if (this.f36763e[i10] > j10) {
            return true;
        }
        return false;
    }

    @Override // u5.s
    public final j1 c() {
        return this.f36759a;
    }

    @Override // u5.s
    public final int e(b5.v vVar) {
        for (int i10 = 0; i10 < this.f36760b; i10++) {
            if (this.f36762d[i10] == vVar) {
                return i10;
            }
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f36759a == cVar.f36759a && Arrays.equals(this.f36761c, cVar.f36761c)) {
            return true;
        }
        return false;
    }

    @Override // u5.s
    public final b5.v g(int i10) {
        return this.f36762d[i10];
    }

    @Override // u5.s
    public void h() {
    }

    public final int hashCode() {
        if (this.f36764f == 0) {
            this.f36764f = Arrays.hashCode(this.f36761c) + (System.identityHashCode(this.f36759a) * 31);
        }
        return this.f36764f;
    }

    @Override // u5.s
    public final int i(int i10) {
        return this.f36761c[i10];
    }

    @Override // u5.s
    public int j(long j10, List list) {
        return list.size();
    }

    @Override // u5.s
    public void k() {
    }

    @Override // u5.s
    public final b5.v l() {
        return this.f36762d[d()];
    }

    @Override // u5.s
    public final int length() {
        return this.f36761c.length;
    }

    @Override // u5.s
    public final boolean n(int i10, long j10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean a10 = a(i10, elapsedRealtime);
        for (int i11 = 0; i11 < this.f36760b && !a10; i11++) {
            if (i11 != i10 && !a(i11, elapsedRealtime)) {
                a10 = true;
            } else {
                a10 = false;
            }
        }
        if (!a10) {
            return false;
        }
        long[] jArr = this.f36763e;
        long j11 = jArr[i10];
        int i12 = x.f15050a;
        long j12 = elapsedRealtime + j10;
        if (((j10 ^ j12) & (elapsedRealtime ^ j12)) < 0) {
            j12 = Long.MAX_VALUE;
        }
        jArr[i10] = Math.max(j11, j12);
        return true;
    }

    @Override // u5.s
    public void o(float f10) {
    }

    @Override // u5.s
    public final int t(int i10) {
        for (int i11 = 0; i11 < this.f36760b; i11++) {
            if (this.f36761c[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }
}
