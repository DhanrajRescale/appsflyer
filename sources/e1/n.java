package e1;

import java.util.ArrayList;
import java.util.Iterator;
import okhttp3.HttpUrl;
import vt.g0;

/* loaded from: classes.dex */
public final class n implements Iterable, ju.a {

    /* renamed from: e, reason: collision with root package name */
    public static final n f14896e = new n(0, 0, 0, null);

    /* renamed from: a, reason: collision with root package name */
    public final long f14897a;

    /* renamed from: b, reason: collision with root package name */
    public final long f14898b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14899c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f14900d;

    public n(long j10, long j11, int i10, int[] iArr) {
        this.f14897a = j10;
        this.f14898b = j11;
        this.f14899c = i10;
        this.f14900d = iArr;
    }

    public final n b(n nVar) {
        n nVar2;
        int[] iArr;
        n nVar3 = f14896e;
        if (nVar == nVar3) {
            return this;
        }
        if (this == nVar3) {
            return nVar3;
        }
        int i10 = nVar.f14899c;
        int i11 = this.f14899c;
        int[] iArr2 = nVar.f14900d;
        long j10 = nVar.f14898b;
        long j11 = nVar.f14897a;
        if (i10 == i11 && iArr2 == (iArr = this.f14900d)) {
            return new n((~j11) & this.f14897a, this.f14898b & (~j10), i11, iArr);
        }
        if (iArr2 != null) {
            nVar2 = this;
            for (int i12 : iArr2) {
                nVar2 = nVar2.e(i12);
            }
        } else {
            nVar2 = this;
        }
        int i13 = nVar.f14899c;
        if (j10 != 0) {
            for (int i14 = 0; i14 < 64; i14++) {
                if (((1 << i14) & j10) != 0) {
                    nVar2 = nVar2.e(i14 + i13);
                }
            }
        }
        if (j11 != 0) {
            for (int i15 = 0; i15 < 64; i15++) {
                if (((1 << i15) & j11) != 0) {
                    nVar2 = nVar2.e(i15 + 64 + i13);
                }
            }
        }
        return nVar2;
    }

    public final n e(int i10) {
        int[] iArr;
        int x10;
        int i11 = this.f14899c;
        int i12 = i10 - i11;
        if (i12 >= 0 && i12 < 64) {
            long j10 = 1 << i12;
            long j11 = this.f14898b;
            if ((j11 & j10) != 0) {
                return new n(this.f14897a, j11 & (~j10), i11, this.f14900d);
            }
        } else if (i12 >= 64 && i12 < 128) {
            long j12 = 1 << (i12 - 64);
            long j13 = this.f14897a;
            if ((j13 & j12) != 0) {
                return new n(j13 & (~j12), this.f14898b, i11, this.f14900d);
            }
        } else if (i12 < 0 && (iArr = this.f14900d) != null && (x10 = t0.t.x(iArr, i10)) >= 0) {
            int length = iArr.length;
            int i13 = length - 1;
            if (i13 == 0) {
                return new n(this.f14897a, this.f14898b, this.f14899c, null);
            }
            int[] iArr2 = new int[i13];
            if (x10 > 0) {
                vt.t.c(0, 0, x10, iArr, iArr2);
            }
            if (x10 < i13) {
                vt.t.c(x10, x10 + 1, length, iArr, iArr2);
            }
            return new n(this.f14897a, this.f14898b, this.f14899c, iArr2);
        }
        return this;
    }

    public final boolean g(int i10) {
        int[] iArr;
        int i11 = i10 - this.f14899c;
        boolean z10 = true;
        if (i11 >= 0 && i11 < 64) {
            if (((1 << i11) & this.f14898b) != 0) {
                return true;
            }
            return false;
        }
        if (i11 >= 64 && i11 < 128) {
            if (((1 << (i11 - 64)) & this.f14897a) != 0) {
                return true;
            }
            return false;
        }
        if (i11 > 0 || (iArr = this.f14900d) == null) {
            return false;
        }
        if (t0.t.x(iArr, i10) < 0) {
            z10 = false;
        }
        return z10;
    }

