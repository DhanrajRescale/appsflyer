package com.bumptech.glide;

import ak.p;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import rk.k;
import y3.i;

/* loaded from: classes.dex */
public final class g extends nk.a {
    public final Context A;
    public final h B;
    public final Class C;
    public final d D;
    public a E;
    public Object F;
    public ArrayList G;
    public g H;
    public final boolean I = true;
    public boolean J;
    public boolean X;

    static {
    }

    public g(b bVar, h hVar, Class cls, Context context) {
        nk.e eVar;
        this.B = hVar;
        this.C = cls;
        this.A = context;
        Map map = hVar.f10820a.f10780c.f10806f;
        a aVar = (a) map.get(cls);
        if (aVar == null) {
            for (Map.Entry entry : map.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    aVar = (a) entry.getValue();
                }
            }
        }
        this.E = aVar == null ? d.f10800k : aVar;
        this.D = bVar.f10780c;
        Iterator it = hVar.f10829j.iterator();
        while (it.hasNext()) {
            nk.d dVar = (nk.d) it.next();
            if (dVar != null) {
                if (this.G == null) {
                    this.G = new ArrayList();
                }
                this.G.add(dVar);
            }
        }
        synchronized (hVar) {
            eVar = hVar.f10830k;
        }
        w(eVar);
    }

    public final void A(ok.g gVar) {
        B(gVar, this, rk.e.f33938a);
    }

    public final void B(ok.g gVar, nk.a aVar, i iVar) {
        al.d.V(gVar);
        if (this.J) {
            Object obj = new Object();
            nk.b x10 = x(aVar.f28777k, aVar.f28776j, this.E, aVar.f28770d, aVar, null, gVar, obj, iVar);
            nk.b g10 = gVar.g();
            if (x10.b(g10) && (aVar.f28775i || !g10.h())) {
                al.d.V(g10);
                if (!g10.isRunning()) {
                    g10.g();
                    return;
                }
                return;
            }
            this.B.k(gVar);
            gVar.e(x10);
            h hVar = this.B;
            synchronized (hVar) {
                hVar.f10825f.f24899a.add(gVar);
                i5.b bVar = hVar.f10823d;
                ((Set) bVar.f19359c).add(x10);
                if (!bVar.f19358b) {
                    x10.g();
                } else {
                    x10.clear();
                    if (Log.isLoggable("RequestTracker", 2)) {
                        Log.v("RequestTracker", "Paused, delaying request");
                    }
                    ((List) bVar.f19360d).add(x10);
                }
            }
            return;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    public final g C(Bitmap bitmap) {
        this.F = bitmap;
        this.J = true;
        return w((nk.e) new nk.a().f(p.f555a));
    }

    @Override // nk.a
    public final nk.a a(nk.a aVar) {
        al.d.V(aVar);
        return (g) super.a(aVar);
    }

    public final g w(nk.a aVar) {
        al.d.V(aVar);
        return (g) super.a(aVar);
    }

    public final nk.b x(int i10, int i11, a aVar, e eVar, nk.a aVar2, nk.h hVar, ok.g gVar, Object obj, i iVar) {
        a aVar3;
        e eVar2;
        int i12;
        int i13;
        g gVar2 = this.H;
        if (gVar2 != null) {
            if (!this.X) {
                a aVar4 = gVar2.E;
                if (gVar2.I) {
                    aVar3 = aVar;
                } else {
                    aVar3 = aVar4;
                }
                if (nk.a.h(gVar2.f28767a, 8)) {
                    eVar2 = this.H.f28770d;
                } else {
                    int ordinal = eVar.ordinal();
                    if (ordinal != 0 && ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal == 3) {
                                eVar2 = e.f10813c;
                            } else {
                                throw new IllegalArgumentException("unknown priority: " + this.f28770d);
                            }
                        } else {
                            eVar2 = e.f10812b;
                        }
                    } else {
                        eVar2 = e.f10811a;
                    }
                }
                e eVar3 = eVar2;
                g gVar3 = this.H;
                int i14 = gVar3.f28777k;
                int i15 = gVar3.f28776j;
                if (k.h(i10, i11)) {
                    g gVar4 = this.H;
                    if (!k.h(gVar4.f28777k, gVar4.f28776j)) {
                        i13 = aVar2.f28777k;
                        i12 = aVar2.f28776j;
                        nk.h hVar2 = new nk.h(obj, hVar);
                        Context context = this.A;
                        Object obj2 = this.F;
                        Class cls = this.C;
                        ArrayList arrayList = this.G;
                        d dVar = this.D;
                        nk.g gVar5 = new nk.g(context, dVar, obj, obj2, cls, aVar2, i10, i11, eVar, gVar, arrayList, hVar2, dVar.f10807g, aVar.f10775a, iVar);
                        this.X = true;
                        g gVar6 = this.H;
                        nk.b x10 = gVar6.x(i13, i12, aVar3, eVar3, gVar6, hVar2, gVar, obj, iVar);
                        this.X = false;
                        hVar2.f28821c = gVar5;
                        hVar2.f28822d = x10;
                        return hVar2;
                    }
                }
                i12 = i15;
                i13 = i14;
                nk.h hVar22 = new nk.h(obj, hVar);
                Context context2 = this.A;
                Object obj22 = this.F;
                Class cls2 = this.C;
                ArrayList arrayList2 = this.G;
                d dVar2 = this.D;
                nk.g gVar52 = new nk.g(context2, dVar2, obj, obj22, cls2, aVar2, i10, i11, eVar, gVar, arrayList2, hVar22, dVar2.f10807g, aVar.f10775a, iVar);
                this.X = true;
                g gVar62 = this.H;
                nk.b x102 = gVar62.x(i13, i12, aVar3, eVar3, gVar62, hVar22, gVar, obj, iVar);
                this.X = false;
                hVar22.f28821c = gVar52;
                hVar22.f28822d = x102;
                return hVar22;
            }
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        }
        Context context3 = this.A;
        Object obj3 = this.F;
        Class cls3 = this.C;
        ArrayList arrayList3 = this.G;
        d dVar3 = this.D;
        return new nk.g(context3, dVar3, obj, obj3, cls3, aVar2, i10, i11, eVar, gVar, arrayList3, hVar, dVar3.f10807g, aVar.f10775a, iVar);
    }

    @Override // nk.a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public final g clone() {
        g gVar = (g) super.clone();
        gVar.E = gVar.E.clone();
        return gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0093  */
    /* JADX WARN: Type inference failed for: r3v1, types: [hk.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [hk.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [hk.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [hk.d, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z(android.widget.ImageView r5) {
        /*
            r4 = this;
            char[] r0 = rk.k.f33950a
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r0 != r1) goto Lc0
            al.d.V(r5)
            int r0 = r4.f28767a
            r1 = 2048(0x800, float:2.87E-42)
            boolean r0 = nk.a.h(r0, r1)
            r1 = 1
            if (r0 != 0) goto L7a
            boolean r0 = r4.f28780n
            if (r0 == 0) goto L7a
            android.widget.ImageView$ScaleType r0 = r5.getScaleType()
            if (r0 == 0) goto L7a
            int[] r0 = com.bumptech.glide.f.f10816a
            android.widget.ImageView$ScaleType r2 = r5.getScaleType()
            int r2 = r2.ordinal()
            r0 = r0[r2]
            switch(r0) {
                case 1: goto L6a;
                case 2: goto L58;
                case 3: goto L46;
                case 4: goto L46;
                case 5: goto L46;
                case 6: goto L34;
                default: goto L33;
            }
        L33:
            goto L7a
        L34:
            com.bumptech.glide.g r0 = r4.clone()
            hk.k r2 = hk.l.f18541b
            hk.g r3 = new hk.g
            r3.<init>()
            nk.a r0 = r0.j(r2, r3)
            r0.f28791y = r1
            goto L7b
        L46:
            com.bumptech.glide.g r0 = r4.clone()
            hk.k r2 = hk.l.f18540a
            hk.s r3 = new hk.s
            r3.<init>()
            nk.a r0 = r0.j(r2, r3)
            r0.f28791y = r1
            goto L7b
        L58:
            com.bumptech.glide.g r0 = r4.clone()
            hk.k r2 = hk.l.f18541b
            hk.g r3 = new hk.g
            r3.<init>()
            nk.a r0 = r0.j(r2, r3)
            r0.f28791y = r1
            goto L7b
        L6a:
            com.bumptech.glide.g r0 = r4.clone()
            hk.k r2 = hk.l.f18542c
            hk.f r3 = new hk.f
            r3.<init>()
            nk.a r0 = r0.j(r2, r3)
            goto L7b
        L7a:
            r0 = r4
        L7b:
            com.bumptech.glide.d r2 = r4.D
            ek.e r2 = r2.f10803c
            r2.getClass()
            java.lang.Class<android.graphics.Bitmap> r2 = android.graphics.Bitmap.class
            java.lang.Class r3 = r4.C
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L93
            ok.b r1 = new ok.b
            r2 = 0
            r1.<init>(r5, r2)
            goto La1
        L93:
            java.lang.Class<android.graphics.drawable.Drawable> r2 = android.graphics.drawable.Drawable.class
            boolean r2 = r2.isAssignableFrom(r3)
            if (r2 == 0) goto La7
            ok.b r2 = new ok.b
            r2.<init>(r5, r1)
            r1 = r2
        La1:
            y3.i r5 = rk.e.f33938a
            r4.B(r1, r0, r5)
            return
        La7:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unhandled class: "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r1 = ", try .as*(Class).transcode(ResourceTranscoder)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        Lc0:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "You must call this method on the main thread"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.g.z(android.widget.ImageView):void");
    }
}
