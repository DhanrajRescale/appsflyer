package com.google.protobuf;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class i1 {

    /* renamed from: f, reason: collision with root package name */
    public static final i1 f11923f = new i1(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f11924a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f11925b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f11926c;

    /* renamed from: d, reason: collision with root package name */
    public int f11927d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f11928e;

    public i1(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f11924a = i10;
        this.f11925b = iArr;
        this.f11926c = objArr;
        this.f11928e = z10;
    }

    public final int a() {
        int v10;
        int i10 = this.f11927d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f11924a; i12++) {
            int i13 = this.f11925b[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 != 0) {
                if (i15 != 1) {
                    if (i15 != 2) {
                        if (i15 != 3) {
                            if (i15 == 5) {
                                ((Integer) this.f11926c[i12]).intValue();
                                v10 = j.f(i14);
                            } else {
                                int i16 = InvalidProtocolBufferException.f11861a;
                                throw new IllegalStateException(new IOException("Protocol message tag had invalid wire type."));
                            }
                        } else {
                            i11 = ((i1) this.f11926c[i12]).a() + (j.s(i14) * 2) + i11;
                        }
                    } else {
                        v10 = j.c(i14, (h) this.f11926c[i12]);
                    }
                } else {
                    ((Long) this.f11926c[i12]).longValue();
                    v10 = j.g(i14);
                }
            } else {
                v10 = j.v(i14, ((Long) this.f11926c[i12]).longValue());
            }
            i11 = v10 + i11;
        }
        this.f11927d = i11;
        return i11;
    }

    public final void b(ek.h0 h0Var) {
        if (this.f11924a == 0) {
            return;
        }
        h0Var.getClass();
        for (int i10 = 0; i10 < this.f11924a; i10++) {
            int i11 = this.f11925b[i10];
            Object obj = this.f11926c[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            if (i13 == 5) {
                                h0Var.w(i12, ((Integer) obj).intValue());
                            } else {
                                int i14 = InvalidProtocolBufferException.f11861a;
                                throw new RuntimeException(new IOException("Protocol message tag had invalid wire type."));
                            }
                        } else {
                            ((j) h0Var.f15593b).G(i12, 3);
                            ((i1) obj).b(h0Var);
                            ((j) h0Var.f15593b).G(i12, 4);
                        }
                    } else {
                        h0Var.s(i12, (h) obj);
                    }
                } else {
                    h0Var.x(i12, ((Long) obj).longValue());
                }
            } else {
                h0Var.B(i12, ((Long) obj).longValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        int i10 = this.f11924a;
        if (i10 == i1Var.f11924a) {
            int[] iArr = this.f11925b;
            int[] iArr2 = i1Var.f11925b;
            int i11 = 0;
            while (true) {
                if (i11 < i10) {
                    if (iArr[i11] != iArr2[i11]) {
                        break;
                    }
                    i11++;
                } else {
                    Object[] objArr = this.f11926c;
                    Object[] objArr2 = i1Var.f11926c;
                    int i12 = this.f11924a;
                    for (int i13 = 0; i13 < i12; i13++) {
                        if (objArr[i13].equals(objArr2[i13])) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f11924a;
        int i11 = (527 + i10) * 31;
        int[] iArr = this.f11925b;
        int i12 = 17;
        int i13 = 17;
        for (int i14 = 0; i14 < i10; i14++) {
            i13 = (i13 * 31) + iArr[i14];
        }
        int i15 = (i11 + i13) * 31;
        Object[] objArr = this.f11926c;
        int i16 = this.f11924a;
        for (int i17 = 0; i17 < i16; i17++) {
            i12 = (i12 * 31) + objArr[i17].hashCode();
        }
        return i15 + i12;
    }
}
