package com.google.android.gms.internal.measurement;

import android.net.Uri;
import okhttp3.HttpUrl;
import t.j0;

/* loaded from: classes2.dex */
public final class zzhh {
    private final j0 zza;

    public zzhh(j0 j0Var) {
        this.zza = j0Var;
    }

    public final String zza(Uri uri, String str, String str2, String str3) {
        if (uri == null) {
            return null;
        }
        j0 j0Var = (j0) this.zza.get(uri.toString());
        if (j0Var == null) {
            return null;
        }
        return (String) j0Var.get(HttpUrl.FRAGMENT_ENCODE_SET.concat(str3));
    }
}
