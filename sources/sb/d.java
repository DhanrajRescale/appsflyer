package sb;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f34443a;

    /* renamed from: b, reason: collision with root package name */
    public final String f34444b;

    /* renamed from: c, reason: collision with root package name */
    public final String f34445c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f34446d;

    /* renamed from: e, reason: collision with root package name */
    public final c f34447e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f34448f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f34449g;

    /* renamed from: h, reason: collision with root package name */
    public final hb.u f34450h;

    /* renamed from: i, reason: collision with root package name */
    public final String f34451i;

    /* renamed from: j, reason: collision with root package name */
    public final String f34452j;

    /* renamed from: k, reason: collision with root package name */
    public final String f34453k;

    /* renamed from: l, reason: collision with root package name */
    public final String f34454l;

    /* renamed from: m, reason: collision with root package name */
    public final String f34455m;

    /* renamed from: n, reason: collision with root package name */
    public final String f34456n;

    /* renamed from: o, reason: collision with root package name */
    public final String f34457o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f34458p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f34459q;

    /* renamed from: r, reason: collision with root package name */
    public final String f34460r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f34461s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f34462t;

    /* renamed from: u, reason: collision with root package name */
    public final List f34463u;

    public d(String str, String str2, String str3, boolean z10, c cVar, boolean z11, boolean z12, hb.u uVar, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z13, boolean z14, String str11, boolean z15, boolean z16, List list) {
        this.f34443a = str;
        this.f34444b = str2;
        this.f34445c = str3;
        this.f34446d = z10;
        this.f34447e = cVar;
        this.f34448f = z11;
        this.f34449g = z12;
        this.f34450h = uVar;
        this.f34451i = str4;
        this.f34452j = str5;
        this.f34453k = str6;
        this.f34454l = str7;
        this.f34455m = str8;
        this.f34456n = str9;
        this.f34457o = str10;
        this.f34458p = z13;
        this.f34459q = z14;
        this.f34460r = str11;
        this.f34461s = z15;
        this.f34462t = z16;
        this.f34463u = list;
    }

    public static d a(d dVar, String str, String str2, String str3, boolean z10, c cVar, boolean z11, boolean z12, hb.u uVar, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z13, boolean z14, String str11, boolean z15, boolean z16, ArrayList arrayList, int i10) {
        String str12 = (i10 & 1) != 0 ? dVar.f34443a : str;
        String str13 = (i10 & 2) != 0 ? dVar.f34444b : str2;
        String str14 = (i10 & 4) != 0 ? dVar.f34445c : str3;
        boolean z17 = (i10 & 8) != 0 ? dVar.f34446d : z10;
        c cVar2 = (i10 & 16) != 0 ? dVar.f34447e : cVar;
        boolean z18 = (i10 & 32) != 0 ? dVar.f34448f : z11;
        boolean z19 = (i10 & 64) != 0 ? dVar.f34449g : z12;
        hb.u uVar2 = (i10 & 128) != 0 ? dVar.f34450h : uVar;
        String str15 = (i10 & 256) != 0 ? dVar.f34451i : str4;
        String str16 = (i10 & 512) != 0 ? dVar.f34452j : str5;
        String str17 = (i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? dVar.f34453k : str6;
        String str18 = (i10 & 2048) != 0 ? dVar.f34454l : str7;
        String str19 = (i10 & 4096) != 0 ? dVar.f34455m : str8;
        String str20 = (i10 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? dVar.f34456n : str9;
        String str21 = (i10 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? dVar.f34457o : str10;
        boolean z20 = (i10 & 32768) != 0 ? dVar.f34458p : z13;
        boolean z21 = (i10 & 65536) != 0 ? dVar.f34459q : z14;
        String str22 = (i10 & 131072) != 0 ? dVar.f34460r : str11;
        boolean z22 = (i10 & 262144) != 0 ? dVar.f34461s : z15;
        boolean z23 = (i10 & 524288) != 0 ? dVar.f34462t : z16;
        List list = (i10 & 1048576) != 0 ? dVar.f34463u : arrayList;
        dVar.getClass();
        return new d(str12, str13, str14, z17, cVar2, z18, z19, uVar2, str15, str16, str17, str18, str19, str20, str21, z20, z21, str22, z22, z23, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.a(this.f34443a, dVar.f34443a) && Intrinsics.a(this.f34444b, dVar.f34444b) && Intrinsics.a(this.f34445c, dVar.f34445c) && this.f34446d == dVar.f34446d && this.f34447e == dVar.f34447e && this.f34448f == dVar.f34448f && this.f34449g == dVar.f34449g && Intrinsics.a(this.f34450h, dVar.f34450h) && Intrinsics.a(this.f34451i, dVar.f34451i) && Intrinsics.a(this.f34452j, dVar.f34452j) && Intrinsics.a(this.f34453k, dVar.f34453k) && Intrinsics.a(this.f34454l, dVar.f34454l) && Intrinsics.a(this.f34455m, dVar.f34455m) && Intrinsics.a(this.f34456n, dVar.f34456n) && Intrinsics.a(this.f34457o, dVar.f34457o) && this.f34458p == dVar.f34458p && this.f34459q == dVar.f34459q && Intrinsics.a(this.f34460r, dVar.f34460r) && this.f34461s == dVar.f34461s && this.f34462t == dVar.f34462t && Intrinsics.a(this.f34463u, dVar.f34463u);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int hashCode13;
        int i10 = 0;
        String str = this.f34443a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = hashCode * 31;
        String str2 = this.f34444b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        String str3 = this.f34445c;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int d10 = v.e.d(this.f34446d, (i12 + hashCode3) * 31, 31);
        c cVar = this.f34447e;
        if (cVar == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = cVar.hashCode();
        }
        int d11 = v.e.d(this.f34449g, v.e.d(this.f34448f, (d10 + hashCode4) * 31, 31), 31);
        hb.u uVar = this.f34450h;
        if (uVar == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = uVar.f18230a.hashCode();
        }
        int i13 = (d11 + hashCode5) * 31;
        String str4 = this.f34451i;
        if (str4 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str4.hashCode();
        }
        int i14 = (i13 + hashCode6) * 31;
        String str5 = this.f34452j;
        if (str5 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str5.hashCode();
        }
        int i15 = (i14 + hashCode7) * 31;
        String str6 = this.f34453k;
        if (str6 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str6.hashCode();
        }
        int i16 = (i15 + hashCode8) * 31;
        String str7 = this.f34454l;
        if (str7 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str7.hashCode();
        }
        int i17 = (i16 + hashCode9) * 31;
        String str8 = this.f34455m;
        if (str8 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str8.hashCode();
        }
        int i18 = (i17 + hashCode10) * 31;
        String str9 = this.f34456n;
        if (str9 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str9.hashCode();
        }
        int i19 = (i18 + hashCode11) * 31;
        String str10 = this.f34457o;
        if (str10 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = str10.hashCode();
        }
        int d12 = v.e.d(this.f34459q, v.e.d(this.f34458p, (i19 + hashCode12) * 31, 31), 31);
        String str11 = this.f34460r;
        if (str11 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = str11.hashCode();
        }
        int d13 = v.e.d(this.f34462t, v.e.d(this.f34461s, (d12 + hashCode13) * 31, 31), 31);
        List list = this.f34463u;
        if (list != null) {
            i10 = list.hashCode();
        }
        return d13 + i10;
    }

    public final String toString() {
        return "UIState(feedType=" + this.f34443a + ", postId=" + this.f34444b + ", entityId=" + this.f34445c + ", isACallFromChat=" + this.f34446d + ", showProgressBar=" + this.f34447e + ", showNoInternetPopup=" + this.f34448f + ", showNoInternetScreen=" + this.f34449g + ", selectedFeedElement=" + this.f34450h + ", postInviteTemplateMessage=" + this.f34451i + ", selectedPostId=" + this.f34452j + ", selectedGroupId=" + this.f34453k + ", selectedStockName=" + this.f34454l + ", errorMessage=" + this.f34455m + ", toolbarTitle=" + this.f34456n + ", message=" + this.f34457o + ", showToolbar=" + this.f34458p + ", isEndOfResponse=" + this.f34459q + ", selectedFilter=" + this.f34460r + ", isExpired=" + this.f34461s + ", showExpiredTradeViewFilter=" + this.f34462t + ", filters=" + this.f34463u + ")";
    }
}
