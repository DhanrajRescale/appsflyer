package ek;

import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class z implements yj.e, yj.d {

    /* renamed from: a, reason: collision with root package name */
    public final List f15632a;

    /* renamed from: b, reason: collision with root package name */
    public final c4.e f15633b;

    /* renamed from: c, reason: collision with root package name */
    public int f15634c;

    /* renamed from: d, reason: collision with root package name */
    public com.bumptech.glide.e f15635d;

    /* renamed from: e, reason: collision with root package name */
    public yj.d f15636e;

    /* renamed from: f, reason: collision with root package name */
    public List f15637f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f15638g;

    public z(ArrayList arrayList, c4.e eVar) {
        this.f15633b = eVar;
        if (!arrayList.isEmpty()) {
            this.f15632a = arrayList;
            this.f15634c = 0;
            return;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }

    @Override // yj.e
    public final Class a() {
        return ((yj.e) this.f15632a.get(0)).a();
    }

    public final void b() {
        if (this.f15638g) {
            return;
        }
        if (this.f15634c < this.f15632a.size() - 1) {
            this.f15634c++;
            d(this.f15635d, this.f15636e);
        } else {
            al.d.V(this.f15637f);
            this.f15636e.e(new GlideException("Fetch failed", new ArrayList(this.f15637f)));
        }
    }

    @Override // yj.e
    public final void c() {
        List list = this.f15637f;
        if (list != null) {
            this.f15633b.b(list);
        }
        this.f15637f = null;
        Iterator it = this.f15632a.iterator();
        while (it.hasNext()) {
            ((yj.e) it.next()).c();
        }
    }

    @Override // yj.e
    public final void cancel() {
        this.f15638g = true;
        Iterator it = this.f15632a.iterator();
        while (it.hasNext()) {
            ((yj.e) it.next()).cancel();
        }
    }

    @Override // yj.e
    public final void d(com.bumptech.glide.e eVar, yj.d dVar) {
        this.f15635d = eVar;
        this.f15636e = dVar;
        this.f15637f = (List) this.f15633b.c();
        ((yj.e) this.f15632a.get(this.f15634c)).d(eVar, this);
        if (this.f15638g) {
            cancel();
        }
    }

    @Override // yj.d
    public final void e(Exception exc) {
        List list = this.f15637f;
        al.d.V(list);
        list.add(exc);
        b();
    }

    @Override // yj.e
    public final xj.a f() {
        return ((yj.e) this.f15632a.get(0)).f();
    }

    @Override // yj.d
    public final void j(Object obj) {
        if (obj != null) {
            this.f15636e.j(obj);
        } else {
            b();
        }
    }
}
