package fl;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import ut.g;
import ut.h;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f16171b;

    /* renamed from: d, reason: collision with root package name */
    public static HashSet f16173d;

    /* renamed from: a, reason: collision with root package name */
    public static final d f16170a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final g f16172c = h.a(c.f16169a);

    public static final void b(Bundle bundle) {
        if (sl.a.b(d.class)) {
            return;
        }
        try {
            if (f16171b && bundle != null && !bundle.isEmpty() && f16173d != null) {
                ArrayList arrayList = new ArrayList();
                Set<String> keySet = bundle.keySet();
                Intrinsics.checkNotNullExpressionValue(keySet, "parameters.keySet()");
                for (String param : keySet) {
                    HashSet hashSet = f16173d;
                    Intrinsics.c(hashSet);
                    if (!hashSet.contains(param)) {
                        Intrinsics.checkNotNullExpressionValue(param, "param");
                        arrayList.add(param);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    bundle.remove((String) it.next());
                }
                bundle.putString("pm", "1");
            }
        } catch (Throwable th2) {
            sl.a.a(d.class, th2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004e A[Catch: all -> 0x0067, TRY_LEAVE, TryCatch #1 {all -> 0x0067, blocks: (B:6:0x0007, B:9:0x0015, B:14:0x004e, B:22:0x0060, B:23:0x0064, B:39:0x0048, B:28:0x0022, B:31:0x0029, B:33:0x0034, B:18:0x0055), top: B:5:0x0007, inners: #0, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            r7 = this;
            boolean r0 = sl.a.b(r7)
            if (r0 == 0) goto L7
            return
        L7:
            nl.a0 r0 = nl.a0.f28827a     // Catch: java.lang.Throwable -> L67
            java.lang.String r0 = com.facebook.FacebookSdk.getApplicationId()     // Catch: java.lang.Throwable -> L67
            r1 = 0
            nl.y r0 = nl.a0.h(r0, r1)     // Catch: java.lang.Throwable -> L67
            if (r0 != 0) goto L15
            return
        L15:
            org.json.JSONArray r0 = r0.f28978m     // Catch: java.lang.Throwable -> L67
            boolean r2 = sl.a.b(r7)     // Catch: java.lang.Throwable -> L67
            r3 = 0
            if (r2 == 0) goto L20
        L1e:
            r2 = r3
            goto L4c
        L20:
            if (r0 == 0) goto L1e
            int r2 = r0.length()     // Catch: java.lang.Throwable -> L47
            if (r2 != 0) goto L29
            goto L1e
        L29:
            java.util.HashSet r2 = new java.util.HashSet     // Catch: java.lang.Throwable -> L47
            r2.<init>()     // Catch: java.lang.Throwable -> L47
            int r4 = r0.length()     // Catch: java.lang.Throwable -> L47
            if (r4 <= 0) goto L4c
        L34:
            int r5 = r1 + 1
            java.lang.String r1 = r0.getString(r1)     // Catch: java.lang.Throwable -> L47
            java.lang.String r6 = "jsonArray.getString(i)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r6)     // Catch: java.lang.Throwable -> L47
            r2.add(r1)     // Catch: java.lang.Throwable -> L47
            if (r5 < r4) goto L45
            goto L4c
        L45:
            r1 = r5
            goto L34
        L47:
            r0 = move-exception
            sl.a.a(r7, r0)     // Catch: java.lang.Throwable -> L67
            goto L1e
        L4c:
            if (r2 != 0) goto L64
            boolean r0 = sl.a.b(r7)     // Catch: java.lang.Throwable -> L67
            if (r0 == 0) goto L55
            goto L63
        L55:
            ut.g r0 = fl.d.f16172c     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L5f
            java.util.HashSet r0 = (java.util.HashSet) r0     // Catch: java.lang.Throwable -> L5f
            r3 = r0
            goto L63
        L5f:
            r0 = move-exception
            sl.a.a(r7, r0)     // Catch: java.lang.Throwable -> L67
        L63:
            r2 = r3
        L64:
            fl.d.f16173d = r2     // Catch: java.lang.Throwable -> L67
            return
        L67:
            r0 = move-exception
            sl.a.a(r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fl.d.a():void");
    }
}
