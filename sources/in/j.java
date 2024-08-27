package in;

import com.airbnb.deeplinkdispatch.UrlTreeKt;

/* loaded from: classes2.dex */
public final class j extends a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f20174a;

    /* renamed from: b, reason: collision with root package name */
    public final String f20175b;

    /* renamed from: c, reason: collision with root package name */
    public final String f20176c;

    /* renamed from: d, reason: collision with root package name */
    public final String f20177d;

    /* renamed from: e, reason: collision with root package name */
    public final String f20178e;

    /* renamed from: f, reason: collision with root package name */
    public final String f20179f;

    /* renamed from: g, reason: collision with root package name */
    public final String f20180g;

    /* renamed from: h, reason: collision with root package name */
    public final String f20181h;

    /* renamed from: i, reason: collision with root package name */
    public final String f20182i;

    /* renamed from: j, reason: collision with root package name */
    public final String f20183j;

    /* renamed from: k, reason: collision with root package name */
    public final String f20184k;

    /* renamed from: l, reason: collision with root package name */
    public final String f20185l;

    public j(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f20174a = num;
        this.f20175b = str;
        this.f20176c = str2;
        this.f20177d = str3;
        this.f20178e = str4;
        this.f20179f = str5;
        this.f20180g = str6;
        this.f20181h = str7;
        this.f20182i = str8;
        this.f20183j = str9;
        this.f20184k = str10;
        this.f20185l = str11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        Integer num = this.f20174a;
        if (num != null ? num.equals(((j) aVar).f20174a) : ((j) aVar).f20174a == null) {
            String str = this.f20175b;
            if (str != null ? str.equals(((j) aVar).f20175b) : ((j) aVar).f20175b == null) {
                String str2 = this.f20176c;
                if (str2 != null ? str2.equals(((j) aVar).f20176c) : ((j) aVar).f20176c == null) {
                    String str3 = this.f20177d;
                    if (str3 != null ? str3.equals(((j) aVar).f20177d) : ((j) aVar).f20177d == null) {
                        String str4 = this.f20178e;
                        if (str4 != null ? str4.equals(((j) aVar).f20178e) : ((j) aVar).f20178e == null) {
                            String str5 = this.f20179f;
                            if (str5 != null ? str5.equals(((j) aVar).f20179f) : ((j) aVar).f20179f == null) {
                                String str6 = this.f20180g;
                                if (str6 != null ? str6.equals(((j) aVar).f20180g) : ((j) aVar).f20180g == null) {
                                    String str7 = this.f20181h;
                                    if (str7 != null ? str7.equals(((j) aVar).f20181h) : ((j) aVar).f20181h == null) {
                                        String str8 = this.f20182i;
                                        if (str8 != null ? str8.equals(((j) aVar).f20182i) : ((j) aVar).f20182i == null) {
                                            String str9 = this.f20183j;
                                            if (str9 != null ? str9.equals(((j) aVar).f20183j) : ((j) aVar).f20183j == null) {
                                                String str10 = this.f20184k;
                                                if (str10 != null ? str10.equals(((j) aVar).f20184k) : ((j) aVar).f20184k == null) {
                                                    String str11 = this.f20185l;
                                                    if (str11 == null) {
                                                        if (((j) aVar).f20185l == null) {
                                                            return true;
                                                        }
                                                    } else if (str11.equals(((j) aVar).f20185l)) {
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
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
        int i10 = 0;
        Integer num = this.f20174a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i11 = (hashCode ^ 1000003) * 1000003;
        String str = this.f20175b;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i12 = (i11 ^ hashCode2) * 1000003;
        String str2 = this.f20176c;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i13 = (i12 ^ hashCode3) * 1000003;
        String str3 = this.f20177d;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i14 = (i13 ^ hashCode4) * 1000003;
        String str4 = this.f20178e;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int i15 = (i14 ^ hashCode5) * 1000003;
        String str5 = this.f20179f;
        if (str5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str5.hashCode();
        }
        int i16 = (i15 ^ hashCode6) * 1000003;
        String str6 = this.f20180g;
        if (str6 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str6.hashCode();
        }
        int i17 = (i16 ^ hashCode7) * 1000003;
        String str7 = this.f20181h;
        if (str7 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str7.hashCode();
        }
        int i18 = (i17 ^ hashCode8) * 1000003;
        String str8 = this.f20182i;
        if (str8 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str8.hashCode();
        }
        int i19 = (i18 ^ hashCode9) * 1000003;
        String str9 = this.f20183j;
        if (str9 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str9.hashCode();
        }
        int i20 = (i19 ^ hashCode10) * 1000003;
        String str10 = this.f20184k;
        if (str10 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str10.hashCode();
        }
        int i21 = (i20 ^ hashCode11) * 1000003;
        String str11 = this.f20185l;
        if (str11 != null) {
            i10 = str11.hashCode();
        }
        return i10 ^ i21;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb2.append(this.f20174a);
        sb2.append(", model=");
        sb2.append(this.f20175b);
        sb2.append(", hardware=");
        sb2.append(this.f20176c);
        sb2.append(", device=");
        sb2.append(this.f20177d);
        sb2.append(", product=");
        sb2.append(this.f20178e);
        sb2.append(", osBuild=");
        sb2.append(this.f20179f);
        sb2.append(", manufacturer=");
        sb2.append(this.f20180g);
        sb2.append(", fingerprint=");
        sb2.append(this.f20181h);
        sb2.append(", locale=");
        sb2.append(this.f20182i);
        sb2.append(", country=");
        sb2.append(this.f20183j);
        sb2.append(", mccMnc=");
        sb2.append(this.f20184k);
        sb2.append(", applicationBuild=");
        return nn.d.o(sb2, this.f20185l, UrlTreeKt.componentParamSuffix);
    }
}
