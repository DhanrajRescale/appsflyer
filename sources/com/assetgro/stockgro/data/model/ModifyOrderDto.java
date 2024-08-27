package com.assetgro.stockgro.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import in.juspay.hypersdk.core.PaymentConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\t\u00108\u001a\u000209HÖ\u0001J\u0019\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u000209HÖ\u0001R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\bR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0006\"\u0004\b\u001e\u0010\bR\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010%\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0006\"\u0004\b'\u0010\bR\u001c\u0010(\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0006\"\u0004\b*\u0010\bR\u001c\u0010+\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0006\"\u0004\b-\u0010\bR\u001c\u0010.\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0006\"\u0004\b0\u0010\bR\u001e\u00101\u001a\u0004\u0018\u000102X\u0086\u000e¢\u0006\u0010\n\u0002\u00107\u001a\u0004\b3\u00104\"\u0004\b5\u00106¨\u0006?"}, d2 = {"Lcom/assetgro/stockgro/data/model/ModifyOrderDto;", "Landroid/os/Parcelable;", "()V", "bookProfit", HttpUrl.FRAGMENT_ENCODE_SET, "getBookProfit", "()Ljava/lang/String;", "setBookProfit", "(Ljava/lang/String;)V", "executionPrice", HttpUrl.FRAGMENT_ENCODE_SET, "getExecutionPrice", "()Ljava/lang/Double;", "setExecutionPrice", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", PaymentConstants.ORDER_ID_CAMEL, "getOrderId", "setOrderId", "orderType", "getOrderType", "setOrderType", "parentOrderType", "getParentOrderType", "setParentOrderType", "purchaseType", "getPurchaseType", "setPurchaseType", "quantity", "getQuantity", "setQuantity", "selectedPortfolio", "Lcom/assetgro/stockgro/data/model/portfolio/holdings/Portfolio;", "getSelectedPortfolio", "()Lcom/assetgro/stockgro/data/model/portfolio/holdings/Portfolio;", "setSelectedPortfolio", "(Lcom/assetgro/stockgro/data/model/portfolio/holdings/Portfolio;)V", "stockCode", "getStockCode", "setStockCode", "stockImageUrl", "getStockImageUrl", "setStockImageUrl", "stockName", "getStockName", "setStockName", "stopLoss", "getStopLoss", "setStopLoss", "totalAmount", HttpUrl.FRAGMENT_ENCODE_SET, "getTotalAmount", "()Ljava/lang/Float;", "setTotalAmount", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ModifyOrderDto implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<ModifyOrderDto> CREATOR = new Creator();
    private String bookProfit;
    private Double executionPrice;
    private String orderId;
    private String orderType;
    private String parentOrderType;
    private String purchaseType;
    private String quantity;
    private Portfolio selectedPortfolio;
    private String stockCode;
    private String stockImageUrl;
    private String stockName;
    private String stopLoss;
    private Float totalAmount;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<ModifyOrderDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ModifyOrderDto createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return new ModifyOrderDto();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ModifyOrderDto[] newArray(int i10) {
            return new ModifyOrderDto[i10];
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getBookProfit() {
        return this.bookProfit;
    }

    public final Double getExecutionPrice() {
        return this.executionPrice;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final String getOrderType() {
        return this.orderType;
    }

    public final String getParentOrderType() {
        return this.parentOrderType;
    }

    public final String getPurchaseType() {
        return this.purchaseType;
    }

    public final String getQuantity() {
        return this.quantity;
    }

    public final Portfolio getSelectedPortfolio() {
        return this.selectedPortfolio;
    }

    public final String getStockCode() {
        return this.stockCode;
    }

    public final String getStockImageUrl() {
        return this.stockImageUrl;
    }

    public final String getStockName() {
        return this.stockName;
    }

    public final String getStopLoss() {
        return this.stopLoss;
    }

    public final Float getTotalAmount() {
        return this.totalAmount;
    }

    public final void setBookProfit(String str) {
        this.bookProfit = str;
    }

    public final void setExecutionPrice(Double d10) {
        this.executionPrice = d10;
    }

    public final void setOrderId(String str) {
        this.orderId = str;
    }

    public final void setOrderType(String str) {
        this.orderType = str;
    }

    public final void setParentOrderType(String str) {
        this.parentOrderType = str;
    }

    public final void setPurchaseType(String str) {
        this.purchaseType = str;
    }

    public final void setQuantity(String str) {
        this.quantity = str;
    }

    public final void setSelectedPortfolio(Portfolio portfolio) {
        this.selectedPortfolio = portfolio;
    }

    public final void setStockCode(String str) {
        this.stockCode = str;
    }

    public final void setStockImageUrl(String str) {
        this.stockImageUrl = str;
    }

    public final void setStockName(String str) {
        this.stockName = str;
    }

    public final void setStopLoss(String str) {
        this.stopLoss = str;
    }

    public final void setTotalAmount(Float f10) {
        this.totalAmount = f10;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(1);
    }
}
