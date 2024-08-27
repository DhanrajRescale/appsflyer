package el;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15649a;

    /* renamed from: b, reason: collision with root package name */
    public final Runnable f15650b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f15651c;

    public f(g this$0, Runnable runnable, int i10) {
        this.f15649a = i10;
        if (i10 != 1) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            this.f15651c = this$0;
            this.f15650b = runnable;
            return;
        }
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.f15651c = this$0;
        this.f15650b = runnable;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0047 A[Catch: Exception -> 0x000f, all -> 0x004a, TryCatch #1 {Exception -> 0x000f, blocks: (B:11:0x0019, B:17:0x002c, B:20:0x003c, B:22:0x0047, B:25:0x0050, B:28:0x0065, B:31:0x0074, B:40:0x0083, B:33:0x0086, B:46:0x0061, B:55:0x0038, B:60:0x0028), top: B:10:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x000f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x004f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0034 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.util.List r9) {
        /*
            r8 = this;
            java.lang.String r0 = "productId"
            java.lang.Class<el.g> r1 = el.g.class
            boolean r2 = sl.a.b(r8)
            if (r2 == 0) goto Lb
            return
        Lb:
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L4a
        Lf:
            boolean r2 = r9.hasNext()     // Catch: java.lang.Throwable -> L4a
            if (r2 == 0) goto L99
            java.lang.Object r2 = r9.next()     // Catch: java.lang.Throwable -> L4a
            boolean r3 = sl.a.b(r1)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            el.g r4 = r8.f15651c
            r5 = 0
            if (r3 == 0) goto L24
        L22:
            r3 = r5
            goto L2c
        L24:
            java.lang.Class r3 = r4.f15664g     // Catch: java.lang.Throwable -> L27
            goto L2c
        L27:
            r3 = move-exception
            sl.a.a(r1, r3)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            goto L22
        L2c:
            boolean r6 = sl.a.b(r1)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            if (r6 == 0) goto L34
        L32:
            r6 = r5
            goto L3c
        L34:
            java.lang.reflect.Method r6 = r4.f15671n     // Catch: java.lang.Throwable -> L37
            goto L3c
        L37:
            r6 = move-exception
            sl.a.a(r1, r6)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            goto L32
        L3c:
            r7 = 0
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            java.lang.Object r2 = el.l.n0(r3, r2, r6, r7)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            boolean r3 = r2 instanceof java.lang.String     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            if (r3 == 0) goto L4c
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            goto L4d
        L4a:
            r9 = move-exception
            goto L9f
        L4c:
            r2 = r5
        L4d:
            if (r2 != 0) goto L50
            goto Lf
        L50:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            r3.<init>(r2)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            boolean r2 = sl.a.b(r1)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            if (r2 == 0) goto L5d
        L5b:
            r2 = r5
            goto L65
        L5d:
            android.content.Context r2 = r4.f15658a     // Catch: java.lang.Throwable -> L60
            goto L65
        L60:
            r2 = move-exception
            sl.a.a(r1, r2)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            goto L5b
        L65:
            java.lang.String r2 = r2.getPackageName()     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            java.lang.String r6 = "packageName"
            r3.put(r6, r2)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            boolean r2 = r3.has(r0)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            if (r2 == 0) goto Lf
            java.lang.String r2 = r3.getString(r0)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            boolean r6 = sl.a.b(r1)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            if (r6 == 0) goto L7f
            goto L86
        L7f:
            java.util.concurrent.CopyOnWriteArraySet r5 = r4.f15675r     // Catch: java.lang.Throwable -> L82
            goto L86
        L82:
            r4 = move-exception
            sl.a.a(r1, r4)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
        L86:
            r5.add(r2)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            ek.h r4 = el.g.f15652s     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            java.util.concurrent.ConcurrentHashMap r4 = ek.h.w()     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            java.lang.String r5 = "skuID"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            r4.put(r2, r3)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            goto Lf
        L99:
            java.lang.Runnable r9 = r8.f15650b     // Catch: java.lang.Throwable -> L4a
            r9.run()     // Catch: java.lang.Throwable -> L4a
            return
        L9f:
            sl.a.a(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: el.f.a(java.util.List):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004c A[Catch: Exception -> 0x0014, all -> 0x004f, TryCatch #3 {Exception -> 0x0014, blocks: (B:11:0x001e, B:17:0x0031, B:20:0x0041, B:22:0x004c, B:25:0x0055, B:28:0x0060, B:37:0x0071, B:30:0x0074, B:47:0x003d, B:52:0x002d), top: B:10:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0055 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0054 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0039 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.util.List r8) {
        /*
            r7 = this;
            java.lang.String r0 = "productId"
            java.lang.Class<el.g> r1 = el.g.class
            boolean r2 = sl.a.b(r7)
            if (r2 == 0) goto Lb
            return
        Lb:
            java.lang.String r2 = "skuDetailsObjectList"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r2)     // Catch: java.lang.Throwable -> L4f
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L4f
        L14:
            boolean r2 = r8.hasNext()     // Catch: java.lang.Throwable -> L4f
            if (r2 == 0) goto L7d
            java.lang.Object r2 = r8.next()     // Catch: java.lang.Throwable -> L4f
            boolean r3 = sl.a.b(r1)     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L4f
            r4 = 0
            el.g r5 = r7.f15651c
            if (r3 == 0) goto L29
        L27:
            r3 = r4
            goto L31
        L29:
            java.lang.Class r3 = r5.f15663f     // Catch: java.lang.Throwable -> L2c
            goto L31
        L2c:
            r3 = move-exception
            sl.a.a(r1, r3)     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L4f
            goto L27
        L31:
            boolean r6 = sl.a.b(r1)     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L4f
            if (r6 == 0) goto L39
        L37:
            r5 = r4
            goto L41
        L39:
            java.lang.reflect.Method r5 = r5.f15670m     // Catch: java.lang.Throwable -> L3c
            goto L41
        L3c:
            r5 = move-exception
            sl.a.a(r1, r5)     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L4f
            goto L37
        L41:
            r6 = 0
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L4f
            java.lang.Object r2 = el.l.n0(r3, r2, r5, r6)     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L4f
            boolean r3 = r2 instanceof java.lang.String     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L4f
            if (r3 == 0) goto L51
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L4f
            goto L52
        L4f:
            r8 = move-exception
            goto L83
        L51:
            r2 = r4
        L52:
            if (r2 != 0) goto L55
            goto L14
        L55:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L4f
            r3.<init>(r2)     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L4f
            boolean r2 = r3.has(r0)     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L4f
            if (r2 == 0) goto L14
            java.lang.String r2 = r3.getString(r0)     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L4f
            ek.h r5 = el.g.f15652s     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L4f
            boolean r5 = sl.a.b(r1)     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L4f
            if (r5 == 0) goto L6d
            goto L74
        L6d:
            java.util.concurrent.ConcurrentHashMap r4 = el.g.f15657x     // Catch: java.lang.Throwable -> L70
            goto L74
        L70:
            r5 = move-exception
            sl.a.a(r1, r5)     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L4f
        L74:
            java.lang.String r5 = "skuID"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L4f
            r4.put(r2, r3)     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L4f
            goto L14
        L7d:
            java.lang.Runnable r8 = r7.f15650b     // Catch: java.lang.Throwable -> L4f
            r8.run()     // Catch: java.lang.Throwable -> L4f
            return
        L83:
            sl.a.a(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: el.f.b(java.util.List):void");
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object proxy, Method method, Object[] objArr) {
        Object obj;
        Object obj2;
        switch (this.f15649a) {
            case 0:
                if (!sl.a.b(this)) {
                    try {
                        Intrinsics.checkNotNullParameter(proxy, "proxy");
                        Intrinsics.checkNotNullParameter(method, "method");
                        if (Intrinsics.a(method.getName(), "onPurchaseHistoryResponse")) {
                            if (objArr == null) {
                                obj = null;
                            } else {
                                obj = objArr[1];
                            }
                            if (obj != null && (obj instanceof List)) {
                                a((List) obj);
                            }
                        }
                    } catch (Throwable th2) {
                        sl.a.a(this, th2);
                    }
                }
                return null;
            default:
                if (!sl.a.b(this)) {
                    try {
                        Intrinsics.checkNotNullParameter(proxy, "proxy");
                        Intrinsics.checkNotNullParameter(method, "m");
                        if (Intrinsics.a(method.getName(), "onSkuDetailsResponse")) {
                            if (objArr == null) {
                                obj2 = null;
                            } else {
                                obj2 = objArr[1];
                            }
                            if (obj2 != null && (obj2 instanceof List)) {
                                b((List) obj2);
                            }
                        }
                    } catch (Throwable th3) {
                        sl.a.a(this, th3);
                    }
                }
                return null;
        }
    }
}
