package t;

import com.airbnb.deeplinkdispatch.UrlTreeKt;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f34886a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ long[] f34887b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f34888c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f34889d;

    public o() {
        this((Object) null);
    }

    public final void a() {
        int i10 = this.f34889d;
        Object[] objArr = this.f34888c;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f34889d = 0;
        this.f34886a = false;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final o clone() {
        Object clone = super.clone();
        Intrinsics.d(clone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        o oVar = (o) clone;
        oVar.f34887b = (long[]) this.f34887b.clone();
        oVar.f34888c = (Object[]) this.f34888c.clone();
        return oVar;
    }

    public final Object c(long j10) {
        Object obj;
        int b10 = u.a.b(this.f34887b, this.f34889d, j10);
        if (b10 < 0 || (obj = this.f34888c[b10]) == p.f34890a) {
            return null;
        }
        return obj;
    }

    public final int d(long j10) {
        if (this.f34886a) {
            int i10 = this.f34889d;
            long[] jArr = this.f34887b;
            Object[] objArr = this.f34888c;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != p.f34890a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f34886a = false;
            this.f34889d = i11;
        }
        return u.a.b(this.f34887b, this.f34889d, j10);
    }

    public final boolean e() {
        if (i() == 0) {
            return true;
        }
        return false;
    }

    public final long f(int i10) {
        int i11;
        if (i10 >= 0 && i10 < (i11 = this.f34889d)) {
            if (this.f34886a) {
                long[] jArr = this.f34887b;
                Object[] objArr = this.f34888c;
                int i12 = 0;
                for (int i13 = 0; i13 < i11; i13++) {
                    Object obj = objArr[i13];
                    if (obj != p.f34890a) {
                        if (i13 != i12) {
                            jArr[i12] = jArr[i13];
                            objArr[i12] = obj;
                            objArr[i13] = null;
                        }
                        i12++;
                    }
                }
                this.f34886a = false;
                this.f34889d = i12;
            }
            return this.f34887b[i10];
        }
        throw new IllegalArgumentException(jr.h.n("Expected index to be within 0..size()-1, but was ", i10).toString());
    }

    public final void g(long j10, Object obj) {
        int b10 = u.a.b(this.f34887b, this.f34889d, j10);
        if (b10 >= 0) {
            this.f34888c[b10] = obj;
            return;
        }
        int i10 = ~b10;
        int i11 = this.f34889d;
        if (i10 < i11) {
            Object[] objArr = this.f34888c;
            if (objArr[i10] == p.f34890a) {
                this.f34887b[i10] = j10;
                objArr[i10] = obj;
                return;
            }
        }
        if (this.f34886a) {
            long[] jArr = this.f34887b;
            if (i11 >= jArr.length) {
                Object[] objArr2 = this.f34888c;
                int i12 = 0;
                for (int i13 = 0; i13 < i11; i13++) {
                    Object obj2 = objArr2[i13];
                    if (obj2 != p.f34890a) {
                        if (i13 != i12) {
                            jArr[i12] = jArr[i13];
                            objArr2[i12] = obj2;
                            objArr2[i13] = null;
                        }
                        i12++;
                    }
                }
                this.f34886a = false;
                this.f34889d = i12;
                i10 = ~u.a.b(this.f34887b, i12, j10);
            }
        }
        int i14 = this.f34889d;
        if (i14 >= this.f34887b.length) {
            int i15 = (i14 + 1) * 8;
            int i16 = 4;
            while (true) {
                if (i16 >= 32) {
                    break;
                }
                int i17 = (1 << i16) - 12;
                if (i15 <= i17) {
                    i15 = i17;
                    break;
                }
                i16++;
            }
            int i18 = i15 / 8;
            long[] copyOf = Arrays.copyOf(this.f34887b, i18);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f34887b = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f34888c, i18);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.f34888c = copyOf2;
        }
        int i19 = this.f34889d - i10;
        if (i19 != 0) {
            long[] destination = this.f34887b;
            int i20 = i10 + 1;
            Intrinsics.checkNotNullParameter(destination, "<this>");
            Intrinsics.checkNotNullParameter(destination, "destination");
            System.arraycopy(destination, i10, destination, i20, i19);
            Object[] objArr3 = this.f34888c;
            vt.t.f(objArr3, i20, objArr3, i10, this.f34889d);
        }
        this.f34887b[i10] = j10;
        this.f34888c[i10] = obj;
        this.f34889d++;
    }

    public final void h(long j10) {
        int b10 = u.a.b(this.f34887b, this.f34889d, j10);
        if (b10 >= 0) {
            Object[] objArr = this.f34888c;
            Object obj = objArr[b10];
            Object obj2 = p.f34890a;
            if (obj != obj2) {
                objArr[b10] = obj2;
                this.f34886a = true;
            }
        }
    }

    public final int i() {
        if (this.f34886a) {
            int i10 = this.f34889d;
            long[] jArr = this.f34887b;
            Object[] objArr = this.f34888c;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != p.f34890a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f34886a = false;
            this.f34889d = i11;
        }
        return this.f34889d;
    }

    public final Object j(int i10) {
        int i11;
        if (i10 >= 0 && i10 < (i11 = this.f34889d)) {
            if (this.f34886a) {
                long[] jArr = this.f34887b;
                Object[] objArr = this.f34888c;
                int i12 = 0;
                for (int i13 = 0; i13 < i11; i13++) {
                    Object obj = objArr[i13];
                    if (obj != p.f34890a) {
                        if (i13 != i12) {
                            jArr[i12] = jArr[i13];
                            objArr[i12] = obj;
                            objArr[i13] = null;
                        }
                        i12++;
                    }
                }
                this.f34886a = false;
                this.f34889d = i12;
            }
            return this.f34888c[i10];
        }
        throw new IllegalArgumentException(jr.h.n("Expected index to be within 0..size()-1, but was ", i10).toString());
    }

    public final String toString() {
        if (i() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f34889d * 28);
        sb2.append(UrlTreeKt.componentParamPrefixChar);
        int i10 = this.f34889d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(f(i11));
            sb2.append('=');
            Object j10 = j(i11);
            if (j10 != sb2) {
                sb2.append(j10);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append(UrlTreeKt.componentParamSuffixChar);
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }

    public o(int i10) {
        if (i10 == 0) {
            this.f34887b = u.a.f36600b;
            this.f34888c = u.a.f36601c;
            return;
        }
        int i11 = i10 * 8;
        int i12 = 4;
        while (true) {
            if (i12 >= 32) {
                break;
            }
            int i13 = (1 << i12) - 12;
            if (i11 <= i13) {
                i11 = i13;
                break;
            }
            i12++;
        }
        int i14 = i11 / 8;
        this.f34887b = new long[i14];
        this.f34888c = new Object[i14];
    }

    public /* synthetic */ o(Object obj) {
        this(10);
    }
}
