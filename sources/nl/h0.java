package nl;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.FacebookSdk;
import in.juspay.hypersdk.core.PaymentConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final h0 f28857a;

    /* renamed from: b, reason: collision with root package name */
    public static final ArrayList f28858b;

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicBoolean f28859c;

    /* renamed from: d, reason: collision with root package name */
    public static final Integer[] f28860d;

    /* JADX WARN: Type inference failed for: r0v0, types: [nl.h0, java.lang.Object] */
    static {
        ?? obj = new Object();
        f28857a = obj;
        f28858b = obj.a();
        ArrayList arrayList = null;
        if (!sl.a.b(obj)) {
            try {
                ArrayList c10 = vt.y.c(new f0(0));
                c10.addAll(obj.a());
                arrayList = c10;
            } catch (Throwable th2) {
                sl.a.a(obj, th2);
            }
        }
        h0 h0Var = f28857a;
        if (!sl.a.b(h0Var)) {
            try {
                HashMap hashMap = new HashMap();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new f0(3));
                ArrayList arrayList3 = f28858b;
                hashMap.put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", arrayList3);
                hashMap.put("com.facebook.platform.action.request.FEED_DIALOG", arrayList3);
                hashMap.put("com.facebook.platform.action.request.LIKE_DIALOG", arrayList3);
                hashMap.put("com.facebook.platform.action.request.APPINVITES_DIALOG", arrayList3);
                hashMap.put("com.facebook.platform.action.request.MESSAGE_DIALOG", arrayList2);
                hashMap.put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", arrayList2);
                hashMap.put("com.facebook.platform.action.request.CAMERA_EFFECT", arrayList);
                hashMap.put("com.facebook.platform.action.request.SHARE_STORY", arrayList3);
            } catch (Throwable th3) {
                sl.a.a(h0Var, th3);
            }
        }
        f28859c = new AtomicBoolean(false);
        f28860d = new Integer[]{20210906, 20171115, 20170417, 20170411, 20170213, 20161017, 20160327, 20150702, 20150401, 20141218, 20141107, 20141028, 20141001, 20140701, 20140324, 20140313, 20140204, 20131107, 20131024, 20130618, 20130502, 20121101};
    }

    public static final int b(TreeSet treeSet, int i10, int[] versionSpec) {
        if (sl.a.b(h0.class)) {
            return 0;
        }
        try {
            Intrinsics.checkNotNullParameter(versionSpec, "versionSpec");
            if (treeSet == null) {
                return -1;
            }
            int length = versionSpec.length - 1;
            Iterator descendingIterator = treeSet.descendingIterator();
            int i11 = -1;
            while (descendingIterator.hasNext()) {
                Integer fbAppVersion = (Integer) descendingIterator.next();
                Intrinsics.checkNotNullExpressionValue(fbAppVersion, "fbAppVersion");
                i11 = Math.max(i11, fbAppVersion.intValue());
                while (length >= 0 && versionSpec[length] > fbAppVersion.intValue()) {
                    length--;
                }
                if (length < 0) {
                    return -1;
                }
                if (versionSpec[length] == fbAppVersion.intValue()) {
                    if (length % 2 != 0) {
                        return -1;
                    }
                    return Math.min(i11, i10);
                }
            }
            return -1;
        } catch (Throwable th2) {
            sl.a.a(h0.class, th2);
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[LOOP:0: B:7:0x0015->B:16:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final android.content.Intent d(android.content.Context r7) {
        /*
            java.lang.String r0 = "context"
            java.lang.Class<nl.h0> r1 = nl.h0.class
            boolean r2 = sl.a.b(r1)
            r3 = 0
            if (r2 == 0) goto Lc
            return r3
        Lc:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)     // Catch: java.lang.Throwable -> L6a
            java.util.ArrayList r2 = nl.h0.f28858b     // Catch: java.lang.Throwable -> L6a
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L6a
        L15:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> L6a
            if (r4 == 0) goto L6c
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> L6a
            nl.g0 r4 = (nl.g0) r4     // Catch: java.lang.Throwable -> L6a
            android.content.Intent r5 = new android.content.Intent     // Catch: java.lang.Throwable -> L6a
            java.lang.String r6 = "com.facebook.platform.PLATFORM_SERVICE"
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r4 = r4.b()     // Catch: java.lang.Throwable -> L6a
            android.content.Intent r4 = r5.setPackage(r4)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r5 = "android.intent.category.DEFAULT"
            android.content.Intent r4 = r4.addCategory(r5)     // Catch: java.lang.Throwable -> L6a
            boolean r5 = sl.a.b(r1)     // Catch: java.lang.Throwable -> L6a
            if (r5 == 0) goto L3e
        L3c:
            r4 = r3
            goto L67
        L3e:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)     // Catch: java.lang.Throwable -> L62
            if (r4 != 0) goto L44
            goto L3c
        L44:
            android.content.pm.PackageManager r5 = r7.getPackageManager()     // Catch: java.lang.Throwable -> L62
            r6 = 0
            android.content.pm.ResolveInfo r5 = r5.resolveService(r4, r6)     // Catch: java.lang.Throwable -> L62
            if (r5 != 0) goto L50
            goto L3c
        L50:
            java.util.HashSet r6 = nl.q.f28900a     // Catch: java.lang.Throwable -> L62
            android.content.pm.ServiceInfo r5 = r5.serviceInfo     // Catch: java.lang.Throwable -> L62
            java.lang.String r5 = r5.packageName     // Catch: java.lang.Throwable -> L62
            java.lang.String r6 = "resolveInfo.serviceInfo.packageName"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)     // Catch: java.lang.Throwable -> L62
            boolean r5 = nl.q.a(r7, r5)     // Catch: java.lang.Throwable -> L62
            if (r5 != 0) goto L67
            goto L3c
        L62:
            r4 = move-exception
            sl.a.a(r1, r4)     // Catch: java.lang.Throwable -> L6a
            goto L3c
        L67:
            if (r4 == 0) goto L15
            return r4
        L6a:
            r7 = move-exception
            goto L6d
        L6c:
            return r3
        L6d:
            sl.a.a(r1, r7)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: nl.h0.d(android.content.Context):android.content.Intent");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004b A[Catch: all -> 0x0094, TryCatch #1 {all -> 0x0094, blocks: (B:6:0x000a, B:12:0x004b, B:14:0x0067, B:17:0x0090, B:24:0x008c, B:25:0x0096, B:27:0x009b, B:46:0x0044, B:32:0x001e, B:34:0x0028, B:36:0x002e, B:39:0x003f, B:43:0x0037, B:19:0x0071, B:21:0x0083), top: B:5:0x000a, inners: #0, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final android.content.Intent e(android.content.Intent r8, android.os.Bundle r9, com.facebook.FacebookException r10) {
        /*
            java.lang.Class<nl.h0> r0 = nl.h0.class
            boolean r1 = sl.a.b(r0)
            r2 = 0
            if (r1 == 0) goto La
            return r2
        La:
            java.lang.String r1 = "requestIntent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r1)     // Catch: java.lang.Throwable -> L94
            boolean r1 = sl.a.b(r0)     // Catch: java.lang.Throwable -> L94
            java.lang.String r3 = "action_id"
            java.lang.String r4 = "com.facebook.platform.protocol.BRIDGE_ARGS"
            if (r1 == 0) goto L1b
        L19:
            r1 = r2
            goto L48
        L1b:
            if (r8 != 0) goto L1e
            goto L19
        L1e:
            int r1 = i(r8)     // Catch: java.lang.Throwable -> L33
            boolean r1 = j(r1)     // Catch: java.lang.Throwable -> L33
            if (r1 == 0) goto L37
            android.os.Bundle r1 = r8.getBundleExtra(r4)     // Catch: java.lang.Throwable -> L33
            if (r1 == 0) goto L35
            java.lang.String r1 = r1.getString(r3)     // Catch: java.lang.Throwable -> L33
            goto L3d
        L33:
            r1 = move-exception
            goto L44
        L35:
            r1 = r2
            goto L3d
        L37:
            java.lang.String r1 = "com.facebook.platform.protocol.CALL_ID"
            java.lang.String r1 = r8.getStringExtra(r1)     // Catch: java.lang.Throwable -> L33
        L3d:
            if (r1 == 0) goto L19
            java.util.UUID r1 = java.util.UUID.fromString(r1)     // Catch: java.lang.IllegalArgumentException -> L19 java.lang.Throwable -> L33
            goto L48
        L44:
            sl.a.a(r0, r1)     // Catch: java.lang.Throwable -> L94
            goto L19
        L48:
            if (r1 != 0) goto L4b
            return r2
        L4b:
            android.content.Intent r5 = new android.content.Intent     // Catch: java.lang.Throwable -> L94
            r5.<init>()     // Catch: java.lang.Throwable -> L94
            java.lang.String r6 = "com.facebook.platform.protocol.PROTOCOL_VERSION"
            int r8 = i(r8)     // Catch: java.lang.Throwable -> L94
            r5.putExtra(r6, r8)     // Catch: java.lang.Throwable -> L94
            android.os.Bundle r8 = new android.os.Bundle     // Catch: java.lang.Throwable -> L94
            r8.<init>()     // Catch: java.lang.Throwable -> L94
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L94
            r8.putString(r3, r1)     // Catch: java.lang.Throwable -> L94
            if (r10 == 0) goto L96
            java.lang.String r1 = "error"
            boolean r3 = sl.a.b(r0)     // Catch: java.lang.Throwable -> L94
            if (r3 == 0) goto L71
        L6f:
            r3 = r2
            goto L90
        L71:
            android.os.Bundle r3 = new android.os.Bundle     // Catch: java.lang.Throwable -> L8b
            r3.<init>()     // Catch: java.lang.Throwable -> L8b
            java.lang.String r6 = "error_description"
            java.lang.String r7 = r10.toString()     // Catch: java.lang.Throwable -> L8b
            r3.putString(r6, r7)     // Catch: java.lang.Throwable -> L8b
            boolean r10 = r10 instanceof com.facebook.FacebookOperationCanceledException     // Catch: java.lang.Throwable -> L8b
            if (r10 == 0) goto L90
            java.lang.String r10 = "error_type"
            java.lang.String r6 = "UserCanceled"
            r3.putString(r10, r6)     // Catch: java.lang.Throwable -> L8b
            goto L90
        L8b:
            r10 = move-exception
            sl.a.a(r0, r10)     // Catch: java.lang.Throwable -> L94
            goto L6f
        L90:
            r8.putBundle(r1, r3)     // Catch: java.lang.Throwable -> L94
            goto L96
        L94:
            r8 = move-exception
            goto La1
        L96:
            r5.putExtra(r4, r8)     // Catch: java.lang.Throwable -> L94
            if (r9 == 0) goto La0
            java.lang.String r8 = "com.facebook.platform.protocol.RESULT_ARGS"
            r5.putExtra(r8, r9)     // Catch: java.lang.Throwable -> L94
        La0:
            return r5
        La1:
            sl.a.a(r0, r8)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: nl.h0.e(android.content.Intent, android.os.Bundle, com.facebook.FacebookException):android.content.Intent");
    }

    public static final Bundle h(Intent intent) {
        if (sl.a.b(h0.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(intent, "intent");
            if (!j(i(intent))) {
                return intent.getExtras();
            }
            return intent.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS");
        } catch (Throwable th2) {
            sl.a.a(h0.class, th2);
            return null;
        }
    }

    public static final int i(Intent intent) {
        if (sl.a.b(h0.class)) {
            return 0;
        }
        try {
            Intrinsics.checkNotNullParameter(intent, "intent");
            return intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
        } catch (Throwable th2) {
            sl.a.a(h0.class, th2);
            return 0;
        }
    }

    public static final boolean j(int i10) {
        if (sl.a.b(h0.class)) {
            return false;
        }
        try {
            if (!vt.v.o(f28860d, Integer.valueOf(i10)) || i10 < 20140701) {
                return false;
            }
            return true;
        } catch (Throwable th2) {
            sl.a.a(h0.class, th2);
            return false;
        }
    }

    public static final void k() {
        if (sl.a.b(h0.class)) {
            return;
        }
        try {
            if (!f28859c.compareAndSet(false, true)) {
                return;
            }
            FacebookSdk.getExecutor().execute(new com.appsflyer.internal.l(15));
        } catch (Throwable th2) {
            sl.a.a(h0.class, th2);
        }
    }

    public final ArrayList a() {
        if (sl.a.b(this)) {
            return null;
        }
        try {
            return vt.y.c(new f0(2), new f0(4));
        } catch (Throwable th2) {
            sl.a.a(this, th2);
            return null;
        }
    }

    public final Intent c(g0 g0Var, String str, Collection collection, String str2, boolean z10, wl.d dVar, String str3, String str4, boolean z11, String str5, boolean z12, wl.e0 e0Var, boolean z13, boolean z14, String str6) {
        String str7;
        String str8;
        if (sl.a.b(this)) {
            return null;
        }
        try {
            switch (((f0) g0Var).f28854b) {
                case 0:
                case 3:
                    str7 = null;
                    break;
                case 1:
                    str7 = "com.instagram.platform.AppAuthorizeActivity";
                    break;
                case 2:
                default:
                    str7 = "com.facebook.katana.ProxyAuth";
                    break;
            }
            if (str7 == null) {
                return null;
            }
            Intent putExtra = new Intent().setClassName(g0Var.b(), str7).putExtra(PaymentConstants.CLIENT_ID, str);
            Intrinsics.checkNotNullExpressionValue(putExtra, "Intent()\n            .setClassName(appInfo.getPackage(), activityName)\n            .putExtra(FACEBOOK_PROXY_AUTH_APP_ID_KEY, applicationId)");
            putExtra.putExtra("facebook_sdk_version", FacebookSdk.getSdkVersion());
            if (collection != null && !collection.isEmpty()) {
                putExtra.putExtra("scope", TextUtils.join(",", collection));
            }
            if (!n0.A(str2)) {
                putExtra.putExtra("e2e", str2);
            }
            putExtra.putExtra("state", str3);
            switch (((f0) g0Var).f28854b) {
                case 1:
                    str8 = "token,signed_request,graph_domain,granted_scopes";
                    break;
                default:
                    str8 = "id_token,token,signed_request,graph_domain";
                    break;
            }
            putExtra.putExtra("response_type", str8);
            putExtra.putExtra("nonce", str6);
            putExtra.putExtra("return_scopes", "true");
            if (z10) {
                putExtra.putExtra("default_audience", dVar.f39166a);
            }
            putExtra.putExtra("legacy_override", FacebookSdk.getGraphApiVersion());
            putExtra.putExtra("auth_type", str4);
            if (z11) {
                putExtra.putExtra("fail_on_logged_out", true);
            }
            putExtra.putExtra("messenger_page_id", str5);
            putExtra.putExtra("reset_messenger_state", z12);
            if (z13) {
                putExtra.putExtra("fx_app", e0Var.f39176a);
            }
            if (z14) {
                putExtra.putExtra("skip_dedupe", true);
            }
            return putExtra;
        } catch (Throwable th2) {
            sl.a.a(this, th2);
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:(9:45|46|9|10|11|12|(4:14|15|16|(2:(3:24|21|22)|25))(1:38)|(1:19)|20)|9|10|11|12|(0)(0)|(0)|20) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0069, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x006a, code lost:
    
        android.util.Log.e("nl.h0", "Failed to query content resolver.", r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x006d, code lost:
    
        r14 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a6 A[Catch: all -> 0x00aa, TRY_ENTER, TryCatch #3 {all -> 0x00aa, blocks: (B:6:0x000e, B:31:0x00b2, B:32:0x00af, B:19:0x00a6, B:49:0x004b, B:46:0x002b), top: B:5:0x000e, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0087 A[EXC_TOP_SPLITTER, LOOP:0: B:21:0x0087->B:24:0x008d, LOOP_START, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.TreeSet f(nl.g0 r14) {
        /*
            r13 = this;
            java.lang.String r0 = "version"
            java.lang.String r1 = "Failed to query content resolver."
            java.lang.String r2 = "nl.h0"
            boolean r3 = sl.a.b(r13)
            r4 = 0
            if (r3 == 0) goto Le
            return r4
        Le:
            java.util.TreeSet r3 = new java.util.TreeSet     // Catch: java.lang.Throwable -> Laa
            r3.<init>()     // Catch: java.lang.Throwable -> Laa
            android.content.Context r5 = com.facebook.FacebookSdk.getApplicationContext()     // Catch: java.lang.Throwable -> Laa
            android.content.ContentResolver r6 = r5.getContentResolver()     // Catch: java.lang.Throwable -> Laa
            r5 = 1
            java.lang.String[] r8 = new java.lang.String[r5]     // Catch: java.lang.Throwable -> Laa
            r5 = 0
            r8[r5] = r0     // Catch: java.lang.Throwable -> Laa
            java.lang.String r7 = "content://"
            boolean r9 = sl.a.b(r13)     // Catch: java.lang.Throwable -> Laa
            if (r9 == 0) goto L2b
        L29:
            r7 = r4
            goto L4f
        L2b:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4a
            r9.<init>(r7)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r7 = r14.b()     // Catch: java.lang.Throwable -> L4a
            r9.append(r7)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r7 = ".provider.PlatformProvider/versions"
            r9.append(r7)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r7 = r9.toString()     // Catch: java.lang.Throwable -> L4a
            android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r9 = "parse(CONTENT_SCHEME + appInfo.getPackage() + PLATFORM_PROVIDER_VERSIONS)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r9)     // Catch: java.lang.Throwable -> L4a
            goto L4f
        L4a:
            r7 = move-exception
            sl.a.a(r13, r7)     // Catch: java.lang.Throwable -> Laa
            goto L29
        L4f:
            android.content.Context r9 = com.facebook.FacebookSdk.getApplicationContext()     // Catch: java.lang.Throwable -> L66
            android.content.pm.PackageManager r9 = r9.getPackageManager()     // Catch: java.lang.Throwable -> L66
            java.lang.String r14 = r14.b()     // Catch: java.lang.Throwable -> L66
            java.lang.String r10 = ".provider.PlatformProvider"
            java.lang.String r14 = kotlin.jvm.internal.Intrinsics.i(r10, r14)     // Catch: java.lang.Throwable -> L66
            android.content.pm.ProviderInfo r14 = r9.resolveContentProvider(r14, r5)     // Catch: java.lang.Throwable -> L66 java.lang.RuntimeException -> L69
            goto L6e
        L66:
            r14 = move-exception
            r0 = r4
            goto Lac
        L69:
            r14 = move-exception
            android.util.Log.e(r2, r1, r14)     // Catch: java.lang.Throwable -> L66
            r14 = r4
        L6e:
            if (r14 == 0) goto La2
            r9 = 0
            r10 = 0
            r11 = 0
            android.database.Cursor r14 = r6.query(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L66 java.lang.IllegalArgumentException -> L78 java.lang.SecurityException -> L7d java.lang.NullPointerException -> L81
            goto L85
        L78:
            android.util.Log.e(r2, r1)     // Catch: java.lang.Throwable -> L66
        L7b:
            r14 = r4
            goto L85
        L7d:
            android.util.Log.e(r2, r1)     // Catch: java.lang.Throwable -> L66
            goto L7b
        L81:
            android.util.Log.e(r2, r1)     // Catch: java.lang.Throwable -> L66
            goto L7b
        L85:
            if (r14 == 0) goto La3
        L87:
            boolean r1 = r14.moveToNext()     // Catch: java.lang.Throwable -> L9d
            if (r1 == 0) goto La3
            int r1 = r14.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L9d
            int r1 = r14.getInt(r1)     // Catch: java.lang.Throwable -> L9d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L9d
            r3.add(r1)     // Catch: java.lang.Throwable -> L9d
            goto L87
        L9d:
            r0 = move-exception
            r12 = r0
            r0 = r14
            r14 = r12
            goto Lac
        La2:
            r14 = r4
        La3:
            if (r14 != 0) goto La6
            goto La9
        La6:
            r14.close()     // Catch: java.lang.Throwable -> Laa
        La9:
            return r3
        Laa:
            r14 = move-exception
            goto Lb3
        Lac:
            if (r0 != 0) goto Laf
            goto Lb2
        Laf:
            r0.close()     // Catch: java.lang.Throwable -> Laa
        Lb2:
            throw r14     // Catch: java.lang.Throwable -> Laa
        Lb3:
            sl.a.a(r13, r14)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: nl.h0.f(nl.g0):java.util.TreeSet");
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [androidx.work.u, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [androidx.work.u, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v5, types: [androidx.work.u, java.lang.Object] */
    public final androidx.work.u g(ArrayList arrayList, int[] iArr) {
        if (sl.a.b(this)) {
            return null;
        }
        try {
            k();
            if (arrayList == null) {
                ?? obj = new Object();
                obj.f2637a = -1;
                return obj;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                g0 g0Var = (g0) it.next();
                TreeSet treeSet = g0Var.f28856a;
                int i10 = 0;
                if (treeSet == null || !Intrinsics.a(Boolean.valueOf(treeSet.isEmpty()), Boolean.FALSE)) {
                    g0Var.a(false);
                }
                TreeSet treeSet2 = g0Var.f28856a;
                if (!sl.a.b(h0.class)) {
                    try {
                        i10 = f28860d[0].intValue();
                    } catch (Throwable th2) {
                        sl.a.a(h0.class, th2);
                    }
                }
                int b10 = b(treeSet2, i10, iArr);
                if (b10 != -1) {
                    ?? obj2 = new Object();
                    obj2.f2637a = b10;
                    return obj2;
                }
            }
            ?? obj3 = new Object();
            obj3.f2637a = -1;
            return obj3;
        } catch (Throwable th3) {
            sl.a.a(this, th3);
            return null;
        }
    }
}
