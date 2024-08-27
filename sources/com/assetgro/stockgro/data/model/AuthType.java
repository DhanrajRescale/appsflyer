package com.assetgro.stockgro.data.model;

import bu.a;
import com.facebook.FacebookSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import zq.f;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/assetgro/stockgro/data/model/AuthType;", HttpUrl.FRAGMENT_ENCODE_SET, "authValue", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;ILjava/lang/String;)V", "getAuthValue", "()Ljava/lang/String;", "setAuthValue", "(Ljava/lang/String;)V", "FACEBOOK", "LINKEDIN", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AuthType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AuthType[] $VALUES;
    public static final AuthType FACEBOOK = new AuthType("FACEBOOK", 0, FacebookSdk.FACEBOOK_COM);
    public static final AuthType LINKEDIN = new AuthType("LINKEDIN", 1, "linkedin.com");

    @NotNull
    private String authValue;

    private static final /* synthetic */ AuthType[] $values() {
        return new AuthType[]{FACEBOOK, LINKEDIN};
    }

    static {
        AuthType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = f.E($values);
    }

    private AuthType(String str, int i10, String str2) {
        this.authValue = str2;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static AuthType valueOf(String str) {
        return (AuthType) Enum.valueOf(AuthType.class, str);
    }

    public static AuthType[] values() {
        return (AuthType[]) $VALUES.clone();
    }

    @NotNull
    public final String getAuthValue() {
        return this.authValue;
    }

    public final void setAuthValue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.authValue = str;
    }
}
