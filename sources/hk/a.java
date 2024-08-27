package hk;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.InputStream;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class a implements xj.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18513a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f18514b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f18515c;

    public /* synthetic */ a(int i10, Object obj, Object obj2) {
        this.f18513a = i10;
        this.f18514b = obj;
        this.f18515c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.io.InputStream] */
    @Override // xj.m
    public final ak.e0 a(Object obj, int i10, int i11, xj.k kVar) {
        boolean z10;
        v vVar;
        rk.d dVar;
        rk.d dVar2;
        switch (this.f18513a) {
            case 0:
                ak.e0 a10 = ((xj.m) this.f18514b).a(obj, i10, i11, kVar);
                Resources resources = (Resources) this.f18515c;
                if (a10 == null) {
                    return null;
                }
                return new c(resources, a10);
            case 1:
                ak.e0 c10 = ((ik.c) this.f18514b).c((Uri) obj);
                if (c10 == null) {
                    return null;
                }
                return p.a((bk.d) this.f18515c, (Drawable) ((ik.a) c10).get(), i10, i11);
            default:
                InputStream inputStream = (InputStream) obj;
                if (inputStream instanceof v) {
                    vVar = (v) inputStream;
                    z10 = false;
                } else {
                    z10 = true;
                    vVar = new v(inputStream, (bk.h) this.f18515c);
                }
                ArrayDeque arrayDeque = rk.d.f33935c;
                synchronized (arrayDeque) {
                    dVar = (rk.d) arrayDeque.poll();
                    dVar2 = dVar;
                }
                if (dVar == null) {
                    dVar2 = new InputStream();
                }
                rk.d dVar3 = dVar2;
                dVar3.f33936a = vVar;
                rk.h hVar = new rk.h(dVar3);
                da.d dVar4 = new da.d(vVar, dVar3, 15);
                try {
                    n nVar = (n) this.f18514b;
                    c a11 = nVar.a(new x9.c(nVar.f18555c, hVar, nVar.f18556d), i10, i11, kVar, dVar4);
                    dVar3.f33937b = null;
                    dVar3.f33936a = null;
                    synchronized (arrayDeque) {
                        arrayDeque.offer(dVar3);
                    }
                    if (z10) {
                        vVar.release();
                    }
                    return a11;
                } catch (Throwable th2) {
                    dVar3.f33937b = null;
                    dVar3.f33936a = null;
                    ArrayDeque arrayDeque2 = rk.d.f33935c;
                    synchronized (arrayDeque2) {
                        arrayDeque2.offer(dVar3);
                        if (z10) {
                            vVar.release();
                        }
                        throw th2;
                    }
                }
        }
    }

    @Override // xj.m
    public final boolean b(Object obj, xj.k kVar) {
        int i10 = this.f18513a;
        Object obj2 = this.f18514b;
        switch (i10) {
            case 0:
                return ((xj.m) obj2).b(obj, kVar);
            case 1:
                return "android.resource".equals(((Uri) obj).getScheme());
            default:
                ((n) obj2).getClass();
                return true;
        }
    }

    public a(Resources resources, xj.m mVar) {
        this.f18513a = 0;
        this.f18515c = resources;
        this.f18514b = mVar;
    }
}
