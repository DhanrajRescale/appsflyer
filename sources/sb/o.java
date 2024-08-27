package sb;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o extends yk.o {

    /* renamed from: d, reason: collision with root package name */
    public final String f34526d;

    /* renamed from: e, reason: collision with root package name */
    public final String f34527e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f34528f;

    /* renamed from: g, reason: collision with root package name */
    public final String f34529g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f34530h;

    /* renamed from: i, reason: collision with root package name */
    public final String f34531i;

    public o(String str, String str2, String str3, String str4, boolean z10, boolean z11) {
        this.f34526d = str;
        this.f34527e = str2;
        this.f34528f = z10;
        this.f34529g = str3;
        this.f34530h = z11;
        this.f34531i = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.a(this.f34526d, oVar.f34526d) && Intrinsics.a(this.f34527e, oVar.f34527e) && this.f34528f == oVar.f34528f && Intrinsics.a(this.f34529g, oVar.f34529g) && this.f34530h == oVar.f34530h && Intrinsics.a(this.f34531i, oVar.f34531i);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int i10 = 0;
        String str = this.f34526d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = hashCode * 31;
        String str2 = this.f34527e;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int d10 = v.e.d(this.f34528f, (i11 + hashCode2) * 31, 31);
        String str3 = this.f34529g;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int d11 = v.e.d(this.f34530h, (d10 + hashCode3) * 31, 31);
        String str4 = this.f34531i;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return d11 + i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Initial(feedType=");
        sb2.append(this.f34526d);
        sb2.append(", entityId=");
        sb2.append(this.f34527e);
        sb2.append(", isACallFromChat=");
        sb2.append(this.f34528f);
        sb2.append(", toolbarTitle=");
        sb2.append(this.f34529g);
        sb2.append(", showToolbar=");
        sb2.append(this.f34530h);
        sb2.append(", postId=");
        return nn.d.o(sb2, this.f34531i, ")");
    }
}
