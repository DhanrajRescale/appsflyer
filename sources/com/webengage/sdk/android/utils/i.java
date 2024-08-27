package com.webengage.sdk.android.utils;

import com.google.android.gms.common.api.GoogleApiClient;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public class i {
    public static Object a(String str, String str2, Class<?>[] clsArr, Object[] objArr) {
        try {
            return Class.forName(str).getMethod(str2, clsArr).invoke(null, objArr);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean b() {
        try {
            Class.forName("com.webengage.cordova.WebEngagePlugin");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static boolean c() {
        try {
            Class.forName("com.google.android.gms.location.LocationServices");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static boolean d() {
        try {
            Class.forName("com.google.android.gms.location.GeofencingEvent");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static boolean e() {
        try {
            Class.forName("com.google.android.gms.location.Geofence");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static boolean f() {
        try {
            Class.forName("com.google.android.gms.location.GeofencingRequest");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static boolean g() {
        try {
            String str = GoogleApiClient.DEFAULT_ACCOUNT;
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static boolean h() {
        try {
            Class.forName("com.google.android.gms.gcm.GoogleCloudMessaging");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static boolean i() {
        return true;
    }

    public static boolean j() {
        try {
            Class.forName("com.google.android.gms.location.LocationResult");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static boolean a() {
        return true;
    }
}
