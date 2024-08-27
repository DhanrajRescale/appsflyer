package r5;

import android.content.Context;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class j implements v {

    /* renamed from: a, reason: collision with root package name */
    public final android.support.v4.media.d f33194a;

    /* renamed from: b, reason: collision with root package name */
    public final g5.e f33195b;

    /* renamed from: c, reason: collision with root package name */
    public kq.e f33196c;

    /* renamed from: d, reason: collision with root package name */
    public final long f33197d;

    /* renamed from: e, reason: collision with root package name */
    public final long f33198e;

    /* renamed from: f, reason: collision with root package name */
    public final long f33199f;

    /* renamed from: g, reason: collision with root package name */
    public final float f33200g;

    /* renamed from: h, reason: collision with root package name */
    public final float f33201h;

    /* JADX WARN: Type inference failed for: r2v1, types: [android.support.v4.media.d, java.lang.Object] */
    public j(Context context, z5.n nVar) {
        g5.j jVar = new g5.j(context);
        this.f33195b = jVar;
        ?? obj = new Object();
        obj.f809a = nVar;
        obj.f810b = new HashMap();
        obj.f811c = new HashSet();
        obj.f812d = new HashMap();
        this.f33194a = obj;
        if (jVar != ((g5.e) obj.f813e)) {
            obj.f813e = jVar;
            ((Map) obj.f810b).clear();
            ((Map) obj.f812d).clear();
        }
        this.f33197d = -9223372036854775807L;
        this.f33198e = -9223372036854775807L;
        this.f33199f = -9223372036854775807L;
        this.f33200g = -3.4028235E38f;
        this.f33201h = -3.4028235E38f;
    }

    public static v d(Class cls, g5.e eVar) {
        try {
            return (v) cls.getConstructor(g5.e.class).newInstance(eVar);
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0208  */
    /* JADX WARN: Type inference failed for: r13v2, types: [b5.y, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v16, types: [b5.z, b5.a0] */
    /* JADX WARN: Type inference failed for: r8v21, types: [b5.b0, java.lang.Object] */
    @Override // r5.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final r5.a a(b5.k0 r25) {
        /*
            Method dump skipped, instructions count: 528
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r5.j.a(b5.k0):r5.a");
    }

    @Override // r5.v
    public final v b(n5.h hVar) {
        if (hVar != null) {
            android.support.v4.media.d dVar = this.f33194a;
            dVar.f815g = hVar;
            Iterator it = ((Map) dVar.f812d).values().iterator();
            while (it.hasNext()) {
                ((v) it.next()).b(hVar);
            }
            return this;
        }
        throw new NullPointerException("MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
    }

    @Override // r5.v
    public final v c(kq.e eVar) {
        if (eVar != null) {
            this.f33196c = eVar;
            android.support.v4.media.d dVar = this.f33194a;
            dVar.f816h = eVar;
            Iterator it = ((Map) dVar.f812d).values().iterator();
            while (it.hasNext()) {
                ((v) it.next()).c(eVar);
            }
            return this;
        }
        throw new NullPointerException("MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
    }
}
