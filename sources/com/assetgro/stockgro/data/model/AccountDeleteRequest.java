package com.assetgro.stockgro.data.model;

import com.google.gson.annotations.SerializedName;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/assetgro/stockgro/data/model/AccountDeleteRequest;", HttpUrl.FRAGMENT_ENCODE_SET, "pin", HttpUrl.FRAGMENT_ENCODE_SET, "uuid", "(Ljava/lang/String;Ljava/lang/String;)V", "getPin", "()Ljava/lang/String;", "getUuid", "component1", "component2", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AccountDeleteRequest {
    public static final int $stable = 0;

    @SerializedName("pin")
    @NotNull
    private final String pin;

    @SerializedName("uuid")
    @NotNull
    private final String uuid;

    public AccountDeleteRequest(@NotNull String pin, @NotNull String uuid) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        this.pin = pin;
        this.uuid = uuid;
    }

    public static /* synthetic */ AccountDeleteRequest copy$default(AccountDeleteRequest accountDeleteRequest, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = accountDeleteRequest.pin;
        }
        if ((i10 & 2) != 0) {
            str2 = accountDeleteRequest.uuid;
        }
        return accountDeleteRequest.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPin() {
        return this.pin;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    @NotNull
    public final AccountDeleteRequest copy(@NotNull String pin, @NotNull String uuid) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        return new AccountDeleteRequest(pin, uuid);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountDeleteRequest)) {
            return false;
        }
        AccountDeleteRequest accountDeleteRequest = (AccountDeleteRequest) other;
        return Intrinsics.a(this.pin, accountDeleteRequest.pin) && Intrinsics.a(this.uuid, accountDeleteRequest.uuid);
    }

    @NotNull
    public final String getPin() {
        return this.pin;
    }

    @NotNull
    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        return this.uuid.hashCode() + (this.pin.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return h.s("AccountDeleteRequest(pin=", this.pin, ", uuid=", this.uuid, ")");
    }
}
