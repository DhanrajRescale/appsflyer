package lp;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes2.dex */
public abstract class v0 extends i0 implements Set {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f25066c = 0;

    /* renamed from: b, reason: collision with root package name */
    public transient o0 f25067b;

    public static int o(int i10) {
        int max = Math.max(i10, 2);
        boolean z10 = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (highestOneBit * 0.7d < max) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z10 = false;
        }
        if (z10) {
            return 1073741824;
        }
        throw new IllegalArgumentException("collection too large");
    }

    public static v0 p(int i10, Object... objArr) {
        if (i10 != 0) {
            if (i10 != 1) {
                int o10 = o(i10);
                Object[] objArr2 = new Object[o10];
                int i11 = o10 - 1;
                int i12 = 0;
                int i13 = 0;
                for (int i14 = 0; i14 < i10; i14++) {
                    Object obj = objArr[i14];
                    if (obj != null) {
                        int hashCode = obj.hashCode();
                        int n10 = g0.n(hashCode);
                        while (true) {
                            int i15 = n10 & i11;
                            Object obj2 = objArr2[i15];
                            if (obj2 == null) {
                                objArr[i13] = obj;
                                objArr2[i15] = obj;
                                i12 += hashCode;
                                i13++;
                                break;
                            }
                            if (obj2.equals(obj)) {
                                break;
                            }
                            n10++;
                        }
                    } else {
                        throw new NullPointerException(nn.d.h(20, "at index ", i14));
                    }
                }
                Arrays.fill(objArr, i13, i10, (Object) null);
                if (i13 == 1) {
                    Object obj3 = objArr[0];
                    Objects.requireNonNull(obj3);
                    return new w1(obj3);
                }
                if (o(i13) < o10 / 2) {
                    return p(i13, objArr);
                }
                int length = objArr.length;
                if (i13 < (length >> 1) + (length >> 2)) {
                    objArr = Arrays.copyOf(objArr, i13);
                }
                return new p1(objArr, i12, objArr2, i11, i13);
            }
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new w1(obj4);
        }
        return p1.f25035j;
    }

    public static v0 q(Set set) {
        if ((set instanceof v0) && !(set instanceof SortedSet)) {
            v0 v0Var = (v0) set;
            if (!v0Var.k()) {
                return v0Var;
            }
        }
        Object[] array = set.toArray();
        return p(array.length, array);
    }

    @Override // lp.i0
    public o0 b() {
        o0 o0Var = this.f25067b;
        if (o0Var == null) {
            o0 r10 = r();
            this.f25067b = r10;
            return r10;
        }
        return o0Var;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof v0) && (this instanceof p1)) {
            v0 v0Var = (v0) obj;
            v0Var.getClass();
            if ((v0Var instanceof p1) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        return g0.b(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return g0.h(this);
    }

    public o0 r() {
        Object[] array = toArray(i0.f24994a);
        l0 l0Var = o0.f25025b;
        return o0.o(array.length, array);
    }

    @Override // lp.i0
    public Object writeReplace() {
        return new u0(toArray(i0.f24994a));
    }
}
