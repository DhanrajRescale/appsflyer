package dv;

import com.airbnb.deeplinkdispatch.UrlTreeKt;
import in.juspay.hyper.constants.LogSubCategory;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class h extends a {

    /* renamed from: b, reason: collision with root package name */
    public String f14535b;

    /* renamed from: c, reason: collision with root package name */
    public String f14536c;

    /* renamed from: d, reason: collision with root package name */
    public String f14537d;

    /* renamed from: e, reason: collision with root package name */
    public String f14538e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f14539f;

    public static String b(String str) {
        if (str != null) {
            return str.replace(UrlTreeKt.configurablePathSegmentSuffixChar, ' ').replace(UrlTreeKt.configurablePathSegmentPrefixChar, ' ').replace('&', ' ').replace('\'', ' ').replace('\"', ' ');
        }
        return str;
    }

    public final void c() {
        String str = this.f14536c;
        if (!"public".equalsIgnoreCase(str) && !LogSubCategory.Action.SYSTEM.equalsIgnoreCase(str) && "html".equalsIgnoreCase(this.f14535b) && str == null) {
            this.f14539f = 60;
        }
        boolean equalsIgnoreCase = "public".equalsIgnoreCase(str);
        String str2 = this.f14537d;
        if (equalsIgnoreCase) {
            boolean equals = "-//W3C//DTD HTML 4.0//EN".equals(str2);
            String str3 = this.f14538e;
            if (equals) {
                this.f14539f = 10;
                if (!"http://www.w3.org/TR/REC-html40/strict.dtd".equals(str3)) {
                    HttpUrl.FRAGMENT_ENCODE_SET.equals(str3);
                }
            }
            if ("-//W3C//DTD HTML 4.01//EN".equals(str2)) {
                this.f14539f = 21;
                if (!"http://www.w3.org/TR/html4/strict.dtd".equals(str3)) {
                    HttpUrl.FRAGMENT_ENCODE_SET.equals(str3);
                }
            }
            if ("-//W3C//DTD HTML 4.01 Transitional//EN".equals(str2)) {
                this.f14539f = 22;
                "http://www.w3.org/TR/html4/loose.dtd".equals(str3);
            }
            if ("-//W3C//DTD HTML 4.01 Frameset//EN".equals(str2)) {
                this.f14539f = 23;
                "http://www.w3.org/TR/html4/frameset.dtd".equals(str3);
            }
            if ("-//W3C//DTD XHTML 1.0 Strict//EN".equals(str2)) {
                this.f14539f = 31;
                "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd".equals(str3);
            }
            if ("-//W3C//DTD XHTML 1.0 Transitional//EN".equals(str2)) {
                this.f14539f = 32;
                "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd".equals(str3);
            }
            if ("-//W3C//DTD XHTML 1.0 Frameset//EN".equals(str2)) {
                this.f14539f = 33;
                "http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd".equals(str3);
            }
            if ("-//W3C//DTD XHTML 1.1//EN".equals(str2)) {
                this.f14539f = 40;
                "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd".equals(str3);
            }
            if ("-//W3C//DTD XHTML Basic 1.1//EN".equals(str2)) {
                this.f14539f = 41;
                "http://www.w3.org/TR/xhtml11/DTD/xhtml-basic11.dtd".equals(str3);
            }
        }
        if (LogSubCategory.Action.SYSTEM.equalsIgnoreCase(str) && "about:legacy-compat".equals(str2)) {
            this.f14539f = 61;
        }
        if (this.f14539f == null) {
            this.f14539f = 0;
        }
    }

    public final String toString() {
        String f10;
        int intValue = this.f14539f.intValue();
        String str = this.f14535b;
        if (intValue == 0 && str == null) {
            return "<!DOCTYPE>";
        }
        if (this.f14539f.intValue() != 0) {
            if (this.f14539f.intValue() >= 30) {
                f10 = "<!DOCTYPE html";
            } else {
                f10 = "<!DOCTYPE HTML";
            }
        } else {
            f10 = a3.a.f("<!DOCTYPE ", str);
        }
        String str2 = this.f14536c;
        if (str2 != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(f10);
            sb2.append(" ");
            sb2.append(str2);
            sb2.append(" \"");
            String o10 = nn.d.o(sb2, this.f14537d, "\"");
            String str3 = this.f14538e;
            if (!HttpUrl.FRAGMENT_ENCODE_SET.equals(str3)) {
                f10 = o10 + " \"" + str3 + "\"";
            } else {
                f10 = o10;
            }
        }
        return jr.h.r(f10, UrlTreeKt.configurablePathSegmentSuffix);
    }
}
