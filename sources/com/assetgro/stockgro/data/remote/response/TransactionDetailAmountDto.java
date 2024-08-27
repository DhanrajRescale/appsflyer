package com.assetgro.stockgro.data.remote.response;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/assetgro/stockgro/data/remote/response/TransactionDetailAmountDto;", HttpUrl.FRAGMENT_ENCODE_SET, "deposit", "Lcom/assetgro/stockgro/data/remote/response/AmountDetailDto;", "bonus", "cash", "(Lcom/assetgro/stockgro/data/remote/response/AmountDetailDto;Lcom/assetgro/stockgro/data/remote/response/AmountDetailDto;Lcom/assetgro/stockgro/data/remote/response/AmountDetailDto;)V", "getBonus", "()Lcom/assetgro/stockgro/data/remote/response/AmountDetailDto;", "getCash", "getDeposit", "component1", "component2", "component3", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", HttpUrl.FRAGMENT_ENCODE_SET, "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class TransactionDetailAmountDto {
    public static final int $stable = 0;

    @SerializedName("bonus")
    private final AmountDetailDto bonus;

    @SerializedName("cash")
    private final AmountDetailDto cash;

    @SerializedName("deposit")
    private final AmountDetailDto deposit;

    public TransactionDetailAmountDto(AmountDetailDto amountDetailDto, AmountDetailDto amountDetailDto2, AmountDetailDto amountDetailDto3) {
        this.deposit = amountDetailDto;
        this.bonus = amountDetailDto2;
        this.cash = amountDetailDto3;
    }

    public static /* synthetic */ TransactionDetailAmountDto copy$default(TransactionDetailAmountDto transactionDetailAmountDto, AmountDetailDto amountDetailDto, AmountDetailDto amountDetailDto2, AmountDetailDto amountDetailDto3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            amountDetailDto = transactionDetailAmountDto.deposit;
        }
        if ((i10 & 2) != 0) {
            amountDetailDto2 = transactionDetailAmountDto.bonus;
        }
        if ((i10 & 4) != 0) {
            amountDetailDto3 = transactionDetailAmountDto.cash;
        }
        return transactionDetailAmountDto.copy(amountDetailDto, amountDetailDto2, amountDetailDto3);
    }

    /* renamed from: component1, reason: from getter */
    public final AmountDetailDto getDeposit() {
        return this.deposit;
    }

    /* renamed from: component2, reason: from getter */
    public final AmountDetailDto getBonus() {
        return this.bonus;
    }

    /* renamed from: component3, reason: from getter */
    public final AmountDetailDto getCash() {
        return this.cash;
    }

    @NotNull
    public final TransactionDetailAmountDto copy(AmountDetailDto deposit, AmountDetailDto bonus, AmountDetailDto cash) {
        return new TransactionDetailAmountDto(deposit, bonus, cash);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransactionDetailAmountDto)) {
            return false;
        }
        TransactionDetailAmountDto transactionDetailAmountDto = (TransactionDetailAmountDto) other;
        return Intrinsics.a(this.deposit, transactionDetailAmountDto.deposit) && Intrinsics.a(this.bonus, transactionDetailAmountDto.bonus) && Intrinsics.a(this.cash, transactionDetailAmountDto.cash);
    }

    public final AmountDetailDto getBonus() {
        return this.bonus;
    }

    public final AmountDetailDto getCash() {
        return this.cash;
    }

    public final AmountDetailDto getDeposit() {
        return this.deposit;
    }

    public int hashCode() {
        AmountDetailDto amountDetailDto = this.deposit;
        int hashCode = (amountDetailDto == null ? 0 : amountDetailDto.hashCode()) * 31;
        AmountDetailDto amountDetailDto2 = this.bonus;
        int hashCode2 = (hashCode + (amountDetailDto2 == null ? 0 : amountDetailDto2.hashCode())) * 31;
        AmountDetailDto amountDetailDto3 = this.cash;
        return hashCode2 + (amountDetailDto3 != null ? amountDetailDto3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TransactionDetailAmountDto(deposit=" + this.deposit + ", bonus=" + this.bonus + ", cash=" + this.cash + ")";
    }
}
