package com.assetgro.stockgro.data.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import xh.a;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u001a\u0010\t\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u0006\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0018\u00010\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J1\u0010\u000b\u001a\u00020\u00002\u001c\b\u0002\u0010\t\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\u0007HÆ\u0001J\t\u0010\f\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R+\u0010\t\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/assetgro/stockgro/data/model/AuthUiModel;", HttpUrl.FRAGMENT_ENCODE_SET, "Lxh/a;", "Lkotlin/Pair;", "Lcom/assetgro/stockgro/data/model/AuthType;", HttpUrl.FRAGMENT_ENCODE_SET, "component1", HttpUrl.FRAGMENT_ENCODE_SET, "component2", "error", "success", "copy", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "other", "equals", "Lxh/a;", "getError", "()Lxh/a;", "Z", "getSuccess", "()Z", "<init>", "(Lxh/a;Z)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class AuthUiModel {
    public static final int $stable = 8;
    private final a error;
    private final boolean success;

    public AuthUiModel(a aVar, boolean z10) {
        this.error = aVar;
        this.success = z10;
    }

    public static /* synthetic */ AuthUiModel copy$default(AuthUiModel authUiModel, a aVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = authUiModel.error;
        }
        if ((i10 & 2) != 0) {
            z10 = authUiModel.success;
        }
        return authUiModel.copy(aVar, z10);
    }

    /* renamed from: component1, reason: from getter */
    public final a getError() {
        return this.error;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    @NotNull
    public final AuthUiModel copy(a error, boolean success) {
        return new AuthUiModel(error, success);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthUiModel)) {
            return false;
        }
        AuthUiModel authUiModel = (AuthUiModel) other;
        return Intrinsics.a(this.error, authUiModel.error) && this.success == authUiModel.success;
    }

    public final a getError() {
        return this.error;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        a aVar = this.error;
        return Boolean.hashCode(this.success) + ((aVar == null ? 0 : aVar.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return "AuthUiModel(error=" + this.error + ", success=" + this.success + ")";
    }
}
