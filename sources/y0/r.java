package y0;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: e, reason: collision with root package name */
    public static final r f41041e = new r(0, 0, new Object[0], null);

    /* renamed from: a, reason: collision with root package name */
    public int f41042a;

    /* renamed from: b, reason: collision with root package name */
    public int f41043b;

    /* renamed from: c, reason: collision with root package name */
    public final a1.b f41044c;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f41045d;

    public r(int i10, int i11, Object[] objArr, a1.b bVar) {
        this.f41042a = i10;
        this.f41043b = i11;
        this.f41044c = bVar;
        this.f41045d = objArr;
    }

    public static r j(int i10, Object obj, Object obj2, int i11, Object obj3, Object obj4, int i12, a1.b bVar) {
        Object[] objArr;
        if (i12 > 30) {
            return new r(0, 0, new Object[]{obj, obj2, obj3, obj4}, bVar);
        }
        int W = t0.t.W(i10, i12);
        int W2 = t0.t.W(i11, i12);
        if (W != W2) {
            if (W < W2) {
                objArr = new Object[]{obj, obj2, obj3, obj4};
            } else {
                objArr = new Object[]{obj3, obj4, obj, obj2};
            }
            return new r((1 << W) | (1 << W2), 0, objArr, bVar);
        }
        return new r(0, 1 << W, new Object[]{j(i10, obj, obj2, i11, obj3, obj4, i12 + 5, bVar)}, bVar);
    }

    public final Object[] a(int i10, int i11, int i12, Object obj, Object obj2, int i13, a1.b bVar) {
        int i14;
        Object obj3 = this.f41045d[i10];
        if (obj3 != null) {
            i14 = obj3.hashCode();
        } else {
            i14 = 0;
        }
        r j10 = j(i14, obj3, x(i10), i12, obj, obj2, i13 + 5, bVar);
        int t10 = t(i11);
        int i15 = t10 + 1;
        Object[] objArr = this.f41045d;
        Object[] objArr2 = new Object[objArr.length - 1];
        vt.t.h(objArr, objArr2, 0, i10, 6);
        vt.t.f(objArr, i10, objArr2, i10 + 2, i15);
        objArr2[t10 - 1] = j10;
        vt.t.f(objArr, t10, objArr2, i15, objArr.length);
        return objArr2;
    }

    public final int b() {
        if (this.f41043b == 0) {
            return this.f41045d.length / 2;
        }
        int bitCount = Integer.bitCount(this.f41042a);
        int length = this.f41045d.length;
        for (int i10 = bitCount * 2; i10 < length; i10++) {
            bitCount += s(i10).b();
        }
        return bitCount;
    }

    public final boolean c(Object obj) {
        kotlin.ranges.c j10 = kotlin.ranges.d.j(kotlin.ranges.d.k(0, this.f41045d.length), 2);
        int i10 = j10.f23381a;
        int i11 = j10.f23382b;
        int i12 = j10.f23383c;
        if ((i12 > 0 && i10 <= i11) || (i12 < 0 && i11 <= i10)) {
            while (!Intrinsics.a(obj, this.f41045d[i10])) {
                if (i10 != i11) {
                    i10 += i12;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(int i10, int i11, Object obj) {
        int W = 1 << t0.t.W(i10, i11);
        if (h(W)) {
            return Intrinsics.a(obj, this.f41045d[f(W)]);
        }
        if (i(W)) {
            r s7 = s(t(W));
            if (i11 == 30) {
                return s7.c(obj);
            }
            return s7.d(i10, i11 + 5, obj);
        }
        return false;
    }

    public final boolean e(r rVar) {
        if (this == rVar) {
            return true;
        }
        if (this.f41043b != rVar.f41043b || this.f41042a != rVar.f41042a) {
            return false;
        }
        int length = this.f41045d.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (this.f41045d[i10] != rVar.f41045d[i10]) {
                return false;
            }
        }
        return true;
    }

    public final int f(int i10) {
        return Integer.bitCount((i10 - 1) & this.f41042a) * 2;
    }

    public final Object g(int i10, int i11, Object obj) {
        int W = 1 << t0.t.W(i10, i11);
        if (h(W)) {
            int f10 = f(W);
            if (!Intrinsics.a(obj, this.f41045d[f10])) {
                return null;
            }
            return x(f10);
        }
        if (!i(W)) {
            return null;
        }
        r s7 = s(t(W));
        if (i11 == 30) {
            kotlin.ranges.c j10 = kotlin.ranges.d.j(kotlin.ranges.d.k(0, s7.f41045d.length), 2);
            int i12 = j10.f23381a;
            int i13 = j10.f23382b;
            int i14 = j10.f23383c;
            if ((i14 <= 0 || i12 > i13) && (i14 >= 0 || i13 > i12)) {
                return null;
            }
            while (!Intrinsics.a(obj, s7.f41045d[i12])) {
                if (i12 == i13) {
                    return null;
                }
                i12 += i14;
            }
            return s7.x(i12);
        }
        return s7.g(i10, i11 + 5, obj);
    }

    public final boolean h(int i10) {
        return (i10 & this.f41042a) != 0;
    }

    public final boolean i(int i10) {
        return (i10 & this.f41043b) != 0;
    }

    public final r k(int i10, f fVar) {
        fVar.f(fVar.d() - 1);
        fVar.f41025c = x(i10);
        Object[] objArr = this.f41045d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f41044c == fVar.f41023a) {
            this.f41045d = t0.t.s(i10, objArr);
            return this;
        }
        return new r(0, 0, t0.t.s(i10, objArr), fVar.f41023a);
    }

    public final r l(int i10, Object obj, Object obj2, int i11, f fVar) {
        r l10;
        int W = 1 << t0.t.W(i10, i11);
        boolean h10 = h(W);
        a1.b bVar = this.f41044c;
        if (h10) {
            int f10 = f(W);
            if (Intrinsics.a(obj, this.f41045d[f10])) {
                fVar.f41025c = x(f10);
                if (x(f10) == obj2) {
                    return this;
                }
                if (bVar == fVar.f41023a) {
                    this.f41045d[f10 + 1] = obj2;
                    return this;
                }
                fVar.f41026d++;
                Object[] objArr = this.f41045d;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
                copyOf[f10 + 1] = obj2;
                return new r(this.f41042a, this.f41043b, copyOf, fVar.f41023a);
            }
            fVar.f(fVar.f41027e + 1);
            a1.b bVar2 = fVar.f41023a;
            if (bVar == bVar2) {
                this.f41045d = a(f10, W, i10, obj, obj2, i11, bVar2);
                this.f41042a ^= W;
                this.f41043b |= W;
                return this;
            }
            return new r(this.f41042a ^ W, this.f41043b | W, a(f10, W, i10, obj, obj2, i11, bVar2), bVar2);
        }
        if (i(W)) {
            int t10 = t(W);
            r s7 = s(t10);
            if (i11 == 30) {
                kotlin.ranges.c j10 = kotlin.ranges.d.j(kotlin.ranges.d.k(0, s7.f41045d.length), 2);
                int i12 = j10.f23381a;
                int i13 = j10.f23382b;
                int i14 = j10.f23383c;
                if ((i14 > 0 && i12 <= i13) || (i14 < 0 && i13 <= i12)) {
                    while (!Intrinsics.a(obj, s7.f41045d[i12])) {
                        if (i12 != i13) {
                            i12 += i14;
                        }
                    }
                    fVar.f41025c = s7.x(i12);
                    if (s7.f41044c == fVar.f41023a) {
                        s7.f41045d[i12 + 1] = obj2;
                        l10 = s7;
                    } else {
                        fVar.f41026d++;
                        Object[] objArr2 = s7.f41045d;
                        Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                        Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, size)");
                        copyOf2[i12 + 1] = obj2;
                        l10 = new r(0, 0, copyOf2, fVar.f41023a);
                    }
                }
                fVar.f(fVar.f41027e + 1);
                l10 = new r(0, 0, t0.t.q(s7.f41045d, 0, obj, obj2), fVar.f41023a);
                break;
            }
            l10 = s7.l(i10, obj, obj2, i11 + 5, fVar);
            if (s7 == l10) {
                return this;
            }
            return r(t10, l10, fVar.f41023a);
        }
        fVar.f(fVar.f41027e + 1);
        a1.b bVar3 = fVar.f41023a;
        int f11 = f(W);
        if (bVar == bVar3) {
            this.f41045d = t0.t.q(this.f41045d, f11, obj, obj2);
            this.f41042a |= W;
            return this;
        }
        return new r(this.f41042a | W, this.f41043b, t0.t.q(this.f41045d, f11, obj, obj2), bVar3);
    }

    public final r m(r rVar, int i10, a1.a aVar, f fVar) {
        boolean z10;
        r rVar2;
        Object[] objArr;
        int i11;
        int i12;
        int i13;
        r j10;
        int i14;
        int i15;
        int i16;
        if (this == rVar) {
            aVar.f20a += b();
            return this;
        }
        int i17 = 0;
        if (i10 > 30) {
            a1.b bVar = fVar.f41023a;
            Object[] objArr2 = this.f41045d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length + rVar.f41045d.length);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            int length = this.f41045d.length;
            kotlin.ranges.c j11 = kotlin.ranges.d.j(kotlin.ranges.d.k(0, rVar.f41045d.length), 2);
            int i18 = j11.f23381a;
            int i19 = j11.f23382b;
            int i20 = j11.f23383c;
            if ((i20 > 0 && i18 <= i19) || (i20 < 0 && i19 <= i18)) {
                while (true) {
                    if (!c(rVar.f41045d[i18])) {
                        Object[] objArr3 = rVar.f41045d;
                        copyOf[length] = objArr3[i18];
                        copyOf[length + 1] = objArr3[i18 + 1];
                        length += 2;
                    } else {
                        aVar.f20a++;
                    }
                    if (i18 == i19) {
                        break;
                    }
                    i18 += i20;
                }
            }
            if (length == this.f41045d.length) {
                return this;
            }
            if (length == rVar.f41045d.length) {
                return rVar;
            }
            if (length == copyOf.length) {
                return new r(0, 0, copyOf, bVar);
            }
            Object[] copyOf2 = Arrays.copyOf(copyOf, length);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            return new r(0, 0, copyOf2, bVar);
        }
        int i21 = this.f41043b | rVar.f41043b;
        int i22 = this.f41042a;
        int i23 = rVar.f41042a;
        int i24 = (i22 ^ i23) & (~i21);
        int i25 = i22 & i23;
        int i26 = i24;
        while (i25 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i25);
            if (Intrinsics.a(this.f41045d[f(lowestOneBit)], rVar.f41045d[rVar.f(lowestOneBit)])) {
                i26 |= lowestOneBit;
            } else {
                i21 |= lowestOneBit;
            }
            i25 ^= lowestOneBit;
        }
        if ((i21 & i26) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (Intrinsics.a(this.f41044c, fVar.f41023a) && this.f41042a == i26 && this.f41043b == i21) {
                rVar2 = this;
            } else {
                rVar2 = new r(i26, i21, new Object[Integer.bitCount(i21) + (Integer.bitCount(i26) * 2)], null);
            }
            int i27 = i21;
            int i28 = 0;
            while (i27 != 0) {
                int lowestOneBit2 = Integer.lowestOneBit(i27);
                Object[] objArr4 = rVar2.f41045d;
                int length2 = (objArr4.length - 1) - i28;
                if (i(lowestOneBit2)) {
                    j10 = s(t(lowestOneBit2));
                    if (rVar.i(lowestOneBit2)) {
                        j10 = j10.m(rVar.s(rVar.t(lowestOneBit2)), i10 + 5, aVar, fVar);
                    } else if (rVar.h(lowestOneBit2)) {
                        int f10 = rVar.f(lowestOneBit2);
                        Object obj = rVar.f41045d[f10];
                        Object x10 = rVar.x(f10);
                        int i29 = fVar.f41027e;
                        if (obj != null) {
                            i16 = obj.hashCode();
                        } else {
                            i16 = i17;
                        }
                        int i30 = i16;
                        objArr = objArr4;
                        j10 = j10.l(i30, obj, x10, i10 + 5, fVar);
                        if (fVar.f41027e == i29) {
                            aVar.f20a++;
                        }
                        i11 = lowestOneBit2;
                    }
                    objArr = objArr4;
                    i11 = lowestOneBit2;
                } else {
                    objArr = objArr4;
                    i11 = lowestOneBit2;
                    if (rVar.i(i11)) {
                        j10 = rVar.s(rVar.t(i11));
                        if (h(i11)) {
                            int f11 = f(i11);
                            Object obj2 = this.f41045d[f11];
                            if (obj2 != null) {
                                i14 = obj2.hashCode();
                            } else {
                                i14 = 0;
                            }
                            int i31 = i10 + 5;
                            if (j10.d(i14, i31, obj2)) {
                                aVar.f20a++;
                            } else {
                                Object x11 = x(f11);
                                if (obj2 != null) {
                                    i15 = obj2.hashCode();
                                } else {
                                    i15 = 0;
                                }
                                j10 = j10.l(i15, obj2, x11, i31, fVar);
                            }
                        }
                    } else {
                        int f12 = f(i11);
                        Object obj3 = this.f41045d[f12];
                        Object x12 = x(f12);
                        int f13 = rVar.f(i11);
                        Object obj4 = rVar.f41045d[f13];
                        Object x13 = rVar.x(f13);
                        if (obj3 != null) {
                            i12 = obj3.hashCode();
                        } else {
                            i12 = 0;
                        }
                        if (obj4 != null) {
                            i13 = obj4.hashCode();
                        } else {
                            i13 = 0;
                        }
                        j10 = j(i12, obj3, x12, i13, obj4, x13, i10 + 5, fVar.f41023a);
                    }
                }
                objArr[length2] = j10;
                i28++;
                i27 ^= i11;
                i17 = 0;
            }
            int i32 = 0;
            while (i26 != 0) {
                int lowestOneBit3 = Integer.lowestOneBit(i26);
                int i33 = i32 * 2;
                if (!rVar.h(lowestOneBit3)) {
                    int f14 = f(lowestOneBit3);
                    Object[] objArr5 = rVar2.f41045d;
                    objArr5[i33] = this.f41045d[f14];
                    objArr5[i33 + 1] = x(f14);
                } else {
                    int f15 = rVar.f(lowestOneBit3);
                    Object[] objArr6 = rVar2.f41045d;
                    objArr6[i33] = rVar.f41045d[f15];
                    objArr6[i33 + 1] = rVar.x(f15);
                    if (h(lowestOneBit3)) {
                        aVar.f20a++;
                    }
                }
                i32++;
                i26 ^= lowestOneBit3;
            }
            if (e(rVar2)) {
                return this;
            }
            if (rVar.e(rVar2)) {
                return rVar;
            }
            return rVar2;
        }
        al.d.f1("Check failed.");
        throw null;
    }

    public final r n(int i10, Object obj, int i11, f fVar) {
        r n10;
        int W = 1 << t0.t.W(i10, i11);
        if (h(W)) {
            int f10 = f(W);
            if (Intrinsics.a(obj, this.f41045d[f10])) {
                return p(f10, W, fVar);
            }
            return this;
        }
        if (i(W)) {
            int t10 = t(W);
            r s7 = s(t10);
            if (i11 == 30) {
                kotlin.ranges.c j10 = kotlin.ranges.d.j(kotlin.ranges.d.k(0, s7.f41045d.length), 2);
                int i12 = j10.f23381a;
                int i13 = j10.f23382b;
                int i14 = j10.f23383c;
                if ((i14 > 0 && i12 <= i13) || (i14 < 0 && i13 <= i12)) {
                    while (!Intrinsics.a(obj, s7.f41045d[i12])) {
                        if (i12 != i13) {
                            i12 += i14;
                        }
                    }
                    n10 = s7.k(i12, fVar);
                }
                n10 = s7;
                break;
            }
            n10 = s7.n(i10, obj, i11 + 5, fVar);
            return q(s7, n10, t10, W, fVar.f41023a);
        }
        return this;
    }

    public final r o(int i10, Object obj, Object obj2, int i11, f fVar) {
        r o10;
        int W = 1 << t0.t.W(i10, i11);
        if (h(W)) {
            int f10 = f(W);
            if (!Intrinsics.a(obj, this.f41045d[f10]) || !Intrinsics.a(obj2, x(f10))) {
                return this;
            }
            return p(f10, W, fVar);
        }
        if (!i(W)) {
            return this;
        }
        int t10 = t(W);
        r s7 = s(t10);
        if (i11 == 30) {
            kotlin.ranges.c j10 = kotlin.ranges.d.j(kotlin.ranges.d.k(0, s7.f41045d.length), 2);
            int i12 = j10.f23381a;
            int i13 = j10.f23382b;
            int i14 = j10.f23383c;
            if ((i14 > 0 && i12 <= i13) || (i14 < 0 && i13 <= i12)) {
                while (true) {
                    if (Intrinsics.a(obj, s7.f41045d[i12]) && Intrinsics.a(obj2, s7.x(i12))) {
                        o10 = s7.k(i12, fVar);
                        break;
                    }
                    if (i12 == i13) {
                        break;
                    }
                    i12 += i14;
                }
            }
            o10 = s7;
        } else {
            o10 = s7.o(i10, obj, obj2, i11 + 5, fVar);
        }
        return q(s7, o10, t10, W, fVar.f41023a);
    }

    public final r p(int i10, int i11, f fVar) {
        fVar.f(fVar.d() - 1);
        fVar.f41025c = x(i10);
        Object[] objArr = this.f41045d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f41044c == fVar.f41023a) {
            this.f41045d = t0.t.s(i10, objArr);
            this.f41042a ^= i11;
            return this;
        }
        return new r(i11 ^ this.f41042a, this.f41043b, t0.t.s(i10, objArr), fVar.f41023a);
    }

    public final r q(r rVar, r rVar2, int i10, int i11, a1.b bVar) {
        a1.b bVar2 = this.f41044c;
        if (rVar2 == null) {
            Object[] objArr = this.f41045d;
            if (objArr.length == 1) {
                return null;
            }
            if (bVar2 == bVar) {
                this.f41045d = t0.t.t(i10, objArr);
                this.f41043b ^= i11;
            } else {
                return new r(this.f41042a, i11 ^ this.f41043b, t0.t.t(i10, objArr), bVar);
            }
        } else if (bVar2 == bVar || rVar != rVar2) {
            return r(i10, rVar2, bVar);
        }
        return this;
    }

    public final r r(int i10, r rVar, a1.b bVar) {
        Object[] objArr = this.f41045d;
        if (objArr.length == 1 && rVar.f41045d.length == 2 && rVar.f41043b == 0) {
            rVar.f41042a = this.f41043b;
            return rVar;
        }
        if (this.f41044c == bVar) {
            objArr[i10] = rVar;
            return this;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        copyOf[i10] = rVar;
        return new r(this.f41042a, this.f41043b, copyOf, bVar);
    }

    public final r s(int i10) {
        Object obj = this.f41045d[i10];
        Intrinsics.d(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (r) obj;
    }

    public final int t(int i10) {
        return (this.f41045d.length - 1) - Integer.bitCount((i10 - 1) & this.f41043b);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00cb A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final y0.q u(java.lang.Object r12, int r13, int r14, java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.r.u(java.lang.Object, int, int, java.lang.Object):y0.q");
    }

    public final r v(int i10, int i11, hr.c cVar) {
        r v10;
        int W = 1 << t0.t.W(i10, i11);
        if (h(W)) {
            int f10 = f(W);
            if (Intrinsics.a(cVar, this.f41045d[f10])) {
                Object[] objArr = this.f41045d;
                if (objArr.length == 2) {
                    return null;
                }
                return new r(this.f41042a ^ W, this.f41043b, t0.t.s(f10, objArr), null);
            }
            return this;
        }
        if (i(W)) {
            int t10 = t(W);
            r s7 = s(t10);
            if (i11 == 30) {
                kotlin.ranges.c j10 = kotlin.ranges.d.j(kotlin.ranges.d.k(0, s7.f41045d.length), 2);
                int i12 = j10.f23381a;
                int i13 = j10.f23382b;
                int i14 = j10.f23383c;
                if ((i14 > 0 && i12 <= i13) || (i14 < 0 && i13 <= i12)) {
                    while (!Intrinsics.a(cVar, s7.f41045d[i12])) {
                        if (i12 != i13) {
                            i12 += i14;
                        }
                    }
                    Object[] objArr2 = s7.f41045d;
                    if (objArr2.length == 2) {
                        v10 = null;
                    } else {
                        v10 = new r(0, 0, t0.t.s(i12, objArr2), null);
                    }
                }
                v10 = s7;
                break;
            }
            v10 = s7.v(i10, i11 + 5, cVar);
            if (v10 == null) {
                Object[] objArr3 = this.f41045d;
                if (objArr3.length == 1) {
                    return null;
                }
                return new r(this.f41042a, W ^ this.f41043b, t0.t.t(t10, objArr3), null);
            }
            if (s7 != v10) {
                return w(t10, W, v10);
            }
            return this;
        }
        return this;
    }

    public final r w(int i10, int i11, r rVar) {
        Object[] objArr = rVar.f41045d;
        if (objArr.length == 2 && rVar.f41043b == 0) {
            if (this.f41045d.length == 1) {
                rVar.f41042a = this.f41043b;
                return rVar;
            }
            int f10 = f(i11);
            Object[] objArr2 = this.f41045d;
            Object obj = objArr[0];
            Object obj2 = objArr[1];
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length + 1);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            vt.t.f(copyOf, i10 + 2, copyOf, i10 + 1, objArr2.length);
            vt.t.f(copyOf, f10 + 2, copyOf, f10, i10);
            copyOf[f10] = obj;
            copyOf[f10 + 1] = obj2;
            return new r(this.f41042a ^ i11, i11 ^ this.f41043b, copyOf, null);
        }
        Object[] objArr3 = this.f41045d;
        Object[] copyOf2 = Arrays.copyOf(objArr3, objArr3.length);
        Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
        copyOf2[i10] = rVar;
        return new r(this.f41042a, this.f41043b, copyOf2, null);
    }

    public final Object x(int i10) {
        return this.f41045d[i10 + 1];
    }
}
