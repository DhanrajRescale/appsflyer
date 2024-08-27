package l7;

import java.io.Closeable;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class t implements p7.e, Closeable {

    /* renamed from: i, reason: collision with root package name */
    public static final TreeMap f24169i = new TreeMap();

    /* renamed from: a, reason: collision with root package name */
    public volatile String f24170a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f24171b;

    /* renamed from: c, reason: collision with root package name */
    public final double[] f24172c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f24173d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[][] f24174e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f24175f;

    /* renamed from: g, reason: collision with root package name */
    public final int f24176g;

    /* renamed from: h, reason: collision with root package name */
    public int f24177h;

    public t(int i10) {
        this.f24176g = i10;
        int i11 = i10 + 1;
        this.f24175f = new int[i11];
        this.f24171b = new long[i11];
        this.f24172c = new double[i11];
        this.f24173d = new String[i11];
        this.f24174e = new byte[i11];
    }

    public static t a(int i10, String str) {
        TreeMap treeMap = f24169i;
        synchronized (treeMap) {
            try {
                Map.Entry ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i10));
                if (ceilingEntry != null) {
                    treeMap.remove(ceilingEntry.getKey());
                    t tVar = (t) ceilingEntry.getValue();
                    tVar.f24170a = str;
                    tVar.f24177h = i10;
                    return tVar;
                }
                t tVar2 = new t(i10);
                tVar2.f24170a = str;
                tVar2.f24177h = i10;
                return tVar2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(int i10, long j10) {
        this.f24175f[i10] = 2;
        this.f24171b[i10] = j10;
    }

    public final void c(int i10) {
        this.f24175f[i10] = 1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public final void d(int i10, String str) {
        this.f24175f[i10] = 4;
        this.f24173d[i10] = str;
    }

    @Override // p7.e
    public final void f(q7.f fVar) {
        for (int i10 = 1; i10 <= this.f24177h; i10++) {
            int i11 = this.f24175f[i10];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 == 5) {
                                fVar.a(i10, this.f24174e[i10]);
                            }
                        } else {
                            fVar.f(i10, this.f24173d[i10]);
                        }
                    } else {
                        fVar.b(i10, this.f24172c[i10]);
                    }
                } else {
                    fVar.c(i10, this.f24171b[i10]);
                }
            } else {
                fVar.d(i10);
            }
        }
    }

    @Override // p7.e
    public final String l() {
        return this.f24170a;
    }

    public final void release() {
        TreeMap treeMap = f24169i;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f24176g), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                while (true) {
                    int i10 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i10;
                }
            }
        }
    }
}
