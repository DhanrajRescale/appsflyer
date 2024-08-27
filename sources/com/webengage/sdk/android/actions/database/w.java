package com.webengage.sdk.android.actions.database;

import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.location.Address;
import android.location.Geocoder;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.webengage.sdk.android.utils.WebEngageUtils;
import in.juspay.hyper.constants.LogSubCategory;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes2.dex */
class w {

    /* renamed from: a, reason: collision with root package name */
    private Context f12307a;

    public w(Context context) {
        this.f12307a = null;
        this.f12307a = context.getApplicationContext();
    }

    public Map<String, Object> a(Double d10, Double d11) {
        if (d10 != null && d11 != null) {
            try {
                Address address = new Geocoder(this.f12307a, Locale.ENGLISH).getFromLocation(d10.doubleValue(), d11.doubleValue(), 1).get(0);
                HashMap hashMap = new HashMap();
                if (address != null) {
                    if (address.getLocality() != null && !address.getLocality().isEmpty()) {
                        hashMap.put("city", address.getLocality());
                    }
                    if (address.getCountryName() != null && !address.getCountryName().isEmpty()) {
                        hashMap.put("country", address.getCountryName());
                    }
                    if (address.getAdminArea() != null && !address.getAdminArea().isEmpty()) {
                        hashMap.put("region", address.getAdminArea());
                    }
                    if (address.getPostalCode() != null && !address.getPostalCode().isEmpty()) {
                        hashMap.put("postal_code", address.getPostalCode());
                    }
                    if (address.getFeatureName() != null && !address.getFeatureName().isEmpty()) {
                        hashMap.put("locality", address.getSubLocality());
                    }
                }
                return hashMap;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public String b() {
        try {
            DisplayMetrics d10 = d();
            int i10 = d10.widthPixels;
            int i11 = d10.heightPixels;
            return Math.sqrt((double) ((i11 * i11) + (i10 * i10))) / ((double) d10.densityDpi) < 7.0d ? "Mobile" : "Tablet";
        } catch (Exception unused) {
            return "Mobile";
        }
    }

    public Map<String, Object> c() {
        HashMap hashMap = new HashMap();
        PackageInfo e10 = WebEngageUtils.e(this.f12307a);
        hashMap.put("status_airplane_mode", Boolean.valueOf(x.a(this.f12307a)));
        hashMap.put("status_nfc", Boolean.valueOf(x.f(this.f12307a)));
        hashMap.put("status_wifi", x.g(this.f12307a));
        hashMap.put("status_bluetooth", x.b(this.f12307a));
        hashMap.put("status_gps", x.e(this.f12307a));
        hashMap.put("opt_in_push", Boolean.valueOf(a()));
        String a10 = WebEngageUtils.a(this.f12307a);
        if (!a10.isEmpty()) {
            hashMap.put("advertising_id", a10);
        }
        if (e10 != null) {
            hashMap.put("app_installed_on", new Date(e10.firstInstallTime));
        }
        hashMap.put("viewport_height", Integer.valueOf(d().heightPixels));
        hashMap.put("viewport_width", Integer.valueOf(d().widthPixels));
        hashMap.put("language", Locale.getDefault().getDisplayLanguage(Locale.US));
        String c10 = x.c(this.f12307a);
        if (c10 != null && !c10.isEmpty()) {
            hashMap.put("carrier", c10.toUpperCase());
        }
        String d10 = x.d(this.f12307a);
        if (d10 != null && !d10.isEmpty() && !d10.equalsIgnoreCase("UNKNOWN")) {
            hashMap.put("carrier_type", d10);
        }
        hashMap.put("model", Build.MODEL);
        hashMap.put("brand", Build.BRAND);
        hashMap.put(LogSubCategory.Context.DEVICE, Build.DEVICE);
        hashMap.put("manufacturer", Build.MANUFACTURER);
        String str = Build.VERSION.RELEASE;
        hashMap.put("release", str);
        hashMap.put("api_version", Integer.valueOf(Build.VERSION.SDK_INT));
        hashMap.put("os_name", "Android");
        hashMap.put("os_version", str);
        hashMap.put("device_type", b());
        hashMap.put("locale", Locale.getDefault().toString());
        hashMap.put("time_zone", WebEngageUtils.a());
        hashMap.put("tz_name", WebEngageUtils.b());
        if (e10 != null) {
            hashMap.put("app_version", e10.versionName);
            hashMap.put("app_version_code", Integer.valueOf(e10.versionCode));
        }
        return hashMap;
    }

    public DisplayMetrics d() {
        WindowManager windowManager = (WindowManager) this.f12307a.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public Map<String, Object> a(Map<String, Object> map, boolean z10) {
        WebEngageUtils.e(this.f12307a);
        com.webengage.sdk.android.utils.h hVar = new com.webengage.sdk.android.utils.h();
        if (map != null) {
            hVar.a(map);
        }
        if (z10) {
            hVar.a("status_airplane_mode", DataHolder.get().b("status_airplane_mode"));
            hVar.a("status_nfc", DataHolder.get().b("status_nfc"));
            hVar.a("status_wifi", DataHolder.get().b("status_wifi"));
            hVar.a("status_bluetooth", DataHolder.get().b("status_bluetooth"));
            hVar.a("status_gps", DataHolder.get().b("status_gps"));
            hVar.a("app_installed_on", DataHolder.get().b("app_installed_on"));
            hVar.a("android_id", DataHolder.get().b("android_id"));
            hVar.a("advertising_id", DataHolder.get().b("advertising_id"));
            hVar.put("tz_name", DataHolder.get().b("tz_name"));
            hVar.a("opt_in_push", DataHolder.get().b("opt_in_push"));
        }
        hVar.a("latitude", DataHolder.get().n());
        hVar.a("longitude", DataHolder.get().p());
        hVar.a("city", DataHolder.get().d());
        hVar.a("country", DataHolder.get().e());
        hVar.a("region", DataHolder.get().s());
        hVar.a("locality", DataHolder.get().o());
        hVar.a("postal_code", DataHolder.get().r());
        hVar.a("total_page_view_count", DataHolder.get().B(), 0L);
        hVar.a("page_view_count_session", DataHolder.get().x(), 0L);
        if ("online".equalsIgnoreCase(DataHolder.get().m())) {
            hVar.a("session_type", "online");
            hVar.a("session_count", DataHolder.get().h(), 0L);
            hVar.a("screen_name", DataHolder.get().t());
            hVar.a("screen_title", DataHolder.get().v());
            hVar.a("screen_path", DataHolder.get().u());
        } else {
            hVar.a("session_type", "background");
            hVar.a("session_count", DataHolder.get().b(), 0L);
        }
        hVar.a("viewport_height", DataHolder.get().b("viewport_height"));
        hVar.a("viewport_width", DataHolder.get().b("viewport_width"));
        hVar.a("language", DataHolder.get().b("language"));
        hVar.a("carrier", DataHolder.get().b("carrier"));
        hVar.a("carrier_type", DataHolder.get().b("carrier_type"));
        hVar.a("model", DataHolder.get().b("model"));
        hVar.a("brand", DataHolder.get().b("brand"));
        hVar.a(LogSubCategory.Context.DEVICE, DataHolder.get().b(LogSubCategory.Context.DEVICE));
        hVar.a("manufacturer", DataHolder.get().b("manufacturer"));
        hVar.a("release", DataHolder.get().b("release"));
        hVar.a("api_version", DataHolder.get().b("api_version"));
        hVar.a("os_name", DataHolder.get().b("os_name"));
        hVar.a("os_version", DataHolder.get().b("os_version"));
        hVar.a("device_type", DataHolder.get().b("device_type"));
        hVar.a("locale", DataHolder.get().b("locale"));
        hVar.a("time_zone", DataHolder.get().b("time_zone"));
        hVar.a("tzo", DataHolder.get().z());
        hVar.a("app_version", DataHolder.get().b("app_version"));
        hVar.a("app_version_code", DataHolder.get().b("app_version_code"));
        return hVar;
    }

    private boolean a() {
        try {
            return ((NotificationManager) this.f12307a.getSystemService("notification")).areNotificationsEnabled();
        } catch (Exception unused) {
            return true;
        }
    }
}
