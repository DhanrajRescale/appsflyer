package fv;

import com.google.firebase.messaging.t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import vt.d0;
import vt.g0;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a */
    public int f16280a;

    /* renamed from: b */
    public final ConcurrentLinkedQueue f16281b;

    /* renamed from: c */
    public int f16282c;

    /* renamed from: d */
    public long f16283d;

    /* renamed from: e */
    public boolean f16284e;

    /* renamed from: f */
    public final g f16285f;

    /* renamed from: g */
    public final ArrayList f16286g;

    /* renamed from: h */
    public final n f16287h;

    /* renamed from: i */
    public final String f16288i;

    /* renamed from: j */
    public final m f16289j;

    public e(String topic, Map params, m socket) {
        Intrinsics.e(topic, "topic");
        Intrinsics.e(params, "params");
        Intrinsics.e(socket, "socket");
        this.f16288i = topic;
        this.f16289j = socket;
        int i10 = 1;
        this.f16280a = 1;
        this.f16281b = new ConcurrentLinkedQueue();
        int i11 = 0;
        this.f16282c = 0;
        this.f16283d = socket.f16318c;
        this.f16284e = false;
        this.f16286g = new ArrayList();
        d dVar = socket.f16321f;
        this.f16287h = new n(socket.f16323h, new b(this, i11), dVar);
        be.b bVar = new be.b(this, 23);
        t tVar = socket.f16325j;
        tVar.getClass();
        tVar.f11784d = g0.J(bVar, (List) tVar.f11784d);
        b bVar2 = new b(this, i10);
        tVar.getClass();
        tVar.f11782b = g0.J(bVar2, (List) tVar.f11782b);
        g gVar = new g(this, "phx_join", params, this.f16283d);
        this.f16285f = gVar;
        gVar.a("ok", new c(this, i11));
        gVar.a("error", new c(this, i10));
        gVar.a("timeout", new c(this, 2));
        d("phx_close", new c(this, 3));
        d("phx_error", new c(this, 4));
        d("phx_reply", new c(this, 5));
    }

    public static g b(e eVar) {
        long j10 = eVar.f16283d;
        if (!eVar.f16284e) {
            eVar.f16283d = j10;
            eVar.f16284e = true;
            f(eVar);
            return eVar.f16285f;
        }
        throw new IllegalStateException("Tried to join channel multiple times. `join()` can only be called once per channel");
    }

    public static void c(e eVar) {
        boolean z10;
        long j10 = eVar.f16283d;
        if (eVar.f16289j.c() && eVar.a()) {
            z10 = true;
        } else {
            z10 = false;
        }
        eVar.f16287h.a();
        g gVar = eVar.f16285f;
        i iVar = gVar.f16296b;
        if (iVar != null) {
            iVar.f16305a.cancel(true);
        }
        gVar.f16296b = null;
        eVar.f16280a = 5;
        c cVar = new c(eVar, 6);
        g gVar2 = new g(eVar, j10);
        gVar2.a("ok", cVar);
        gVar2.a("timeout", cVar);
        gVar2.b();
        if (!z10) {
            gVar2.d("ok", new HashMap());
        }
    }

    public static void f(e eVar) {
        long j10 = eVar.f16283d;
        if (eVar.f16280a != 5) {
            eVar.f16280a = 4;
            g gVar = eVar.f16285f;
            gVar.f16303i = j10;
            String str = gVar.f16299e;
            Object obj = null;
            if (str != null) {
                e eVar2 = gVar.f16300f;
                eVar2.getClass();
                ConcurrentLinkedQueue concurrentLinkedQueue = eVar2.f16281b;
                zd.g predicate = new zd.g(str, 24, obj);
                Intrinsics.checkNotNullParameter(concurrentLinkedQueue, "<this>");
                Intrinsics.checkNotNullParameter(predicate, "predicate");
                d0.o(concurrentLinkedQueue, predicate, true);
            }
            gVar.f16298d = null;
            gVar.f16299e = null;
            gVar.f16295a = null;
            gVar.b();
        }
    }

    public static /* synthetic */ void i(e eVar, String str, LinkedHashMap linkedHashMap, int i10) {
        String str2;
        HashMap hashMap = linkedHashMap;
        if ((i10 & 2) != 0) {
            hashMap = new HashMap();
        }
        if ((i10 & 4) != 0) {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            str2 = null;
        }
        eVar.h(str, hashMap, str2, null);
    }

    public final boolean a() {
        return this.f16280a == 3;
    }

    public final int d(String event, Function1 function1) {
        Intrinsics.e(event, "event");
        int i10 = this.f16282c;
        this.f16282c = i10 + 1;
        this.f16281b.add(new a(i10, event, function1));
        return i10;
    }

    public final g e(String str, long j10, Map payload) {
        Intrinsics.e(payload, "payload");
        if (this.f16284e) {
            g gVar = new g(this, str, payload, j10);
            if (this.f16289j.c() && a()) {
                gVar.b();
            } else {
                gVar.c();
                this.f16286g.add(gVar);
            }
            return gVar;
        }
        throw new RuntimeException(nn.d.o(da.e.s("Tried to push ", str, " to "), this.f16288i, " before joining. Use channel.join() before pushing events"));
    }

    public final void g(f fVar) {
        f fVar2 = (f) d.f16276b.invoke(fVar);
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f16281b;
        ArrayList arrayList = new ArrayList();
        Iterator it = concurrentLinkedQueue.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (Intrinsics.a(((a) next).f16269a, fVar.a())) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((a) it2.next()).f16271c.invoke(fVar2);
        }
    }

    public final void h(String event, Map payload, String ref, String str) {
        Intrinsics.e(event, "event");
        Intrinsics.e(payload, "payload");
        Intrinsics.e(ref, "ref");
        g(new f(ref, this.f16288i, event, str, payload));
    }
}
