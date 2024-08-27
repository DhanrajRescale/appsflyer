package ak;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class f0 implements h, yj.d {

    /* renamed from: a, reason: collision with root package name */
    public final g f472a;

    /* renamed from: b, reason: collision with root package name */
    public final i f473b;

    /* renamed from: c, reason: collision with root package name */
    public int f474c;

    /* renamed from: d, reason: collision with root package name */
    public int f475d = -1;

    /* renamed from: e, reason: collision with root package name */
    public xj.g f476e;

    /* renamed from: f, reason: collision with root package name */
    public List f477f;

    /* renamed from: g, reason: collision with root package name */
    public int f478g;

    /* renamed from: h, reason: collision with root package name */
    public volatile ek.v f479h;

    /* renamed from: i, reason: collision with root package name */
    public File f480i;

    /* renamed from: j, reason: collision with root package name */
    public g0 f481j;

    public f0(i iVar, g gVar) {
        this.f473b = iVar;
        this.f472a = gVar;
    }

    @Override // ak.h
    public final boolean b() {
        List list;
        ArrayList c10;
        ArrayList a10 = this.f473b.a();
        boolean z10 = false;
        if (a10.isEmpty()) {
            return false;
        }
        i iVar = this.f473b;
        j8.m mVar = iVar.f494c.f10802b;
        Class<?> cls = iVar.f495d.getClass();
        Class cls2 = iVar.f498g;
        Class cls3 = iVar.f502k;
        da.d dVar = (da.d) mVar.f21100h;
        rk.i iVar2 = (rk.i) ((AtomicReference) dVar.f14276b).getAndSet(null);
        if (iVar2 == null) {
            iVar2 = new rk.i(cls, cls2, cls3);
        } else {
            iVar2.f33946a = cls;
            iVar2.f33947b = cls2;
            iVar2.f33948c = cls3;
        }
        synchronized (((t.f) dVar.f14277c)) {
            list = (List) ((t.f) dVar.f14277c).get(iVar2);
        }
        ((AtomicReference) dVar.f14276b).set(iVar2);
        List list2 = list;
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            da.d dVar2 = (da.d) mVar.f21093a;
            synchronized (dVar2) {
                c10 = ((ek.c0) dVar2.f14276b).c(cls);
            }
            Iterator it = c10.iterator();
            while (it.hasNext()) {
                Iterator it2 = ((da.d) mVar.f21095c).s((Class) it.next(), cls2).iterator();
                while (it2.hasNext()) {
                    Class cls4 = (Class) it2.next();
                    if (!((q9.b) mVar.f21098f).f(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                        arrayList.add(cls4);
                    }
                }
            }
            da.d dVar3 = (da.d) mVar.f21100h;
            List unmodifiableList = Collections.unmodifiableList(arrayList);
            synchronized (((t.f) dVar3.f14277c)) {
                ((t.f) dVar3.f14277c).put(new rk.i(cls, cls2, cls3), unmodifiableList);
            }
            list2 = arrayList;
        }
        if (list2.isEmpty()) {
            if (File.class.equals(this.f473b.f502k)) {
                return false;
            }
            throw new IllegalStateException("Failed to find any load path from " + this.f473b.f495d.getClass() + " to " + this.f473b.f502k);
        }
        while (true) {
            List list3 = this.f477f;
            if (list3 != null && this.f478g < list3.size()) {
                this.f479h = null;
                while (!z10 && this.f478g < this.f477f.size()) {
                    List list4 = this.f477f;
                    int i10 = this.f478g;
                    this.f478g = i10 + 1;
                    ek.w wVar = (ek.w) list4.get(i10);
                    File file = this.f480i;
                    i iVar3 = this.f473b;
                    this.f479h = wVar.b(file, iVar3.f496e, iVar3.f497f, iVar3.f500i);
                    if (this.f479h != null && this.f473b.c(this.f479h.f15630c.a()) != null) {
                        this.f479h.f15630c.d(this.f473b.f506o, this);
                        z10 = true;
                    }
                }
                return z10;
            }
            int i11 = this.f475d + 1;
            this.f475d = i11;
            if (i11 >= list2.size()) {
                int i12 = this.f474c + 1;
                this.f474c = i12;
                if (i12 >= a10.size()) {
                    return false;
                }
                this.f475d = 0;
            }
            xj.g gVar = (xj.g) a10.get(this.f474c);
            Class cls5 = (Class) list2.get(this.f475d);
            xj.o e10 = this.f473b.e(cls5);
            i iVar4 = this.f473b;
            this.f481j = new g0(iVar4.f494c.f10801a, gVar, iVar4.f505n, iVar4.f496e, iVar4.f497f, e10, cls5, iVar4.f500i);
            File b10 = iVar4.f499h.a().b(this.f481j);
            this.f480i = b10;
            if (b10 != null) {
                this.f476e = gVar;
                this.f477f = this.f473b.f494c.f10802b.j(b10);
                this.f478g = 0;
            }
        }
    }

    @Override // ak.h
    public final void cancel() {
        ek.v vVar = this.f479h;
        if (vVar != null) {
            vVar.f15630c.cancel();
        }
    }

    @Override // yj.d
    public final void e(Exception exc) {
        this.f472a.a(this.f481j, exc, this.f479h.f15630c, xj.a.f40289d);
    }

    @Override // yj.d
    public final void j(Object obj) {
        this.f472a.d(this.f476e, obj, this.f479h.f15630c, xj.a.f40289d, this.f481j);
    }
}
