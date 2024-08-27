package n2;

import java.util.HashMap;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import mt.p;
import vt.g0;
import zq.f;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final p f28224a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f28225b = new HashMap(0, 0.75f);

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f28226c = new LinkedHashSet();

    /* renamed from: d, reason: collision with root package name */
    public int f28227d;

    /* renamed from: e, reason: collision with root package name */
    public int f28228e;

    /* renamed from: f, reason: collision with root package name */
    public int f28229f;

    public final Object a(Object obj) {
        synchronized (this.f28224a) {
            Object obj2 = this.f28225b.get(obj);
            if (obj2 != null) {
                this.f28226c.remove(obj);
                this.f28226c.add(obj);
                this.f28228e++;
                return obj2;
            }
            this.f28229f++;
            return null;
        }
    }

    public final Object b(Object obj, Object obj2) {
        Object put;
        Object obj3;
        Object obj4;
        if (obj != null) {
            if (obj2 != null) {
                synchronized (this.f28224a) {
                    try {
                        this.f28227d = d() + 1;
                        put = this.f28225b.put(obj, obj2);
                        if (put != null) {
                            this.f28227d = d() - 1;
                        }
                        if (this.f28226c.contains(obj)) {
                            this.f28226c.remove(obj);
                        }
                        this.f28226c.add(obj);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                while (true) {
                    synchronized (this.f28224a) {
                        try {
                            if (d() >= 0) {
                                if (this.f28225b.isEmpty() && d() != 0) {
                                    break;
                                }
                                if (this.f28225b.isEmpty() != this.f28226c.isEmpty()) {
                                    break;
                                }
                                if (d() > 16 && !this.f28225b.isEmpty()) {
                                    obj3 = g0.t(this.f28226c);
                                    obj4 = this.f28225b.get(obj3);
                                    if (obj4 != null) {
                                        HashMap hashMap = this.f28225b;
                                        f.w(hashMap);
                                        hashMap.remove(obj3);
                                        f.u(this.f28226c).remove(obj3);
                                        int d10 = d();
                                        Intrinsics.c(obj3);
                                        this.f28227d = d10 - 1;
                                    } else {
                                        throw new IllegalStateException("inconsistent state");
                                    }
                                } else {
                                    obj3 = null;
                                    obj4 = null;
                                }
                                Unit unit = Unit.f23355a;
                            } else {
                                break;
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    if (obj3 == null && obj4 == null) {
                        return put;
                    }
                    Intrinsics.c(obj3);
                    Intrinsics.c(obj4);
                }
                throw new IllegalStateException("map/keySet size inconsistency");
            }
            throw null;
        }
        throw null;
    }

    public final Object c(Object obj) {
        Object remove;
        obj.getClass();
        synchronized (this.f28224a) {
            try {
                remove = this.f28225b.remove(obj);
                this.f28226c.remove(obj);
                if (remove != null) {
                    this.f28227d = d() - 1;
                }
                Unit unit = Unit.f23355a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return remove;
    }

    public final int d() {
        int i10;
        synchronized (this.f28224a) {
            i10 = this.f28227d;
        }
        return i10;
    }

    public final String toString() {
        int i10;
        String str;
        synchronized (this.f28224a) {
            try {
                int i11 = this.f28228e;
                int i12 = this.f28229f + i11;
                if (i12 != 0) {
                    i10 = (i11 * 100) / i12;
                } else {
                    i10 = 0;
                }
                str = "LruCache[maxSize=16,hits=" + this.f28228e + ",misses=" + this.f28229f + ",hitRate=" + i10 + "%]";
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }
}
