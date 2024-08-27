package com.appsflyer.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFi1jSDK extends AFi1rSDK {

    @NotNull
    private final AFd1sSDK AFInAppEventType;

    @NotNull
    private final Runnable AFLogger;

    /* renamed from: i */
    private String f8509i;

    @NotNull
    private final AFi1fSDK registerClient;

    @NotNull
    private final ExecutorService valueOf;

    /* loaded from: classes.dex */
    public /* synthetic */ class AFa1uSDK {
        public static final /* synthetic */ int[] values;

        static {
            int[] iArr = new int[AFi1fSDK.values().length];
            iArr[AFi1fSDK.FACEBOOK.ordinal()] = 1;
            iArr[AFi1fSDK.INSTAGRAM.ordinal()] = 2;
            values = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AFi1jSDK(@org.jetbrains.annotations.NotNull com.appsflyer.internal.AFd1sSDK r3, @org.jetbrains.annotations.NotNull java.util.concurrent.ExecutorService r4, @org.jetbrains.annotations.NotNull com.appsflyer.internal.AFi1fSDK r5, @org.jetbrains.annotations.NotNull java.lang.Runnable r6, @org.jetbrains.annotations.NotNull java.lang.Runnable r7) {
        /*
            r2 = this;
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            int[] r0 = com.appsflyer.internal.AFi1gSDK.AFa1vSDK.AFInAppEventType
            int r1 = r5.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L28
            r1 = 2
            if (r0 != r1) goto L22
            java.lang.String r0 = "instagram"
            goto L2a
        L22:
            kotlin.NoWhenBranchMatchedException r3 = new kotlin.NoWhenBranchMatchedException
            r3.<init>()
            throw r3
        L28:
            java.lang.String r0 = "facebook"
        L2a:
            java.lang.String r1 = "app"
            r2.<init>(r1, r0, r3, r6)
            r2.AFInAppEventType = r3
            r2.valueOf = r4
            r2.registerClient = r5
            r2.AFLogger = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFi1jSDK.<init>(com.appsflyer.internal.AFd1sSDK, java.util.concurrent.ExecutorService, com.appsflyer.internal.AFi1fSDK, java.lang.Runnable, java.lang.Runnable):void");
    }

    private final boolean AFInAppEventParameterName(Context context) {
        int i10 = AFa1uSDK.values[this.registerClient.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return valueOf(context);
            }
            throw new NoWhenBranchMatchedException();
        }
        return AFKeystoreWrapper(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        if (r0 == null) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean AFInAppEventType(android.content.Context r5) {
        /*
            r4 = this;
            boolean r0 = r4.valueOf()
            r1 = 0
            if (r0 != 0) goto Ld
            java.lang.String r5 = "[MetaReferrer]: Referrer collection disallowed by counter."
            com.appsflyer.AFLogger.afDebugLog(r5)
            return r1
        Ld:
            com.appsflyer.internal.AFd1sSDK r0 = r4.AFInAppEventType
            java.lang.String r2 = "com.facebook.sdk.ApplicationId"
            java.lang.String r0 = r0.AFInAppEventType(r2)
            r2 = 0
            if (r0 == 0) goto L1e
            int r3 = r0.length()
            if (r3 != 0) goto L24
        L1e:
            java.lang.String r0 = "[MetaReferrer]: Facebook app id Manifest metadata is not found."
            com.appsflyer.AFLogger.afDebugLog(r0)
            r0 = r2
        L24:
            if (r0 != 0) goto L57
            com.appsflyer.internal.AFd1sSDK r0 = r4.AFInAppEventType
            java.lang.String r3 = "facebook_application_id"
            java.lang.String r0 = r0.AFKeystoreWrapper(r3)
            if (r0 == 0) goto L36
            int r3 = r0.length()
            if (r3 != 0) goto L3c
        L36:
            java.lang.String r0 = "[MetaReferrer]: Facebook app id string resource is not found."
            com.appsflyer.AFLogger.afDebugLog(r0)
            r0 = r2
        L3c:
            if (r0 != 0) goto L57
            com.appsflyer.internal.AFd1sSDK r0 = r4.AFInAppEventType
            java.lang.String r3 = "com.appsflyer.FacebookApplicationId"
            java.lang.String r0 = r0.AFInAppEventType(r3)
            if (r0 == 0) goto L4e
            int r3 = r0.length()
            if (r3 != 0) goto L54
        L4e:
            java.lang.String r0 = "[MetaReferrer]: AF Facebook app id Manifest metadata is not found."
            com.appsflyer.AFLogger.afDebugLog(r0)
            r0 = r2
        L54:
            if (r0 != 0) goto L57
            goto L58
        L57:
            r2 = r0
        L58:
            r4.f8509i = r2
            if (r2 != 0) goto L62
            java.lang.String r5 = "[MetaReferrer]: Referrer collection disallowed by missing Facebook app id."
            com.appsflyer.AFLogger.afDebugLog(r5)
            return r1
        L62:
            boolean r5 = r4.AFInAppEventParameterName(r5)
            if (r5 != 0) goto L6e
            java.lang.String r5 = "[MetaReferrer]: Referrer collection disallowed by missing content providers."
            com.appsflyer.AFLogger.afDebugLog(r5)
            return r1
        L6e:
            r5 = 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFi1jSDK.AFInAppEventType(android.content.Context):boolean");
    }

    private static boolean AFKeystoreWrapper(Context context) {
        return context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.InstallReferrerProvider", 0) != null;
    }

    private static boolean valueOf(Context context) {
        if (context.getPackageManager().resolveContentProvider("com.instagram.contentprovider.InstallReferrerProvider", 0) == null) {
            return false;
        }
        return true;
    }

    @Override // com.appsflyer.internal.AFi1hSDK
    @SuppressLint({"NewApi"})
    public final void values(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (!AFInAppEventType(context)) {
            this.AFLogger.run();
        } else {
            this.valueOf.execute(new h(2, this, context));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x019a, code lost:
    
        if (r6 != null) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x018c, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x018a, code lost:
    
        if (r6 != null) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01a7, code lost:
    
        if (r6 != null) goto L149;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void AFKeystoreWrapper(com.appsflyer.internal.AFi1jSDK r18, android.content.Context r19) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFi1jSDK.AFKeystoreWrapper(com.appsflyer.internal.AFi1jSDK, android.content.Context):void");
    }
}
