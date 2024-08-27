package com.google.android.gms.internal.measurement;

import android.net.Uri;
import t.f;
import t.j0;

/* loaded from: classes2.dex */
public final class zzhq {
    private static final f zza = new j0();

    public static synchronized Uri zza(String str) {
        synchronized (zzhq.class) {
            f fVar = zza;
            Uri uri = (Uri) fVar.get("com.google.android.gms.measurement");
            if (uri == null) {
                Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
                fVar.put("com.google.android.gms.measurement", parse);
                return parse;
            }
            return uri;
        }
    }
}
