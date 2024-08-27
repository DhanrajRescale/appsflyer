package com.webengage.sdk.android;

import android.content.Context;
import android.content.SharedPreferences;
import com.webengage.sdk.android.utils.DataType;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private static final List<String> f12551a;

    /* renamed from: b, reason: collision with root package name */
    public Context f12552b;

    static {
        ArrayList arrayList = new ArrayList();
        f12551a = arrayList;
        arrayList.add("com.webengage.static.interfaceID");
    }

    public h(Context context) {
        this.f12552b = null;
        this.f12552b = context.getApplicationContext();
    }

    private Set<String> m() {
        return new HashSet(b("webengage_prefs.txt").getStringSet("push_shown", new HashSet()));
    }

    public void a() {
        Set<String> m10 = m();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        HashSet hashSet = new HashSet();
        for (String str : m10) {
            try {
                if (System.currentTimeMillis() - simpleDateFormat.parse(str.substring(str.lastIndexOf(" ") + 1)).getTime() < 604800000) {
                    hashSet.add(str);
                }
            } catch (ParseException e10) {
                Logger.e("WebEngage", "Exception while parsing push shown date", e10);
            }
        }
        a("push_shown", hashSet);
    }

    public long b() {
        return b("webengage_prefs.txt").getLong("amplify_interval", 10800000L);
    }

    public String c(String str) {
        return b("webengage_volatile_prefs.txt").getString(str, HttpUrl.FRAGMENT_ENCODE_SET);
    }

    public String d() {
        return b("webengage_prefs.txt").getString("com.webengage.static.cuid", HttpUrl.FRAGMENT_ENCODE_SET);
    }

    public String e() {
        return b("webengage_prefs.txt").getString("com.webengage.static.hwRegID", HttpUrl.FRAGMENT_ENCODE_SET);
    }

    public String f() {
        String string = b("webengage_persistent_prefs.txt").getString("com.webengage.static.interfaceID", HttpUrl.FRAGMENT_ENCODE_SET);
        return string.isEmpty() ? b("webengage_prefs.txt").getString("com.webengage.static.interfaceID", HttpUrl.FRAGMENT_ENCODE_SET) : string;
    }

    public String g() {
        return b("webengage_prefs.txt").getString("com.webengage.static.luid", HttpUrl.FRAGMENT_ENCODE_SET);
    }

    public String h() {
        return b("webengage_prefs.txt").getString("com.webengage.static.regID", HttpUrl.FRAGMENT_ENCODE_SET);
    }

    public String i() {
        return b("webengage_prefs.txt").getString("com.webengage.session.suid", HttpUrl.FRAGMENT_ENCODE_SET);
    }

    public long j() {
        return b("webengage_prefs.txt").getLong("session_destroy_time", -1L);
    }

    public List<String> k() {
        try {
            return (List) DataType.convert(b("webengage_prefs.txt").getString("com.webengage.session.evaluatedIds", HttpUrl.FRAGMENT_ENCODE_SET), DataType.LIST, false);
        } catch (Exception unused) {
            return null;
        }
    }

    public Set<String> l() {
        Set<String> m10 = m();
        HashSet hashSet = new HashSet();
        for (String str : m10) {
            hashSet.add(str.substring(0, str.lastIndexOf(" ")));
        }
        return hashSet;
    }

    public Map<String, Map<String, String>> n() {
        try {
            return (Map) DataType.convert(b("webengage_prefs.txt").getString("com.webengage.session.variations", HttpUrl.FRAGMENT_ENCODE_SET), DataType.MAP, false);
        } catch (Exception unused) {
            return null;
        }
    }

    public int o() {
        return b("webengage_prefs.txt").getInt("com.webengage.static.version_code", -1);
    }

    public String p() {
        return b("webengage_prefs.txt").getString("com.webengage.static.mIregID", HttpUrl.FRAGMENT_ENCODE_SET);
    }

    public boolean q() {
        return b("webengage_prefs.txt").getBoolean("install_referrer_set", true);
    }

    public void a(long j10) {
        a("amplify_interval", Long.valueOf(j10));
    }

    public SharedPreferences b(String str) {
        return this.f12552b.getSharedPreferences(str, 0);
    }

    public boolean c() {
        return b("webengage_volatile_prefs.txt").getBoolean("com.webengage.static.app_crashed", false);
    }

    public void d(String str) {
        SharedPreferences.Editor edit = b("webengage_volatile_prefs.txt").edit();
        edit.remove(str);
        edit.apply();
    }

    public void e(String str) {
        Logger.d("WebEngage", "HW token: " + str);
        a("com.webengage.static.hwRegID", (Object) str);
    }

    public void f(String str) {
        Logger.d("WebEngage", "Push token: " + str);
        a("com.webengage.static.regID", (Object) str);
    }

    public void g(String str) {
        if (str != null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            String g10 = a3.a.g(str, " ", simpleDateFormat.format(new Date()));
            Set<String> m10 = m();
            m10.add(g10);
            a("push_shown", m10);
        }
    }

    public void h(String str) {
        Logger.d("WebEngage", "MI token: " + str);
        a("com.webengage.static.mIregID", (Object) str);
    }

    public void a(String str, String str2) {
        a("webengage_volatile_prefs.txt", str, str2, true);
    }

    public void b(long j10) {
        a("session_destroy_time", Long.valueOf(j10));
    }

    public void a(List<String> list) {
        try {
            a("com.webengage.session.evaluatedIds", DataType.convert(list, DataType.STRING, false));
        } catch (Exception unused) {
        }
    }

    public void a(Map<String, Map<String, String>> map) {
        try {
            a("com.webengage.session.variations", DataType.convert(map, DataType.STRING, false));
        } catch (Exception unused) {
        }
    }

    public boolean a(String str) {
        return b(str).edit().clear().commit();
    }

    public boolean a(String str, Object obj) {
        return a(str, obj, true);
    }

    public boolean a(String str, Object obj, boolean z10) {
        return a(f12551a.contains(str) ? "webengage_persistent_prefs.txt" : "webengage_prefs.txt", str, obj, z10);
    }

    public boolean a(String str, String str2, Object obj, boolean z10) {
        SharedPreferences b10 = b(str);
        if (b10 == null) {
            return false;
        }
        if (!z10 && b10.contains(str2)) {
            return true;
        }
        SharedPreferences.Editor edit = b10.edit();
        if (obj instanceof String) {
            edit.putString(str2, String.valueOf(obj));
        } else if (obj instanceof Integer) {
            edit.putInt(str2, ((Integer) obj).intValue());
        } else if (obj instanceof Float) {
            edit.putFloat(str2, ((Float) obj).floatValue());
        } else if (obj instanceof Boolean) {
            edit.putBoolean(str2, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Long) {
            edit.putLong(str2, ((Long) obj).longValue());
        } else if (obj instanceof Set) {
            edit.putStringSet(str2, (Set) obj);
        }
        edit.apply();
        return true;
    }
}
