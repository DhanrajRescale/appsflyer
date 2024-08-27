package wt;

import com.airbnb.deeplinkdispatch.UrlTreeKt;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import vt.d;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0000\u0018\u0000 \n*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u00060\u0004j\u0002`\u0005:\u0006\u000b\f\r\u000e\f\fB\t\b\u0016¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0007\u001a\u00020\u0006H\u0002¨\u0006\u000f"}, d2 = {"Lwt/d;", "K", "V", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", HttpUrl.FRAGMENT_ENCODE_SET, "writeReplace", "<init>", "()V", "n", "a", "wt/e", "wt/f", "d4/t0", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class d<K, V> implements Map<K, V>, Serializable, ju.d {

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: o, reason: collision with root package name */
    public static final d f39460o;

    /* renamed from: a, reason: collision with root package name */
    public Object[] f39461a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f39462b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f39463c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f39464d;

    /* renamed from: e, reason: collision with root package name */
    public int f39465e;

    /* renamed from: f, reason: collision with root package name */
    public int f39466f;

    /* renamed from: g, reason: collision with root package name */
    public int f39467g;

    /* renamed from: h, reason: collision with root package name */
    public int f39468h;

    /* renamed from: i, reason: collision with root package name */
    public int f39469i;

    /* renamed from: j, reason: collision with root package name */
    public h f39470j;

    /* renamed from: k, reason: collision with root package name */
    public i f39471k;

    /* renamed from: l, reason: collision with root package name */
    public g f39472l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f39473m;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lwt/d$a;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "INITIAL_CAPACITY", "I", "INITIAL_MAX_PROBE_DISTANCE", "MAGIC", "TOMBSTONE", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    /* renamed from: wt.d$a, reason: from kotlin metadata */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        d dVar = new d(0);
        dVar.f39473m = true;
        f39460o = dVar;
    }

    public d() {
        this(8);
    }

    private final Object writeReplace() {
        if (this.f39473m) {
            return new k(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    public final int b(Object obj) {
        c();
        while (true) {
            int i10 = i(obj);
            int i11 = this.f39465e * 2;
            int length = this.f39464d.length / 2;
            if (i11 > length) {
                i11 = length;
            }
            int i12 = 0;
            while (true) {
                int[] iArr = this.f39464d;
                int i13 = iArr[i10];
                if (i13 <= 0) {
                    int i14 = this.f39466f;
                    Object[] objArr = this.f39461a;
                    if (i14 >= objArr.length) {
                        f(1);
                    } else {
                        int i15 = i14 + 1;
                        this.f39466f = i15;
                        objArr[i14] = obj;
                        this.f39463c[i14] = i10;
                        iArr[i10] = i15;
                        this.f39469i++;
                        this.f39468h++;
                        if (i12 > this.f39465e) {
                            this.f39465e = i12;
                        }
                        return i14;
                    }
                } else {
                    if (Intrinsics.a(this.f39461a[i13 - 1], obj)) {
                        return -i13;
                    }
                    i12++;
                    if (i12 > i11) {
                        k(this.f39464d.length * 2);
                        break;
                    }
                    int i16 = i10 - 1;
                    if (i10 == 0) {
                        i10 = this.f39464d.length - 1;
                    } else {
                        i10 = i16;
                    }
                }
            }
        }
    }

    public final void c() {
        if (!this.f39473m) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        c();
        int i10 = this.f39466f - 1;
        if (i10 >= 0) {
            int i11 = 0;
            while (true) {
                int[] iArr = this.f39463c;
                int i12 = iArr[i11];
                if (i12 >= 0) {
                    this.f39464d[i12] = 0;
                    iArr[i11] = -1;
                }
                if (i11 == i10) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        zq.f.e0(0, this.f39466f, this.f39461a);
        Object[] objArr = this.f39462b;
        if (objArr != null) {
            zq.f.e0(0, this.f39466f, objArr);
        }
        this.f39469i = 0;
        this.f39466f = 0;
        this.f39468h++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (g(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (h(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean d(Collection m10) {
        Intrinsics.checkNotNullParameter(m10, "m");
        for (Object obj : m10) {
            if (obj != null) {
                try {
                    if (!e((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean e(Map.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        int g10 = g(entry.getKey());
        if (g10 < 0) {
            return false;
        }
        Object[] objArr = this.f39462b;
        Intrinsics.c(objArr);
        return Intrinsics.a(objArr[g10], entry.getValue());
    }

    @Override // java.util.Map
    public final Set entrySet() {
        g gVar = this.f39472l;
        if (gVar == null) {
            g gVar2 = new g(this);
            this.f39472l = gVar2;
            return gVar2;
        }
        return gVar;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (this.f39469i != map.size() || !d(map.entrySet())) {
                }
            }
            return false;
        }
        return true;
    }

    public final void f(int i10) {
        Object[] objArr;
        Object[] objArr2 = this.f39461a;
        int length = objArr2.length;
        int i11 = this.f39466f;
        int i12 = length - i11;
        int i13 = i11 - this.f39469i;
        if (i12 < i10 && i12 + i13 >= i10 && i13 >= objArr2.length / 4) {
            k(this.f39464d.length);
            return;
        }
        int i14 = i11 + i10;
        if (i14 >= 0) {
            if (i14 > objArr2.length) {
                d.Companion companion = vt.d.INSTANCE;
                int length2 = objArr2.length;
                companion.getClass();
                int d10 = d.Companion.d(length2, i14);
                Object[] objArr3 = this.f39461a;
                Intrinsics.checkNotNullParameter(objArr3, "<this>");
                Object[] copyOf = Arrays.copyOf(objArr3, d10);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
                this.f39461a = copyOf;
                Object[] objArr4 = this.f39462b;
                if (objArr4 != null) {
                    Intrinsics.checkNotNullParameter(objArr4, "<this>");
                    objArr = Arrays.copyOf(objArr4, d10);
                    Intrinsics.checkNotNullExpressionValue(objArr, "copyOf(...)");
                } else {
                    objArr = null;
                }
                this.f39462b = objArr;
                int[] copyOf2 = Arrays.copyOf(this.f39463c, d10);
                Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(...)");
                this.f39463c = copyOf2;
                INSTANCE.getClass();
                if (d10 < 1) {
                    d10 = 1;
                }
                int highestOneBit = Integer.highestOneBit(d10 * 3);
                if (highestOneBit > this.f39464d.length) {
                    k(highestOneBit);
                    return;
                }
                return;
            }
            return;
        }
        throw new OutOfMemoryError();
    }

    public final int g(Object obj) {
        int i10 = i(obj);
        int i11 = this.f39465e;
        while (true) {
            int i12 = this.f39464d[i10];
            if (i12 == 0) {
                return -1;
            }
            if (i12 > 0) {
                int i13 = i12 - 1;
                if (Intrinsics.a(this.f39461a[i13], obj)) {
                    return i13;
                }
            }
            i11--;
            if (i11 < 0) {
                return -1;
            }
            int i14 = i10 - 1;
            if (i10 == 0) {
                i10 = this.f39464d.length - 1;
            } else {
                i10 = i14;
            }
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int g10 = g(obj);
        if (g10 < 0) {
            return null;
        }
        Object[] objArr = this.f39462b;
        Intrinsics.c(objArr);
        return objArr[g10];
    }

    public final int h(Object obj) {
        int i10 = this.f39466f;
        while (true) {
            i10--;
            if (i10 < 0) {
                return -1;
            }
            if (this.f39463c[i10] >= 0) {
                Object[] objArr = this.f39462b;
                Intrinsics.c(objArr);
                if (Intrinsics.a(objArr[i10], obj)) {
                    return i10;
                }
            }
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        int i10;
        int i11;
        e eVar = new e(this, 0);
        int i12 = 0;
        while (eVar.hasNext()) {
            int i13 = eVar.f13827a;
            d dVar = (d) eVar.f13830d;
            if (i13 < dVar.f39466f) {
                eVar.f13827a = i13 + 1;
                eVar.f13828b = i13;
                Object obj = dVar.f39461a[i13];
                if (obj != null) {
                    i10 = obj.hashCode();
                } else {
                    i10 = 0;
                }
                Object[] objArr = dVar.f39462b;
                Intrinsics.c(objArr);
                Object obj2 = objArr[eVar.f13828b];
                if (obj2 != null) {
                    i11 = obj2.hashCode();
                } else {
                    i11 = 0;
                }
                eVar.f();
                i12 += i10 ^ i11;
            } else {
                throw new NoSuchElementException();
            }
        }
        return i12;
    }

    public final int i(Object obj) {
        int i10;
        if (obj != null) {
            i10 = obj.hashCode();
        } else {
            i10 = 0;
        }
        return (i10 * (-1640531527)) >>> this.f39467g;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f39469i == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0070, code lost:
    
        r3[r0] = r7;
        r6.f39463c[r2] = r0;
        r2 = r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(int r7) {
        /*
            r6 = this;
            int r0 = r6.f39468h
            int r0 = r0 + 1
            r6.f39468h = r0
            int r0 = r6.f39466f
            int r1 = r6.f39469i
            r2 = 0
            if (r0 <= r1) goto L3a
            java.lang.Object[] r0 = r6.f39462b
            r1 = r2
            r3 = r1
        L11:
            int r4 = r6.f39466f
            if (r1 >= r4) goto L2c
            int[] r4 = r6.f39463c
            r4 = r4[r1]
            if (r4 < 0) goto L29
            java.lang.Object[] r4 = r6.f39461a
            r5 = r4[r1]
            r4[r3] = r5
            if (r0 == 0) goto L27
            r4 = r0[r1]
            r0[r3] = r4
        L27:
            int r3 = r3 + 1
        L29:
            int r1 = r1 + 1
            goto L11
        L2c:
            java.lang.Object[] r1 = r6.f39461a
            zq.f.e0(r3, r4, r1)
            if (r0 == 0) goto L38
            int r1 = r6.f39466f
            zq.f.e0(r3, r1, r0)
        L38:
            r6.f39466f = r3
        L3a:
            int[] r0 = r6.f39464d
            int r1 = r0.length
            if (r7 == r1) goto L51
            int[] r0 = new int[r7]
            r6.f39464d = r0
            wt.d$a r0 = wt.d.INSTANCE
            r0.getClass()
            int r7 = java.lang.Integer.numberOfLeadingZeros(r7)
            int r7 = r7 + 1
            r6.f39467g = r7
            goto L5a
        L51:
            int r7 = r0.length
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.util.Arrays.fill(r0, r2, r7, r2)
        L5a:
            int r7 = r6.f39466f
            if (r2 >= r7) goto L8e
            int r7 = r2 + 1
            java.lang.Object[] r0 = r6.f39461a
            r0 = r0[r2]
            int r0 = r6.i(r0)
            int r1 = r6.f39465e
        L6a:
            int[] r3 = r6.f39464d
            r4 = r3[r0]
            if (r4 != 0) goto L78
            r3[r0] = r7
            int[] r1 = r6.f39463c
            r1[r2] = r0
            r2 = r7
            goto L5a
        L78:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L86
            int r4 = r0 + (-1)
            if (r0 != 0) goto L84
            int r0 = r3.length
            int r0 = r0 + (-1)
            goto L6a
        L84:
            r0 = r4
            goto L6a
        L86:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            r7.<init>(r0)
            throw r7
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wt.d.k(int):void");
    }

    @Override // java.util.Map
    public final Set keySet() {
        h hVar = this.f39470j;
        if (hVar == null) {
            h hVar2 = new h(this);
            this.f39470j = hVar2;
            return hVar2;
        }
        return hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[LOOP:0: B:8:0x0027->B:25:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(int r12) {
        /*
            r11 = this;
            java.lang.Object[] r0 = r11.f39461a
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r2 = 0
            r0[r12] = r2
            java.lang.Object[] r0 = r11.f39462b
            if (r0 == 0) goto L13
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0[r12] = r2
        L13:
            int[] r0 = r11.f39463c
            r0 = r0[r12]
            int r1 = r11.f39465e
            int r1 = r1 * 2
            int[] r2 = r11.f39464d
            int r2 = r2.length
            int r2 = r2 / 2
            if (r1 <= r2) goto L23
            r1 = r2
        L23:
            r2 = 0
            r3 = r1
            r4 = r2
            r1 = r0
        L27:
            int r5 = r0 + (-1)
            if (r0 != 0) goto L31
            int[] r0 = r11.f39464d
            int r0 = r0.length
            int r0 = r0 + (-1)
            goto L32
        L31:
            r0 = r5
        L32:
            int r4 = r4 + 1
            int r5 = r11.f39465e
            r6 = -1
            if (r4 <= r5) goto L3e
            int[] r0 = r11.f39464d
            r0[r1] = r2
            goto L6f
        L3e:
            int[] r5 = r11.f39464d
            r7 = r5[r0]
            if (r7 != 0) goto L47
            r5[r1] = r2
            goto L6f
        L47:
            if (r7 >= 0) goto L4e
            r5[r1] = r6
        L4b:
            r1 = r0
            r4 = r2
            goto L68
        L4e:
            java.lang.Object[] r5 = r11.f39461a
            int r8 = r7 + (-1)
            r5 = r5[r8]
            int r5 = r11.i(r5)
            int r5 = r5 - r0
            int[] r9 = r11.f39464d
            int r10 = r9.length
            int r10 = r10 + (-1)
            r5 = r5 & r10
            if (r5 < r4) goto L68
            r9[r1] = r7
            int[] r4 = r11.f39463c
            r4[r8] = r1
            goto L4b
        L68:
            int r3 = r3 + r6
            if (r3 >= 0) goto L27
            int[] r0 = r11.f39464d
            r0[r1] = r6
        L6f:
            int[] r0 = r11.f39463c
            r0[r12] = r6
            int r12 = r11.f39469i
            int r12 = r12 + r6
            r11.f39469i = r12
            int r12 = r11.f39468h
            int r12 = r12 + 1
            r11.f39468h = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wt.d.m(int):void");
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        c();
        int b10 = b(obj);
        Object[] objArr = this.f39462b;
        if (objArr == null) {
            int length = this.f39461a.length;
            if (length >= 0) {
                objArr = new Object[length];
                this.f39462b = objArr;
            } else {
                throw new IllegalArgumentException("capacity must be non-negative.".toString());
            }
        }
        if (b10 < 0) {
            int i10 = (-b10) - 1;
            Object obj3 = objArr[i10];
            objArr[i10] = obj2;
            return obj3;
        }
        objArr[b10] = obj2;
        return null;
    }

    @Override // java.util.Map
    public final void putAll(Map from) {
        Intrinsics.checkNotNullParameter(from, "from");
        c();
        Set<Map.Entry<K, V>> entrySet = from.entrySet();
        if (!entrySet.isEmpty()) {
            f(entrySet.size());
            for (Map.Entry<K, V> entry : entrySet) {
                int b10 = b(entry.getKey());
                Object[] objArr = this.f39462b;
                if (objArr == null) {
                    int length = this.f39461a.length;
                    if (length >= 0) {
                        objArr = new Object[length];
                        this.f39462b = objArr;
                    } else {
                        throw new IllegalArgumentException("capacity must be non-negative.".toString());
                    }
                }
                if (b10 >= 0) {
                    objArr[b10] = entry.getValue();
                } else {
                    int i10 = (-b10) - 1;
                    if (!Intrinsics.a(entry.getValue(), objArr[i10])) {
                        objArr[i10] = entry.getValue();
                    }
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        c();
        int g10 = g(obj);
        if (g10 < 0) {
            return null;
        }
        Object[] objArr = this.f39462b;
        Intrinsics.c(objArr);
        Object obj2 = objArr[g10];
        m(g10);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f39469i;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder((this.f39469i * 3) + 2);
        sb2.append(UrlTreeKt.componentParamPrefix);
        int i10 = 0;
        e eVar = new e(this, 0);
        while (eVar.hasNext()) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            Intrinsics.checkNotNullParameter(sb2, "sb");
            int i11 = eVar.f13827a;
            d dVar = (d) eVar.f13830d;
            if (i11 < dVar.f39466f) {
                eVar.f13827a = i11 + 1;
                eVar.f13828b = i11;
                Object obj = dVar.f39461a[i11];
                if (obj == dVar) {
                    sb2.append("(this Map)");
                } else {
                    sb2.append(obj);
                }
                sb2.append('=');
                Object[] objArr = dVar.f39462b;
                Intrinsics.c(objArr);
                Object obj2 = objArr[eVar.f13828b];
                if (obj2 == dVar) {
                    sb2.append("(this Map)");
                } else {
                    sb2.append(obj2);
                }
                eVar.f();
                i10++;
            } else {
                throw new NoSuchElementException();
            }
        }
        sb2.append(UrlTreeKt.componentParamSuffix);
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    @Override // java.util.Map
    public final Collection values() {
        i iVar = this.f39471k;
        if (iVar == null) {
            i iVar2 = new i(this);
            this.f39471k = iVar2;
            return iVar2;
        }
        return iVar;
    }

    public d(int i10) {
        if (i10 >= 0) {
            Object[] objArr = new Object[i10];
            int[] iArr = new int[i10];
            INSTANCE.getClass();
            int highestOneBit = Integer.highestOneBit((i10 < 1 ? 1 : i10) * 3);
            this.f39461a = objArr;
            this.f39462b = null;
            this.f39463c = iArr;
            this.f39464d = new int[highestOneBit];
            this.f39465e = 2;
            this.f39466f = 0;
            this.f39467g = Integer.numberOfLeadingZeros(highestOneBit) + 1;
            return;
        }
        throw new IllegalArgumentException("capacity must be non-negative.".toString());
    }
}
