package ib;

import com.assetgro.stockgro.feature_social.data.remote.ria.RiaProfileResponseDto;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final RiaProfileResponseDto f19837a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f19838b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f19839c;

    public y(RiaProfileResponseDto riaProfileResponseDto, boolean z10, boolean z11) {
        this.f19837a = riaProfileResponseDto;
        this.f19838b = z10;
        this.f19839c = z11;
    }

    public static y a(y yVar, boolean z10, boolean z11, int i10) {
        RiaProfileResponseDto riaProfileResponseDto;
        if ((i10 & 1) != 0) {
            riaProfileResponseDto = yVar.f19837a;
        } else {
            riaProfileResponseDto = null;
        }
        if ((i10 & 2) != 0) {
            z10 = yVar.f19838b;
        }
        if ((i10 & 4) != 0) {
            z11 = yVar.f19839c;
        }
        yVar.getClass();
        return new y(riaProfileResponseDto, z10, z11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Intrinsics.a(this.f19837a, yVar.f19837a) && this.f19838b == yVar.f19838b && this.f19839c == yVar.f19839c;
    }

    public final int hashCode() {
        int hashCode;
        RiaProfileResponseDto riaProfileResponseDto = this.f19837a;
        if (riaProfileResponseDto == null) {
            hashCode = 0;
        } else {
            hashCode = riaProfileResponseDto.hashCode();
        }
        return Boolean.hashCode(this.f19839c) + v.e.d(this.f19838b, hashCode * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RiaProfileInsightState(riaData=");
        sb2.append(this.f19837a);
        sb2.append(", showShimmer=");
        sb2.append(this.f19838b);
        sb2.append(", showRetryScreen=");
        return da.e.o(sb2, this.f19839c, ")");
    }
}
