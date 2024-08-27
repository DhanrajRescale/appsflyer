package com.assetgro.stockgro.data.model;

import a3.a;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J3\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/assetgro/stockgro/data/model/TicketData;", HttpUrl.FRAGMENT_ENCODE_SET, "userEmail", HttpUrl.FRAGMENT_ENCODE_SET, "description", "imageUrls", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getDescription", "()Ljava/lang/String;", "getImageUrls", "()Ljava/util/List;", "getUserEmail", "component1", "component2", "component3", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class TicketData {
    public static final int $stable = 8;

    @SerializedName("issue_description")
    private final String description;

    @SerializedName("attachment_links")
    private final List<String> imageUrls;

    @SerializedName("user_email")
    private final String userEmail;

    public TicketData(String str, String str2, List<String> list) {
        this.userEmail = str;
        this.description = str2;
        this.imageUrls = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TicketData copy$default(TicketData ticketData, String str, String str2, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = ticketData.userEmail;
        }
        if ((i10 & 2) != 0) {
            str2 = ticketData.description;
        }
        if ((i10 & 4) != 0) {
            list = ticketData.imageUrls;
        }
        return ticketData.copy(str, str2, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUserEmail() {
        return this.userEmail;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final List<String> component3() {
        return this.imageUrls;
    }

    @NotNull
    public final TicketData copy(String userEmail, String description, List<String> imageUrls) {
        return new TicketData(userEmail, description, imageUrls);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TicketData)) {
            return false;
        }
        TicketData ticketData = (TicketData) other;
        return Intrinsics.a(this.userEmail, ticketData.userEmail) && Intrinsics.a(this.description, ticketData.description) && Intrinsics.a(this.imageUrls, ticketData.imageUrls);
    }

    public final String getDescription() {
        return this.description;
    }

    public final List<String> getImageUrls() {
        return this.imageUrls;
    }

    public final String getUserEmail() {
        return this.userEmail;
    }

    public int hashCode() {
        String str = this.userEmail;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.description;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.imageUrls;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.userEmail;
        String str2 = this.description;
        return a.l(e.l("TicketData(userEmail=", str, ", description=", str2, ", imageUrls="), this.imageUrls, ")");
    }
}
