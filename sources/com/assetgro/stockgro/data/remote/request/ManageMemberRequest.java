package com.assetgro.stockgro.data.remote.request;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/assetgro/stockgro/data/remote/request/ManageMemberRequest;", HttpUrl.FRAGMENT_ENCODE_SET, "groupId", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;)V", "getGroupId", "()Ljava/lang/String;", "component1", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ManageMemberRequest {
    public static final int $stable = 0;

    @SerializedName("group_id")
    @NotNull
    private final String groupId;

    public ManageMemberRequest(@NotNull String groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        this.groupId = groupId;
    }

    public static /* synthetic */ ManageMemberRequest copy$default(ManageMemberRequest manageMemberRequest, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = manageMemberRequest.groupId;
        }
        return manageMemberRequest.copy(str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getGroupId() {
        return this.groupId;
    }

    @NotNull
    public final ManageMemberRequest copy(@NotNull String groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        return new ManageMemberRequest(groupId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ManageMemberRequest) && Intrinsics.a(this.groupId, ((ManageMemberRequest) other).groupId);
    }

    @NotNull
    public final String getGroupId() {
        return this.groupId;
    }

    public int hashCode() {
        return this.groupId.hashCode();
    }

    @NotNull
    public String toString() {
        return d.k("ManageMemberRequest(groupId=", this.groupId, ")");
    }
}
