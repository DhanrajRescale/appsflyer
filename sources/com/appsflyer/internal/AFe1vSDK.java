package com.appsflyer.internal;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.MatchGroup;
import kotlin.text.Regex;
import kotlin.text.r;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import vt.v;

/* loaded from: classes.dex */
public final class AFe1vSDK {
    public static final String AFKeystoreWrapper(String str, String str2) {
        MessageDigest messageDigest = MessageDigest.getInstance(str2);
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        byte[] digest = messageDigest.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(digest, "");
        String str3 = HttpUrl.FRAGMENT_ENCODE_SET;
        for (byte b10 : digest) {
            StringBuilder p10 = da.e.p(str3);
            String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "");
            p10.append(format);
            str3 = p10.toString();
        }
        return str3;
    }

    public static final Pair<Integer, Integer> valueOf(@NotNull String str) {
        Integer num;
        Integer num2;
        Integer num3;
        String str2;
        String str3;
        String str4;
        Intrinsics.checkNotNullParameter(str, "");
        kotlin.text.f b10 = new Regex("^(\\d+).(\\+)$|^(\\d+).(\\d+).(\\+)$").b(str);
        if (b10 != null) {
            kotlin.text.e eVar = b10.f23410c;
            MatchGroup e10 = eVar.e(1);
            if (e10 != null && (str4 = e10.f23389a) != null) {
                num = r.g(str4);
            } else {
                num = null;
            }
            MatchGroup e11 = eVar.e(3);
            if (e11 != null && (str3 = e11.f23389a) != null) {
                num2 = r.g(str3);
            } else {
                num2 = null;
            }
            MatchGroup e12 = eVar.e(4);
            if (e12 != null && (str2 = e12.f23389a) != null) {
                num3 = r.g(str2);
            } else {
                num3 = null;
            }
            if (num != null) {
                return new Pair<>(Integer.valueOf(num.intValue() * 1000000), Integer.valueOf(((num.intValue() + 1) * 1000000) - 1));
            }
            if (num2 != null && num3 != null) {
                return new Pair<>(Integer.valueOf((num3.intValue() * CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT) + (num2.intValue() * 1000000)), Integer.valueOf((((num3.intValue() + 1) * CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT) + (num2.intValue() * 1000000)) - 1));
            }
        }
        return null;
    }

    public static final Pair<Integer, Integer> values(@NotNull String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        Intrinsics.checkNotNullParameter(str, "");
        kotlin.text.f b10 = new Regex("(\\d+).(\\d+).(\\d+)-(\\d+).(\\d+).(\\d+)").b(str);
        if (b10 != null) {
            kotlin.text.e eVar = b10.f23410c;
            MatchGroup e10 = eVar.e(1);
            Integer g10 = (e10 == null || (str7 = e10.f23389a) == null) ? null : r.g(str7);
            MatchGroup e11 = eVar.e(2);
            Integer g11 = (e11 == null || (str6 = e11.f23389a) == null) ? null : r.g(str6);
            MatchGroup e12 = eVar.e(3);
            Integer g12 = (e12 == null || (str5 = e12.f23389a) == null) ? null : r.g(str5);
            MatchGroup e13 = eVar.e(4);
            Integer g13 = (e13 == null || (str4 = e13.f23389a) == null) ? null : r.g(str4);
            MatchGroup e14 = eVar.e(5);
            Integer g14 = (e14 == null || (str3 = e14.f23389a) == null) ? null : r.g(str3);
            MatchGroup e15 = eVar.e(6);
            Integer g15 = (e15 == null || (str2 = e15.f23389a) == null) ? null : r.g(str2);
            if (values(g10, g11, g12, g13, g14, g15)) {
                Intrinsics.c(g10);
                int intValue = g10.intValue() * 1000000;
                Intrinsics.c(g11);
                int intValue2 = (g11.intValue() * CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT) + intValue;
                Intrinsics.c(g12);
                Integer valueOf = Integer.valueOf(g12.intValue() + intValue2);
                Intrinsics.c(g13);
                int intValue3 = g13.intValue() * 1000000;
                Intrinsics.c(g14);
                int intValue4 = (g14.intValue() * CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT) + intValue3;
                Intrinsics.c(g15);
                return new Pair<>(valueOf, Integer.valueOf(g15.intValue() + intValue4));
            }
        }
        return null;
    }

    private static boolean values(@NotNull Object... objArr) {
        Intrinsics.checkNotNullParameter(objArr, "");
        return !v.o(objArr, null);
    }
}
