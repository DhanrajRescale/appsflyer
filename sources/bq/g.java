package bq;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class g implements b, eq.a {

    /* renamed from: g, reason: collision with root package name */
    public static final f f7248g = new f(0);

    /* renamed from: d, reason: collision with root package name */
    public final k f7252d;

    /* renamed from: f, reason: collision with root package name */
    public final e f7254f;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f7249a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f7250b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f7251c = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference f7253e = new AtomicReference();

    public g(Executor executor, List list, List list2, e eVar) {
        k kVar = new k(executor);
        this.f7252d = kVar;
        this.f7254f = eVar;
        ArrayList arrayList = new ArrayList();
        int i10 = 1;
        arrayList.add(a.b(kVar, k.class, jq.c.class, jq.b.class));
        arrayList.add(a.b(this, eq.a.class, new Class[0]));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar != null) {
                arrayList.add(aVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(it2.next());
        }
        ArrayList arrayList3 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((mq.c) it3.next()).get();
                    if (componentRegistrar != null) {
                        arrayList.addAll(this.f7254f.a(componentRegistrar));
                        it3.remove();
                    }
                } catch (InvalidRegistrarException e10) {
                    it3.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e10);
                }
            }
            if (this.f7249a.isEmpty()) {
                kp.j.L(arrayList);
            } else {
                ArrayList arrayList4 = new ArrayList(this.f7249a.keySet());
                arrayList4.addAll(arrayList);
                kp.j.L(arrayList4);
            }
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                a aVar2 = (a) it4.next();
                this.f7249a.put(aVar2, new l(new pp.c(i10, this, aVar2)));
            }
            arrayList3.addAll(k(arrayList));
            arrayList3.addAll(l());
            j();
        }
        Iterator it5 = arrayList3.iterator();
        while (it5.hasNext()) {
            ((Runnable) it5.next()).run();
        }
        Boolean bool = (Boolean) this.f7253e.get();
        if (bool != null) {
            i(this.f7249a, bool.booleanValue());
        }
    }

    @Override // bq.b
    public final synchronized mq.c c(p pVar) {
        if (pVar != null) {
        } else {
            throw new NullPointerException("Null interface requested.");
        }
        return (mq.c) this.f7250b.get(pVar);
    }

    @Override // bq.b
    public final synchronized mq.c d(p pVar) {
        m mVar = (m) this.f7251c.get(pVar);
        if (mVar != null) {
            return mVar;
        }
        return f7248g;
    }

    @Override // bq.b
    public final mq.b g(p pVar) {
        mq.c c10 = c(pVar);
        if (c10 == null) {
            return new n(n.f7271c, n.f7272d);
        }
        if (c10 instanceof n) {
            return (n) c10;
        }
        return new n(null, c10);
    }

    public final void i(Map map, boolean z10) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : map.entrySet()) {
            a aVar = (a) entry.getKey();
            mq.c cVar = (mq.c) entry.getValue();
            int i10 = aVar.f7241d;
            if (i10 == 1 || (i10 == 2 && z10)) {
                cVar.get();
            }
        }
        k kVar = this.f7252d;
        synchronized (kVar) {
            arrayDeque = kVar.f7264b;
            if (arrayDeque != null) {
                kVar.f7264b = null;
            } else {
                arrayDeque = null;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                a3.a.u(it.next());
                throw null;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r6v4, types: [bq.m, java.lang.Object] */
    public final void j() {
        for (a aVar : this.f7249a.keySet()) {
            for (j jVar : aVar.f7240c) {
                boolean a10 = jVar.a();
                p pVar = jVar.f7260a;
                if (a10) {
                    HashMap hashMap = this.f7251c;
                    if (!hashMap.containsKey(pVar)) {
                        Set emptySet = Collections.emptySet();
                        ?? obj = new Object();
                        obj.f7270b = null;
                        obj.f7269a = Collections.newSetFromMap(new ConcurrentHashMap());
                        obj.f7269a.addAll(emptySet);
                        hashMap.put(pVar, obj);
                    }
                }
                HashMap hashMap2 = this.f7250b;
                if (hashMap2.containsKey(pVar)) {
                    continue;
                } else if (jVar.f7261b != 1) {
                    if (!jVar.a()) {
                        hashMap2.put(pVar, new n(n.f7271c, n.f7272d));
                    }
                } else {
                    throw new RuntimeException(String.format("Unsatisfied dependency for component %s: %s", aVar, pVar));
                }
            }
        }
    }

    public final ArrayList k(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.f7242e == 0) {
                mq.c cVar = (mq.c) this.f7249a.get(aVar);
                for (p pVar : aVar.f7239b) {
                    HashMap hashMap = this.f7250b;
                    if (!hashMap.containsKey(pVar)) {
                        hashMap.put(pVar, cVar);
                    } else {
                        arrayList2.add(new yk.h(12, (n) ((mq.c) hashMap.get(pVar)), cVar));
                    }
                }
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [bq.m, java.lang.Object] */
    public final ArrayList l() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f7249a.entrySet()) {
            a aVar = (a) entry.getKey();
            if (aVar.f7242e != 0) {
                mq.c cVar = (mq.c) entry.getValue();
                for (p pVar : aVar.f7239b) {
                    if (!hashMap.containsKey(pVar)) {
                        hashMap.put(pVar, new HashSet());
                    }
                    ((Set) hashMap.get(pVar)).add(cVar);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            Object key = entry2.getKey();
            HashMap hashMap2 = this.f7251c;
            if (!hashMap2.containsKey(key)) {
                p pVar2 = (p) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                ?? obj = new Object();
                obj.f7270b = null;
                obj.f7269a = Collections.newSetFromMap(new ConcurrentHashMap());
                obj.f7269a.addAll(set);
                hashMap2.put(pVar2, obj);
            } else {
                m mVar = (m) hashMap2.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new yk.h(13, mVar, (mq.c) it.next()));
                }
            }
        }
        return arrayList;
    }
}
