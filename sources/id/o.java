package id;

import com.assetgro.stockgro.data.model.UserChatGroup;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f19868a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19869b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19870c;

    /* renamed from: d, reason: collision with root package name */
    public final int f19871d;

    /* renamed from: e, reason: collision with root package name */
    public final UserChatGroup f19872e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f19873f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f19874g;

    public o(boolean z10, int i10, int i11, int i12, UserChatGroup userChatGroup, boolean z11, boolean z12) {
        this.f19868a = z10;
        this.f19869b = i10;
        this.f19870c = i11;
        this.f19871d = i12;
        this.f19872e = userChatGroup;
        this.f19873f = z11;
        this.f19874g = z12;
    }

    public static o a(o oVar, boolean z10, int i10, int i11, int i12, UserChatGroup userChatGroup, boolean z11, boolean z12, int i13) {
        boolean z13;
        int i14;
        int i15;
        int i16;
        UserChatGroup userChatGroup2;
        boolean z14;
        boolean z15;
        if ((i13 & 1) != 0) {
            z13 = oVar.f19868a;
        } else {
            z13 = z10;
        }
        if ((i13 & 2) != 0) {
            i14 = oVar.f19869b;
        } else {
            i14 = i10;
        }
        if ((i13 & 4) != 0) {
            i15 = oVar.f19870c;
        } else {
            i15 = i11;
        }
        if ((i13 & 8) != 0) {
            i16 = oVar.f19871d;
        } else {
            i16 = i12;
        }
        if ((i13 & 16) != 0) {
            userChatGroup2 = oVar.f19872e;
        } else {
            userChatGroup2 = userChatGroup;
        }
        if ((i13 & 32) != 0) {
            z14 = oVar.f19873f;
        } else {
            z14 = z11;
        }
        if ((i13 & 64) != 0) {
            z15 = oVar.f19874g;
        } else {
            z15 = z12;
        }
        oVar.getClass();
        return new o(z13, i14, i15, i16, userChatGroup2, z14, z15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f19868a == oVar.f19868a && this.f19869b == oVar.f19869b && this.f19870c == oVar.f19870c && this.f19871d == oVar.f19871d && Intrinsics.a(this.f19872e, oVar.f19872e) && this.f19873f == oVar.f19873f && this.f19874g == oVar.f19874g;
    }

    public final int hashCode() {
        int hashCode;
        int f10 = da.e.f(this.f19871d, da.e.f(this.f19870c, da.e.f(this.f19869b, Boolean.hashCode(this.f19868a) * 31, 31), 31), 31);
        UserChatGroup userChatGroup = this.f19872e;
        if (userChatGroup == null) {
            hashCode = 0;
        } else {
            hashCode = userChatGroup.hashCode();
        }
        return Boolean.hashCode(this.f19874g) + v.e.d(this.f19873f, (f10 + hashCode) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChatListUIState(isLoading=");
        sb2.append(this.f19868a);
        sb2.append(", selectedIndex=");
        sb2.append(this.f19869b);
        sb2.append(", chatOffset=");
        sb2.append(this.f19870c);
        sb2.append(", chatLimit=");
        sb2.append(this.f19871d);
        sb2.append(", selectedChatGroup=");
        sb2.append(this.f19872e);
        sb2.append(", showShimmerEffect=");
        sb2.append(this.f19873f);
        sb2.append(", showNoInternetScreen=");
        return da.e.o(sb2, this.f19874g, ")");
    }
}
