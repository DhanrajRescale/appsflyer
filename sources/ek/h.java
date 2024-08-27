package ek;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import java.io.File;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import nl.n0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class h implements x, hk.d0, lk.d, sk.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15591a;

    public /* synthetic */ h(int i10) {
        this.f15591a = i10;
    }

    public static final String c(String str) {
        HashSet hashSet = yk.e.f41684f;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            Charset forName = Charset.forName("UTF-8");
            Intrinsics.checkNotNullExpressionValue(forName, "Charset.forName(charsetName)");
            if (str != null) {
                byte[] bytes = str.getBytes(forName);
                Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                messageDigest.update(bytes, 0, bytes.length);
                byte[] digest = messageDigest.digest();
                Intrinsics.checkNotNullExpressionValue(digest, "digest.digest()");
                return gl.c.a(digest);
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } catch (UnsupportedEncodingException e10) {
            n0.E("Failed to generate checksum: ", e10);
            return "1";
        } catch (NoSuchAlgorithmException e11) {
            n0.E("Failed to generate checksum: ", e11);
            return "0";
        }
    }

    public static final void d(String str) {
        boolean contains;
        HashSet hashSet = yk.e.f41684f;
        if (str != null && str.length() != 0 && str.length() <= 40) {
            HashSet hashSet2 = yk.e.f41684f;
            synchronized (hashSet2) {
                contains = hashSet2.contains(str);
                Unit unit = Unit.f23355a;
            }
            if (!contains) {
                if (new Regex("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$").c(str)) {
                    synchronized (hashSet2) {
                        hashSet2.add(str);
                    }
                    return;
                }
                throw new FacebookException(a3.a.m(new Object[]{str}, 1, "Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", "java.lang.String.format(format, *args)"));
            }
            return;
        }
        if (str == null) {
            str = "<None Provided>";
        }
        String format = String.format(Locale.ROOT, "Identifier '%s' must be less than %d characters", Arrays.copyOf(new Object[]{str, 40}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
        throw new FacebookException(format);
    }

    public static hl.d e(JSONObject jSONObject) {
        String useCase;
        String assetUri;
        String optString;
        int i10;
        float[] fArr;
        if (jSONObject != null) {
            try {
                useCase = jSONObject.getString("use_case");
                assetUri = jSONObject.getString("asset_uri");
                optString = jSONObject.optString("rules_uri", null);
                i10 = jSONObject.getInt("version_id");
                hl.e eVar = hl.e.f18611a;
                JSONArray jSONArray = jSONObject.getJSONArray("thresholds");
                if (!sl.a.b(hl.e.class)) {
                    try {
                    } catch (Throwable th2) {
                        sl.a.a(hl.e.class, th2);
                    }
                    if (!sl.a.b(eVar) && jSONArray != null) {
                        try {
                            fArr = new float[jSONArray.length()];
                            int length = jSONArray.length();
                            if (length > 0) {
                                int i11 = 0;
                                while (true) {
                                    int i12 = i11 + 1;
                                    try {
                                        String string = jSONArray.getString(i11);
                                        Intrinsics.checkNotNullExpressionValue(string, "jsonArray.getString(i)");
                                        fArr[i11] = Float.parseFloat(string);
                                    } catch (JSONException unused) {
                                    }
                                    if (i12 >= length) {
                                        break;
                                    }
                                    i11 = i12;
                                }
                            }
                        } catch (Throwable th3) {
                            sl.a.a(eVar, th3);
                        }
                        Intrinsics.checkNotNullExpressionValue(useCase, "useCase");
                        Intrinsics.checkNotNullExpressionValue(assetUri, "assetUri");
                    }
                }
                fArr = null;
                Intrinsics.checkNotNullExpressionValue(useCase, "useCase");
                Intrinsics.checkNotNullExpressionValue(assetUri, "assetUri");
            } catch (Exception unused2) {
                return null;
            }
        }
        return new hl.d(useCase, assetUri, optString, i10, fArr);
    }

    public static void g(JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String key = keys.next();
            JSONObject optJSONObject = jSONObject.optJSONObject(key);
            if (optJSONObject != null) {
                String k10 = optJSONObject.optString("k");
                String v10 = optJSONObject.optString("v");
                Intrinsics.checkNotNullExpressionValue(k10, "k");
                if (k10.length() != 0) {
                    CopyOnWriteArraySet a10 = zk.c.a();
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    List P = kotlin.text.w.P(k10, new String[]{","}, 0, 6);
                    Intrinsics.checkNotNullExpressionValue(v10, "v");
                    a10.add(new zk.c(key, P, v10));
                }
            }
        }
    }

    public static xk.a h(JSONObject jsonObject) {
        ArrayList C;
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        if (jsonObject.getInt("version") <= 1) {
            String token = jsonObject.getString("token");
            Date date = new Date(jsonObject.getLong("expires_at"));
            JSONArray permissionsArray = jsonObject.getJSONArray("permissions");
            JSONArray declinedPermissionsArray = jsonObject.getJSONArray("declined_permissions");
            JSONArray optJSONArray = jsonObject.optJSONArray("expired_permissions");
            Date date2 = new Date(jsonObject.getLong("last_refresh"));
            String string = jsonObject.getString("source");
            Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(SOURCE_KEY)");
            xk.h valueOf = xk.h.valueOf(string);
            String applicationId = jsonObject.getString("application_id");
            String userId = jsonObject.getString("user_id");
            Date date3 = new Date(jsonObject.optLong("data_access_expiration_time", 0L));
            String optString = jsonObject.optString("graph_domain", null);
            Intrinsics.checkNotNullExpressionValue(token, "token");
            Intrinsics.checkNotNullExpressionValue(applicationId, "applicationId");
            Intrinsics.checkNotNullExpressionValue(userId, "userId");
            Intrinsics.checkNotNullExpressionValue(permissionsArray, "permissionsArray");
            ArrayList C2 = n0.C(permissionsArray);
            Intrinsics.checkNotNullExpressionValue(declinedPermissionsArray, "declinedPermissionsArray");
            ArrayList C3 = n0.C(declinedPermissionsArray);
            if (optJSONArray == null) {
                C = new ArrayList();
            } else {
                C = n0.C(optJSONArray);
            }
            return new xk.a(token, applicationId, userId, C2, C3, C, valueOf, date, date2, date3, optString);
        }
        throw new FacebookException("Unknown AccessToken serialization format.");
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x00a4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01c2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void i(android.content.Context r26) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ek.h.i(android.content.Context):void");
    }

    public static void l(String str, String str2, gl.h hVar) {
        File file = new File(hl.g.a(), str2);
        if (str != null && !file.exists()) {
            new gl.i(str, file, hVar).execute(new String[0]);
        } else {
            hVar.c(file);
        }
    }

    public static void m(hl.d master, ArrayList slaves) {
        File[] listFiles;
        Intrinsics.checkNotNullParameter(master, "master");
        Intrinsics.checkNotNullParameter(slaves, "slaves");
        String str = master.f18603a;
        File a10 = hl.g.a();
        int i10 = master.f18606d;
        if (a10 != null && (listFiles = a10.listFiles()) != null && listFiles.length != 0) {
            String str2 = str + '_' + i10;
            int length = listFiles.length;
            int i11 = 0;
            while (i11 < length) {
                File file = listFiles[i11];
                i11++;
                String name = file.getName();
                Intrinsics.checkNotNullExpressionValue(name, "name");
                if (kotlin.text.s.r(name, str, false) && !kotlin.text.s.r(name, str2, false)) {
                    file.delete();
                }
            }
        }
        l(master.f18604b, master.f18603a + '_' + i10, new i5.c0(slaves));
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00cc, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.a(r8.getClass().getSimpleName(), (java.lang.String) nn.d.g(r11, 1)) == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00dc, code lost:
    
        if (r1.f8218c != r8.getId()) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fc, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.a(r6, r5) == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x012a, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.a(r7, r6) == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0149, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.a(r7, r6) == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0173, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.a(r1, r11) == false) goto L76;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList n(android.view.View r8, java.util.List r9, int r10, int r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ek.h.n(android.view.View, java.util.List, int, int, java.lang.String):java.util.ArrayList");
    }

    public static ArrayList o(ViewGroup viewGroup) {
        ArrayList arrayList = new ArrayList();
        int childCount = viewGroup.getChildCount();
        if (childCount > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                View child = viewGroup.getChildAt(i10);
                if (child.getVisibility() == 0) {
                    Intrinsics.checkNotNullExpressionValue(child, "child");
                    arrayList.add(child);
                }
                if (i11 >= childCount) {
                    break;
                }
                i10 = i11;
            }
        }
        return arrayList;
    }

    public static xk.a q() {
        return xk.g.f40363f.r().f40367c;
    }

    public static cl.c t(JSONObject mapping) {
        int length;
        Intrinsics.checkNotNullParameter(mapping, "mapping");
        String eventName = mapping.getString("event_name");
        String string = mapping.getString("method");
        Intrinsics.checkNotNullExpressionValue(string, "mapping.getString(\"method\")");
        Locale ENGLISH = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        String upperCase = string.toUpperCase(ENGLISH);
        Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.String).toUpperCase(locale)");
        cl.b valueOf = cl.b.valueOf(upperCase);
        String string2 = mapping.getString("event_type");
        Intrinsics.checkNotNullExpressionValue(string2, "mapping.getString(\"event_type\")");
        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        String upperCase2 = string2.toUpperCase(ENGLISH);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "(this as java.lang.String).toUpperCase(locale)");
        cl.a valueOf2 = cl.a.valueOf(upperCase2);
        String appVersion = mapping.getString("app_version");
        JSONArray jSONArray = mapping.getJSONArray("path");
        ArrayList arrayList = new ArrayList();
        int length2 = jSONArray.length();
        int i10 = 0;
        if (length2 > 0) {
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                JSONObject jsonPath = jSONArray.getJSONObject(i11);
                Intrinsics.checkNotNullExpressionValue(jsonPath, "jsonPath");
                arrayList.add(new cl.e(jsonPath));
                if (i12 >= length2) {
                    break;
                }
                i11 = i12;
            }
        }
        String pathType = mapping.optString("path_type", "absolute");
        JSONArray optJSONArray = mapping.optJSONArray("parameters");
        ArrayList arrayList2 = new ArrayList();
        if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
            while (true) {
                int i13 = i10 + 1;
                JSONObject jsonParameter = optJSONArray.getJSONObject(i10);
                Intrinsics.checkNotNullExpressionValue(jsonParameter, "jsonParameter");
                arrayList2.add(new cl.d(jsonParameter));
                if (i13 >= length) {
                    break;
                }
                i10 = i13;
            }
        }
        String componentId = mapping.optString("component_id");
        String activityName = mapping.optString("activity_name");
        Intrinsics.checkNotNullExpressionValue(eventName, "eventName");
        Intrinsics.checkNotNullExpressionValue(appVersion, "appVersion");
        Intrinsics.checkNotNullExpressionValue(componentId, "componentId");
        Intrinsics.checkNotNullExpressionValue(pathType, "pathType");
        Intrinsics.checkNotNullExpressionValue(activityName, "activityName");
        return new cl.c(eventName, valueOf, valueOf2, appVersion, arrayList, arrayList2, componentId, pathType, activityName);
    }

    public static String u(String name, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        if (jSONObject.has(name)) {
            return jSONObject.getString(name);
        }
        return null;
    }

    public static List v(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        ArrayList<String> stringArrayList = bundle.getStringArrayList(str);
        if (stringArrayList == null) {
            return vt.i0.f38321a;
        }
        List unmodifiableList = Collections.unmodifiableList(new ArrayList(stringArrayList));
        Intrinsics.checkNotNullExpressionValue(unmodifiableList, "{\n            Collections.unmodifiableList(ArrayList(originalPermissions))\n          }");
        return unmodifiableList;
    }

    public static ConcurrentHashMap w() {
        h hVar = el.g.f15652s;
        if (sl.a.b(el.g.class)) {
            return null;
        }
        try {
            return el.g.f15656w;
        } catch (Throwable th2) {
            sl.a.a(el.g.class, th2);
            return null;
        }
    }

    public static boolean x() {
        xk.a aVar = xk.g.f40363f.r().f40367c;
        if (aVar != null && !new Date().after(aVar.f40312a)) {
            return true;
        }
        return false;
    }

    public static AtomicBoolean y() {
        h hVar = el.g.f15652s;
        if (sl.a.b(el.g.class)) {
            return null;
        }
        try {
            return el.g.f15655v;
        } catch (Throwable th2) {
            sl.a.a(el.g.class, th2);
            return null;
        }
    }

    @Override // lk.d
    public final void a(lk.e eVar) {
        eVar.onStart();
    }

    @Override // lk.d
    public final void b(lk.e eVar) {
    }

    @Override // ek.x
    public final w f(c0 c0Var) {
        switch (this.f15591a) {
            case 0:
                return new i(0);
            case 1:
            default:
                return new e0(c0Var.a(l.class, InputStream.class), 1);
            case 2:
                return new e0(c0Var.a(Uri.class, InputStream.class), 0);
        }
    }

    @Override // hk.d0
    public final void j(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        mediaMetadataRetriever.setDataSource(new hk.c0((ByteBuffer) obj));
    }

    @Override // sk.c
    public final void k(Object obj) {
    }

    public final String p(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        e eVar = yk.m.f41703c;
        Intrinsics.checkNotNullParameter(context, "context");
        if (yk.m.a() == null) {
            synchronized (yk.m.c()) {
                try {
                    if (yk.m.a() == null) {
                        String string = context.getSharedPreferences(FacebookSdk.APP_EVENT_PREFERENCES, 0).getString("anonymousAppDeviceGUID", null);
                        if (!sl.a.b(yk.m.class)) {
                            try {
                                yk.m.f41707g = string;
                            } catch (Throwable th2) {
                                sl.a.a(yk.m.class, th2);
                            }
                        }
                        if (yk.m.a() == null) {
                            UUID randomUUID = UUID.randomUUID();
                            Intrinsics.checkNotNullExpressionValue(randomUUID, "randomUUID()");
                            String i10 = Intrinsics.i(randomUUID, "XZ");
                            if (!sl.a.b(yk.m.class)) {
                                try {
                                    yk.m.f41707g = i10;
                                } catch (Throwable th3) {
                                    sl.a.a(yk.m.class, th3);
                                }
                            }
                            context.getSharedPreferences(FacebookSdk.APP_EVENT_PREFERENCES, 0).edit().putString("anonymousAppDeviceGUID", yk.m.a()).apply();
                        }
                    }
                    Unit unit = Unit.f23355a;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
        String a10 = yk.m.a();
        if (a10 != null) {
            return a10;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public final xk.g r() {
        xk.g gVar;
        xk.g gVar2 = xk.g.f40364g;
        if (gVar2 == null) {
            synchronized (this) {
                gVar = xk.g.f40364g;
                if (gVar == null) {
                    a5.b a10 = a5.b.a(FacebookSdk.getApplicationContext());
                    Intrinsics.checkNotNullExpressionValue(a10, "getInstance(applicationContext)");
                    xk.g gVar3 = new xk.g(a10, new xk.b());
                    xk.g.f40364g = gVar3;
                    gVar = gVar3;
                }
            }
            return gVar;
        }
        return gVar2;
    }

    public final synchronized xk.j0 s() {
        xk.j0 j0Var;
        try {
            if (xk.j0.f40405e == null) {
                a5.b a10 = a5.b.a(FacebookSdk.getApplicationContext());
                Intrinsics.checkNotNullExpressionValue(a10, "getInstance(applicationContext)");
                xk.j0.f40405e = new xk.j0(a10, new xk.i0());
            }
            j0Var = xk.j0.f40405e;
            if (j0Var == null) {
                Intrinsics.k("instance");
                throw null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return j0Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i10, int i11) {
        this(9);
        this.f15591a = i10;
        switch (i10) {
            case 10:
                this(10);
                return;
            case 11:
                this(11);
                return;
            case 12:
                this(12);
                return;
            case 13:
                this(13);
                return;
            case 14:
                this(14);
                return;
            case 15:
                this(15);
                return;
            case 16:
                this(16);
                return;
            case 17:
                this(17);
                return;
            case 18:
                this(18);
                return;
            case 19:
                this(19);
                return;
            case 20:
                this(20);
                return;
            case 21:
                this(21);
                return;
            case 22:
                this(22);
                return;
            case 23:
                this(23);
                return;
            case 24:
                this(24);
                return;
            case 25:
                this(25);
                return;
            case 26:
                this(26);
                return;
            case 27:
                this(27);
                return;
            case 28:
                this(28);
                return;
            case 29:
                this(29);
                return;
            default:
                return;
        }
    }
}