    public final n h(n nVar) {
        n nVar2;
        int[] iArr;
        n nVar3 = nVar;
        n nVar4 = f14896e;
        if (nVar3 == nVar4) {
            return this;
        }
        if (this == nVar4) {
            return nVar3;
        }
        int i10 = nVar3.f14899c;
        int i11 = this.f14899c;
        long j10 = this.f14898b;
        long j11 = this.f14897a;
        int[] iArr2 = nVar3.f14900d;
        long j12 = nVar3.f14898b;
        long j13 = nVar3.f14897a;
        if (i10 == i11 && iArr2 == (iArr = this.f14900d)) {
            return new n(j11 | j13, j12 | j10, i11, iArr);
        }
        int[] iArr3 = this.f14900d;
        if (iArr3 == null) {
            if (iArr3 != null) {
                for (int i12 : iArr3) {
                    nVar3 = nVar3.i(i12);
                }
            }
            int i13 = this.f14899c;
            if (j10 != 0) {
                for (int i14 = 0; i14 < 64; i14++) {
                    if (((1 << i14) & j10) != 0) {
                        nVar3 = nVar3.i(i14 + i13);
                    }
                }
            }
            if (j11 != 0) {
                for (int i15 = 0; i15 < 64; i15++) {
                    if (((1 << i15) & j11) != 0) {
                        nVar3 = nVar3.i(i15 + 64 + i13);
                    }
                }
                return nVar3;
            }
            return nVar3;
        }
        if (iArr2 != null) {
            nVar2 = this;
            for (int i16 : iArr2) {
                nVar2 = nVar2.i(i16);
            }
        } else {
            nVar2 = this;
        }
        int i17 = nVar3.f14899c;
        if (j12 != 0) {
            for (int i18 = 0; i18 < 64; i18++) {
                if (((1 << i18) & j12) != 0) {
                    nVar2 = nVar2.i(i18 + i17);
                }
            }
        }
        if (j13 != 0) {
            for (int i19 = 0; i19 < 64; i19++) {
                if (((1 << i19) & j13) != 0) {
                    nVar2 = nVar2.i(i19 + 64 + i17);
                }
            }
        }
        return nVar2;
    }

    public final n i(int i10) {
        long j10;
        int i11;
        int i12 = this.f14899c;
        int i13 = i10 - i12;
        long j11 = this.f14898b;
        if (i13 >= 0 && i13 < 64) {
            long j12 = 1 << i13;
            if ((j11 & j12) == 0) {
                return new n(this.f14897a, j11 | j12, i12, this.f14900d);
            }
        } else {
            long j13 = this.f14897a;
            if (i13 >= 64 && i13 < 128) {
                long j14 = 1 << (i13 - 64);
                if ((j13 & j14) == 0) {
                    return new n(j13 | j14, j11, i12, this.f14900d);
                }
            } else {
                int[] iArr = this.f14900d;
                if (i13 >= 128) {
                    if (!g(i10)) {
                        int i14 = ((i10 + 1) / 64) * 64;
                        int i15 = this.f14899c;
                        ArrayList arrayList = null;
                        long j15 = j13;
                        while (true) {
                            if (i15 < i14) {
                                if (j11 != 0) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                        if (iArr != null) {
                                            for (int i16 : iArr) {
                                                arrayList.add(Integer.valueOf(i16));
                                            }
                                        }
                                    }
                                    for (int i17 = 0; i17 < 64; i17++) {
                                        if (((1 << i17) & j11) != 0) {
                                            arrayList.add(Integer.valueOf(i17 + i15));
                                        }
                                    }
                                }
                                if (j15 == 0) {
                                    i11 = i14;
                                    j10 = 0;
                                    break;
                                }
                                i15 += 64;
                                j11 = j15;
                                j15 = 0;
                            } else {
                                j10 = j11;
                                i11 = i15;
                                break;
                            }
                        }
                        if (arrayList != null) {
                            iArr = g0.Q(arrayList);
                        }
                        return new n(j15, j10, i11, iArr).i(i10);
                    }
                } else {
                    if (iArr == null) {
                        return new n(j13, j11, i12, new int[]{i10});
                    }
                    int x10 = t0.t.x(iArr, i10);
                    if (x10 < 0) {
                        int i18 = -(x10 + 1);
                        int length = iArr.length;
                        int[] iArr2 = new int[length + 1];
                        vt.t.c(0, 0, i18, iArr, iArr2);
                        vt.t.c(i18 + 1, i18, length, iArr, iArr2);
                        iArr2[i18] = i10;
                        return new n(this.f14897a, this.f14898b, this.f14899c, iArr2);
                    }
                }
            }
        }
        return this;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return pu.j.a(new m(this, null)).iterator();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(" [");
        ArrayList arrayList = new ArrayList(vt.z.k(this));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).intValue()));
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append((CharSequence) HttpUrl.FRAGMENT_ENCODE_SET);
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = arrayList.get(i11);
            i10++;
            if (i10 > 1) {
                sb3.append((CharSequence) ", ");
            }
            if (obj == null || (obj instanceof CharSequence)) {
                sb3.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb3.append(((Character) obj).charValue());
            } else {
                sb3.append((CharSequence) String.valueOf(obj));
            }
        }
        sb3.append((CharSequence) HttpUrl.FRAGMENT_ENCODE_SET);
        sb2.append(sb3.toString());
        sb2.append(']');
        return sb2.toString();
    }
}
