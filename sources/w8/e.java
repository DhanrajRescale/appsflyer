package w8;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import n8.o;
import vt.p0;
import y8.p;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final n8.i f38858a;

    /* renamed from: b, reason: collision with root package name */
    public final h.c f38859b;

    public e(n8.i iVar, h.c cVar) {
        this.f38858a = iVar;
        this.f38859b = cVar;
    }

    public static p c(t8.l lVar, y8.j jVar, c cVar, d dVar) {
        String str;
        boolean z10;
        boolean z11;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(jVar.f41362a.getResources(), dVar.f38856a);
        p8.f fVar = p8.f.f30738a;
        Map map = dVar.f38857b;
        Object obj = map.get("coil#disk_cache_key");
        Boolean bool = null;
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        Object obj2 = map.get("coil#is_sampled");
        if (obj2 instanceof Boolean) {
            bool = (Boolean) obj2;
        }
        if (bool != null) {
            z10 = bool.booleanValue();
        } else {
            z10 = false;
        }
        Bitmap.Config[] configArr = d9.e.f14221a;
        if ((lVar instanceof t8.l) && lVar.f35626g) {
            z11 = true;
        } else {
            z11 = false;
        }
        return new p(bitmapDrawable, jVar, fVar, cVar, str, z10, z11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006d, code lost:
    
        if (r7 != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0071, code lost:
    
        r16 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0089, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.a(r2, r20.toString()) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00de, code lost:
    
        if (java.lang.Math.abs(r3 - (r10 * r4)) > 1.0d) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0103, code lost:
    
        if (r12 != 1.0d) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0106, code lost:
    
        if (r1 != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x010b, code lost:
    
        if (r12 <= 1.0d) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x010d, code lost:
    
        if (r7 == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f2, code lost:
    
        if (java.lang.Math.abs(r9 - r2) > 1) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00fe, code lost:
    
        if (java.lang.Math.abs(r3 - r4) > 1) goto L71;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final w8.d a(y8.j r18, w8.c r19, z8.g r20, z8.f r21) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w8.e.a(y8.j, w8.c, z8.g, z8.f):w8.d");
    }

    public final c b(y8.j jVar, Object obj, y8.m mVar, n8.e eVar) {
        String str;
        Map map;
        c cVar = jVar.f41366e;
        if (cVar != null) {
            return cVar;
        }
        List list = ((o) this.f38858a).f28401f.f28366c;
        int size = list.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                Pair pair = (Pair) list.get(i10);
                u8.b bVar = (u8.b) pair.f23353a;
                if (((Class) pair.f23354b).isAssignableFrom(obj.getClass())) {
                    Intrinsics.d(bVar, "null cannot be cast to non-null type coil.key.Keyer<kotlin.Any>");
                    str = bVar.a(obj, mVar);
                    if (str != null) {
                        break;
                    }
                }
                i10++;
            } else {
                str = null;
                break;
            }
        }
        if (str == null) {
            return null;
        }
        Map map2 = jVar.D.f41405a;
        if (map2.isEmpty()) {
            map = p0.d();
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = map2.entrySet().iterator();
            if (!it.hasNext()) {
                map = linkedHashMap;
            } else {
                a3.a.u(((Map.Entry) it.next()).getValue());
                throw null;
            }
        }
        List list2 = jVar.f41373l;
        if (list2.isEmpty() && map.isEmpty()) {
            return new c(str);
        }
        LinkedHashMap m10 = p0.m(map);
        if (!list2.isEmpty()) {
            int size2 = list2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                m10.put(jr.h.n("coil#transformation_", i11), ((b9.a) list2.get(i11)).f4146a);
            }
            m10.put("coil#transformation_size", mVar.f41392d.toString());
        }
        return new c(str, m10);
    }
}
