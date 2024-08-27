package ek;

import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: d, reason: collision with root package name */
    public static final ArrayDeque f15622d;

    /* renamed from: a, reason: collision with root package name */
    public int f15623a;

    /* renamed from: b, reason: collision with root package name */
    public int f15624b;

    /* renamed from: c, reason: collision with root package name */
    public Object f15625c;

    static {
        char[] cArr = rk.k.f33950a;
        f15622d = new ArrayDeque(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static t a(Object obj) {
        t tVar;
        t tVar2;
        ArrayDeque arrayDeque = f15622d;
        synchronized (arrayDeque) {
            tVar = (t) arrayDeque.poll();
            tVar2 = tVar;
        }
        if (tVar == null) {
            tVar2 = new Object();
        }
        tVar2.f15625c = obj;
        tVar2.f15624b = 0;
        tVar2.f15623a = 0;
        return tVar2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (this.f15624b != tVar.f15624b || this.f15623a != tVar.f15623a || !this.f15625c.equals(tVar.f15625c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f15625c.hashCode() + (((this.f15623a * 31) + this.f15624b) * 31);
    }
}
