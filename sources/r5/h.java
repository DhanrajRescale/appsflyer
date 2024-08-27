package r5;

import android.os.Handler;
import b5.i1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public abstract class h extends a {

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f33173h = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public Handler f33174i;

    /* renamed from: j, reason: collision with root package name */
    public g5.u f33175j;

    @Override // r5.a
    public final void d() {
        for (g gVar : this.f33173h.values()) {
            gVar.f33162a.c(gVar.f33163b);
        }
    }

    @Override // r5.a
    public final void f() {
        for (g gVar : this.f33173h.values()) {
            gVar.f33162a.e(gVar.f33163b);
        }
    }

    @Override // r5.a
    public void j() {
        Iterator it = this.f33173h.values().iterator();
        while (it.hasNext()) {
            ((g) it.next()).f33162a.j();
        }
    }

    @Override // r5.a
    public void p() {
        HashMap hashMap = this.f33173h;
        for (g gVar : hashMap.values()) {
            gVar.f33162a.o(gVar.f33163b);
            a aVar = gVar.f33162a;
            com.google.firebase.messaging.t tVar = gVar.f33164c;
            aVar.r(tVar);
            aVar.q(tVar);
        }
        hashMap.clear();
    }

    public abstract w s(Object obj, w wVar);

    public long t(long j10, Object obj) {
        return j10;
    }

    public int u(int i10, Object obj) {
        return i10;
    }

    public abstract void v(Object obj, a aVar, i1 i1Var);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [r5.x, r5.f] */
    /* JADX WARN: Type inference failed for: r3v1, types: [r5.a0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [n5.k, java.lang.Object] */
    public final void w(final Object obj, a aVar) {
        HashMap hashMap = this.f33173h;
        yk.j.E0(!hashMap.containsKey(obj));
        ?? r12 = new x() { // from class: r5.f
            @Override // r5.x
            public final void a(a aVar2, i1 i1Var) {
                h.this.v(obj, aVar2, i1Var);
            }
        };
        com.google.firebase.messaging.t tVar = new com.google.firebase.messaging.t(this, obj);
        hashMap.put(obj, new g(aVar, r12, tVar));
        Handler handler = this.f33174i;
        handler.getClass();
        l0.j jVar = aVar.f33077c;
        jVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) jVar.f23775c;
        ?? obj2 = new Object();
        obj2.f33082a = handler;
        obj2.f33083b = tVar;
        copyOnWriteArrayList.add(obj2);
        Handler handler2 = this.f33174i;
        handler2.getClass();
        n5.l lVar = aVar.f33078d;
        lVar.getClass();
        ?? obj3 = new Object();
        obj3.f28312a = handler2;
        obj3.f28313b = tVar;
        lVar.f28316c.add(obj3);
        g5.u uVar = this.f33175j;
        j5.d0 d0Var = this.f33081g;
        yk.j.I0(d0Var);
        aVar.k(r12, uVar, d0Var);
        if (!(!this.f33076b.isEmpty())) {
            aVar.c(r12);
        }
    }
}
