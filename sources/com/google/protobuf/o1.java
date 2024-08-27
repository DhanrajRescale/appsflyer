package com.google.protobuf;

import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public final class o1 extends q1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11953b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o1(Unsafe unsafe, int i10) {
        super(unsafe);
        this.f11953b = i10;
    }

    @Override // com.google.protobuf.q1
    public final boolean c(long j10, Object obj) {
        switch (this.f11953b) {
            case 0:
                if (r1.f11985g) {
                    if (r1.h(j10, obj) == 0) {
                        return false;
                    }
                } else if (r1.i(j10, obj) == 0) {
                    return false;
                }
                return true;
            default:
                if (r1.f11985g) {
                    if (r1.h(j10, obj) == 0) {
                        return false;
                    }
                } else if (r1.i(j10, obj) == 0) {
                    return false;
                }
                return true;
        }
    }

    @Override // com.google.protobuf.q1
    public final byte d(long j10, Object obj) {
        switch (this.f11953b) {
            case 0:
                if (r1.f11985g) {
                    return r1.h(j10, obj);
                }
                return r1.i(j10, obj);
            default:
                if (r1.f11985g) {
                    return r1.h(j10, obj);
                }
                return r1.i(j10, obj);
        }
    }

    @Override // com.google.protobuf.q1
    public final double e(long j10, Object obj) {
        switch (this.f11953b) {
            case 0:
                return Double.longBitsToDouble(h(j10, obj));
            default:
                return Double.longBitsToDouble(h(j10, obj));
        }
    }

    @Override // com.google.protobuf.q1
    public final float f(long j10, Object obj) {
        switch (this.f11953b) {
            case 0:
                return Float.intBitsToFloat(g(j10, obj));
            default:
                return Float.intBitsToFloat(g(j10, obj));
        }
    }

    @Override // com.google.protobuf.q1
    public final void k(Object obj, long j10, boolean z10) {
        switch (this.f11953b) {
            case 0:
                if (r1.f11985g) {
                    r1.o(obj, j10, z10 ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    r1.p(obj, j10, z10 ? (byte) 1 : (byte) 0);
                    return;
                }
            default:
                if (r1.f11985g) {
                    r1.o(obj, j10, z10 ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    r1.p(obj, j10, z10 ? (byte) 1 : (byte) 0);
                    return;
                }
        }
    }

    @Override // com.google.protobuf.q1
    public final void l(Object obj, long j10, byte b10) {
        switch (this.f11953b) {
            case 0:
                if (r1.f11985g) {
                    r1.o(obj, j10, b10);
                    return;
                } else {
                    r1.p(obj, j10, b10);
                    return;
                }
            default:
                if (r1.f11985g) {
                    r1.o(obj, j10, b10);
                    return;
                } else {
                    r1.p(obj, j10, b10);
                    return;
                }
        }
    }

    @Override // com.google.protobuf.q1
    public final void m(Object obj, long j10, double d10) {
        switch (this.f11953b) {
            case 0:
                p(obj, j10, Double.doubleToLongBits(d10));
                return;
            default:
                p(obj, j10, Double.doubleToLongBits(d10));
                return;
        }
    }

    @Override // com.google.protobuf.q1
    public final void n(Object obj, long j10, float f10) {
        switch (this.f11953b) {
            case 0:
                o(obj, Float.floatToIntBits(f10), j10);
                return;
            default:
                o(obj, Float.floatToIntBits(f10), j10);
                return;
        }
    }

    @Override // com.google.protobuf.q1
    public final boolean s() {
        return false;
    }
}
