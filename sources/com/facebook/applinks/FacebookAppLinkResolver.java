package com.facebook.applinks;

import android.net.Uri;
import android.os.Bundle;
import ek.h;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;
import ll.c;
import ll.d;
import ll.i;
import ll.m;
import ll.n;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;
import sl.a;
import xk.v;
import xk.z;

/* loaded from: classes.dex */
public class FacebookAppLinkResolver {
    private static final String APP_LINK_ANDROID_TARGET_KEY = "android";
    private static final String APP_LINK_KEY = "app_links";
    private static final String APP_LINK_TARGET_APP_NAME_KEY = "app_name";
    private static final String APP_LINK_TARGET_CLASS_KEY = "class";
    private static final String APP_LINK_TARGET_PACKAGE_KEY = "package";
    private static final String APP_LINK_TARGET_SHOULD_FALLBACK_KEY = "should_fallback";
    private static final String APP_LINK_TARGET_URL_KEY = "url";
    private static final String APP_LINK_WEB_TARGET_KEY = "web";
    private final HashMap<Uri, d> cachedAppLinks = new HashMap<>();

    public static /* synthetic */ c access$000(JSONObject jSONObject) {
        if (a.b(FacebookAppLinkResolver.class)) {
            return null;
        }
        try {
            return getAndroidTargetFromJson(jSONObject);
        } catch (Throwable th2) {
            a.a(FacebookAppLinkResolver.class, th2);
            return null;
        }
    }

    public static /* synthetic */ Uri access$100(Uri uri, JSONObject jSONObject) {
        if (a.b(FacebookAppLinkResolver.class)) {
            return null;
        }
        try {
            return getWebFallbackUriFromJson(uri, jSONObject);
        } catch (Throwable th2) {
            a.a(FacebookAppLinkResolver.class, th2);
            return null;
        }
    }

