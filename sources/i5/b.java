package i5;

import android.content.Context;
import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import com.airbnb.deeplinkdispatch.UrlTreeKt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class b implements o5.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19357a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f19358b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f19359c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f19360d;

    public b() {
        this.f19357a = 2;
        this.f19359c = Collections.newSetFromMap(new WeakHashMap());
        this.f19360d = new ArrayList();
    }

    public final boolean b(nk.b bVar) {
        boolean z10 = true;
        if (bVar == null) {
            return true;
        }
        boolean remove = ((Set) this.f19359c).remove(bVar);
        if (!((List) this.f19360d).remove(bVar) && !remove) {
            z10 = false;
        }
        if (z10) {
            bVar.clear();
        }
        return z10;
    }

    @Override // o5.j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final o5.c a(o5.i iVar) {
        MediaCodec mediaCodec;
        String str = iVar.f29625a.f29630a;
        o5.c cVar = null;
        try {
            e5.a.a("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                o5.c cVar2 = new o5.c(mediaCodec, (HandlerThread) ((kp.n) this.f19359c).get(), (HandlerThread) ((kp.n) this.f19360d).get(), this.f19358b);
                try {
                    e5.a.i();
                    o5.c.o(cVar2, iVar.f29626b, iVar.f29628d, iVar.f29629e);
                    return cVar2;
                } catch (Exception e10) {
                    e = e10;
                    cVar = cVar2;
                    if (cVar == null) {
                        if (mediaCodec != null) {
                            mediaCodec.release();
                        }
                    } else {
                        cVar.release();
                    }
                    throw e;
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Exception e12) {
            e = e12;
            mediaCodec = null;
        }
    }

    public final void d() {
        Iterator it = rk.k.d((Set) this.f19359c).iterator();
        while (it.hasNext()) {
            nk.b bVar = (nk.b) it.next();
            if (!bVar.h() && !bVar.f()) {
                bVar.clear();
                if (!this.f19358b) {
                    bVar.g();
                } else {
                    ((List) this.f19360d).add(bVar);
                }
            }
        }
    }

    public final void e() {
        this.f19358b = false;
        Iterator it = rk.k.d((Set) this.f19359c).iterator();
        while (it.hasNext()) {
            nk.b bVar = (nk.b) it.next();
            if (!bVar.h() && !bVar.isRunning()) {
                bVar.g();
            }
        }
        ((List) this.f19360d).clear();
    }

    public final void f(boolean z10) {
        if (this.f19358b) {
            ((Context) this.f19359c).unregisterReceiver((a) this.f19360d);
            this.f19358b = false;
        }
    }

    public final String toString() {
        switch (this.f19357a) {
            case 2:
                StringBuilder sb2 = new StringBuilder();
                sb2.append(super.toString());
                sb2.append("{numRequests=");
                sb2.append(((Set) this.f19359c).size());
                sb2.append(", isPaused=");
                return da.e.o(sb2, this.f19358b, UrlTreeKt.componentParamSuffix);
            default:
                return super.toString();
        }
    }

    public b(Context context, Handler handler, d0 d0Var) {
        this.f19357a = 0;
        this.f19359c = context.getApplicationContext();
        this.f19360d = new a(this, handler, d0Var);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r1v0, types: [o5.b] */
    /* JADX WARN: Type inference failed for: r2v1, types: [o5.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b(final int r4, boolean r5) {
        /*
            r3 = this;
            r0 = 1
            r3.f19357a = r0
            o5.b r1 = new o5.b
            r2 = 0
            r1.<init>()
            o5.b r2 = new o5.b
            r2.<init>()
            r3.<init>(r1, r2, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.b.<init>(int, boolean):void");
    }

    public b(o5.b bVar, o5.b bVar2, boolean z10) {
        this.f19357a = 1;
        this.f19359c = bVar;
        this.f19360d = bVar2;
        this.f19358b = z10;
    }
}
