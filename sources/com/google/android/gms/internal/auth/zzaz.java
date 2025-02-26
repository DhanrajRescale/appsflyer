package com.google.android.gms.internal.auth;

import android.util.Log;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.io.UnsupportedEncodingException;

/* loaded from: classes2.dex */
public abstract class zzaz extends FastSafeParcelableJsonResponse {
    private static String zzem = "AUTH";

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public byte[] toByteArray() {
        try {
            return toString().getBytes("UTF-8");
        } catch (UnsupportedEncodingException e10) {
            Log.e(zzem, "Error serializing object.", e10);
            return null;
        }
    }
}
