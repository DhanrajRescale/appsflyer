package lp;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public final class a0 extends AbstractMap implements Serializable {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f24949j = new Object();

    /* renamed from: a, reason: collision with root package name */
    public transient Object f24950a;

    /* renamed from: b, reason: collision with root package name */
    public transient int[] f24951b;

    /* renamed from: c, reason: collision with root package name */
    public transient Object[] f24952c;

    /* renamed from: d, reason: collision with root package name */
    public transient Object[] f24953d;

    /* renamed from: e, reason: collision with root package name */
    public transient int f24954e;

    /* renamed from: f, reason: collision with root package name */
    public transient int f24955f;

    /* renamed from: g, reason: collision with root package name */
    public transient w f24956g;

    /* renamed from: h, reason: collision with root package name */
    public transient w f24957h;

    /* renamed from: i, reason: collision with root package name */
    public transient z f24958i;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractMap, lp.a0] */
    public static a0 a(int i10) {
        ?? abstractMap = new AbstractMap();
        if (i10 >= 0) {
            abstractMap.f24954e = kp.j.F(i10, 1);
            return abstractMap;
        }
        throw new IllegalArgumentException("Expected size must be >= 0");
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            if (readInt >= 0) {
                this.f24954e = kp.j.F(readInt, 1);
                for (int i10 = 0; i10 < readInt; i10++) {
                    put(objectInputStream.readObject(), objectInputStream.readObject());
                }
                return;
            }
            throw new IllegalArgumentException("Expected size must be >= 0");
        }
        throw new InvalidObjectException(nn.d.h(25, "Invalid size: ", readInt));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        Iterator vVar;
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Map b10 = b();
        if (b10 != null) {
            vVar = b10.entrySet().iterator();
        } else {
            vVar = new v(this, 1);
        }
        while (vVar.hasNext()) {
            Map.Entry entry = (Map.Entry) vVar.next();
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    public final Map b() {
        Object obj = this.f24950a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final int c() {
        return (1 << (this.f24954e & 31)) - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (f()) {
            return;
        }
        this.f24954e += 32;
        Map b10 = b();
        if (b10 != null) {
            this.f24954e = kp.j.F(size(), 3);
            b10.clear();
            this.f24950a = null;
            this.f24955f = 0;
            return;
        }
        Arrays.fill(i(), 0, this.f24955f, (Object) null);
        Arrays.fill(j(), 0, this.f24955f, (Object) null);
        Object obj = this.f24950a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(h(), 0, this.f24955f, 0);
        this.f24955f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map b10 = b();
        if (b10 != null) {
            return b10.containsKey(obj);
        }
        if (d(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map b10 = b();
        if (b10 != null) {
            return b10.containsValue(obj);
        }
        for (int i10 = 0; i10 < this.f24955f; i10++) {
            if (pn.e.g(obj, j()[i10])) {
                return true;
            }
        }
        return false;
    }

    public final int d(Object obj) {
        if (f()) {
            return -1;
        }
        int o10 = g0.o(obj);
        int c10 = c();
        Object obj2 = this.f24950a;
        Objects.requireNonNull(obj2);
        int a02 = kp.j.a0(o10 & c10, obj2);
        if (a02 == 0) {
            return -1;
        }
        int i10 = ~c10;
        int i11 = o10 & i10;
        do {
            int i12 = a02 - 1;
            int i13 = h()[i12];
            if ((i13 & i10) == i11 && pn.e.g(obj, i()[i12])) {
                return i12;
            }
            a02 = i13 & c10;
        } while (a02 != 0);
        return -1;
    }

    public final void e(int i10, int i11) {
        Object obj = this.f24950a;
        Objects.requireNonNull(obj);
        int[] h10 = h();
        Object[] i12 = i();
        Object[] j10 = j();
        int size = size();
        int i13 = size - 1;
        if (i10 < i13) {
            Object obj2 = i12[i13];
            i12[i10] = obj2;
            j10[i10] = j10[i13];
            i12[i13] = null;
            j10[i13] = null;
            h10[i10] = h10[i13];
            h10[i13] = 0;
            int o10 = g0.o(obj2) & i11;
            int a02 = kp.j.a0(o10, obj);
            if (a02 == size) {
                kp.j.b0(o10, i10 + 1, obj);
                return;
            }
            while (true) {
                int i14 = a02 - 1;
                int i15 = h10[i14];
                int i16 = i15 & i11;
                if (i16 == size) {
                    h10[i14] = kp.j.T(i15, i10 + 1, i11);
                    return;
                }
                a02 = i16;
            }
        } else {
            i12[i10] = null;
            j10[i10] = null;
            h10[i10] = 0;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        w wVar = this.f24957h;
        if (wVar == null) {
            w wVar2 = new w(this, 0);
            this.f24957h = wVar2;
            return wVar2;
        }
        return wVar;
    }

    public final boolean f() {
        return this.f24950a == null;
    }

    public final Object g(Object obj) {
        boolean f10 = f();
        Object obj2 = f24949j;
        if (f10) {
            return obj2;
        }
        int c10 = c();
        Object obj3 = this.f24950a;
        Objects.requireNonNull(obj3);
        int V = kp.j.V(obj, null, c10, obj3, h(), i(), null);
        if (V == -1) {
            return obj2;
        }
        Object obj4 = j()[V];
        e(V, c10);
        this.f24955f--;
        this.f24954e += 32;
        return obj4;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map b10 = b();
        if (b10 != null) {
            return b10.get(obj);
        }
        int d10 = d(obj);
        if (d10 == -1) {
            return null;
        }
        return j()[d10];
    }

    public final int[] h() {
        int[] iArr = this.f24951b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] i() {
        Object[] objArr = this.f24952c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final Object[] j() {
        Object[] objArr = this.f24953d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final int k(int i10, int i11, int i12, int i13) {
        Object I = kp.j.I(i11);
        int i14 = i11 - 1;
        if (i13 != 0) {
            kp.j.b0(i12 & i14, i13 + 1, I);
        }
        Object obj = this.f24950a;
        Objects.requireNonNull(obj);
        int[] h10 = h();
        for (int i15 = 0; i15 <= i10; i15++) {
            int a02 = kp.j.a0(i15, obj);
            while (a02 != 0) {
                int i16 = a02 - 1;
                int i17 = h10[i16];
                int i18 = ((~i10) & i17) | i15;
                int i19 = i18 & i14;
                int a03 = kp.j.a0(i19, I);
                kp.j.b0(i19, a02, I);
                h10[i16] = kp.j.T(i18, a03, i14);
                a02 = i17 & i10;
            }
        }
        this.f24950a = I;
        this.f24954e = kp.j.T(this.f24954e, 32 - Integer.numberOfLeadingZeros(i14), 31);
        return i14;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        w wVar = this.f24956g;
        if (wVar == null) {
            w wVar2 = new w(this, 1);
            this.f24956g = wVar2;
            return wVar2;
        }
        return wVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00ef  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0102 -> B:47:0x00e8). Please report as a decompilation issue!!! */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object put(java.lang.Object r21, java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lp.a0.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map b10 = b();
        if (b10 != null) {
            return b10.remove(obj);
        }
        Object g10 = g(obj);
        if (g10 == f24949j) {
            return null;
        }
        return g10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map b10 = b();
        if (b10 != null) {
            return b10.size();
        }
        return this.f24955f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        z zVar = this.f24958i;
        if (zVar == null) {
            z zVar2 = new z(this);
            this.f24958i = zVar2;
            return zVar2;
        }
        return zVar;
    }
}
