package nb;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final b f28567a;

    /* renamed from: b, reason: collision with root package name */
    public final b f28568b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f28569c;

    /* renamed from: d, reason: collision with root package name */
    public final String f28570d;

    /* renamed from: e, reason: collision with root package name */
    public final String f28571e;

    /* renamed from: f, reason: collision with root package name */
    public final String f28572f;

    /* renamed from: g, reason: collision with root package name */
    public final String f28573g;

    /* renamed from: h, reason: collision with root package name */
    public final Integer f28574h;

    public c(b bVar, b bVar2, boolean z10, String str, String str2, String str3, String str4, Integer num) {
        this.f28567a = bVar;
        this.f28568b = bVar2;
        this.f28569c = z10;
        this.f28570d = str;
        this.f28571e = str2;
        this.f28572f = str3;
        this.f28573g = str4;
        this.f28574h = num;
    }

    public static c a(c cVar, b bVar, b bVar2, boolean z10, String str, String str2, String str3, Integer num, int i10) {
        b bVar3;
        b bVar4;
        boolean z11;
        String str4;
        String str5;
        String str6;
        String str7;
        Integer num2;
        if ((i10 & 1) != 0) {
            bVar3 = cVar.f28567a;
        } else {
            bVar3 = bVar;
        }
        if ((i10 & 2) != 0) {
            bVar4 = cVar.f28568b;
        } else {
            bVar4 = bVar2;
        }
        if ((i10 & 4) != 0) {
            z11 = cVar.f28569c;
        } else {
            z11 = z10;
        }
        if ((i10 & 8) != 0) {
            str4 = cVar.f28570d;
        } else {
            str4 = str;
        }
        if ((i10 & 16) != 0) {
            str5 = cVar.f28571e;
        } else {
            str5 = null;
        }
        if ((i10 & 32) != 0) {
            str6 = cVar.f28572f;
        } else {
            str6 = str2;
        }
        if ((i10 & 64) != 0) {
            str7 = cVar.f28573g;
        } else {
            str7 = str3;
        }
        if ((i10 & 128) != 0) {
            num2 = cVar.f28574h;
        } else {
            num2 = num;
        }
        cVar.getClass();
        return new c(bVar3, bVar4, z11, str4, str5, str6, str7, num2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f28567a == cVar.f28567a && this.f28568b == cVar.f28568b && this.f28569c == cVar.f28569c && Intrinsics.a(this.f28570d, cVar.f28570d) && Intrinsics.a(this.f28571e, cVar.f28571e) && Intrinsics.a(this.f28572f, cVar.f28572f) && Intrinsics.a(this.f28573g, cVar.f28573g) && Intrinsics.a(this.f28574h, cVar.f28574h);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int i10 = 0;
        b bVar = this.f28567a;
        if (bVar == null) {
            hashCode = 0;
        } else {
            hashCode = bVar.hashCode();
        }
        int i11 = hashCode * 31;
        b bVar2 = this.f28568b;
        if (bVar2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bVar2.hashCode();
        }
        int d10 = v.e.d(this.f28569c, (i11 + hashCode2) * 31, 31);
        String str = this.f28570d;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i12 = (d10 + hashCode3) * 31;
        String str2 = this.f28571e;
        if (str2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str2.hashCode();
        }
        int i13 = (i12 + hashCode4) * 31;
        String str3 = this.f28572f;
        if (str3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str3.hashCode();
        }
        int i14 = (i13 + hashCode5) * 31;
        String str4 = this.f28573g;
        if (str4 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str4.hashCode();
        }
        int i15 = (i14 + hashCode6) * 31;
        Integer num = this.f28574h;
        if (num != null) {
            i10 = num.hashCode();
        }
        return i15 + i10;
    }

    public final String toString() {
        return "UIState(showStoriesProgressBar=" + this.f28567a + ", showFavProgressBar=" + this.f28568b + ", showNoInternetScreen=" + this.f28569c + ", errorMessage=" + this.f28570d + ", message=" + this.f28571e + ", feedType=" + this.f28572f + ", feedEntityId=" + this.f28573g + ", favoriteFeedCount=" + this.f28574h + ")";
    }
}
