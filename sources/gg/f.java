package gg;

import com.assetgro.stockgro.ui.portfolio.v2.data.remote.PortfolioSectionDto;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final PortfolioSectionDto f17395a;

    /* renamed from: b, reason: collision with root package name */
    public final PortfolioSectionDto f17396b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f17397c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f17398d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f17399e;

    public f(PortfolioSectionDto portfolioSectionDto, PortfolioSectionDto portfolioSectionDto2, boolean z10, boolean z11, boolean z12) {
        this.f17395a = portfolioSectionDto;
        this.f17396b = portfolioSectionDto2;
        this.f17397c = z10;
        this.f17398d = z11;
        this.f17399e = z12;
    }

    public static f a(f fVar, boolean z10, boolean z11, boolean z12, int i10) {
        PortfolioSectionDto portfolioSectionDto;
        PortfolioSectionDto portfolioSectionDto2 = null;
        if ((i10 & 1) != 0) {
            portfolioSectionDto = fVar.f17395a;
        } else {
            portfolioSectionDto = null;
        }
        if ((i10 & 2) != 0) {
            portfolioSectionDto2 = fVar.f17396b;
        }
        PortfolioSectionDto portfolioSectionDto3 = portfolioSectionDto2;
        if ((i10 & 4) != 0) {
            z10 = fVar.f17397c;
        }
        boolean z13 = z10;
        if ((i10 & 8) != 0) {
            z11 = fVar.f17398d;
        }
        boolean z14 = z11;
        if ((i10 & 16) != 0) {
            z12 = fVar.f17399e;
        }
        fVar.getClass();
        return new f(portfolioSectionDto, portfolioSectionDto3, z13, z14, z12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.a(this.f17395a, fVar.f17395a) && Intrinsics.a(this.f17396b, fVar.f17396b) && this.f17397c == fVar.f17397c && this.f17398d == fVar.f17398d && this.f17399e == fVar.f17399e;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        PortfolioSectionDto portfolioSectionDto = this.f17395a;
        if (portfolioSectionDto == null) {
            hashCode = 0;
        } else {
            hashCode = portfolioSectionDto.hashCode();
        }
        int i11 = hashCode * 31;
        PortfolioSectionDto portfolioSectionDto2 = this.f17396b;
        if (portfolioSectionDto2 != null) {
            i10 = portfolioSectionDto2.hashCode();
        }
        return Boolean.hashCode(this.f17399e) + v.e.d(this.f17398d, v.e.d(this.f17397c, (i11 + i10) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PortfolioState(modelPortfolio=");
        sb2.append(this.f17395a);
        sb2.append(", leaguePortfolio=");
        sb2.append(this.f17396b);
        sb2.append(", showShimmer=");
        sb2.append(this.f17397c);
        sb2.append(", isRefreshing=");
        sb2.append(this.f17398d);
        sb2.append(", showRetryScreen=");
        return da.e.o(sb2, this.f17399e, ")");
    }
}
