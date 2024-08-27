package com.appsflyer.internal;

import android.content.Context;
import android.util.Base64;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFd1dSDK;
import com.appsflyer.internal.AFd1fSDK;
import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import vt.g0;
import vt.v;
import vt.z;

/* loaded from: classes.dex */
public final class AFd1hSDK implements AFd1gSDK {

    @NotNull
    private final AFd1lSDK AFInAppEventParameterName;

    public AFd1hSDK(@NotNull AFd1lSDK aFd1lSDK) {
        Intrinsics.checkNotNullParameter(aFd1lSDK, "");
        this.AFInAppEventParameterName = aFd1lSDK;
    }

    private final File AFKeystoreWrapper() {
        Context context = this.AFInAppEventParameterName.AFKeystoreWrapper;
        if (context != null) {
            File file = new File(context.getFilesDir(), "AFExceptionsCache");
            if (!file.exists()) {
                file.mkdirs();
            }
            return file;
        }
        return null;
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    public final String AFInAppEventParameterName(@NotNull Throwable th2, @NotNull String str) {
        String str2;
        File file;
        AFd1fSDK valueOf;
        Intrinsics.checkNotNullParameter(th2, "");
        Intrinsics.checkNotNullParameter(str, "");
        synchronized (this) {
            File AFKeystoreWrapper = AFKeystoreWrapper();
            str2 = null;
            if (AFKeystoreWrapper != null) {
                file = new File(AFKeystoreWrapper, "6.14.0");
                if (!file.exists()) {
                    file.mkdirs();
                }
            } else {
                file = null;
            }
            if (file != null) {
                try {
                    Intrinsics.checkNotNullParameter(th2, "");
                    Intrinsics.checkNotNullParameter(str, "");
                    StringBuilder sb2 = new StringBuilder();
                    Intrinsics.checkNotNullParameter(th2, "");
                    String name = th2.getClass().getName();
                    Intrinsics.checkNotNullExpressionValue(name, "");
                    sb2.append(name);
                    sb2.append(": ");
                    sb2.append(str);
                    String obj = sb2.toString();
                    Intrinsics.checkNotNullParameter(th2, "");
                    Intrinsics.checkNotNullParameter(th2, "");
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(th2);
                    sb3.append('\n');
                    sb3.append(g0.B(AFd1dSDK.values(th2), "\n", null, null, AFd1dSDK.AnonymousClass5.AFInAppEventParameterName, 30));
                    String obj2 = sb3.toString();
                    Intrinsics.checkNotNullParameter(obj2, "");
                    AFd1fSDK aFd1fSDK = new AFd1fSDK(obj, AFe1vSDK.AFKeystoreWrapper(obj2, "SHA-256"), ut.c.b(th2), 0, 8, null);
                    String str3 = aFd1fSDK.AFKeystoreWrapper;
                    File file2 = new File(file, str3);
                    if (file2.exists() && (valueOf = AFd1fSDK.Companion.valueOf(fu.i.a(file2))) != null) {
                        valueOf.AFInAppEventParameterName++;
                        aFd1fSDK = valueOf;
                    }
                    StringBuilder sb4 = new StringBuilder("label=");
                    String str4 = aFd1fSDK.values;
                    Intrinsics.checkNotNullParameter(str4, "");
                    Charset charset = Charsets.UTF_8;
                    byte[] bytes = str4.getBytes(charset);
                    Intrinsics.checkNotNullExpressionValue(bytes, "");
                    sb4.append(Base64.encodeToString(bytes, 2));
                    sb4.append("\nhashName=");
                    String str5 = aFd1fSDK.AFKeystoreWrapper;
                    Intrinsics.checkNotNullParameter(str5, "");
                    byte[] bytes2 = str5.getBytes(charset);
                    Intrinsics.checkNotNullExpressionValue(bytes2, "");
                    sb4.append(Base64.encodeToString(bytes2, 2));
                    sb4.append("\nstackTrace=");
                    String str6 = aFd1fSDK.AFInAppEventType;
                    Intrinsics.checkNotNullParameter(str6, "");
                    byte[] bytes3 = str6.getBytes(charset);
                    Intrinsics.checkNotNullExpressionValue(bytes3, "");
                    sb4.append(Base64.encodeToString(bytes3, 2));
                    sb4.append("\nc=");
                    sb4.append(aFd1fSDK.AFInAppEventParameterName);
                    fu.i.b(file2, sb4.toString());
                    str2 = str3;
                } catch (Exception e10) {
                    AFLogger aFLogger = AFLogger.INSTANCE;
                    AFg1aSDK aFg1aSDK = AFg1aSDK.EXCEPTION_MANAGER;
                    StringBuilder sb5 = new StringBuilder("Could not cache exception\n ");
                    sb5.append(e10.getMessage());
                    AFg1fSDK.v$default(aFLogger, aFg1aSDK, sb5.toString(), false, 4, null);
                }
            }
        }
        return str2;
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    public final boolean AFInAppEventType() {
        return AFInAppEventType(new String[0]);
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    public final int values() {
        Iterator<T> it = AFInAppEventParameterName().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += ((AFd1fSDK) it.next()).AFInAppEventParameterName;
        }
        return i10;
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    public final boolean AFInAppEventType(@NotNull String... strArr) {
        boolean z10;
        Intrinsics.checkNotNullParameter(strArr, "");
        synchronized (this) {
            try {
                File AFKeystoreWrapper = AFKeystoreWrapper();
                z10 = true;
                if (AFKeystoreWrapper != null) {
                    if (strArr.length == 0) {
                        AFg1fSDK.v$default(AFLogger.INSTANCE, AFg1aSDK.EXCEPTION_MANAGER, "delete all exceptions", false, 4, null);
                        z10 = fu.k.d(AFKeystoreWrapper);
                    } else {
                        AFLogger aFLogger = AFLogger.INSTANCE;
                        AFg1aSDK aFg1aSDK = AFg1aSDK.EXCEPTION_MANAGER;
                        StringBuilder sb2 = new StringBuilder("delete all exceptions except for: ");
                        sb2.append(v.u(strArr, ", ", null, null, 62));
                        AFg1fSDK.v$default(aFLogger, aFg1aSDK, sb2.toString(), false, 4, null);
                        File[] listFiles = AFKeystoreWrapper.listFiles();
                        if (listFiles != null) {
                            Intrinsics.checkNotNullExpressionValue(listFiles, "");
                            ArrayList arrayList = new ArrayList();
                            for (File file : listFiles) {
                                if (!v.o(strArr, file.getName())) {
                                    arrayList.add(file);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList(z.k(arrayList));
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                File file2 = (File) it.next();
                                Intrinsics.checkNotNullExpressionValue(file2, "");
                                arrayList2.add(Boolean.valueOf(fu.k.d(file2)));
                            }
                            Set V = g0.V(arrayList2);
                            if (V.isEmpty()) {
                                V = Collections.singleton(Boolean.TRUE);
                                Intrinsics.checkNotNullExpressionValue(V, "singleton(...)");
                            }
                            Set set = V;
                            if (set.size() != 1 || !((Boolean) g0.t(set)).booleanValue()) {
                                z10 = false;
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    public final void AFInAppEventType(int i10, int i11) {
        File[] listFiles;
        synchronized (this) {
            try {
                File AFKeystoreWrapper = AFKeystoreWrapper();
                if (AFKeystoreWrapper != null && (listFiles = AFKeystoreWrapper.listFiles()) != null) {
                    Intrinsics.checkNotNullExpressionValue(listFiles, "");
                    ArrayList arrayList = new ArrayList();
                    for (File file : listFiles) {
                        String name = file.getName();
                        Intrinsics.checkNotNullExpressionValue(name, "");
                        int valueOf = AFc1rSDK.valueOf(name);
                        if (i10 > valueOf || valueOf > i11) {
                            arrayList.add(file);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(z.k(arrayList));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        File file2 = (File) it.next();
                        Intrinsics.checkNotNullExpressionValue(file2, "");
                        arrayList2.add(Boolean.valueOf(fu.k.d(file2)));
                    }
                }
                Unit unit = Unit.f23355a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0069 A[Catch: all -> 0x006d, TryCatch #1 {all -> 0x006d, blocks: (B:3:0x0001, B:5:0x0008, B:7:0x000e, B:9:0x0018, B:23:0x0069, B:25:0x006f, B:30:0x004a, B:32:0x0072, B:33:0x0080, B:35:0x0086, B:38:0x0092, B:11:0x001a, B:13:0x0020, B:15:0x002e, B:17:0x0041), top: B:2:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f A[SYNTHETIC] */
    @Override // com.appsflyer.internal.AFd1gSDK
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.appsflyer.internal.AFd1fSDK> AFInAppEventParameterName() {
        /*
            r13 = this;
            monitor-enter(r13)
            java.io.File r0 = r13.AFKeystoreWrapper()     // Catch: java.lang.Throwable -> L6d
            r1 = 0
            if (r0 == 0) goto L90
            java.io.File[] r0 = r0.listFiles()     // Catch: java.lang.Throwable -> L6d
            if (r0 == 0) goto L90
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L6d
            r2.<init>()     // Catch: java.lang.Throwable -> L6d
            int r3 = r0.length     // Catch: java.lang.Throwable -> L6d
            r4 = 0
            r5 = r4
        L16:
            if (r5 >= r3) goto L72
            r6 = r0[r5]     // Catch: java.lang.Throwable -> L6d
            java.io.File[] r6 = r6.listFiles()     // Catch: java.lang.Throwable -> L45
            if (r6 == 0) goto L66
            java.lang.String r7 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)     // Catch: java.lang.Throwable -> L45
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L45
            r7.<init>()     // Catch: java.lang.Throwable -> L45
            int r8 = r6.length     // Catch: java.lang.Throwable -> L45
            r9 = r4
        L2c:
            if (r9 >= r8) goto L67
            r10 = r6[r9]     // Catch: java.lang.Throwable -> L45
            com.appsflyer.internal.AFd1fSDK$AFa1vSDK r11 = com.appsflyer.internal.AFd1fSDK.INSTANCE     // Catch: java.lang.Throwable -> L45
            java.lang.String r11 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r11)     // Catch: java.lang.Throwable -> L45
            java.lang.String r10 = fu.i.a(r10)     // Catch: java.lang.Throwable -> L45
            com.appsflyer.internal.AFd1fSDK r10 = com.appsflyer.internal.AFd1fSDK.Companion.valueOf(r10)     // Catch: java.lang.Throwable -> L45
            if (r10 == 0) goto L47
            r7.add(r10)     // Catch: java.lang.Throwable -> L45
            goto L47
        L45:
            r6 = move-exception
            goto L4a
        L47:
            int r9 = r9 + 1
            goto L2c
        L4a:
            com.appsflyer.AFLogger r7 = com.appsflyer.AFLogger.INSTANCE     // Catch: java.lang.Throwable -> L6d
            com.appsflyer.internal.AFg1aSDK r8 = com.appsflyer.internal.AFg1aSDK.EXCEPTION_MANAGER     // Catch: java.lang.Throwable -> L6d
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6d
            java.lang.String r10 = "Could not get stored exceptions\n "
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r6 = r6.getMessage()     // Catch: java.lang.Throwable -> L6d
            r9.append(r6)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L6d
            r10 = 0
            r11 = 4
            r12 = 0
            com.appsflyer.internal.AFg1fSDK.v$default(r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L6d
        L66:
            r7 = r1
        L67:
            if (r7 == 0) goto L6f
            r2.add(r7)     // Catch: java.lang.Throwable -> L6d
            goto L6f
        L6d:
            r0 = move-exception
            goto L96
        L6f:
            int r5 = r5 + 1
            goto L16
        L72:
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)     // Catch: java.lang.Throwable -> L6d
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L6d
            r1.<init>()     // Catch: java.lang.Throwable -> L6d
            java.util.Iterator r0 = r2.iterator()     // Catch: java.lang.Throwable -> L6d
        L80:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L6d
            if (r2 == 0) goto L90
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L6d
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch: java.lang.Throwable -> L6d
            vt.d0.m(r2, r1)     // Catch: java.lang.Throwable -> L6d
            goto L80
        L90:
            if (r1 != 0) goto L94
            vt.i0 r1 = vt.i0.f38321a     // Catch: java.lang.Throwable -> L6d
        L94:
            monitor-exit(r13)
            return r1
        L96:
            monitor-exit(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1hSDK.AFInAppEventParameterName():java.util.List");
    }
}
