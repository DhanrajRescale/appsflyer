package bk;

import android.util.Log;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.Queue;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final da.d f7046a = new da.d(9);

    /* renamed from: b, reason: collision with root package name */
    public final c f7047b = new c(1);

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f7048c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f7049d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final int f7050e;

    /* renamed from: f, reason: collision with root package name */
    public int f7051f;

    public h(int i10) {
        this.f7050e = i10;
    }

    public final void a(int i10, Class cls) {
        NavigableMap f10 = f(cls);
        Integer num = (Integer) f10.get(Integer.valueOf(i10));
        if (num != null) {
            if (num.intValue() == 1) {
                f10.remove(Integer.valueOf(i10));
                return;
            } else {
                f10.put(Integer.valueOf(i10), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i10 + ", this: " + this);
    }

    public final void b(int i10) {
        while (this.f7051f > i10) {
            Object x10 = this.f7046a.x();
            al.d.V(x10);
            a d10 = d(x10.getClass());
            this.f7051f -= d10.a() * d10.c(x10);
            a(d10.c(x10), x10.getClass());
            if (Log.isLoggable(d10.b(), 2)) {
                Log.v(d10.b(), "evicted: " + d10.c(x10));
            }
        }
    }

    public final synchronized Object c(int i10, Class cls) {
        g gVar;
        int i11;
        try {
            Integer num = (Integer) f(cls).ceilingKey(Integer.valueOf(i10));
            if (num == null || ((i11 = this.f7051f) != 0 && this.f7050e / i11 < 2 && num.intValue() > i10 * 8)) {
                c cVar = this.f7047b;
                k kVar = (k) ((Queue) cVar.f3178b).poll();
                if (kVar == null) {
                    kVar = cVar.h();
                }
                gVar = (g) kVar;
                gVar.f7044b = i10;
                gVar.f7045c = cls;
            }
            c cVar2 = this.f7047b;
            int intValue = num.intValue();
            k kVar2 = (k) ((Queue) cVar2.f3178b).poll();
            if (kVar2 == null) {
                kVar2 = cVar2.h();
            }
            gVar = (g) kVar2;
            gVar.f7044b = intValue;
            gVar.f7045c = cls;
        } catch (Throwable th2) {
            throw th2;
        }
        return e(gVar, cls);
    }

    public final a d(Class cls) {
        HashMap hashMap = this.f7049d;
        a aVar = (a) hashMap.get(cls);
        if (aVar == null) {
            if (cls.equals(int[].class)) {
                aVar = new e(1);
            } else if (cls.equals(byte[].class)) {
                aVar = new e(0);
            } else {
                throw new IllegalArgumentException("No array pool found for: ".concat(cls.getSimpleName()));
            }
            hashMap.put(cls, aVar);
        }
        return aVar;
    }

    public final Object e(g gVar, Class cls) {
        a d10 = d(cls);
        Object o10 = this.f7046a.o(gVar);
        if (o10 != null) {
            this.f7051f -= d10.a() * d10.c(o10);
            a(d10.c(o10), cls);
        }
        if (o10 == null) {
            if (Log.isLoggable(d10.b(), 2)) {
                Log.v(d10.b(), "Allocated " + gVar.f7044b + " bytes");
            }
            return d10.newArray(gVar.f7044b);
        }
        return o10;
    }

    public final NavigableMap f(Class cls) {
        HashMap hashMap = this.f7048c;
        NavigableMap navigableMap = (NavigableMap) hashMap.get(cls);
        if (navigableMap == null) {
            TreeMap treeMap = new TreeMap();
            hashMap.put(cls, treeMap);
            return treeMap;
        }
        return navigableMap;
    }

    public final synchronized void g(Object obj) {
        Class<?> cls = obj.getClass();
        a d10 = d(cls);
        int c10 = d10.c(obj);
        int a10 = d10.a() * c10;
        if (a10 <= this.f7050e / 2) {
            c cVar = this.f7047b;
            k kVar = (k) ((Queue) cVar.f3178b).poll();
            if (kVar == null) {
                kVar = cVar.h();
            }
            g gVar = (g) kVar;
            gVar.f7044b = c10;
            gVar.f7045c = cls;
            this.f7046a.v(gVar, obj);
            NavigableMap f10 = f(cls);
            Integer num = (Integer) f10.get(Integer.valueOf(gVar.f7044b));
            Integer valueOf = Integer.valueOf(gVar.f7044b);
            int i10 = 1;
            if (num != null) {
                i10 = 1 + num.intValue();
            }
            f10.put(valueOf, Integer.valueOf(i10));
            this.f7051f += a10;
            b(this.f7050e);
        }
    }
}
