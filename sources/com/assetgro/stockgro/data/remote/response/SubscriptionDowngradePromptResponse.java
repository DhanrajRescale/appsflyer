package com.assetgro.stockgro.data.remote.response;

import a3.a;
import com.assetgro.stockgro.data.model.SubscriptionFeature;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0002\u0010\tJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/assetgro/stockgro/data/remote/response/SubscriptionDowngradePromptResponse;", HttpUrl.FRAGMENT_ENCODE_SET, "missingFeatures", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/data/model/SubscriptionFeature;", "note", HttpUrl.FRAGMENT_ENCODE_SET, "message", "mandateMessage", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMandateMessage", "()Ljava/lang/String;", "getMessage", "getMissingFeatures", "()Ljava/util/List;", "getNote", "component1", "component2", "component3", "component4", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SubscriptionDowngradePromptResponse {
    public static final int $stable = 8;

    @SerializedName("mandate_message")
    @NotNull
    private final String mandateMessage;

    @SerializedName("message")
    @NotNull
    private final String message;

    @SerializedName("missing_features")
    @NotNull
    private final List<SubscriptionFeature> missingFeatures;

    @SerializedName("note")
    @NotNull
    private final String note;

    public SubscriptionDowngradePromptResponse(@NotNull List<SubscriptionFeature> missingFeatures, @NotNull String note, @NotNull String message, @NotNull String mandateMessage) {
        Intrinsics.checkNotNullParameter(missingFeatures, "missingFeatures");
        Intrinsics.checkNotNullParameter(note, "note");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(mandateMessage, "mandateMessage");
        this.missingFeatures = missingFeatures;
        this.note = note;
        this.message = message;
        this.mandateMessage = mandateMessage;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SubscriptionDowngradePromptResponse copy$default(SubscriptionDowngradePromptResponse subscriptionDowngradePromptResponse, List list, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = subscriptionDowngradePromptResponse.missingFeatures;
        }
        if ((i10 & 2) != 0) {
            str = subscriptionDowngradePromptResponse.note;
        }
        if ((i10 & 4) != 0) {
            str2 = subscriptionDowngradePromptResponse.message;
        }
        if ((i10 & 8) != 0) {
            str3 = subscriptionDowngradePromptResponse.mandateMessage;
        }
        return subscriptionDowngradePromptResponse.copy(list, str, str2, str3);
    }

    @NotNull
    public final List<SubscriptionFeature> component1() {
        return this.missingFeatures;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getNote() {
        return this.note;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getMandateMessage() {
        return this.mandateMessage;
    }

    @NotNull
    public final SubscriptionDowngradePromptResponse copy(@NotNull List<SubscriptionFeature> missingFeatures, @NotNull String note, @NotNull String message, @NotNull String mandateMessage) {
        Intrinsics.checkNotNullParameter(missingFeatures, "missingFeatures");
        Intrinsics.checkNotNullParameter(note, "note");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(mandateMessage, "mandateMessage");
        return new SubscriptionDowngradePromptResponse(missingFeatures, note, message, mandateMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionDowngradePromptResponse)) {
            return false;
        }
        SubscriptionDowngradePromptResponse subscriptionDowngradePromptResponse = (SubscriptionDowngradePromptResponse) other;
        return Intrinsics.a(this.missingFeatures, subscriptionDowngradePromptResponse.missingFeatures) && Intrinsics.a(this.note, subscriptionDowngradePromptResponse.note) && Intrinsics.a(this.message, subscriptionDowngradePromptResponse.message) && Intrinsics.a(this.mandateMessage, subscriptionDowngradePromptResponse.mandateMessage);
    }

    @NotNull
    public final String getMandateMessage() {
        return this.mandateMessage;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final List<SubscriptionFeature> getMissingFeatures() {
        return this.missingFeatures;
    }

    @NotNull
    public final String getNote() {
        return this.note;
    }

    public int hashCode() {
        return this.mandateMessage.hashCode() + h.g(this.message, h.g(this.note, this.missingFeatures.hashCode() * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        List<SubscriptionFeature> list = this.missingFeatures;
        String str = this.note;
        String str2 = this.message;
        String str3 = this.mandateMessage;
        StringBuilder sb2 = new StringBuilder("SubscriptionDowngradePromptResponse(missingFeatures=");
        sb2.append(list);
        sb2.append(", note=");
        sb2.append(str);
        sb2.append(", message=");
        return a.k(sb2, str2, ", mandateMessage=", str3, ")");
    }
}
