package e;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.n;
import androidx.lifecycle.o;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public Random f14624a = new Random();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f14625b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f14626c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f14627d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f14628e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final transient HashMap f14629f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f14630g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final Bundle f14631h = new Bundle();

    public final boolean a(int i10, int i11, Intent intent) {
        b bVar;
        String str = (String) this.f14625b.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        f fVar = (f) this.f14629f.get(str);
        if (fVar != null && (bVar = fVar.f14620a) != null && this.f14628e.contains(str)) {
            bVar.d(fVar.f14621b.c(i11, intent));
            this.f14628e.remove(str);
            return true;
        }
        this.f14630g.remove(str);
        this.f14631h.putParcelable(str, new a(i11, intent));
        return true;
    }

    public abstract void b(int i10, f.a aVar, Object obj);

    public final e c(String str, t tVar, f.a aVar, b bVar) {
        o lifecycle = tVar.getLifecycle();
        if (!lifecycle.b().a(n.f1950d)) {
            e(str);
            HashMap hashMap = this.f14627d;
            g gVar = (g) hashMap.get(str);
            if (gVar == null) {
                gVar = new g(lifecycle);
            }
            d dVar = new d(this, str, bVar, aVar);
            gVar.f14622a.a(dVar);
            gVar.f14623b.add(dVar);
            hashMap.put(str, gVar);
            return new e(this, str, aVar, 0);
        }
        throw new IllegalStateException("LifecycleOwner " + tVar + " is attempting to register while current state is " + lifecycle.b() + ". LifecycleOwners must call register before they are STARTED.");
    }

    public final e d(String str, f.a aVar, b bVar) {
        e(str);
        this.f14629f.put(str, new f(aVar, bVar));
        HashMap hashMap = this.f14630g;
        if (hashMap.containsKey(str)) {
            Object obj = hashMap.get(str);
            hashMap.remove(str);
            bVar.d(obj);
        }
        Bundle bundle = this.f14631h;
        a aVar2 = (a) bundle.getParcelable(str);
        if (aVar2 != null) {
            bundle.remove(str);
            bVar.d(aVar.c(aVar2.f14610a, aVar2.f14611b));
        }
        return new e(this, str, aVar, 1);
    }

    public final void e(String str) {
        HashMap hashMap = this.f14626c;
        if (((Integer) hashMap.get(str)) != null) {
            return;
        }
        int nextInt = this.f14624a.nextInt(2147418112);
        while (true) {
            int i10 = nextInt + 65536;
            HashMap hashMap2 = this.f14625b;
            if (hashMap2.containsKey(Integer.valueOf(i10))) {
                nextInt = this.f14624a.nextInt(2147418112);
            } else {
                hashMap2.put(Integer.valueOf(i10), str);
                hashMap.put(str, Integer.valueOf(i10));
                return;
            }
        }
    }

    public final void f(String str) {
        Integer num;
        if (!this.f14628e.contains(str) && (num = (Integer) this.f14626c.remove(str)) != null) {
            this.f14625b.remove(num);
        }
        this.f14629f.remove(str);
        HashMap hashMap = this.f14630g;
        if (hashMap.containsKey(str)) {
            StringBuilder s7 = da.e.s("Dropping pending result for request ", str, ": ");
            s7.append(hashMap.get(str));
            Log.w("ActivityResultRegistry", s7.toString());
            hashMap.remove(str);
        }
        Bundle bundle = this.f14631h;
        if (bundle.containsKey(str)) {
            StringBuilder s10 = da.e.s("Dropping pending result for request ", str, ": ");
            s10.append(bundle.getParcelable(str));
            Log.w("ActivityResultRegistry", s10.toString());
            bundle.remove(str);
        }
        HashMap hashMap2 = this.f14627d;
        g gVar = (g) hashMap2.get(str);
        if (gVar != null) {
            ArrayList arrayList = gVar.f14623b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                gVar.f14622a.c((r) it.next());
            }
            arrayList.clear();
            hashMap2.remove(str);
        }
    }
}
