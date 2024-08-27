package yk;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import android.util.Patterns;
import com.facebook.FacebookSdk;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import nl.n0;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: b, reason: collision with root package name */
    public static SharedPreferences f41736b;

    /* renamed from: a, reason: collision with root package name */
    public static final w f41735a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicBoolean f41737c = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    public static final ConcurrentHashMap f41738d = new ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final ConcurrentHashMap f41739e = new ConcurrentHashMap();

    public final HashMap a() {
        if (sl.a.b(this)) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            CopyOnWriteArraySet copyOnWriteArraySet = zk.c.f42542d;
            HashSet hashSet = new HashSet();
            Iterator it = zk.c.a().iterator();
            while (it.hasNext()) {
                hashSet.add(((zk.c) it.next()).b());
            }
            ConcurrentHashMap concurrentHashMap = f41739e;
            for (String str : concurrentHashMap.keySet()) {
                if (hashSet.contains(str)) {
                    hashMap.put(str, concurrentHashMap.get(str));
                }
            }
            return hashMap;
        } catch (Throwable th2) {
            sl.a.a(this, th2);
            return null;
        }
    }

    public final synchronized void b() {
        if (sl.a.b(this)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = f41737c;
            if (atomicBoolean.get()) {
                return;
            }
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.getApplicationContext());
            Intrinsics.checkNotNullExpressionValue(defaultSharedPreferences, "getDefaultSharedPreferences(FacebookSdk.getApplicationContext())");
            f41736b = defaultSharedPreferences;
            if (defaultSharedPreferences != null) {
                String string = defaultSharedPreferences.getString("com.facebook.appevents.UserDataStore.userData", HttpUrl.FRAGMENT_ENCODE_SET);
                if (string == null) {
                    string = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                SharedPreferences sharedPreferences = f41736b;
                if (sharedPreferences != null) {
                    String string2 = sharedPreferences.getString("com.facebook.appevents.UserDataStore.internalUserData", HttpUrl.FRAGMENT_ENCODE_SET);
                    if (string2 == null) {
                        string2 = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    f41738d.putAll(n0.D(string));
                    f41739e.putAll(n0.D(string2));
                    atomicBoolean.set(true);
                    return;
                }
                Intrinsics.k("sharedPreferences");
                throw null;
            }
            Intrinsics.k("sharedPreferences");
            throw null;
        } catch (Throwable th2) {
            sl.a.a(this, th2);
        }
    }

    public final String c(String str, String str2) {
        String str3;
        int i10;
        boolean z10;
        if (sl.a.b(this)) {
            return null;
        }
        try {
            int length = str2.length() - 1;
            int i11 = 0;
            boolean z11 = false;
            while (i11 <= length) {
                if (!z11) {
                    i10 = i11;
                } else {
                    i10 = length;
                }
                if (Intrinsics.f(str2.charAt(i10), 32) <= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z11) {
                    if (!z10) {
                        z11 = true;
                    } else {
                        i11++;
                    }
                } else {
                    if (!z10) {
                        break;
                    }
                    length--;
                }
            }
            String obj = str2.subSequence(i11, length + 1).toString();
            if (obj != null) {
                String lowerCase = obj.toLowerCase();
                Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
                if (Intrinsics.a("em", str)) {
                    if (!Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                        Log.e("w", "Setting email failure: this is not a valid email address");
                        return HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    return lowerCase;
                }
                if (Intrinsics.a("ph", str)) {
                    return new Regex("[^0-9]").replace(lowerCase, HttpUrl.FRAGMENT_ENCODE_SET);
                }
                if (Intrinsics.a("ge", str)) {
                    if (lowerCase.length() > 0) {
                        if (lowerCase != null) {
                            str3 = lowerCase.substring(0, 1);
                            Intrinsics.checkNotNullExpressionValue(str3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        }
                    } else {
                        str3 = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    if (!Intrinsics.a("f", str3) && !Intrinsics.a("m", str3)) {
                        Log.e("w", "Setting gender failure: the supported value for gender is f or m");
                        return HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    return str3;
                }
                return lowerCase;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } catch (Throwable th2) {
            sl.a.a(this, th2);
            return null;
        }
    }
}
