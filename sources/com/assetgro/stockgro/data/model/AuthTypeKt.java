package com.assetgro.stockgro.data.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toAuthType", "Lcom/assetgro/stockgro/data/model/AuthType;", HttpUrl.FRAGMENT_ENCODE_SET, "app_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AuthTypeKt {
    @NotNull
    public static final AuthType toAuthType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        AuthType authType = AuthType.FACEBOOK;
        if (!Intrinsics.a(str, authType.getAuthValue())) {
            AuthType authType2 = AuthType.LINKEDIN;
            if (Intrinsics.a(str, authType2.getAuthValue())) {
                return authType2;
            }
            return authType;
        }
        return authType;
    }
}
