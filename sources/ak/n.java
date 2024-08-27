package ak;

import android.util.Log;
import com.airbnb.deeplinkdispatch.UrlTreeKt;
import com.bumptech.glide.load.engine.GlideException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final Class f549a;

    /* renamed from: b, reason: collision with root package name */
    public final List f550b;

    /* renamed from: c, reason: collision with root package name */
    public final kk.a f551c;

    /* renamed from: d, reason: collision with root package name */
    public final c4.e f552d;

    /* renamed from: e, reason: collision with root package name */
    public final String f553e;

    public n(Class cls, Class cls2, Class cls3, List list, kk.a aVar, c4.e eVar) {
        this.f549a = cls;
        this.f550b = list;
        this.f551c = aVar;
        this.f552d = eVar;
        this.f553e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + UrlTreeKt.componentParamSuffix;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c0, code lost:
    
        if (r0 == xj.a.f40288c) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c7, code lost:
    
        if (r1 != 2) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d0, code lost:
    
        if (r5 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d2, code lost:
    
        r0 = w.k.e(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d6, code lost:
    
        if (r0 == 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d8, code lost:
    
        if (r0 != 1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00da, code lost:
    
        r4 = true;
        r1 = new ak.g0(r4.f494c.f10801a, r2.f544v, r2.f531i, r2.f534l, r2.f535m, r14, r15, r2.f537o);
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0114, code lost:
    
        r3 = (ak.d0) ak.d0.f456e.c();
        al.d.V(r3);
        r3.f460d = r0;
        r3.f459c = r4;
        r3.f458b = r6;
        r0 = r2.f528f;
        r0.f517a = r1;
        r0.f518b = r5;
        r0.f519c = r3;
        r6 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0108, code lost:
    
        throw new java.lang.IllegalArgumentException("Unknown strategy: ".concat(v.e.C(r1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0109, code lost:
    
        r4 = true;
        r0 = false;
        r1 = new ak.f(r2.f544v, r2.f531i);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x012f, code lost:
    
        r1 = r6.get().getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x013c, code lost:
    
        throw new com.bumptech.glide.Registry$NoResultEncoderAvailableException(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c4, code lost:
    
        if (r0 == xj.a.f40286a) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ce, code lost:
    
        if (r0 != xj.a.f40290e) goto L40;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x00b9. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ak.e0 a(int r19, int r20, da.d r21, xj.k r22, yj.g r23) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ak.n.a(int, int, da.d, xj.k, yj.g):ak.e0");
    }

    public final e0 b(yj.g gVar, int i10, int i11, xj.k kVar, List list) {
        List list2 = this.f550b;
        int size = list2.size();
        e0 e0Var = null;
        for (int i12 = 0; i12 < size; i12++) {
            xj.m mVar = (xj.m) list2.get(i12);
            try {
                if (mVar.b(gVar.l(), kVar)) {
                    e0Var = mVar.a(gVar.l(), i10, i11, kVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e10) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + mVar, e10);
                }
                list.add(e10);
            }
            if (e0Var != null) {
                break;
            }
        }
        if (e0Var != null) {
            return e0Var;
        }
        throw new GlideException(this.f553e, new ArrayList(list));
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.f549a + ", decoders=" + this.f550b + ", transcoder=" + this.f551c + UrlTreeKt.componentParamSuffixChar;
    }
}
