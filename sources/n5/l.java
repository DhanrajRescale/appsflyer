package n5;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final int f28314a;

    /* renamed from: b, reason: collision with root package name */
    public final r5.w f28315b;

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f28316c;

    public l(CopyOnWriteArrayList copyOnWriteArrayList, int i10, r5.w wVar) {
        this.f28316c = copyOnWriteArrayList;
        this.f28314a = i10;
        this.f28315b = wVar;
    }

    public final void a() {
        Iterator it = this.f28316c.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            e5.x.J(kVar.f28312a, new j(this, kVar.f28313b, 3));
        }
    }

    public final void b() {
        Iterator it = this.f28316c.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            e5.x.J(kVar.f28312a, new j(this, kVar.f28313b, 2));
        }
    }

    public final void c() {
        Iterator it = this.f28316c.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            e5.x.J(kVar.f28312a, new j(this, kVar.f28313b, 1));
        }
    }

    public final void d(int i10) {
        Iterator it = this.f28316c.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            e5.x.J(kVar.f28312a, new defpackage.a(this, kVar.f28313b, i10, 3));
        }
    }

    public final void e(Exception exc) {
        Iterator it = this.f28316c.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            e5.x.J(kVar.f28312a, new androidx.fragment.app.e(6, this, kVar.f28313b, exc));
        }
    }

    public final void f() {
        Iterator it = this.f28316c.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            e5.x.J(kVar.f28312a, new j(this, kVar.f28313b, 0));
        }
    }
}
