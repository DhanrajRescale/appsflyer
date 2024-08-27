package com.assetgro.stockgro.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b<\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bá\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0016\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0013j\b\u0012\u0004\u0012\u00020\u0003`\u0014\u0012\u0006\u0010\u0015\u001a\u00020\n\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0016\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0013j\b\u0012\u0004\u0012\u00020\u0003`\u0014\u0012\u0006\u0010\u001a\u001a\u00020\n\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001e\u001a\u00020\n\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u0006\u0010 \u001a\u00020!\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\u0010#J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0011HÆ\u0003J\u0019\u0010F\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0013j\b\u0012\u0004\u0012\u00020\u0003`\u0014HÆ\u0003J\t\u0010G\u001a\u00020\nHÆ\u0003J\t\u0010H\u001a\u00020\u0017HÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\u0019\u0010J\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0013j\b\u0012\u0004\u0012\u00020\u0003`\u0014HÆ\u0003J\t\u0010K\u001a\u00020\nHÆ\u0003J\t\u0010L\u001a\u00020\u001cHÆ\u0003J\t\u0010M\u001a\u00020\u001cHÆ\u0003J\t\u0010N\u001a\u00020\nHÆ\u0003J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\t\u0010P\u001a\u00020\u001cHÆ\u0003J\t\u0010Q\u001a\u00020!HÆ\u0003J\u000f\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\t\u0010S\u001a\u00020\u0003HÆ\u0003J\u000f\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\t\u0010U\u001a\u00020\u0003HÆ\u0003J\t\u0010V\u001a\u00020\nHÆ\u0003J\t\u0010W\u001a\u00020\fHÆ\u0003J\t\u0010X\u001a\u00020\nHÆ\u0003J\t\u0010Y\u001a\u00020\u000fHÆ\u0003J\u0091\u0002\u0010Z\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0018\b\u0002\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0013j\b\u0012\u0004\u0012\u00020\u0003`\u00142\b\b\u0002\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00032\u0018\b\u0002\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0013j\b\u0012\u0004\u0012\u00020\u0003`\u00142\b\b\u0002\u0010\u001a\u001a\u00020\n2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\n2\b\b\u0002\u0010\u001f\u001a\u00020\u001c2\b\b\u0002\u0010 \u001a\u00020!2\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0001J\t\u0010[\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\\\u001a\u00020\n2\b\u0010]\u001a\u0004\u0018\u00010^HÖ\u0003J\t\u0010_\u001a\u00020\u0011HÖ\u0001J\t\u0010`\u001a\u00020\u0003HÖ\u0001J\u0019\u0010a\u001a\u00020b2\u0006\u0010c\u001a\u00020d2\u0006\u0010e\u001a\u00020\u0011HÖ\u0001R\u0016\u0010\u001e\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010\u001f\u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R&\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0013j\b\u0012\u0004\u0012\u00020\u0003`\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010%R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0016\u0010\u001a\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010%R\u0016\u0010\u001d\u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010'R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00100R\u0016\u0010\u0016\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0016\u0010\u0015\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010%R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0016\u0010\r\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010%R\u0016\u0010\u001b\u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010'R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u00104R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u00104R&\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0013j\b\u0012\u0004\u0012\u00020\u0003`\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010+R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u00104R\u0016\u0010\u0018\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u00104R\u0016\u0010 \u001a\u00020!8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010C¨\u0006f"}, d2 = {"Lcom/assetgro/stockgro/data/model/RedemptionOffer;", "Landroid/os/Parcelable;", "id", HttpUrl.FRAGMENT_ENCODE_SET, "type", "title", "description", HttpUrl.FRAGMENT_ENCODE_SET, "subTitle", "ctaExists", HttpUrl.FRAGMENT_ENCODE_SET, "cta", "Lcom/assetgro/stockgro/data/model/CTA;", "pricingExists", "pricing", "Lcom/assetgro/stockgro/data/model/Pricing;", "creativeUrlLength", HttpUrl.FRAGMENT_ENCODE_SET, "creativeUrls", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "inventory_exists", "inventory", "Lcom/assetgro/stockgro/data/model/Inventory;", "vendorId", "tnc", "enabled", "startDate", HttpUrl.FRAGMENT_ENCODE_SET, "endDate", "alreadyBought", "boughtQuantity", "walletInfo", "Lcom/assetgro/stockgro/data/model/WalletInfo;", "instructions", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZLcom/assetgro/stockgro/data/model/CTA;ZLcom/assetgro/stockgro/data/model/Pricing;ILjava/util/ArrayList;ZLcom/assetgro/stockgro/data/model/Inventory;Ljava/lang/String;Ljava/util/ArrayList;ZJJZJLcom/assetgro/stockgro/data/model/WalletInfo;Ljava/util/List;)V", "getAlreadyBought", "()Z", "getBoughtQuantity", "()J", "getCreativeUrlLength", "()I", "getCreativeUrls", "()Ljava/util/ArrayList;", "getCta", "()Lcom/assetgro/stockgro/data/model/CTA;", "getCtaExists", "getDescription", "()Ljava/util/List;", "getEnabled", "getEndDate", "getId", "()Ljava/lang/String;", "getInstructions", "getInventory", "()Lcom/assetgro/stockgro/data/model/Inventory;", "getInventory_exists", "getPricing", "()Lcom/assetgro/stockgro/data/model/Pricing;", "getPricingExists", "getStartDate", "getSubTitle", "getTitle", "getTnc", "getType", "getVendorId", "getWalletInfo", "()Lcom/assetgro/stockgro/data/model/WalletInfo;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class RedemptionOffer implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<RedemptionOffer> CREATOR = new Creator();

    @SerializedName("already_bought")
    private final boolean alreadyBought;

    @SerializedName("bought_quantity")
    private final long boughtQuantity;

    @SerializedName("creative_url_length")
    private final int creativeUrlLength;

    @SerializedName("creative_urls")
    @NotNull
    private final ArrayList<String> creativeUrls;

    @SerializedName("cta")
    @NotNull
    private final CTA cta;

    @SerializedName("cta_exists")
    private final boolean ctaExists;

    @SerializedName("description")
    @NotNull
    private final List<String> description;

    @SerializedName("enabled")
    private final boolean enabled;

    @SerializedName("end_date")
    private final long endDate;

    @SerializedName("id")
    @NotNull
    private final String id;

    @SerializedName("instructions")
    @NotNull
    private final List<String> instructions;

    @SerializedName("inventory")
    @NotNull
    private final Inventory inventory;

    @SerializedName("inventory_exists")
    private final boolean inventory_exists;

    @SerializedName("pricing")
    @NotNull
    private final Pricing pricing;

    @SerializedName("pricing_exists")
    private final boolean pricingExists;

    @SerializedName("start_date")
    private final long startDate;

    @SerializedName("subTitle")
    @NotNull
    private final String subTitle;

    @SerializedName("title")
    @NotNull
    private final String title;

    @SerializedName("tnc")
    @NotNull
    private final ArrayList<String> tnc;

    @SerializedName("type")
    @NotNull
    private final String type;

    @SerializedName("vendor_id")
    @NotNull
    private final String vendorId;

    @SerializedName("wallet_info")
    @NotNull
    private final WalletInfo walletInfo;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<RedemptionOffer> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final RedemptionOffer createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RedemptionOffer(parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readInt() != 0, CTA.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, Pricing.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.createStringArrayList(), parcel.readInt() != 0, Inventory.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.createStringArrayList(), parcel.readInt() != 0, parcel.readLong(), parcel.readLong(), parcel.readInt() != 0, parcel.readLong(), WalletInfo.CREATOR.createFromParcel(parcel), parcel.createStringArrayList());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final RedemptionOffer[] newArray(int i10) {
            return new RedemptionOffer[i10];
        }
    }

    public RedemptionOffer(@NotNull String id2, @NotNull String type, @NotNull String title, @NotNull List<String> description, @NotNull String subTitle, boolean z10, @NotNull CTA cta, boolean z11, @NotNull Pricing pricing, int i10, @NotNull ArrayList<String> creativeUrls, boolean z12, @NotNull Inventory inventory, @NotNull String vendorId, @NotNull ArrayList<String> tnc, boolean z13, long j10, long j11, boolean z14, long j12, @NotNull WalletInfo walletInfo, @NotNull List<String> instructions) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(subTitle, "subTitle");
        Intrinsics.checkNotNullParameter(cta, "cta");
        Intrinsics.checkNotNullParameter(pricing, "pricing");
        Intrinsics.checkNotNullParameter(creativeUrls, "creativeUrls");
        Intrinsics.checkNotNullParameter(inventory, "inventory");
        Intrinsics.checkNotNullParameter(vendorId, "vendorId");
        Intrinsics.checkNotNullParameter(tnc, "tnc");
        Intrinsics.checkNotNullParameter(walletInfo, "walletInfo");
        Intrinsics.checkNotNullParameter(instructions, "instructions");
        this.id = id2;
        this.type = type;
        this.title = title;
        this.description = description;
        this.subTitle = subTitle;
        this.ctaExists = z10;
        this.cta = cta;
        this.pricingExists = z11;
        this.pricing = pricing;
        this.creativeUrlLength = i10;
        this.creativeUrls = creativeUrls;
        this.inventory_exists = z12;
        this.inventory = inventory;
        this.vendorId = vendorId;
        this.tnc = tnc;
        this.enabled = z13;
        this.startDate = j10;
        this.endDate = j11;
        this.alreadyBought = z14;
        this.boughtQuantity = j12;
        this.walletInfo = walletInfo;
        this.instructions = instructions;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final int getCreativeUrlLength() {
        return this.creativeUrlLength;
    }

    @NotNull
    public final ArrayList<String> component11() {
        return this.creativeUrls;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getInventory_exists() {
        return this.inventory_exists;
    }

    @NotNull
    /* renamed from: component13, reason: from getter */
    public final Inventory getInventory() {
        return this.inventory;
    }

    @NotNull
    /* renamed from: component14, reason: from getter */
    public final String getVendorId() {
        return this.vendorId;
    }

    @NotNull
    public final ArrayList<String> component15() {
        return this.tnc;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: component17, reason: from getter */
    public final long getStartDate() {
        return this.startDate;
    }

    /* renamed from: component18, reason: from getter */
    public final long getEndDate() {
        return this.endDate;
    }

    /* renamed from: component19, reason: from getter */
    public final boolean getAlreadyBought() {
        return this.alreadyBought;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component20, reason: from getter */
    public final long getBoughtQuantity() {
        return this.boughtQuantity;
    }

    @NotNull
    /* renamed from: component21, reason: from getter */
    public final WalletInfo getWalletInfo() {
        return this.walletInfo;
    }

    @NotNull
    public final List<String> component22() {
        return this.instructions;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final List<String> component4() {
        return this.description;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getSubTitle() {
        return this.subTitle;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getCtaExists() {
        return this.ctaExists;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final CTA getCta() {
        return this.cta;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getPricingExists() {
        return this.pricingExists;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final Pricing getPricing() {
        return this.pricing;
    }

    @NotNull
    public final RedemptionOffer copy(@NotNull String id2, @NotNull String type, @NotNull String title, @NotNull List<String> description, @NotNull String subTitle, boolean ctaExists, @NotNull CTA cta, boolean pricingExists, @NotNull Pricing pricing, int creativeUrlLength, @NotNull ArrayList<String> creativeUrls, boolean inventory_exists, @NotNull Inventory inventory, @NotNull String vendorId, @NotNull ArrayList<String> tnc, boolean enabled, long startDate, long endDate, boolean alreadyBought, long boughtQuantity, @NotNull WalletInfo walletInfo, @NotNull List<String> instructions) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(subTitle, "subTitle");
        Intrinsics.checkNotNullParameter(cta, "cta");
        Intrinsics.checkNotNullParameter(pricing, "pricing");
        Intrinsics.checkNotNullParameter(creativeUrls, "creativeUrls");
        Intrinsics.checkNotNullParameter(inventory, "inventory");
        Intrinsics.checkNotNullParameter(vendorId, "vendorId");
        Intrinsics.checkNotNullParameter(tnc, "tnc");
        Intrinsics.checkNotNullParameter(walletInfo, "walletInfo");
        Intrinsics.checkNotNullParameter(instructions, "instructions");
        return new RedemptionOffer(id2, type, title, description, subTitle, ctaExists, cta, pricingExists, pricing, creativeUrlLength, creativeUrls, inventory_exists, inventory, vendorId, tnc, enabled, startDate, endDate, alreadyBought, boughtQuantity, walletInfo, instructions);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RedemptionOffer)) {
            return false;
        }
        RedemptionOffer redemptionOffer = (RedemptionOffer) other;
        return Intrinsics.a(this.id, redemptionOffer.id) && Intrinsics.a(this.type, redemptionOffer.type) && Intrinsics.a(this.title, redemptionOffer.title) && Intrinsics.a(this.description, redemptionOffer.description) && Intrinsics.a(this.subTitle, redemptionOffer.subTitle) && this.ctaExists == redemptionOffer.ctaExists && Intrinsics.a(this.cta, redemptionOffer.cta) && this.pricingExists == redemptionOffer.pricingExists && Intrinsics.a(this.pricing, redemptionOffer.pricing) && this.creativeUrlLength == redemptionOffer.creativeUrlLength && Intrinsics.a(this.creativeUrls, redemptionOffer.creativeUrls) && this.inventory_exists == redemptionOffer.inventory_exists && Intrinsics.a(this.inventory, redemptionOffer.inventory) && Intrinsics.a(this.vendorId, redemptionOffer.vendorId) && Intrinsics.a(this.tnc, redemptionOffer.tnc) && this.enabled == redemptionOffer.enabled && this.startDate == redemptionOffer.startDate && this.endDate == redemptionOffer.endDate && this.alreadyBought == redemptionOffer.alreadyBought && this.boughtQuantity == redemptionOffer.boughtQuantity && Intrinsics.a(this.walletInfo, redemptionOffer.walletInfo) && Intrinsics.a(this.instructions, redemptionOffer.instructions);
    }

    public final boolean getAlreadyBought() {
        return this.alreadyBought;
    }

    public final long getBoughtQuantity() {
        return this.boughtQuantity;
    }

    public final int getCreativeUrlLength() {
        return this.creativeUrlLength;
    }

    @NotNull
    public final ArrayList<String> getCreativeUrls() {
        return this.creativeUrls;
    }

    @NotNull
    public final CTA getCta() {
        return this.cta;
    }

    public final boolean getCtaExists() {
        return this.ctaExists;
    }

    @NotNull
    public final List<String> getDescription() {
        return this.description;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final long getEndDate() {
        return this.endDate;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final List<String> getInstructions() {
        return this.instructions;
    }

    @NotNull
    public final Inventory getInventory() {
        return this.inventory;
    }

    public final boolean getInventory_exists() {
        return this.inventory_exists;
    }

    @NotNull
    public final Pricing getPricing() {
        return this.pricing;
    }

    public final boolean getPricingExists() {
        return this.pricingExists;
    }

    public final long getStartDate() {
        return this.startDate;
    }

    @NotNull
    public final String getSubTitle() {
        return this.subTitle;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final ArrayList<String> getTnc() {
        return this.tnc;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final String getVendorId() {
        return this.vendorId;
    }

    @NotNull
    public final WalletInfo getWalletInfo() {
        return this.walletInfo;
    }

    public int hashCode() {
        return this.instructions.hashCode() + ((this.walletInfo.hashCode() + e.c(this.boughtQuantity, e.d(this.alreadyBought, e.c(this.endDate, e.c(this.startDate, e.d(this.enabled, (this.tnc.hashCode() + h.g(this.vendorId, (this.inventory.hashCode() + e.d(this.inventory_exists, (this.creativeUrls.hashCode() + da.e.f(this.creativeUrlLength, (this.pricing.hashCode() + e.d(this.pricingExists, (this.cta.hashCode() + e.d(this.ctaExists, h.g(this.subTitle, d.e(this.description, h.g(this.title, h.g(this.type, this.id.hashCode() * 31, 31), 31), 31), 31), 31)) * 31, 31)) * 31, 31)) * 31, 31)) * 31, 31)) * 31, 31), 31), 31), 31), 31)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.type;
        String str3 = this.title;
        List<String> list = this.description;
        String str4 = this.subTitle;
        boolean z10 = this.ctaExists;
        CTA cta = this.cta;
        boolean z11 = this.pricingExists;
        Pricing pricing = this.pricing;
        int i10 = this.creativeUrlLength;
        ArrayList<String> arrayList = this.creativeUrls;
        boolean z12 = this.inventory_exists;
        Inventory inventory = this.inventory;
        String str5 = this.vendorId;
        ArrayList<String> arrayList2 = this.tnc;
        boolean z13 = this.enabled;
        long j10 = this.startDate;
        long j11 = this.endDate;
        boolean z14 = this.alreadyBought;
        long j12 = this.boughtQuantity;
        WalletInfo walletInfo = this.walletInfo;
        List<String> list2 = this.instructions;
        StringBuilder l10 = e.l("RedemptionOffer(id=", str, ", type=", str2, ", title=");
        l10.append(str3);
        l10.append(", description=");
        l10.append(list);
        l10.append(", subTitle=");
        l10.append(str4);
        l10.append(", ctaExists=");
        l10.append(z10);
        l10.append(", cta=");
        l10.append(cta);
        l10.append(", pricingExists=");
        l10.append(z11);
        l10.append(", pricing=");
        l10.append(pricing);
        l10.append(", creativeUrlLength=");
        l10.append(i10);
        l10.append(", creativeUrls=");
        l10.append(arrayList);
        l10.append(", inventory_exists=");
        l10.append(z12);
        l10.append(", inventory=");
        l10.append(inventory);
        l10.append(", vendorId=");
        l10.append(str5);
        l10.append(", tnc=");
        l10.append(arrayList2);
        l10.append(", enabled=");
        l10.append(z13);
        l10.append(", startDate=");
        l10.append(j10);
        l10.append(", endDate=");
        l10.append(j11);
        l10.append(", alreadyBought=");
        l10.append(z14);
        l10.append(", boughtQuantity=");
        l10.append(j12);
        l10.append(", walletInfo=");
        l10.append(walletInfo);
        l10.append(", instructions=");
        l10.append(list2);
        l10.append(")");
        return l10.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.id);
        parcel.writeString(this.type);
        parcel.writeString(this.title);
        parcel.writeStringList(this.description);
        parcel.writeString(this.subTitle);
        parcel.writeInt(this.ctaExists ? 1 : 0);
        this.cta.writeToParcel(parcel, flags);
        parcel.writeInt(this.pricingExists ? 1 : 0);
        this.pricing.writeToParcel(parcel, flags);
        parcel.writeInt(this.creativeUrlLength);
        parcel.writeStringList(this.creativeUrls);
        parcel.writeInt(this.inventory_exists ? 1 : 0);
        this.inventory.writeToParcel(parcel, flags);
        parcel.writeString(this.vendorId);
        parcel.writeStringList(this.tnc);
        parcel.writeInt(this.enabled ? 1 : 0);
        parcel.writeLong(this.startDate);
        parcel.writeLong(this.endDate);
        parcel.writeInt(this.alreadyBought ? 1 : 0);
        parcel.writeLong(this.boughtQuantity);
        this.walletInfo.writeToParcel(parcel, flags);
        parcel.writeStringList(this.instructions);
    }
}