    public static /* synthetic */ HashMap access$200(FacebookAppLinkResolver facebookAppLinkResolver) {
        if (a.b(FacebookAppLinkResolver.class)) {
            return null;
        }
        try {
            return facebookAppLinkResolver.cachedAppLinks;
        } catch (Throwable th2) {
            a.a(FacebookAppLinkResolver.class, th2);
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [ll.c, java.lang.Object] */
    private static c getAndroidTargetFromJson(JSONObject jSONObject) {
        Uri url;
        if (a.b(FacebookAppLinkResolver.class)) {
            return null;
        }
        try {
            String packageName = tryGetStringFromJson(jSONObject, APP_LINK_TARGET_PACKAGE_KEY, null);
            if (packageName == null) {
                return null;
            }
            String className = tryGetStringFromJson(jSONObject, APP_LINK_TARGET_CLASS_KEY, null);
            String appName = tryGetStringFromJson(jSONObject, APP_LINK_TARGET_APP_NAME_KEY, null);
            String tryGetStringFromJson = tryGetStringFromJson(jSONObject, "url", null);
            if (tryGetStringFromJson != null) {
                url = Uri.parse(tryGetStringFromJson);
            } else {
                url = null;
            }
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            Intrinsics.checkNotNullParameter(className, "className");
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(appName, "appName");
            return new Object();
        } catch (Throwable th2) {
            a.a(FacebookAppLinkResolver.class, th2);
            return null;
        }
    }

    private static Uri getWebFallbackUriFromJson(Uri uri, JSONObject jSONObject) {
        Uri uri2 = null;
        if (a.b(FacebookAppLinkResolver.class)) {
            return null;
        }
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(APP_LINK_WEB_TARGET_KEY);
            if (!tryGetBooleanFromJson(jSONObject2, APP_LINK_TARGET_SHOULD_FALLBACK_KEY, true)) {
                return null;
            }
            String tryGetStringFromJson = tryGetStringFromJson(jSONObject2, "url", null);
            if (tryGetStringFromJson != null) {
                uri2 = Uri.parse(tryGetStringFromJson);
            }
            if (uri2 != null) {
                return uri2;
            }
            return uri;
        } catch (JSONException unused) {
            return uri;
        } catch (Throwable th2) {
            a.a(FacebookAppLinkResolver.class, th2);
            return null;
        }
    }

    private static boolean tryGetBooleanFromJson(JSONObject jSONObject, String str, boolean z10) {
        if (a.b(FacebookAppLinkResolver.class)) {
            return false;
        }
        try {
            return jSONObject.getBoolean(str);
        } catch (JSONException unused) {
            return z10;
        } catch (Throwable th2) {
            a.a(FacebookAppLinkResolver.class, th2);
            return false;
        }
    }

    private static String tryGetStringFromJson(JSONObject jSONObject, String str, String str2) {
        if (a.b(FacebookAppLinkResolver.class)) {
            return null;
        }
        try {
            return jSONObject.getString(str);
        } catch (JSONException unused) {
            return str2;
        } catch (Throwable th2) {
            a.a(FacebookAppLinkResolver.class, th2);
            return null;
        }
    }

    public m getAppLinkFromUrlInBackground(final Uri uri) {
        if (a.b(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(uri);
            return getAppLinkFromUrlsInBackground(arrayList).d(new i() { // from class: com.facebook.applinks.FacebookAppLinkResolver.1
                @Override // ll.i
                public d then(m mVar) throws Exception {
                    ReentrantLock reentrantLock = mVar.f24928a;
                    reentrantLock.lock();
                    try {
                        Object obj = mVar.f24932e;
                        reentrantLock.unlock();
                        return (d) ((Map) obj).get(uri);
                    } catch (Throwable th2) {
                        reentrantLock.unlock();
                        throw th2;
                    }
                }
            });
        } catch (Throwable th2) {
            a.a(this, th2);
            return null;
        }
    }

    public m getAppLinkFromUrlsInBackground(List<Uri> list) {
        d dVar;
        if (a.b(this)) {
            return null;
        }
        try {
            final HashMap hashMap = new HashMap();
            final HashSet hashSet = new HashSet();
            StringBuilder sb2 = new StringBuilder();
            for (Uri uri : list) {
                synchronized (this.cachedAppLinks) {
                    dVar = this.cachedAppLinks.get(uri);
                }
                if (dVar != null) {
                    hashMap.put(uri, dVar);
                } else {
                    if (!hashSet.isEmpty()) {
                        sb2.append(',');
                    }
                    sb2.append(uri.toString());
                    hashSet.add(uri);
                }
            }
            if (hashSet.isEmpty()) {
                return m.b(hashMap);
            }
            final n nVar = new n();
            Bundle bundle = new Bundle();
            bundle.putString("ids", sb2.toString());
            bundle.putString("fields", String.format("%s.fields(%s,%s)", APP_LINK_KEY, "android", APP_LINK_WEB_TARGET_KEY));
            Date date = xk.a.f40309l;
            new z(h.q(), HttpUrl.FRAGMENT_ENCODE_SET, bundle, null, new v() { // from class: com.facebook.applinks.FacebookAppLinkResolver.2
                /* JADX WARN: Removed duplicated region for block: B:17:0x002e A[Catch: all -> 0x0013, TRY_LEAVE, TryCatch #0 {all -> 0x0013, blocks: (B:6:0x0007, B:8:0x000b, B:10:0x0016, B:12:0x001a, B:14:0x0022, B:15:0x0028, B:17:0x002e, B:20:0x003f, B:22:0x005f, B:24:0x0069, B:26:0x006c, B:29:0x006f, B:30:0x0083, B:41:0x0091, B:46:0x0092), top: B:5:0x0007 }] */
                @Override // xk.v
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void onCompleted(xk.d0 r9) {
                    /*
                        r8 = this;
                        boolean r0 = sl.a.b(r8)
                        if (r0 == 0) goto L7
                        return
                    L7:
                        xk.q r0 = r9.f40344c     // Catch: java.lang.Throwable -> L13
                        if (r0 == 0) goto L16
                        ll.n r9 = r2     // Catch: java.lang.Throwable -> L13
                        com.facebook.FacebookException r0 = r0.f40466i     // Catch: java.lang.Throwable -> L13
                        r9.b(r0)     // Catch: java.lang.Throwable -> L13
                        return
                    L13:
                        r9 = move-exception
                        goto L9a
                    L16:
                        org.json.JSONObject r9 = r9.f40343b     // Catch: java.lang.Throwable -> L13
                        if (r9 != 0) goto L22
                        ll.n r9 = r2     // Catch: java.lang.Throwable -> L13
                        java.util.Map r0 = r3     // Catch: java.lang.Throwable -> L13
                        r9.c(r0)     // Catch: java.lang.Throwable -> L13
                        return
                    L22:
                        java.util.HashSet r0 = r4     // Catch: java.lang.Throwable -> L13
                        java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L13
                    L28:
                        boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L13
                        if (r1 == 0) goto L92
                        java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L13
                        android.net.Uri r1 = (android.net.Uri) r1     // Catch: java.lang.Throwable -> L13
                        java.lang.String r2 = r1.toString()     // Catch: java.lang.Throwable -> L13
                        boolean r2 = r9.has(r2)     // Catch: java.lang.Throwable -> L13
                        if (r2 != 0) goto L3f
                        goto L28
                    L3f:
                        java.lang.String r2 = r1.toString()     // Catch: java.lang.Throwable -> L13 org.json.JSONException -> L28
                        org.json.JSONObject r2 = r9.getJSONObject(r2)     // Catch: java.lang.Throwable -> L13 org.json.JSONException -> L28
                        java.lang.String r3 = "app_links"
                        org.json.JSONObject r2 = r2.getJSONObject(r3)     // Catch: java.lang.Throwable -> L13 org.json.JSONException -> L28
                        java.lang.String r3 = "android"
                        org.json.JSONArray r3 = r2.getJSONArray(r3)     // Catch: java.lang.Throwable -> L13 org.json.JSONException -> L28
                        int r4 = r3.length()     // Catch: java.lang.Throwable -> L13 org.json.JSONException -> L28
                        java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L13 org.json.JSONException -> L28
                        r5.<init>(r4)     // Catch: java.lang.Throwable -> L13 org.json.JSONException -> L28
                        r6 = 0
                    L5d:
                        if (r6 >= r4) goto L6f
                        org.json.JSONObject r7 = r3.getJSONObject(r6)     // Catch: java.lang.Throwable -> L13 org.json.JSONException -> L28
                        ll.c r7 = com.facebook.applinks.FacebookAppLinkResolver.access$000(r7)     // Catch: java.lang.Throwable -> L13 org.json.JSONException -> L28
                        if (r7 == 0) goto L6c
                        r5.add(r7)     // Catch: java.lang.Throwable -> L13 org.json.JSONException -> L28
                    L6c:
                        int r6 = r6 + 1
                        goto L5d
                    L6f:
                        android.net.Uri r2 = com.facebook.applinks.FacebookAppLinkResolver.access$100(r1, r2)     // Catch: java.lang.Throwable -> L13 org.json.JSONException -> L28
                        ll.d r3 = new ll.d     // Catch: java.lang.Throwable -> L13 org.json.JSONException -> L28
                        r3.<init>(r1, r5, r2)     // Catch: java.lang.Throwable -> L13 org.json.JSONException -> L28
                        java.util.Map r2 = r3     // Catch: java.lang.Throwable -> L13 org.json.JSONException -> L28
                        r2.put(r1, r3)     // Catch: java.lang.Throwable -> L13 org.json.JSONException -> L28
                        com.facebook.applinks.FacebookAppLinkResolver r2 = com.facebook.applinks.FacebookAppLinkResolver.this     // Catch: java.lang.Throwable -> L13 org.json.JSONException -> L28
                        java.util.HashMap r2 = com.facebook.applinks.FacebookAppLinkResolver.access$200(r2)     // Catch: java.lang.Throwable -> L13 org.json.JSONException -> L28
                        monitor-enter(r2)     // Catch: java.lang.Throwable -> L13 org.json.JSONException -> L28
                        com.facebook.applinks.FacebookAppLinkResolver r4 = com.facebook.applinks.FacebookAppLinkResolver.this     // Catch: java.lang.Throwable -> L8f
                        java.util.HashMap r4 = com.facebook.applinks.FacebookAppLinkResolver.access$200(r4)     // Catch: java.lang.Throwable -> L8f
                        r4.put(r1, r3)     // Catch: java.lang.Throwable -> L8f
                        monitor-exit(r2)     // Catch: java.lang.Throwable -> L8f
                        goto L28
                    L8f:
                        r1 = move-exception
                        monitor-exit(r2)     // Catch: java.lang.Throwable -> L8f
                        throw r1     // Catch: java.lang.Throwable -> L13 org.json.JSONException -> L28
                    L92:
                        ll.n r9 = r2     // Catch: java.lang.Throwable -> L13
                        java.util.Map r0 = r3     // Catch: java.lang.Throwable -> L13
                        r9.c(r0)     // Catch: java.lang.Throwable -> L13
                        return
                    L9a:
                        sl.a.a(r8, r9)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.applinks.FacebookAppLinkResolver.AnonymousClass2.onCompleted(xk.d0):void");
                }
            }).d();
            return nVar.f24935a;
        } catch (Throwable th2) {
            a.a(this, th2);
            return null;
        }
    }
}
