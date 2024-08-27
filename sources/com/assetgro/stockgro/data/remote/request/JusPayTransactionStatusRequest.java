package com.assetgro.stockgro.data.remote.request;

import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\"\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003`\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J%\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003`\u0006HÆ\u0003J;\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032$\b\u0002\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003`\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R2\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003`\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/assetgro/stockgro/data/remote/request/JusPayTransactionStatusRequest;", HttpUrl.FRAGMENT_ENCODE_SET, "transactionId", HttpUrl.FRAGMENT_ENCODE_SET, "response", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "(Ljava/lang/String;Ljava/util/HashMap;)V", "getResponse", "()Ljava/util/HashMap;", "getTransactionId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class JusPayTransactionStatusRequest {
    public static final int $stable = 8;

    @SerializedName("response")
    @NotNull
    private final HashMap<String, String> response;

    @SerializedName("transaction_id")
    private final String transactionId;

    public JusPayTransactionStatusRequest(String str, @NotNull HashMap<String, String> response) {
        Intrinsics.checkNotNullParameter(response, "response");
        this.transactionId = str;
        this.response = response;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ JusPayTransactionStatusRequest copy$default(JusPayTransactionStatusRequest jusPayTransactionStatusRequest, String str, HashMap hashMap, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = jusPayTransactionStatusRequest.transactionId;
        }
        if ((i10 & 2) != 0) {
            hashMap = jusPayTransactionStatusRequest.response;
        }
        return jusPayTransactionStatusRequest.copy(str, hashMap);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }

    @NotNull
    public final HashMap<String, String> component2() {
        return this.response;
    }

    @NotNull
    public final JusPayTransactionStatusRequest copy(String transactionId, @NotNull HashMap<String, String> response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return new JusPayTransactionStatusRequest(transactionId, response);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JusPayTransactionStatusRequest)) {
            return false;
        }
        JusPayTransactionStatusRequest jusPayTransactionStatusRequest = (JusPayTransactionStatusRequest) other;
        return Intrinsics.a(this.transactionId, jusPayTransactionStatusRequest.transactionId) && Intrinsics.a(this.response, jusPayTransactionStatusRequest.response);
    }

    @NotNull
    public final HashMap<String, String> getResponse() {
        return this.response;
    }

    public final String getTransactionId() {
        return this.transactionId;
    }

    public int hashCode() {
        String str = this.transactionId;
        return this.response.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return "JusPayTransactionStatusRequest(transactionId=" + this.transactionId + ", response=" + this.response + ")";
    }
}
