package com.assetgro.stockgro.data.model;

import a3.a;
import com.google.gson.annotations.SerializedName;
import da.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J/\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR&\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/assetgro/stockgro/data/model/WalletTransactionsDto;", HttpUrl.FRAGMENT_ENCODE_SET, "currentPage", HttpUrl.FRAGMENT_ENCODE_SET, "totalPages", "transactions", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/data/model/WalletTransaction;", "(IILjava/util/List;)V", "getCurrentPage", "()I", "setCurrentPage", "(I)V", "getTotalPages", "setTotalPages", "getTransactions", "()Ljava/util/List;", "setTransactions", "(Ljava/util/List;)V", "component1", "component2", "component3", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class WalletTransactionsDto {
    public static final int $stable = 8;

    @SerializedName("current_page")
    private int currentPage;

    @SerializedName("total_pages")
    private int totalPages;

    @SerializedName("transactions")
    private List<WalletTransaction> transactions;

    public WalletTransactionsDto(int i10, int i11, List<WalletTransaction> list) {
        this.currentPage = i10;
        this.totalPages = i11;
        this.transactions = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WalletTransactionsDto copy$default(WalletTransactionsDto walletTransactionsDto, int i10, int i11, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = walletTransactionsDto.currentPage;
        }
        if ((i12 & 2) != 0) {
            i11 = walletTransactionsDto.totalPages;
        }
        if ((i12 & 4) != 0) {
            list = walletTransactionsDto.transactions;
        }
        return walletTransactionsDto.copy(i10, i11, list);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCurrentPage() {
        return this.currentPage;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTotalPages() {
        return this.totalPages;
    }

    public final List<WalletTransaction> component3() {
        return this.transactions;
    }

    @NotNull
    public final WalletTransactionsDto copy(int currentPage, int totalPages, List<WalletTransaction> transactions) {
        return new WalletTransactionsDto(currentPage, totalPages, transactions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WalletTransactionsDto)) {
            return false;
        }
        WalletTransactionsDto walletTransactionsDto = (WalletTransactionsDto) other;
        return this.currentPage == walletTransactionsDto.currentPage && this.totalPages == walletTransactionsDto.totalPages && Intrinsics.a(this.transactions, walletTransactionsDto.transactions);
    }

    public final int getCurrentPage() {
        return this.currentPage;
    }

    public final int getTotalPages() {
        return this.totalPages;
    }

    public final List<WalletTransaction> getTransactions() {
        return this.transactions;
    }

    public int hashCode() {
        int hashCode;
        int f10 = e.f(this.totalPages, Integer.hashCode(this.currentPage) * 31, 31);
        List<WalletTransaction> list = this.transactions;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return f10 + hashCode;
    }

    public final void setCurrentPage(int i10) {
        this.currentPage = i10;
    }

    public final void setTotalPages(int i10) {
        this.totalPages = i10;
    }

    public final void setTransactions(List<WalletTransaction> list) {
        this.transactions = list;
    }

    @NotNull
    public String toString() {
        int i10 = this.currentPage;
        int i11 = this.totalPages;
        return a.l(e.q("WalletTransactionsDto(currentPage=", i10, ", totalPages=", i11, ", transactions="), this.transactions, ")");
    }
}
