package kb;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f23024a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23025b;

    /* renamed from: c, reason: collision with root package name */
    public final a f23026c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f23027d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f23028e;

    /* renamed from: f, reason: collision with root package name */
    public final String f23029f;

    /* renamed from: g, reason: collision with root package name */
    public final String f23030g;

    public b(String str, int i10, a aVar, boolean z10, boolean z11, String str2, String str3) {
        this.f23024a = str;
        this.f23025b = i10;
        this.f23026c = aVar;
        this.f23027d = z10;
        this.f23028e = z11;
        this.f23029f = str2;
        this.f23030g = str3;
    }

    public static b a(b bVar, String str, int i10, a aVar, boolean z10, boolean z11, String str2, int i11) {
        String str3;
        if ((i11 & 1) != 0) {
            str = bVar.f23024a;
        }
        String str4 = str;
        if ((i11 & 2) != 0) {
            i10 = bVar.f23025b;
        }
        int i12 = i10;
        if ((i11 & 4) != 0) {
            aVar = bVar.f23026c;
        }
        a aVar2 = aVar;
        if ((i11 & 8) != 0) {
            z10 = bVar.f23027d;
        }
        boolean z12 = z10;
        if ((i11 & 16) != 0) {
            z11 = bVar.f23028e;
        }
        boolean z13 = z11;
        if ((i11 & 32) != 0) {
            str2 = bVar.f23029f;
        }
        String str5 = str2;
        if ((i11 & 64) != 0) {
            str3 = bVar.f23030g;
        } else {
            str3 = null;
        }
        String str6 = str3;
        bVar.getClass();
        return new b(str4, i12, aVar2, z12, z13, str5, str6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.a(this.f23024a, bVar.f23024a) && this.f23025b == bVar.f23025b && this.f23026c == bVar.f23026c && this.f23027d == bVar.f23027d && this.f23028e == bVar.f23028e && Intrinsics.a(this.f23029f, bVar.f23029f) && Intrinsics.a(this.f23030g, bVar.f23030g);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int i10 = 0;
        String str = this.f23024a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int f10 = da.e.f(this.f23025b, hashCode * 31, 31);
        a aVar = this.f23026c;
        if (aVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = aVar.hashCode();
        }
        int d10 = v.e.d(this.f23028e, v.e.d(this.f23027d, (f10 + hashCode2) * 31, 31), 31);
        String str2 = this.f23029f;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i11 = (d10 + hashCode3) * 31;
        String str3 = this.f23030g;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return i11 + i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UIState(postId=");
        sb2.append(this.f23024a);
        sb2.append(", commentCount=");
        sb2.append(this.f23025b);
        sb2.append(", progressBarType=");
        sb2.append(this.f23026c);
        sb2.append(", showNoInternetFullScreenView=");
        sb2.append(this.f23027d);
        sb2.append(", isEndOfTheResponse=");
        sb2.append(this.f23028e);
        sb2.append(", errorMessage=");
        sb2.append(this.f23029f);
        sb2.append(", message=");
        return nn.d.o(sb2, this.f23030g, ")");
    }
}
