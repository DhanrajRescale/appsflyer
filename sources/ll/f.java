package ll;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.facebook.FacebookSdk;
import com.facebook.login.LoginManager;
import com.google.firebase.components.ComponentRegistrar;
import com.google.protobuf.x;
import in.juspay.hyper.constants.Labels;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.s;
import nl.e0;
import nl.n0;
import nl.p;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import vt.p0;
import xk.g0;

/* loaded from: classes.dex */
public class f implements ln.b, x, bq.e, kr.b, or.b, et.c, et.e {

    /* renamed from: b, reason: collision with root package name */
    public static f f24908b;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24909a;

    public /* synthetic */ f(int i10) {
        this.f24909a = i10;
    }

    /* JADX WARN: Type inference failed for: r9v3, types: [m9.m, java.lang.Object] */
    public static final m9.m f(JSONObject jSONObject) {
        String optString;
        int i10 = wl.i.f39198l;
        JSONArray jSONArray = jSONObject.getJSONObject("permissions").getJSONArray("data");
        ArrayList grantedPermissions = new ArrayList();
        ArrayList declinedPermissions = new ArrayList();
        ArrayList expiredPermissions = new ArrayList();
        int length = jSONArray.length();
        if (length > 0) {
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                JSONObject optJSONObject = jSONArray.optJSONObject(i11);
                String permission = optJSONObject.optString(Labels.System.PERMISSION);
                Intrinsics.checkNotNullExpressionValue(permission, "permission");
                if (permission.length() != 0 && !Intrinsics.a(permission, "installed") && (optString = optJSONObject.optString("status")) != null) {
                    int hashCode = optString.hashCode();
                    if (hashCode != -1309235419) {
                        if (hashCode != 280295099) {
                            if (hashCode == 568196142 && optString.equals("declined")) {
                                declinedPermissions.add(permission);
                            }
                        } else if (optString.equals("granted")) {
                            grantedPermissions.add(permission);
                        }
                    } else if (optString.equals("expired")) {
                        expiredPermissions.add(permission);
                    }
                }
                if (i12 >= length) {
                    break;
                }
                i11 = i12;
            }
        }
        Intrinsics.checkNotNullParameter(grantedPermissions, "grantedPermissions");
        Intrinsics.checkNotNullParameter(declinedPermissions, "declinedPermissions");
        Intrinsics.checkNotNullParameter(expiredPermissions, "expiredPermissions");
        ?? obj = new Object();
        obj.f27657a = grantedPermissions;
        obj.f27658b = declinedPermissions;
        obj.f27659c = expiredPermissions;
        return obj;
    }

    public static p j() {
        return new p(null, p0.f(new Pair(2, null), new Pair(4, null), new Pair(9, null), new Pair(17, null), new Pair(341, null)), p0.f(new Pair(102, null), new Pair(190, null), new Pair(412, null)), null, null, null);
    }

    public static String k() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("init", System.currentTimeMillis());
        } catch (JSONException unused) {
        }
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "e2e.toString()");
        return jSONObject2;
    }

    public static boolean p(String str) {
        if (str == null) {
            return false;
        }
        if (!s.r(str, "publish", false) && !s.r(str, "manage", false) && !LoginManager.f10883g.contains(str)) {
            return false;
        }
        return true;
    }

    public static HashMap t(JSONObject jSONObject) {
        int optInt;
        HashSet hashSet;
        JSONArray optJSONArray = jSONObject.optJSONArray("items");
        if (optJSONArray == null || optJSONArray.length() == 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        int length = optJSONArray.length();
        if (length > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                JSONObject optJSONObject = optJSONArray.optJSONObject(i10);
                if (optJSONObject != null && (optInt = optJSONObject.optInt("code")) != 0) {
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("subcodes");
                    if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                        hashSet = new HashSet();
                        int length2 = optJSONArray2.length();
                        if (length2 > 0) {
                            int i12 = 0;
                            while (true) {
                                int i13 = i12 + 1;
                                int optInt2 = optJSONArray2.optInt(i12);
                                if (optInt2 != 0) {
                                    hashSet.add(Integer.valueOf(optInt2));
                                }
                                if (i13 >= length2) {
                                    break;
                                }
                                i12 = i13;
                            }
                        }
                    } else {
                        hashSet = null;
                    }
                    hashMap.put(Integer.valueOf(optInt), hashSet);
                }
                if (i11 >= length) {
                    break;
                }
                i10 = i11;
            }
        }
        return hashMap;
    }

    public static void v(or.c cVar, StringBuilder sb2) {
        int charAt = (sb2.charAt(1) * '(') + (sb2.charAt(0) * 1600) + sb2.charAt(2) + 1;
        cVar.f30265c.append(new String(new char[]{(char) (charAt / 256), (char) (charAt % 256)}));
        sb2.delete(0, 3);
    }

    @Override // bq.e
    public final List a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (bq.a aVar : componentRegistrar.getComponents()) {
            String str = aVar.f7238a;
            if (str != null) {
                aVar = new bq.a(str, aVar.f7239b, aVar.f7240c, aVar.f7241d, aVar.f7242e, new hr.d(str, 1, aVar), aVar.f7244g);
            }
            arrayList.add(aVar);
        }
        return arrayList;
    }

    @Override // et.c
    public final void b(Object obj) {
    }

    @Override // or.b
    public void c(or.c cVar) {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            if (!cVar.b()) {
                break;
            }
            char a10 = cVar.a();
            cVar.f30266d++;
            int h10 = h(a10, sb2);
            int length = cVar.f30265c.length() + ((sb2.length() / 3) << 1);
            cVar.c(length);
            int i10 = cVar.f30268f.f30276b - length;
            if (!cVar.b()) {
                StringBuilder sb3 = new StringBuilder();
                if (sb2.length() % 3 == 2 && (i10 < 2 || i10 > 2)) {
                    int length2 = sb2.length();
                    sb2.delete(length2 - h10, length2);
                    cVar.f30266d--;
                    h10 = h(cVar.a(), sb3);
                    cVar.f30268f = null;
                }
                while (sb2.length() % 3 == 1 && ((h10 <= 3 && i10 != 1) || h10 > 3)) {
                    int length3 = sb2.length();
                    sb2.delete(length3 - h10, length3);
                    cVar.f30266d--;
                    h10 = h(cVar.a(), sb3);
                    cVar.f30268f = null;
                }
            } else if (sb2.length() % 3 == 0) {
                if (zq.f.Y(cVar.f30263a, cVar.f30266d, l()) != l()) {
                    cVar.f30267e = 0;
                    break;
                }
            }
        }
        o(cVar, sb2);
    }

    @Override // et.e
    public final boolean d(Object obj) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0364 A[LOOP:3: B:104:0x0362->B:105:0x0364, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x07ac  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:478:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:503:0x007b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0247  */
    /* JADX WARN: Type inference failed for: r3v9, types: [e.j, java.lang.Object] */
    @Override // kr.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final mr.b e(java.lang.String r26, int r27, int r28, int r29, java.util.Map r30) {
        /*
            Method dump skipped, instructions count: 3366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ll.f.e(java.lang.String, int, int, int, java.util.Map):mr.b");
    }

    public float g(float f10, float f11) {
        return 1.0f;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        switch (this.f24909a) {
            case 14:
                return new m8.b(Executors.newSingleThreadExecutor(), 1);
            default:
                pn.a aVar = pn.a.f31225f;
                if (aVar != null) {
                    return aVar;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public int h(char c10, StringBuilder sb2) {
        if (c10 == ' ') {
            sb2.append((char) 3);
            return 1;
        }
        if (c10 >= '0' && c10 <= '9') {
            sb2.append((char) (c10 - ','));
            return 1;
        }
        if (c10 >= 'A' && c10 <= 'Z') {
            sb2.append((char) (c10 - '3'));
            return 1;
        }
        if (c10 < ' ') {
            sb2.append((char) 0);
            sb2.append(c10);
            return 2;
        }
        if (c10 >= '!' && c10 <= '/') {
            sb2.append((char) 1);
            sb2.append((char) (c10 - '!'));
            return 2;
        }
        if (c10 >= ':' && c10 <= '@') {
            sb2.append((char) 1);
            sb2.append((char) (c10 - '+'));
            return 2;
        }
        if (c10 >= '[' && c10 <= '_') {
            sb2.append((char) 1);
            sb2.append((char) (c10 - 'E'));
            return 2;
        }
        if (c10 >= '`' && c10 <= 127) {
            sb2.append((char) 2);
            sb2.append((char) (c10 - '`'));
            return 2;
        }
        sb2.append("\u0001\u001e");
        return h((char) (c10 - 128), sb2) + 2;
    }

    public final synchronized p i() {
        p pVar;
        try {
            if (p.f28896e == null) {
                p.f28896e = j();
            }
            pVar = p.f28896e;
            if (pVar == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.FacebookRequestErrorClassification");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return pVar;
    }

    public int l() {
        return 1;
    }

    public final LoginManager m() {
        if (LoginManager.f10885i == null) {
            synchronized (this) {
                LoginManager.f10885i = new LoginManager();
                Unit unit = Unit.f23355a;
            }
        }
        LoginManager loginManager = LoginManager.f10885i;
        if (loginManager != null) {
            return loginManager;
        }
        Intrinsics.k("instance");
        throw null;
    }

    public final Uri n(Bundle bundle, String action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return n0.b(nl.l.c(), FacebookSdk.getGraphApiVersion() + "/dialog/" + action, bundle);
    }

    public void o(or.c cVar, StringBuilder sb2) {
        int length = (sb2.length() / 3) << 1;
        int length2 = sb2.length() % 3;
        int length3 = cVar.f30265c.length() + length;
        cVar.c(length3);
        int i10 = cVar.f30268f.f30276b - length3;
        if (length2 == 2) {
            sb2.append((char) 0);
            while (sb2.length() >= 3) {
                v(cVar, sb2);
            }
            if (cVar.b()) {
                cVar.d((char) 254);
            }
        } else if (i10 == 1 && length2 == 1) {
            while (sb2.length() >= 3) {
                v(cVar, sb2);
            }
            if (cVar.b()) {
                cVar.d((char) 254);
            }
            cVar.f30266d--;
        } else if (length2 == 0) {
            while (sb2.length() >= 3) {
                v(cVar, sb2);
            }
            if (i10 > 0 || cVar.b()) {
                cVar.d((char) 254);
            }
        } else {
            throw new IllegalStateException("Unexpected case. Please report!");
        }
        cVar.f30267e = 0;
    }

    public final void q(g0 behavior, int i10, String tag, String string) {
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(string, "string");
        if (FacebookSdk.isLoggingBehaviorEnabled(behavior)) {
            synchronized (this) {
                for (Map.Entry entry : e0.f28851d.entrySet()) {
                    string = s.n(string, (String) entry.getKey(), (String) entry.getValue(), false);
                }
            }
            if (!s.r(tag, "FacebookSDK.", false)) {
                tag = Intrinsics.i(tag, "FacebookSDK.");
            }
            Log.println(i10, tag, string);
            if (behavior == g0.f40375f) {
                new Exception().printStackTrace();
            }
        }
    }

    public final void r(g0 behavior, String tag, String string) {
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(string, "string");
        q(behavior, 3, tag, string);
    }

    public final void s(g0 behavior, String tag, String format, Object... args) {
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        if (FacebookSdk.isLoggingBehaviorEnabled(behavior)) {
            Object[] copyOf = Arrays.copyOf(args, args.length);
            q(behavior, 3, tag, a3.a.m(copyOf, copyOf.length, format, "java.lang.String.format(format, *args)"));
        }
    }

    public final String toString() {
        switch (this.f24909a) {
            case 28:
                return "EmptyConsumer";
            default:
                return super.toString();
        }
    }

    public final synchronized void u(String original) {
        Intrinsics.checkNotNullParameter(original, "accessToken");
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        if (!FacebookSdk.isLoggingBehaviorEnabled(g0.f40371b)) {
            synchronized (this) {
                Intrinsics.checkNotNullParameter(original, "original");
                Intrinsics.checkNotNullParameter("ACCESS_TOKEN_REMOVED", "replace");
                e0.f28851d.put(original, "ACCESS_TOKEN_REMOVED");
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i10, int i11) {
        this(0);
        this.f24909a = i10;
        switch (i10) {
            case 1:
                this(1);
                return;
            case 2:
                this(2);
                return;
            case 3:
                this(3);
                return;
            case 4:
                this(4);
                return;
            case 5:
                this(5);
                return;
            case 6:
                this(6);
                return;
            case 7:
                this(7);
                return;
            case 8:
                this(8);
                return;
            case 9:
                this(9);
                return;
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
            default:
                switch (i10) {
                    case 25:
                        this(25);
                        return;
                    case 26:
                        this(26);
                        return;
                    case 27:
                        this(27);
                        return;
                    default:
                        return;
                }
        }
    }

    public f(ls.n0 n0Var, Activity activity) {
        this.f24909a = 24;
        activity.getWindow().getDecorView().setOnTouchListener(new os.k(n0Var));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f() {
        this(16);
        this.f24909a = 16;
    }
}
