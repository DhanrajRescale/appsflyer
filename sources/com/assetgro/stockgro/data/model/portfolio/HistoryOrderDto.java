package com.assetgro.stockgro.data.model.portfolio;

import a3.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import in.juspay.hypersdk.core.PaymentConstants;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0002\u0010\u0011J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\t\u0010'\u001a\u00020\u0007HÆ\u0003J\t\u0010(\u001a\u00020\u000bHÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003Jw\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0003HÆ\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018¨\u00063"}, d2 = {"Lcom/assetgro/stockgro/data/model/portfolio/HistoryOrderDto;", HttpUrl.FRAGMENT_ENCODE_SET, AppMeasurementSdk.ConditionalUserProperty.NAME, HttpUrl.FRAGMENT_ENCODE_SET, "quantity", HttpUrl.FRAGMENT_ENCODE_SET, "entryDate", HttpUrl.FRAGMENT_ENCODE_SET, "price", PaymentConstants.AMOUNT, "executionDate", HttpUrl.FRAGMENT_ENCODE_SET, "tradeType", "transactionType", "imageUrl", "executionMessage", "stockIdentifier", "(Ljava/lang/String;FDDDJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()D", "getEntryDate", "getExecutionDate", "()J", "getExecutionMessage", "()Ljava/lang/String;", "getImageUrl", "getName", "getPrice", "getQuantity", "()F", "getStockIdentifier", "getTradeType", "getTransactionType", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class HistoryOrderDto {
    public static final int $stable = 0;

    @SerializedName(PaymentConstants.AMOUNT)
    private final double amount;

    @SerializedName("entry_date")
    private final double entryDate;

    @SerializedName("execution_date")
    private final long executionDate;

    @SerializedName("execution_message")
    @NotNull
    private final String executionMessage;

    @SerializedName("image_url")
    @NotNull
    private final String imageUrl;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    @NotNull
    private final String name;

    @SerializedName("price")
    private final double price;

    @SerializedName("quantity")
    private final float quantity;

    @SerializedName("identifier")
    @NotNull
    private final String stockIdentifier;

    @SerializedName("trade_type")
    @NotNull
    private final String tradeType;

    @SerializedName("transaction_type")
    @NotNull
    private final String transactionType;

    public HistoryOrderDto(@NotNull String name, float f10, double d10, double d11, double d12, long j10, @NotNull String tradeType, @NotNull String transactionType, @NotNull String imageUrl, @NotNull String executionMessage, @NotNull String stockIdentifier) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(tradeType, "tradeType");
        Intrinsics.checkNotNullParameter(transactionType, "transactionType");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(executionMessage, "executionMessage");
        Intrinsics.checkNotNullParameter(stockIdentifier, "stockIdentifier");
        this.name = name;
        this.quantity = f10;
        this.entryDate = d10;
        this.price = d11;
        this.amount = d12;
        this.executionDate = j10;
        this.tradeType = tradeType;
        this.transactionType = transactionType;
        this.imageUrl = imageUrl;
        this.executionMessage = executionMessage;
        this.stockIdentifier = stockIdentifier;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final String getExecutionMessage() {
        return this.executionMessage;
    }

    @NotNull
    /* renamed from: component11, reason: from getter */
    public final String getStockIdentifier() {
        return this.stockIdentifier;
    }

    /* renamed from: component2, reason: from getter */
    public final float getQuantity() {
        return this.quantity;
    }

    /* renamed from: component3, reason: from getter */
    public final double getEntryDate() {
        return this.entryDate;
    }

    /* renamed from: component4, reason: from getter */
    public final double getPrice() {
        return this.price;
    }

    /* renamed from: component5, reason: from getter */
    public final double getAmount() {
        return this.amount;
    }

    /* renamed from: component6, reason: from getter */
    public final long getExecutionDate() {
        return this.executionDate;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getTradeType() {
        return this.tradeType;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getTransactionType() {
        return this.transactionType;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @NotNull
    public final HistoryOrderDto copy(@NotNull String name, float quantity, double entryDate, double price, double amount, long executionDate, @NotNull String tradeType, @NotNull String transactionType, @NotNull String imageUrl, @NotNull String executionMessage, @NotNull String stockIdentifier) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(tradeType, "tradeType");
        Intrinsics.checkNotNullParameter(transactionType, "transactionType");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(executionMessage, "executionMessage");
        Intrinsics.checkNotNullParameter(stockIdentifier, "stockIdentifier");
        return new HistoryOrderDto(name, quantity, entryDate, price, amount, executionDate, tradeType, transactionType, imageUrl, executionMessage, stockIdentifier);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HistoryOrderDto)) {
            return false;
        }
        HistoryOrderDto historyOrderDto = (HistoryOrderDto) other;
        return Intrinsics.a(this.name, historyOrderDto.name) && Float.compare(this.quantity, historyOrderDto.quantity) == 0 && Double.compare(this.entryDate, historyOrderDto.entryDate) == 0 && Double.compare(this.price, historyOrderDto.price) == 0 && Double.compare(this.amount, historyOrderDto.amount) == 0 && this.executionDate == historyOrderDto.executionDate && Intrinsics.a(this.tradeType, historyOrderDto.tradeType) && Intrinsics.a(this.transactionType, historyOrderDto.transactionType) && Intrinsics.a(this.imageUrl, historyOrderDto.imageUrl) && Intrinsics.a(this.executionMessage, historyOrderDto.executionMessage) && Intrinsics.a(this.stockIdentifier, historyOrderDto.stockIdentifier);
    }

    public final double getAmount() {
        return this.amount;
    }

    public final double getEntryDate() {
        return this.entryDate;
    }

    public final long getExecutionDate() {
        return this.executionDate;
    }

    @NotNull
    public final String getExecutionMessage() {
        return this.executionMessage;
    }

    @NotNull
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final double getPrice() {
        return this.price;
    }

    public final float getQuantity() {
        return this.quantity;
    }

    @NotNull
    public final String getStockIdentifier() {
        return this.stockIdentifier;
    }

    @NotNull
    public final String getTradeType() {
        return this.tradeType;
    }

    @NotNull
    public final String getTransactionType() {
        return this.transactionType;
    }

    public int hashCode() {
        return this.stockIdentifier.hashCode() + h.g(this.executionMessage, h.g(this.imageUrl, h.g(this.transactionType, h.g(this.tradeType, e.c(this.executionDate, d.c(this.amount, d.c(this.price, d.c(this.entryDate, e.a(this.quantity, this.name.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        String str = this.name;
        float f10 = this.quantity;
        double d10 = this.entryDate;
        double d11 = this.price;
        double d12 = this.amount;
        long j10 = this.executionDate;
        String str2 = this.tradeType;
        String str3 = this.transactionType;
        String str4 = this.imageUrl;
        String str5 = this.executionMessage;
        String str6 = this.stockIdentifier;
        StringBuilder sb2 = new StringBuilder("HistoryOrderDto(name=");
        sb2.append(str);
        sb2.append(", quantity=");
        sb2.append(f10);
        sb2.append(", entryDate=");
        sb2.append(d10);
        a.v(sb2, ", price=", d11, ", amount=");
        sb2.append(d12);
        sb2.append(", executionDate=");
        sb2.append(j10);
        sb2.append(", tradeType=");
        e.v(sb2, str2, ", transactionType=", str3, ", imageUrl=");
        e.v(sb2, str4, ", executionMessage=", str5, ", stockIdentifier=");
        return d.o(sb2, str6, ")");
    }
}
