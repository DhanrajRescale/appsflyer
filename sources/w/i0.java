package w;

/* loaded from: classes.dex */
public final class i0 implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f38522a;

    /* renamed from: b, reason: collision with root package name */
    public final e1 f38523b;

    /* JADX WARN: Type inference failed for: r7v1, types: [w.e1, java.lang.Object] */
    public i0(float f10, float f11, float f12) {
        this.f38522a = f12;
        ?? obj = new Object();
        obj.f38473a = 1.0f;
        double sqrt = Math.sqrt(50.0d);
        obj.f38474b = sqrt;
        obj.f38479g = 1.0f;
        if (f10 >= s0.g.f34069a) {
            obj.f38479g = f10;
            obj.f38475c = false;
            if (((float) (sqrt * sqrt)) > s0.g.f34069a) {
                obj.f38474b = Math.sqrt(f11);
                obj.f38475c = false;
                this.f38523b = obj;
                return;
            }
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    @Override // w.g0
    public final float b(long j10, float f10, float f11, float f12) {
        e1 e1Var = this.f38523b;
        e1Var.f38473a = f11;
        return Float.intBitsToFloat((int) (e1Var.a(f10, f12, j10 / 1000000) & 4294967295L));
    }

    @Override // w.g0
    public final long c(float f10, float f11, float f12) {
        double d10;
        y yVar;
        y yVar2;
        y yVar3;
        boolean z10;
        boolean z11;
        boolean z12;
        double d11;
        double d12;
        long j10;
        boolean z13;
        boolean z14;
        double d13;
        double d14;
        double d15;
        long j11;
        e1 e1Var = this.f38523b;
        double d16 = e1Var.f38474b;
        float f13 = (float) (d16 * d16);
        float f14 = e1Var.f38479g;
        float f15 = this.f38522a;
        float f16 = (f10 - f11) / f15;
        float f17 = f12 / f15;
        if (f14 == s0.g.f34069a) {
            j11 = 9223372036854L;
        } else {
            double d17 = f13;
            double d18 = f14;
            double d19 = f17;
            double d20 = f16;
            double d21 = 1.0f;
            double sqrt = d18 * 2.0d * Math.sqrt(d17);
            double d22 = (sqrt * sqrt) - (d17 * 4.0d);
            double d23 = -sqrt;
            if (d22 < 0.0d) {
                d10 = d21;
                yVar = new y(0.0d, Math.sqrt(Math.abs(d22)));
            } else {
                d10 = d21;
                yVar = new y(Math.sqrt(d22), 0.0d);
            }
            yVar.f38730a = (yVar.f38730a + d23) * 0.5d;
            yVar.f38731b *= 0.5d;
            if (d22 < 0.0d) {
                yVar2 = yVar;
                yVar3 = new y(0.0d, Math.sqrt(Math.abs(d22)));
            } else {
                yVar2 = yVar;
                yVar3 = new y(Math.sqrt(d22), 0.0d);
            }
            double d24 = -1;
            double d25 = yVar3.f38730a * d24;
            double d26 = yVar3.f38731b * d24;
            yVar3.f38730a = (d25 + d23) * 0.5d;
            yVar3.f38731b = d26 * 0.5d;
            if (d20 == 0.0d && d19 == 0.0d) {
                j10 = 0;
            } else {
                if (d20 < 0.0d) {
                    d19 = -d19;
                }
                double abs = Math.abs(d20);
                int i10 = 0;
                if (d18 > 1.0d) {
                    double d27 = yVar2.f38730a;
                    double d28 = yVar3.f38730a;
                    double d29 = (d27 * abs) - d19;
                    double d30 = d27 - d28;
                    double d31 = d29 / d30;
                    double d32 = abs - d31;
                    d12 = Math.log(Math.abs(d10 / d32)) / d27;
                    double log = Math.log(Math.abs(d10 / d31)) / d28;
                    if (!Double.isInfinite(d12) && !Double.isNaN(d12)) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (!z13) {
                        d12 = log;
                    } else {
                        if (!Double.isInfinite(log) && !Double.isNaN(log)) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (!(!z14)) {
                            d12 = Math.max(d12, log);
                        }
                    }
                    double d33 = d32 * d27;
                    double log2 = Math.log(d33 / ((-d31) * d28)) / (d28 - d27);
                    if (!Double.isNaN(log2) && log2 > 0.0d) {
                        if (log2 > 0.0d) {
                            if ((-((Math.exp(log2 * d28) * d31) + (Math.exp(d27 * log2) * d32))) < d10) {
                                if (d31 > 0.0d && d32 < 0.0d) {
                                    d15 = d10;
                                    d14 = 0.0d;
                                } else {
                                    d14 = d12;
                                    d15 = d10;
                                }
                                d13 = -d15;
                                d12 = d14;
                            }
                        }
                        d13 = d10;
                        d12 = Math.log((-((d31 * d28) * d28)) / (d33 * d27)) / d30;
                    } else {
                        d13 = -d10;
                    }
                    double d34 = d31 * d28;
                    if (Math.abs((Math.exp(d28 * d12) * d34) + (Math.exp(d27 * d12) * d33)) >= 1.0E-4d) {
                        double d35 = Double.MAX_VALUE;
                        for (double d36 = 0.001d; d35 > d36 && i10 < 100; d36 = 0.001d) {
                            i10++;
                            double d37 = d27 * d12;
                            double d38 = d28 * d12;
                            double exp = d12 - ((((Math.exp(d38) * d31) + (Math.exp(d37) * d32)) + d13) / ((Math.exp(d38) * d34) + (Math.exp(d37) * d33)));
                            d35 = Math.abs(d12 - exp);
                            d12 = exp;
                        }
                    }
                } else {
                    y yVar4 = yVar2;
                    double d39 = d10;
                    if (d18 < 1.0d) {
                        double d40 = yVar4.f38730a;
                        double d41 = (d19 - (d40 * abs)) / yVar4.f38731b;
                        d12 = Math.log(d39 / Math.sqrt((d41 * d41) + (abs * abs))) / d40;
                    } else {
                        double d42 = yVar4.f38730a;
                        double d43 = d42 * abs;
                        double d44 = d19 - d43;
                        double log3 = Math.log(Math.abs(d39 / abs)) / d42;
                        double log4 = Math.log(Math.abs(d39 / d44));
                        double d45 = log4;
                        for (int i11 = 0; i11 < 6; i11++) {
                            d45 = log4 - Math.log(Math.abs(d45 / d42));
                        }
                        double d46 = d45 / d42;
                        if (!Double.isInfinite(log3) && !Double.isNaN(log3)) {
                            z11 = true;
                            z10 = true;
                        } else {
                            z10 = false;
                            z11 = true;
                        }
                        if (!z10) {
                            log3 = d46;
                        } else {
                            if (!Double.isInfinite(d46) && !Double.isNaN(d46)) {
                                z12 = z11;
                            } else {
                                z12 = false;
                            }
                            if (!(!z12)) {
                                log3 = Math.max(log3, d46);
                            }
                        }
                        double d47 = (-(d43 + d44)) / (d42 * d44);
                        double d48 = d42 * d47;
                        double d49 = log3;
                        double exp2 = (Math.exp(d48) * d44 * d47) + (Math.exp(d48) * abs);
                        if (!Double.isNaN(d47) && d47 > 0.0d) {
                            if (d47 > 0.0d && (-exp2) < d39) {
                                if (d44 < 0.0d && abs > 0.0d) {
                                    d11 = 0.0d;
                                } else {
                                    d11 = d49;
                                }
                                d39 = -d39;
                            } else {
                                d11 = (-(2.0d / d42)) - (abs / d44);
                            }
                        } else {
                            d39 = -d39;
                            d11 = d49;
                        }
                        double d50 = Double.MAX_VALUE;
                        for (double d51 = 0.001d; d50 > d51 && i10 < 100; d51 = 0.001d) {
                            i10++;
                            double d52 = d42 * d11;
                            double exp3 = d11 - (((Math.exp(d52) * ((d44 * d11) + abs)) + d39) / (Math.exp(d52) * (((d52 + 1) * d44) + d43)));
                            d50 = Math.abs(d11 - exp3);
                            d11 = exp3;
                        }
                        d12 = d11;
                    }
                }
                j10 = (long) (d12 * 1000.0d);
            }
            j11 = j10;
        }
        return j11 * 1000000;
    }

    @Override // w.g0
    public final float d(float f10, float f11, float f12) {
        return s0.g.f34069a;
    }

    @Override // w.g0
    public final float e(long j10, float f10, float f11, float f12) {
        e1 e1Var = this.f38523b;
        e1Var.f38473a = f11;
        return Float.intBitsToFloat((int) (e1Var.a(f10, f12, j10 / 1000000) >> 32));
    }
}
