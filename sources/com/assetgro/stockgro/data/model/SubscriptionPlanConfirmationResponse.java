package com.assetgro.stockgro.data.model;

import a3.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import in.juspay.hypersdk.core.PaymentConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b=\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B»\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u0012\u0006\u0010\u001e\u001a\u00020\u0003\u0012\u0006\u0010\u001f\u001a\u00020\u0012¢\u0006\u0002\u0010 J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0012HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0016HÆ\u0003J\t\u0010D\u001a\u00020\u0016HÆ\u0003J\t\u0010E\u001a\u00020\u0016HÆ\u0003J\t\u0010F\u001a\u00020\u001aHÆ\u0003J\t\u0010G\u001a\u00020\u0016HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0005HÆ\u0003J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0012HÆ\u0003J\t\u0010M\u001a\u00020\u0003HÆ\u0003J\u000f\u0010N\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\u0005HÆ\u0003J\t\u0010R\u001a\u00020\u000eHÆ\u0003J\t\u0010S\u001a\u00020\u000eHÆ\u0003Jë\u0001\u0010T\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u0012HÆ\u0001J\t\u0010U\u001a\u00020\u0005HÖ\u0001J\u0013\u0010V\u001a\u00020\u00122\b\u0010W\u001a\u0004\u0018\u00010XHÖ\u0003J\t\u0010Y\u001a\u00020\u0005HÖ\u0001J\t\u0010Z\u001a\u00020\u0003HÖ\u0001J\u0019\u0010[\u001a\u00020\\2\u0006\u0010]\u001a\u00020^2\u0006\u0010_\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0016\u0010\u001c\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\"R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0016\u0010\u0011\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0016\u0010\u001e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\"R\u0016\u0010\u001d\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\"R\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\"R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\"R\u0016\u0010\u0013\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\"R\u0016\u0010\u001f\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010+R\u0016\u0010\u001b\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010$R\u0016\u0010\u0018\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00103R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\"R\u0016\u0010\u0015\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00103R\u0016\u0010\u0017\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00103R\u0016\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010)R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010\"R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010\"R\u0016\u0010\u0019\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=¨\u0006`"}, d2 = {"Lcom/assetgro/stockgro/data/model/SubscriptionPlanConfirmationResponse;", "Landroid/os/Parcelable;", "packageID", HttpUrl.FRAGMENT_ENCODE_SET, "level", HttpUrl.FRAGMENT_ENCODE_SET, "title", "features", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/data/model/SubscriptionFeature;", "validityTitle", "validityNote", "validity", "startDate", HttpUrl.FRAGMENT_ENCODE_SET, "endDate", "note", "limitedTimeOffer", HttpUrl.FRAGMENT_ENCODE_SET, "price", "discountPrice", PaymentConstants.WIDGET_UPI, "Lcom/assetgro/stockgro/data/model/AvailablePaymentOption;", "upiAutoPay", "stockgroCash", "wallet", "Lcom/assetgro/stockgro/data/model/WalletPaymentOption;", "refund", "headerNote", "message", "mandateMessage", "purchaseEnabled", "(Ljava/lang/String;ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;IJJLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/assetgro/stockgro/data/model/AvailablePaymentOption;Lcom/assetgro/stockgro/data/model/AvailablePaymentOption;Lcom/assetgro/stockgro/data/model/AvailablePaymentOption;Lcom/assetgro/stockgro/data/model/WalletPaymentOption;Lcom/assetgro/stockgro/data/model/AvailablePaymentOption;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getDiscountPrice", "()Ljava/lang/String;", "getEndDate", "()J", "getFeatures", "()Ljava/util/List;", "getHeaderNote", "getLevel", "()I", "getLimitedTimeOffer", "()Z", "getMandateMessage", "getMessage", "getNote", "getPackageID", "getPrice", "getPurchaseEnabled", "getRefund", "()Lcom/assetgro/stockgro/data/model/AvailablePaymentOption;", "getStartDate", "getStockgroCash", "getTitle", "getUpi", "getUpiAutoPay", "getValidity", "getValidityNote", "getValidityTitle", "getWallet", "()Lcom/assetgro/stockgro/data/model/WalletPaymentOption;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SubscriptionPlanConfirmationResponse implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<SubscriptionPlanConfirmationResponse> CREATOR = new Creator();

    @SerializedName("discount_price")
    @NotNull
    private final String discountPrice;

    @SerializedName("end_date")
    private final long endDate;

    @SerializedName("features")
    @NotNull
    private final List<SubscriptionFeature> features;

    @SerializedName("header_note")
    @NotNull
    private final String headerNote;

    @SerializedName("level")
    private final int level;

    @SerializedName("limited_time_offer")
    private final boolean limitedTimeOffer;

    @SerializedName("mandate_message")
    @NotNull
    private final String mandateMessage;

    @SerializedName("message")
    @NotNull
    private final String message;

    @SerializedName("note")
    @NotNull
    private final String note;

    @SerializedName("package_id")
    @NotNull
    private final String packageID;

    @SerializedName("price")
    @NotNull
    private final String price;

    @SerializedName("purchase_enabled")
    private final boolean purchaseEnabled;

    @SerializedName("refund")
    @NotNull
    private final AvailablePaymentOption refund;

    @SerializedName("start_date")
    private final long startDate;

    @SerializedName("stockgro_cash")
    @NotNull
    private final AvailablePaymentOption stockgroCash;

    @SerializedName("title")
    @NotNull
    private final String title;

    @SerializedName(PaymentConstants.WIDGET_UPI)
    @NotNull
    private final AvailablePaymentOption upi;

    @SerializedName("upi_autopay")
    @NotNull
    private final AvailablePaymentOption upiAutoPay;

    @SerializedName("validity")
    private final int validity;

    @SerializedName("validity_note")
    @NotNull
    private final String validityNote;

    @SerializedName("validity_title")
    @NotNull
    private final String validityTitle;

    @SerializedName("wallet")
    @NotNull
    private final WalletPaymentOption wallet;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<SubscriptionPlanConfirmationResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SubscriptionPlanConfirmationResponse createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            String readString2 = parcel.readString();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i10 = 0;
            while (i10 != readInt2) {
                i10 = h.e(SubscriptionFeature.CREATOR, parcel, arrayList, i10, 1);
            }
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            int readInt3 = parcel.readInt();
            long readLong = parcel.readLong();
            long readLong2 = parcel.readLong();
            String readString5 = parcel.readString();
            boolean z10 = parcel.readInt() != 0;
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            Parcelable.Creator<AvailablePaymentOption> creator = AvailablePaymentOption.CREATOR;
            return new SubscriptionPlanConfirmationResponse(readString, readInt, readString2, arrayList, readString3, readString4, readInt3, readLong, readLong2, readString5, z10, readString6, readString7, creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), WalletPaymentOption.CREATOR.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SubscriptionPlanConfirmationResponse[] newArray(int i10) {
            return new SubscriptionPlanConfirmationResponse[i10];
        }
    }

    public SubscriptionPlanConfirmationResponse(@NotNull String packageID, int i10, @NotNull String title, @NotNull List<SubscriptionFeature> features, @NotNull String validityTitle, @NotNull String validityNote, int i11, long j10, long j11, @NotNull String note, boolean z10, @NotNull String price, @NotNull String discountPrice, @NotNull AvailablePaymentOption upi, @NotNull AvailablePaymentOption upiAutoPay, @NotNull AvailablePaymentOption stockgroCash, @NotNull WalletPaymentOption wallet, @NotNull AvailablePaymentOption refund, @NotNull String headerNote, @NotNull String message, @NotNull String mandateMessage, boolean z11) {
        Intrinsics.checkNotNullParameter(packageID, "packageID");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(features, "features");
        Intrinsics.checkNotNullParameter(validityTitle, "validityTitle");
        Intrinsics.checkNotNullParameter(validityNote, "validityNote");
        Intrinsics.checkNotNullParameter(note, "note");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(discountPrice, "discountPrice");
        Intrinsics.checkNotNullParameter(upi, "upi");
        Intrinsics.checkNotNullParameter(upiAutoPay, "upiAutoPay");
        Intrinsics.checkNotNullParameter(stockgroCash, "stockgroCash");
        Intrinsics.checkNotNullParameter(wallet, "wallet");
        Intrinsics.checkNotNullParameter(refund, "refund");
        Intrinsics.checkNotNullParameter(headerNote, "headerNote");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(mandateMessage, "mandateMessage");
        this.packageID = packageID;
        this.level = i10;
        this.title = title;
        this.features = features;
        this.validityTitle = validityTitle;
        this.validityNote = validityNote;
        this.validity = i11;
        this.startDate = j10;
        this.endDate = j11;
        this.note = note;
        this.limitedTimeOffer = z10;
        this.price = price;
        this.discountPrice = discountPrice;
        this.upi = upi;
        this.upiAutoPay = upiAutoPay;
        this.stockgroCash = stockgroCash;
        this.wallet = wallet;
        this.refund = refund;
        this.headerNote = headerNote;
        this.message = message;
        this.mandateMessage = mandateMessage;
        this.purchaseEnabled = z11;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPackageID() {
        return this.packageID;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final String getNote() {
        return this.note;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getLimitedTimeOffer() {
        return this.limitedTimeOffer;
    }

    @NotNull
    /* renamed from: component12, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    @NotNull
    /* renamed from: component13, reason: from getter */
    public final String getDiscountPrice() {
        return this.discountPrice;
    }

    @NotNull
    /* renamed from: component14, reason: from getter */
    public final AvailablePaymentOption getUpi() {
        return this.upi;
    }

    @NotNull
    /* renamed from: component15, reason: from getter */
    public final AvailablePaymentOption getUpiAutoPay() {
        return this.upiAutoPay;
    }

    @NotNull
    /* renamed from: component16, reason: from getter */
    public final AvailablePaymentOption getStockgroCash() {
        return this.stockgroCash;
    }

    @NotNull
    /* renamed from: component17, reason: from getter */
    public final WalletPaymentOption getWallet() {
        return this.wallet;
    }

    @NotNull
    /* renamed from: component18, reason: from getter */
    public final AvailablePaymentOption getRefund() {
        return this.refund;
    }

    @NotNull
    /* renamed from: component19, reason: from getter */
    public final String getHeaderNote() {
        return this.headerNote;
    }

    /* renamed from: component2, reason: from getter */
    public final int getLevel() {
        return this.level;
    }

    @NotNull
    /* renamed from: component20, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    /* renamed from: component21, reason: from getter */
    public final String getMandateMessage() {
        return this.mandateMessage;
    }

    /* renamed from: component22, reason: from getter */
    public final boolean getPurchaseEnabled() {
        return this.purchaseEnabled;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final List<SubscriptionFeature> component4() {
        return this.features;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getValidityTitle() {
        return this.validityTitle;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getValidityNote() {
        return this.validityNote;
    }

    /* renamed from: component7, reason: from getter */
    public final int getValidity() {
        return this.validity;
    }

    /* renamed from: component8, reason: from getter */
    public final long getStartDate() {
        return this.startDate;
    }

    /* renamed from: component9, reason: from getter */
    public final long getEndDate() {
        return this.endDate;
    }

    @NotNull
    public final SubscriptionPlanConfirmationResponse copy(@NotNull String packageID, int level, @NotNull String title, @NotNull List<SubscriptionFeature> features, @NotNull String validityTitle, @NotNull String validityNote, int validity, long startDate, long endDate, @NotNull String note, boolean limitedTimeOffer, @NotNull String price, @NotNull String discountPrice, @NotNull AvailablePaymentOption upi, @NotNull AvailablePaymentOption upiAutoPay, @NotNull AvailablePaymentOption stockgroCash, @NotNull WalletPaymentOption wallet, @NotNull AvailablePaymentOption refund, @NotNull String headerNote, @NotNull String message, @NotNull String mandateMessage, boolean purchaseEnabled) {
        Intrinsics.checkNotNullParameter(packageID, "packageID");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(features, "features");
        Intrinsics.checkNotNullParameter(validityTitle, "validityTitle");
        Intrinsics.checkNotNullParameter(validityNote, "validityNote");
        Intrinsics.checkNotNullParameter(note, "note");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(discountPrice, "discountPrice");
        Intrinsics.checkNotNullParameter(upi, "upi");
        Intrinsics.checkNotNullParameter(upiAutoPay, "upiAutoPay");
        Intrinsics.checkNotNullParameter(stockgroCash, "stockgroCash");
        Intrinsics.checkNotNullParameter(wallet, "wallet");
        Intrinsics.checkNotNullParameter(refund, "refund");
        Intrinsics.checkNotNullParameter(headerNote, "headerNote");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(mandateMessage, "mandateMessage");
        return new SubscriptionPlanConfirmationResponse(packageID, level, title, features, validityTitle, validityNote, validity, startDate, endDate, note, limitedTimeOffer, price, discountPrice, upi, upiAutoPay, stockgroCash, wallet, refund, headerNote, message, mandateMessage, purchaseEnabled);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionPlanConfirmationResponse)) {
            return false;
        }
        SubscriptionPlanConfirmationResponse subscriptionPlanConfirmationResponse = (SubscriptionPlanConfirmationResponse) other;
        return Intrinsics.a(this.packageID, subscriptionPlanConfirmationResponse.packageID) && this.level == subscriptionPlanConfirmationResponse.level && Intrinsics.a(this.title, subscriptionPlanConfirmationResponse.title) && Intrinsics.a(this.features, subscriptionPlanConfirmationResponse.features) && Intrinsics.a(this.validityTitle, subscriptionPlanConfirmationResponse.validityTitle) && Intrinsics.a(this.validityNote, subscriptionPlanConfirmationResponse.validityNote) && this.validity == subscriptionPlanConfirmationResponse.validity && this.startDate == subscriptionPlanConfirmationResponse.startDate && this.endDate == subscriptionPlanConfirmationResponse.endDate && Intrinsics.a(this.note, subscriptionPlanConfirmationResponse.note) && this.limitedTimeOffer == subscriptionPlanConfirmationResponse.limitedTimeOffer && Intrinsics.a(this.price, subscriptionPlanConfirmationResponse.price) && Intrinsics.a(this.discountPrice, subscriptionPlanConfirmationResponse.discountPrice) && Intrinsics.a(this.upi, subscriptionPlanConfirmationResponse.upi) && Intrinsics.a(this.upiAutoPay, subscriptionPlanConfirmationResponse.upiAutoPay) && Intrinsics.a(this.stockgroCash, subscriptionPlanConfirmationResponse.stockgroCash) && Intrinsics.a(this.wallet, subscriptionPlanConfirmationResponse.wallet) && Intrinsics.a(this.refund, subscriptionPlanConfirmationResponse.refund) && Intrinsics.a(this.headerNote, subscriptionPlanConfirmationResponse.headerNote) && Intrinsics.a(this.message, subscriptionPlanConfirmationResponse.message) && Intrinsics.a(this.mandateMessage, subscriptionPlanConfirmationResponse.mandateMessage) && this.purchaseEnabled == subscriptionPlanConfirmationResponse.purchaseEnabled;
    }

    @NotNull
    public final String getDiscountPrice() {
        return this.discountPrice;
    }

    public final long getEndDate() {
        return this.endDate;
    }

    @NotNull
    public final List<SubscriptionFeature> getFeatures() {
        return this.features;
    }

    @NotNull
    public final String getHeaderNote() {
        return this.headerNote;
    }

    public final int getLevel() {
        return this.level;
    }

    public final boolean getLimitedTimeOffer() {
        return this.limitedTimeOffer;
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
    public final String getNote() {
        return this.note;
    }

    @NotNull
    public final String getPackageID() {
        return this.packageID;
    }

    @NotNull
    public final String getPrice() {
        return this.price;
    }

    public final boolean getPurchaseEnabled() {
        return this.purchaseEnabled;
    }

    @NotNull
    public final AvailablePaymentOption getRefund() {
        return this.refund;
    }

    public final long getStartDate() {
        return this.startDate;
    }

    @NotNull
    public final AvailablePaymentOption getStockgroCash() {
        return this.stockgroCash;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final AvailablePaymentOption getUpi() {
        return this.upi;
    }

    @NotNull
    public final AvailablePaymentOption getUpiAutoPay() {
        return this.upiAutoPay;
    }

    public final int getValidity() {
        return this.validity;
    }

    @NotNull
    public final String getValidityNote() {
        return this.validityNote;
    }

    @NotNull
    public final String getValidityTitle() {
        return this.validityTitle;
    }

    @NotNull
    public final WalletPaymentOption getWallet() {
        return this.wallet;
    }

    public int hashCode() {
        return Boolean.hashCode(this.purchaseEnabled) + h.g(this.mandateMessage, h.g(this.message, h.g(this.headerNote, (this.refund.hashCode() + ((this.wallet.hashCode() + ((this.stockgroCash.hashCode() + ((this.upiAutoPay.hashCode() + ((this.upi.hashCode() + h.g(this.discountPrice, h.g(this.price, e.d(this.limitedTimeOffer, h.g(this.note, e.c(this.endDate, e.c(this.startDate, da.e.f(this.validity, h.g(this.validityNote, h.g(this.validityTitle, d.e(this.features, h.g(this.title, da.e.f(this.level, this.packageID.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31), 31), 31);
    }

    @NotNull
    public String toString() {
        String str = this.packageID;
        int i10 = this.level;
        String str2 = this.title;
        List<SubscriptionFeature> list = this.features;
        String str3 = this.validityTitle;
        String str4 = this.validityNote;
        int i11 = this.validity;
        long j10 = this.startDate;
        long j11 = this.endDate;
        String str5 = this.note;
        boolean z10 = this.limitedTimeOffer;
        String str6 = this.price;
        String str7 = this.discountPrice;
        AvailablePaymentOption availablePaymentOption = this.upi;
        AvailablePaymentOption availablePaymentOption2 = this.upiAutoPay;
        AvailablePaymentOption availablePaymentOption3 = this.stockgroCash;
        WalletPaymentOption walletPaymentOption = this.wallet;
        AvailablePaymentOption availablePaymentOption4 = this.refund;
        String str8 = this.headerNote;
        String str9 = this.message;
        String str10 = this.mandateMessage;
        boolean z11 = this.purchaseEnabled;
        StringBuilder sb2 = new StringBuilder("SubscriptionPlanConfirmationResponse(packageID=");
        sb2.append(str);
        sb2.append(", level=");
        sb2.append(i10);
        sb2.append(", title=");
        sb2.append(str2);
        sb2.append(", features=");
        sb2.append(list);
        sb2.append(", validityTitle=");
        e.v(sb2, str3, ", validityNote=", str4, ", validity=");
        sb2.append(i11);
        sb2.append(", startDate=");
        sb2.append(j10);
        sb2.append(", endDate=");
        sb2.append(j11);
        sb2.append(", note=");
        sb2.append(str5);
        sb2.append(", limitedTimeOffer=");
        sb2.append(z10);
        sb2.append(", price=");
        e.v(sb2, str6, ", discountPrice=", str7, ", upi=");
        sb2.append(availablePaymentOption);
        sb2.append(", upiAutoPay=");
        sb2.append(availablePaymentOption2);
        sb2.append(", stockgroCash=");
        sb2.append(availablePaymentOption3);
        sb2.append(", wallet=");
        sb2.append(walletPaymentOption);
        sb2.append(", refund=");
        sb2.append(availablePaymentOption4);
        sb2.append(", headerNote=");
        sb2.append(str8);
        sb2.append(", message=");
        e.v(sb2, str9, ", mandateMessage=", str10, ", purchaseEnabled=");
        return da.e.o(sb2, z11, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.packageID);
        parcel.writeInt(this.level);
        parcel.writeString(this.title);
        Iterator p10 = a.p(this.features, parcel);
        while (p10.hasNext()) {
            ((SubscriptionFeature) p10.next()).writeToParcel(parcel, flags);
        }
        parcel.writeString(this.validityTitle);
        parcel.writeString(this.validityNote);
        parcel.writeInt(this.validity);
        parcel.writeLong(this.startDate);
        parcel.writeLong(this.endDate);
        parcel.writeString(this.note);
        parcel.writeInt(this.limitedTimeOffer ? 1 : 0);
        parcel.writeString(this.price);
        parcel.writeString(this.discountPrice);
        this.upi.writeToParcel(parcel, flags);
        this.upiAutoPay.writeToParcel(parcel, flags);
        this.stockgroCash.writeToParcel(parcel, flags);
        this.wallet.writeToParcel(parcel, flags);
        this.refund.writeToParcel(parcel, flags);
        parcel.writeString(this.headerNote);
        parcel.writeString(this.message);
        parcel.writeString(this.mandateMessage);
        parcel.writeInt(this.purchaseEnabled ? 1 : 0);
    }
}
