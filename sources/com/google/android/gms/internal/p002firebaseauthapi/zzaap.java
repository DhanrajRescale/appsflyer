package com.google.android.gms.internal.p002firebaseauthapi;

import java.lang.reflect.Type;

/* loaded from: classes2.dex */
public final class zzaap {
    private static final String zza = "com.google.android.gms.internal.firebase-auth-api.zzaap";

    private zzaap() {
    }

    public static Object zza(String str, Type type) throws zzyi {
        if (type == String.class) {
            try {
                zzach zzachVar = new zzach();
                zzachVar.zzb(str);
                if (zzachVar.zzd()) {
                    return zzachVar.zzc();
                }
                throw new zzyi("No error message: " + str);
            } catch (Exception e10) {
                throw new zzyi("Json conversion failed! ".concat(String.valueOf(e10.getMessage())), e10);
            }
        }
        if (type != Void.class) {
            try {
                try {
                    return ((zzaar) ((Class) type).getConstructor(new Class[0]).newInstance(new Object[0])).zza(str);
                } catch (Exception e11) {
                    throw new zzyi("Json conversion failed! ".concat(String.valueOf(e11.getMessage())), e11);
                }
            } catch (Exception e12) {
                throw new zzyi("Instantiation of JsonResponse failed! ".concat(type.toString()), e12);
            }
        }
        return null;
    }
}
