package com.google.android.recaptcha.internal;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class zzcn implements zzby {

    @NotNull
    public static final zzcn zza = new zzcn();

    private zzcn() {
    }

    @Override // com.google.android.recaptcha.internal.zzby
    public final void zza(int i10, @NotNull zzbl zzblVar, @NotNull Object... objArr) throws zzt {
        if (objArr.length == 2) {
            Object obj = objArr[0];
            if (true != (obj instanceof int[])) {
                obj = null;
            }
            int[] iArr = (int[]) obj;
            if (iArr != null) {
                Object obj2 = objArr[1];
                if (true != (obj2 instanceof String)) {
                    obj2 = null;
                }
                String str = (String) obj2;
                if (str != null) {
                    zzbm zzc = zzblVar.zzc();
                    StringBuilder sb2 = new StringBuilder();
                    try {
                        for (int i11 : iArr) {
                            sb2.append(str.charAt(i11));
                        }
                        zzc.zzf(i10, sb2.toString());
                        return;
                    } catch (Exception e10) {
                        throw new zzt(4, 22, e10);
                    }
                }
                throw new zzt(4, 5, null);
            }
            throw new zzt(4, 5, null);
        }
        throw new zzt(4, 3, null);
    }
}
