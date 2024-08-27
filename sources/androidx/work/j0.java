package androidx.work;

import java.util.HashSet;
import java.util.UUID;

/* loaded from: classes.dex */
public abstract class j0 {

    /* renamed from: a, reason: collision with root package name */
    public UUID f2617a;

    /* renamed from: b, reason: collision with root package name */
    public j8.k f2618b;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f2619c;

    public j0(Class cls) {
        HashSet hashSet = new HashSet();
        this.f2619c = hashSet;
        this.f2617a = UUID.randomUUID();
        this.f2618b = new j8.k(this.f2617a.toString(), cls.getName());
        hashSet.add(cls.getName());
        c();
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, j8.k] */
    /* JADX WARN: Type inference failed for: r3v7, types: [androidx.work.e, java.lang.Object] */
    public final k0 a() {
        boolean z10;
        k0 b10 = b();
        e eVar = this.f2618b.f21083j;
        if (eVar.f2559h.f2564a.size() <= 0 && !eVar.f2555d && !eVar.f2553b && !eVar.f2554c) {
            z10 = false;
        } else {
            z10 = true;
        }
        j8.k kVar = this.f2618b;
        if (kVar.f21090q) {
            if (!z10) {
                if (kVar.f21080g > 0) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed");
                }
            } else {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
        }
        this.f2617a = UUID.randomUUID();
        j8.k kVar2 = this.f2618b;
        ?? obj = new Object();
        obj.f21075b = g0.f2565a;
        k kVar3 = k.f2621c;
        obj.f21078e = kVar3;
        obj.f21079f = kVar3;
        obj.f21083j = e.f2551i;
        obj.f21085l = 1;
        obj.f21086m = 30000L;
        obj.f21089p = -1L;
        obj.f21091r = 1;
        obj.f21074a = kVar2.f21074a;
        obj.f21076c = kVar2.f21076c;
        obj.f21075b = kVar2.f21075b;
        obj.f21077d = kVar2.f21077d;
        obj.f21078e = new k(kVar2.f21078e);
        obj.f21079f = new k(kVar2.f21079f);
        obj.f21080g = kVar2.f21080g;
        obj.f21081h = kVar2.f21081h;
        obj.f21082i = kVar2.f21082i;
        e eVar2 = kVar2.f21083j;
        ?? obj2 = new Object();
        obj2.f2552a = v.f2638a;
        obj2.f2557f = -1L;
        obj2.f2558g = -1L;
        obj2.f2559h = new g();
        obj2.f2553b = eVar2.f2553b;
        obj2.f2554c = eVar2.f2554c;
        obj2.f2552a = eVar2.f2552a;
        obj2.f2555d = eVar2.f2555d;
        obj2.f2556e = eVar2.f2556e;
        obj2.f2559h = eVar2.f2559h;
        obj.f21083j = obj2;
        obj.f21084k = kVar2.f21084k;
        obj.f21085l = kVar2.f21085l;
        obj.f21086m = kVar2.f21086m;
        obj.f21087n = kVar2.f21087n;
        obj.f21088o = kVar2.f21088o;
        obj.f21089p = kVar2.f21089p;
        obj.f21090q = kVar2.f21090q;
        obj.f21091r = kVar2.f21091r;
        this.f2618b = obj;
        obj.f21074a = this.f2617a.toString();
        return b10;
    }

    public abstract k0 b();

    public abstract j0 c();
}
