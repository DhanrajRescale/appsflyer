package uh;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f37203a;

    /* renamed from: b, reason: collision with root package name */
    public final String f37204b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f37205c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f37206d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f37207e;

    /* renamed from: f, reason: collision with root package name */
    public final th.b f37208f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f37209g;

    public i(String title, String subText, boolean z10, boolean z11, boolean z12, th.b bVar, boolean z13) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subText, "subText");
        this.f37203a = title;
        this.f37204b = subText;
        this.f37205c = z10;
        this.f37206d = z11;
        this.f37207e = z12;
        this.f37208f = bVar;
        this.f37209g = z13;
    }

    public static i a(i iVar, String str, String str2, boolean z10, boolean z11, boolean z12, th.b bVar, boolean z13, int i10) {
        String title;
        String subText;
        boolean z14;
        boolean z15;
        boolean z16;
        th.b bVar2;
        boolean z17;
        if ((i10 & 1) != 0) {
            title = iVar.f37203a;
        } else {
            title = str;
        }
        if ((i10 & 2) != 0) {
            subText = iVar.f37204b;
        } else {
            subText = str2;
        }
        if ((i10 & 4) != 0) {
            z14 = iVar.f37205c;
        } else {
            z14 = z10;
        }
        if ((i10 & 8) != 0) {
            z15 = iVar.f37206d;
        } else {
            z15 = z11;
        }
        if ((i10 & 16) != 0) {
            z16 = iVar.f37207e;
        } else {
            z16 = z12;
        }
        if ((i10 & 32) != 0) {
            bVar2 = iVar.f37208f;
        } else {
            bVar2 = bVar;
        }
        if ((i10 & 64) != 0) {
            z17 = iVar.f37209g;
        } else {
            z17 = z13;
        }
        iVar.getClass();
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subText, "subText");
        return new i(title, subText, z14, z15, z16, bVar2, z17);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.a(this.f37203a, iVar.f37203a) && Intrinsics.a(this.f37204b, iVar.f37204b) && this.f37205c == iVar.f37205c && this.f37206d == iVar.f37206d && this.f37207e == iVar.f37207e && Intrinsics.a(this.f37208f, iVar.f37208f) && this.f37209g == iVar.f37209g;
    }

    public final int hashCode() {
        int hashCode;
        int d10 = v.e.d(this.f37207e, v.e.d(this.f37206d, v.e.d(this.f37205c, jr.h.g(this.f37204b, this.f37203a.hashCode() * 31, 31), 31), 31), 31);
        th.b bVar = this.f37208f;
        if (bVar == null) {
            hashCode = 0;
        } else {
            hashCode = bVar.hashCode();
        }
        return Boolean.hashCode(this.f37209g) + ((d10 + hashCode) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ScratchCardUIState(title=");
        sb2.append(this.f37203a);
        sb2.append(", subText=");
        sb2.append(this.f37204b);
        sb2.append(", isFullScreenPopupShowing=");
        sb2.append(this.f37205c);
        sb2.append(", showNewScratchCardAlertBanner=");
        sb2.append(this.f37206d);
        sb2.append(", showScratchCardTooltipAnimation=");
        sb2.append(this.f37207e);
        sb2.append(", activeCard=");
        sb2.append(this.f37208f);
        sb2.append(", showAnimationLottie=");
        return da.e.o(sb2, this.f37209g, ")");
    }

    public /* synthetic */ i() {
        this(HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, false, true, false, null, false);
    }
}
