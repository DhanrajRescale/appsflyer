package com.appsflyer.internal;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchGroup;
import kotlin.text.Regex;
import kotlin.text.r;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFc1rSDK {
    public static final int valueOf(@NotNull String str) {
        int i10;
        int i11;
        String str2;
        Integer g10;
        String str3;
        Integer g11;
        String str4;
        Integer g12;
        Intrinsics.checkNotNullParameter(str, "");
        kotlin.text.f b10 = new Regex("(\\d+).(\\d+).(\\d+).*").b(str);
        if (b10 != null) {
            kotlin.text.e eVar = b10.f23410c;
            MatchGroup e10 = eVar.e(1);
            int i12 = 0;
            if (e10 != null && (str4 = e10.f23389a) != null && (g12 = r.g(str4)) != null) {
                i10 = g12.intValue();
            } else {
                i10 = 0;
            }
            int i13 = i10 * 1000000;
            MatchGroup e11 = eVar.e(2);
            if (e11 != null && (str3 = e11.f23389a) != null && (g11 = r.g(str3)) != null) {
                i11 = g11.intValue();
            } else {
                i11 = 0;
            }
            int i14 = (i11 * CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT) + i13;
            MatchGroup e12 = eVar.e(3);
            if (e12 != null && (str2 = e12.f23389a) != null && (g10 = r.g(str2)) != null) {
                i12 = g10.intValue();
            }
            return i14 + i12;
        }
        return -1;
    }
}
