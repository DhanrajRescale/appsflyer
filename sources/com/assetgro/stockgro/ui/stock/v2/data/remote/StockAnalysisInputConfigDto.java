package com.assetgro.stockgro.ui.stock.v2.data.remote;

import com.google.gson.annotations.SerializedName;
import in.juspay.hypersdk.analytics.LogConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;
import vt.y;
import zi.k;
import zi.o;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b)\u0010*J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003JU\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\fHÆ\u0001J\t\u0010\u0016\u001a\u00020\tHÖ\u0001J\t\u0010\u0018\u001a\u00020\u0017HÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u001a\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b \u0010\u001eR\u001a\u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b!\u0010\u001eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\"\u001a\u0004\b%\u0010$R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010&\u001a\u0004\b'\u0010(¨\u0006+"}, d2 = {"Lcom/assetgro/stockgro/ui/stock/v2/data/remote/StockAnalysisInputConfigDto;", HttpUrl.FRAGMENT_ENCODE_SET, "Lzi/o;", "toMarketInputParameter", HttpUrl.FRAGMENT_ENCODE_SET, "component1", "component2", "component3", "component4", HttpUrl.FRAGMENT_ENCODE_SET, "component5", "component6", "Lcom/assetgro/stockgro/ui/stock/v2/data/remote/NarrationDto;", "component7", "min", "max", "step", "defaultValue", "sliderTitle", "hint", "narration", "copy", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "other", HttpUrl.FRAGMENT_ENCODE_SET, "equals", "F", "getMin", "()F", "getMax", "getStep", "getDefaultValue", "Ljava/lang/String;", "getSliderTitle", "()Ljava/lang/String;", "getHint", "Lcom/assetgro/stockgro/ui/stock/v2/data/remote/NarrationDto;", "getNarration", "()Lcom/assetgro/stockgro/ui/stock/v2/data/remote/NarrationDto;", "<init>", "(FFFFLjava/lang/String;Ljava/lang/String;Lcom/assetgro/stockgro/ui/stock/v2/data/remote/NarrationDto;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class StockAnalysisInputConfigDto {
    public static final int $stable = 0;

    @SerializedName(LogConstants.DEFAULT_CHANNEL)
    private final float defaultValue;

    @SerializedName("hint")
    private final String hint;

    @SerializedName("max")
    private final float max;

    @SerializedName("min")
    private final float min;

    @SerializedName("narration")
    private final NarrationDto narration;

    @SerializedName("parameter_title")
    private final String sliderTitle;

    @SerializedName("step_width")
    private final float step;

    public StockAnalysisInputConfigDto(float f10, float f11, float f12, float f13, String str, String str2, NarrationDto narrationDto) {
        this.min = f10;
        this.max = f11;
        this.step = f12;
        this.defaultValue = f13;
        this.sliderTitle = str;
        this.hint = str2;
        this.narration = narrationDto;
    }

    public static /* synthetic */ StockAnalysisInputConfigDto copy$default(StockAnalysisInputConfigDto stockAnalysisInputConfigDto, float f10, float f11, float f12, float f13, String str, String str2, NarrationDto narrationDto, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = stockAnalysisInputConfigDto.min;
        }
        if ((i10 & 2) != 0) {
            f11 = stockAnalysisInputConfigDto.max;
        }
        float f14 = f11;
        if ((i10 & 4) != 0) {
            f12 = stockAnalysisInputConfigDto.step;
        }
        float f15 = f12;
        if ((i10 & 8) != 0) {
            f13 = stockAnalysisInputConfigDto.defaultValue;
        }
        float f16 = f13;
        if ((i10 & 16) != 0) {
            str = stockAnalysisInputConfigDto.sliderTitle;
        }
        String str3 = str;
        if ((i10 & 32) != 0) {
            str2 = stockAnalysisInputConfigDto.hint;
        }
        String str4 = str2;
        if ((i10 & 64) != 0) {
            narrationDto = stockAnalysisInputConfigDto.narration;
        }
        return stockAnalysisInputConfigDto.copy(f10, f14, f15, f16, str3, str4, narrationDto);
    }

    /* renamed from: component1, reason: from getter */
    public final float getMin() {
        return this.min;
    }

    /* renamed from: component2, reason: from getter */
    public final float getMax() {
        return this.max;
    }

    /* renamed from: component3, reason: from getter */
    public final float getStep() {
        return this.step;
    }

    /* renamed from: component4, reason: from getter */
    public final float getDefaultValue() {
        return this.defaultValue;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSliderTitle() {
        return this.sliderTitle;
    }

    /* renamed from: component6, reason: from getter */
    public final String getHint() {
        return this.hint;
    }

    /* renamed from: component7, reason: from getter */
    public final NarrationDto getNarration() {
        return this.narration;
    }

    @NotNull
    public final StockAnalysisInputConfigDto copy(float min, float max, float step, float defaultValue, String sliderTitle, String hint, NarrationDto narration) {
        return new StockAnalysisInputConfigDto(min, max, step, defaultValue, sliderTitle, hint, narration);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StockAnalysisInputConfigDto)) {
            return false;
        }
        StockAnalysisInputConfigDto stockAnalysisInputConfigDto = (StockAnalysisInputConfigDto) other;
        return Float.compare(this.min, stockAnalysisInputConfigDto.min) == 0 && Float.compare(this.max, stockAnalysisInputConfigDto.max) == 0 && Float.compare(this.step, stockAnalysisInputConfigDto.step) == 0 && Float.compare(this.defaultValue, stockAnalysisInputConfigDto.defaultValue) == 0 && Intrinsics.a(this.sliderTitle, stockAnalysisInputConfigDto.sliderTitle) && Intrinsics.a(this.hint, stockAnalysisInputConfigDto.hint) && Intrinsics.a(this.narration, stockAnalysisInputConfigDto.narration);
    }

    public final float getDefaultValue() {
        return this.defaultValue;
    }

    public final String getHint() {
        return this.hint;
    }

    public final float getMax() {
        return this.max;
    }

    public final float getMin() {
        return this.min;
    }

    public final NarrationDto getNarration() {
        return this.narration;
    }

    public final String getSliderTitle() {
        return this.sliderTitle;
    }

    public final float getStep() {
        return this.step;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int a10 = e.a(this.defaultValue, e.a(this.step, e.a(this.max, Float.hashCode(this.min) * 31, 31), 31), 31);
        String str = this.sliderTitle;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (a10 + hashCode) * 31;
        String str2 = this.hint;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        NarrationDto narrationDto = this.narration;
        if (narrationDto != null) {
            i10 = narrationDto.hashCode();
        }
        return i12 + i10;
    }

    @NotNull
    public final o toMarketInputParameter() {
        String str;
        k kVar;
        String title;
        float f10 = this.min;
        float f11 = this.max;
        float f12 = this.step;
        float f13 = this.defaultValue;
        NarrationDto narrationDto = this.narration;
        if (narrationDto != null && (title = narrationDto.getTitle()) != null) {
            str = title;
        } else {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String str2 = this.hint;
        NarrationDto narrationDto2 = this.narration;
        if (narrationDto2 != null) {
            kVar = new k(HttpUrl.FRAGMENT_ENCODE_SET, y.c(narrationDto2.toNarration()));
        } else {
            kVar = null;
        }
        return new o(f10, f11, f12, f13, str, str2, kVar);
    }

    @NotNull
    public String toString() {
        float f10 = this.min;
        float f11 = this.max;
        float f12 = this.step;
        float f13 = this.defaultValue;
        String str = this.sliderTitle;
        String str2 = this.hint;
        NarrationDto narrationDto = this.narration;
        StringBuilder sb2 = new StringBuilder("StockAnalysisInputConfigDto(min=");
        sb2.append(f10);
        sb2.append(", max=");
        sb2.append(f11);
        sb2.append(", step=");
        sb2.append(f12);
        sb2.append(", defaultValue=");
        sb2.append(f13);
        sb2.append(", sliderTitle=");
        e.v(sb2, str, ", hint=", str2, ", narration=");
        sb2.append(narrationDto);
        sb2.append(")");
        return sb2.toString();
    }
}
